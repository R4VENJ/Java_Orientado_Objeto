package animais;

public class Cachorro {
    public String nome;
    public String cor;
    public int altura;
    public double peso;
    public int tamanhoDoRabo;

    public void comer(){}
    public void latir(){
        System.out.println("AU AU");
    }
    public String pegar(){
        return "bolinha";
    }

//    public String estadoDeEspirito;
//    public String interagir(String acao){
//        if(acao.equals("carinho")){
//            this.estadoDeEspirito = "feliz";
//        } else if(acao.equals("Vai Dormir!")){
//            this.estadoDeEspirito = "bravo";
//        } else {
//            this.estadoDeEspirito = "neutro";
//        }
//        return estadoDeEspirito;
//    }
// CONTROL + / COMENTA TUDO O QUE ESTÁ SELECIONADO

    public String estadoDeEspirito;
    public String interagir(String acao){
        switch(acao){
            case "carinho" : this.estadoDeEspirito = "feliz"; break;
            case "Vai Dormir!" : this.estadoDeEspirito = "bravo"; break;
            case "pisar na patinha" : this.estadoDeEspirito = "triste"; break;
            default: this.estadoDeEspirito = "neutro"; break;
        }
        return estadoDeEspirito;
    }
}

//public enum Day {
//    SUNDAY, MONDAY, TUESDAY, WEDNESDAY,
//    THURSDAY, FRIDAY, SATURDAY
//}
//
//public class EnumTest {
//    Day day;
//
//    public EnumTest(Day day) {
//        this.day = day;
//    }
//
//    public void tellItLikeItIs() {
//
//        switch (day) {
//            case MONDAY:
//                System.out.println("Mondays are bad.");
//                break;
//
//            case FRIDAY:
//                System.out.println("Fridays are better.");
//                break;
//
//            case SATURDAY:
//            case SUNDAY:
//                System.out.println("Weekends are best.");
//                break;
//
//            default:
//                System.out.println("Midweek days are so-so.");
//                break;
//        }
//    }
//}

