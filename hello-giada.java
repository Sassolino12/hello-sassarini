import java.util.io.*;
public class HelloGiada {
    public static void main(String[] args) {       // entry point from OS           
        System.out.println("Hello Giada!");

        // print il mio nome 3 volte
        for (int i = 0; i < 3; i++) {
            System.out.println( "Giada!");
        } 
        // print la mia data di nascita
        System.out.println("4 Ottobre 2007");
        
        // print la mia squadra del cuore
        System.out.println("Forza Napoli");
    }
    //Array con il mio nome
    char[] lettere={'G','i','a','d','a'};
    // print il mio nome lettera per lettera
    for(char lettera: lettere){
        System.out.println(lettera);
    }
}