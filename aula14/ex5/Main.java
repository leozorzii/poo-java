package ex5;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Midia> playlist = new ArrayList<>();
        playlist.add(new Musica("Bandoleros", 180));
        playlist.add(new Filme("Matrix", 120));
        playlist.add(new Podcast("NeyFlow", 3600));

        for (Midia midia : playlist) {
            if(midia instanceof Baixavel){
                try{
                    ((Baixavel) midia).realizarDownload(true);//trocar para false para testar execao
                } catch (FalhaNoDownloadException e){
                    System.out.println("Aviso do sistema " + e.getMessage());
                }
            }
            midia.reproduzir();
            System.out.println();
        }
    }
}
