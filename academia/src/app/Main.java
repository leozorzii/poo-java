package src.app;

import src.service.AcademiaService;

public class Main {
    public static void main(String[] args) {
        AcademiaService service = new AcademiaService();
        service.iniciarSessao();
    }
}
