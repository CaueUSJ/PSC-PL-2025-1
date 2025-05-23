
package com.mycompany.aula1;

public class App {
    
    public static void main(String[] args){         
         // Interface Swing deve rodar na thread de eventos
        javax.swing.SwingUtilities.invokeLater(() -> {
                new TelaLogin();
        });
        
    }     
     
}
