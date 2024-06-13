
//------------------------------------------------------------------------------------------------------------

import animais.Animal;
import animais.Cachorro;
import animais.Gato;
import animais.Passaro;
import Lojas.Petshop;

import java.util.Arrays;

//public class Main {
//    static public void main(String... qualquerCoisa) {
//    public static void main(String[] args) {
//        System.out.println("Hello and welcome!");
//        }
//    }
public class Main {
    public static void main(String[] args) {
//        System.out.println("Hello and welcome!");
//        // byte -128:127
//        // short -32768:32767
//        // char 0:65535
//        // int -2b:2b
//        // long -9t:9t
//        int variavelInt = 2147483;
//        System.out.println(variavelInt);
//
//
////------------------------------------------------------------------------------------------------------------
//
//
////        Cachorro cachorro1 = new Cachorro();
////        cachorro1.nome = "Puppy";
////        cachorro1.cor = "Marrom";
////        cachorro1.altura = 25;
////        cachorro1.peso = 5.5;
////        cachorro1.tamanhoDoRabo = 5;
////        System.out.println(cachorro1);
//
//        Cachorro cachorro1 = new Cachorro();
//        cachorro1.setNome("Puppy");
//        cachorro1.setCor("Marrom");
//        cachorro1.setAltura(25);
//        cachorro1.setPeso(5.5);
//        cachorro1.setTamanhoDoRabo(5);
//        System.out.println(cachorro1);
//        System.out.println("Cachorros:");
//        System.out.println(cachorro1.getNumeroDeCachorros());
//
//
////------------------------------------------------------------------------------------------------------------
//
//        cachorro1.latir();
//        cachorro1.pegar();
//        System.out.println("O cachorro pegou uma " + cachorro1.pegar());
//
//        System.out.println("O cachorro está " + cachorro1.interagir("carinho"));
//        System.out.println("O cachorro está " + cachorro1.interagir("nada"));
//        System.out.println("O cachorro está " + cachorro1.interagir("Vai Dormir!"));
//
//
////------------------------------------------------------------------------------------------------------------
//
//
//        Cachorro cachorro2 = new Cachorro("Ghost","Branco",25,5.5,5,"feliz");
//        System.out.println("Cachorros:");
//        System.out.println(cachorro1.getNumeroDeCachorros());
//
//        System.out.println("");
//        System.out.println(cachorro2.getNome());
//        System.out.println(cachorro2.getPeso());
//
//
////------------------------------------------------------------------------------------------------------------
//
//        Cachorro cachorro3 = new Cachorro("Ghost","Branco",25,5.5,5,"feliz");
//        System.out.println("Cachorros:");
//        System.out.println(cachorro1.getNumeroDeCachorros());
//
//        System.out.println(cachorro1.toString());
//        System.out.println(cachorro2.toString());
//        System.out.println(cachorro3.toString());
//
//        cachorro3 = cachorro1;
//
//        System.out.println(cachorro1.toString());
//        System.out.println(cachorro2.toString());
//        System.out.println(cachorro3.toString());
//        // estudar garbage collector
//
//        System.out.println(cachorro3.toString());


        Cachorro cachorro10 = new Cachorro("DOGIM","Branco",25,5.5);
        Gato gato10 = new Gato("GATIM","PRETO",10,2);
        Passaro passaro10 = new Passaro("PASSARIM","Branco",5,0.5);
        cachorro10.soar();
        gato10.soar();
        passaro10.soar();

        Petshop petshop = new Petshop();
        petshop.darBanho(gato10);
        System.out.println(gato10.getEstadoDeEspirito());
        petshop.tosar(cachorro10);
        System.out.println(cachorro10.getEstadoDeEspirito());
        petshop.deixarNoHotel(passaro10);
        System.out.println(passaro10.getEstadoDeEspirito());


        Gato gato11 = new Gato("GATIM","PRETO",10,2);
        Animal gato12 = new Gato("GATIM","PRETO",10,2);
        // NAO FUNCIONA
        // Gato gato13 = new Animal("GATIM","PRETO",10,2);

        // Ao inserir abstract em Animal, não funciona mais
        // Animal gato14 = new Animal("GATIM","PRETO",10,2);

    }



}

