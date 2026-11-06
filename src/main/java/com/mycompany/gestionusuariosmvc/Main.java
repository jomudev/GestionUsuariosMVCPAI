package com.mycompany.gestionusuariosmvc;

public class Main {
    public static void main(String[] args) {
        UsuarioView vista = new UsuarioView();
        UsuarioController controlador = new UsuarioController(vista);
        
        controlador.iniciar();
    }
}