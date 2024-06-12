
//------------------------------------------------------------------------------------------------------------

import animais.Cachorro;

import java.util.Arrays;

//public class Main {
//    static public void main(String... qualquerCoisa) {
//    public static void main(String[] args) {
//        System.out.println("Hello and welcome!");
//        }
//    }
public class Main {
    public static void main(String[] args) {
        System.out.println("Hello and welcome!");
        // byte -128:127
        // short -32768:32767
        // char 0:65535
        // int -2b:2b
        // long -9t:9t
        int variavelInt = 2147483;
        System.out.println(variavelInt);


//------------------------------------------------------------------------------------------------------------


        Cachorro cachorro1 = new Cachorro();
        cachorro1.nome = "Puppy";
        cachorro1.cor = "Marrom";
        cachorro1.altura = 25;
        cachorro1.peso = 5.5;
        cachorro1.tamanhoDoRabo = 5;
        System.out.println(cachorro1);


//------------------------------------------------------------------------------------------------------------

        cachorro1.latir();
        cachorro1.pegar();
        System.out.println("O cachorro pegou uma " + cachorro1.pegar());

        System.out.println("O cachorro está " + cachorro1.interagir("carinho"));
        System.out.println("O cachorro está " + cachorro1.interagir("nada"));
        System.out.println("O cachorro está " + cachorro1.interagir("Vai Dormir!"));


    }
}