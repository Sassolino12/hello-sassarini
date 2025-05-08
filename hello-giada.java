import java.util.io.*;
public class HelloGiada {
    public static void main(String[] args) {       // entry point from OS           
    System.out.println("Hello Giada");
        //Array con il mio nome
    char[] lettere={'G','i','a','d','a'};
    // print il mio nome lettera per lettera
    for(char lettera: lettere){
        System.out.println(lettera);
    }
    Vector<Character> lettere=new Vector<Character>();
    lettere.add('G');
    lettere.add('i');
    lettere.add('a');
    lettere.add('d');
    lettere.add('a');
    for(char lettera: lettere){
        System.out.println(lettera);
    }
}