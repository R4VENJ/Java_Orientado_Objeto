////package animais;
////
////public class Cachorro {
////    public String nome;
////    public String cor;
////    public int altura;
////    public double peso;
////    public int tamanhoDoRabo;
////
////    public void comer(){}
////    public void latir(){
////        System.out.println("AU AU");
////    }
////    public String pegar(){
////        return "bolinha";
////    }
////
//////    public String estadoDeEspirito;
//////    public String interagir(String acao){
//////        if(acao.equals("carinho")){
//////            this.estadoDeEspirito = "feliz";
//////        } else if(acao.equals("Vai Dormir!")){
//////            this.estadoDeEspirito = "bravo";
//////        } else {
//////            this.estadoDeEspirito = "neutro";
//////        }
//////        return estadoDeEspirito;
//////    }
////// CONTROL + / COMENTA TUDO O QUE ESTÁ SELECIONADO
////
////    public String estadoDeEspirito;
////    public String interagir(String acao){
////        switch(acao){
////            case "carinho" : this.estadoDeEspirito = "feliz"; break;
////            case "Vai Dormir!" : this.estadoDeEspirito = "bravo"; break;
////            case "pisar na patinha" : this.estadoDeEspirito = "triste"; break;
////            default: this.estadoDeEspirito = "neutro"; break;
////        }
////        return estadoDeEspirito;
////    }
////}
////
//////public enum Day {
//////    SUNDAY, MONDAY, TUESDAY, WEDNESDAY,
//////    THURSDAY, FRIDAY, SATURDAY
//////}
//////
//////public class EnumTest {
//////    Day day;
//////
//////    public EnumTest(Day day) {
//////        this.day = day;
//////    }
//////
//////    public void tellItLikeItIs() {
//////
//////        switch (day) {
//////            case MONDAY:
//////                System.out.println("Mondays are bad.");
//////                break;
//////
//////            case FRIDAY:
//////                System.out.println("Friadays are better.");
//////                break;
//////
//////            case SATURDAY:
//////            case SUNDAY:
//////                System.out.println("Weekends are best.");
//////                break;
//////
//////            default:
//////                System.out.println("Midweek days are so-so.");
//////                break;
//////        }
//////    }
//////}
//
////------------------------------------------------------------------------------------------------------------
//
////------------------------------------------------------------------------------------------------------------
//
//package animais;
//
//////////////////////////////////////////////////////
// // ATRIBUTOS
//////////////////////////////////////////////////////
//
//public class Cachorro {
//
//    static int numeroDeCachorros = 1;
//    private String nome;
//    private String cor;
//    private int altura;
//    private double peso;
//    private int tamanhoDoRabo;
//    private String estadoDeEspirito;
//
//    public String getNome(){
////        if(fulano) {
////            return null;
////        }
//        return this.nome;
//    }
//    public void setNome(String nome){
////        if(nome.equals("nomeIndesejado") {
////            this.nome = null;
////        }
//        this.nome = nome;
//    }
//// botão direito > generate > getters e setters
//
//    public String getCor() {
//        return cor;
//    }
//
//    public void setCor(String cor) {
//        this.cor = cor;
//    }
//
//    public int getAltura() {
//        return altura;
//    }
//
//    public void setAltura(int altura) {
//        this.altura = altura;
//    }
//
//    public double getPeso() {
//        return peso;
//    }
//
//    public void setPeso(double peso) {
//        this.peso = peso;
//    }
//
//    public int getTamanhoDoRabo() {
//        return tamanhoDoRabo;
//    }
//
//    public void setTamanhoDoRabo(int tamanhoDoRabo) {
//        this.tamanhoDoRabo = tamanhoDoRabo;
//    }
//
//    public String getEstadoDeEspirito() {
//        return estadoDeEspirito;
//    }
//
//// Alterar o estado de espirito só deverá ser possível, nesse código, através da interação já criada
////    public void setEstadoDeEspirito(String estadoDeEspirito) {
////        this.estadoDeEspirito = estadoDeEspirito;
////    }
//
//    public Cachorro(int altura, double peso, int tamanhoDoRabo, String estadoDeEspirito) {
//        this.altura = altura;
//        this.peso = peso;
//        this.tamanhoDoRabo = tamanhoDoRabo;
//        this.estadoDeEspirito = estadoDeEspirito;
//    }
//
//    ////////////////////////////////////////////////////
//    // CONSTRUTORES
//    ////////////////////////////////////////////////////
//
//    // botão direito > generate > toString
//    //definindo o que vai ser retornado pelo metodo toString
//    @Override
//    public String toString() {
//        return "Cachorro{" +
//                "nome='" + nome + '\'' +
//                '}';
//    }
//
//    //padrao
//    public Cachorro(){}
//// botão direito > generate > contructor
//    public Cachorro(String nome, String cor, int altura, double peso, int tamanhoDoRabo, String estadoDeEspirito) {
//        this.nome = nome;
//        this.cor = cor;
//        this.altura = altura;
//        this.peso = peso;
//        this.tamanhoDoRabo = tamanhoDoRabo;
//        this.estadoDeEspirito = estadoDeEspirito;
//
////        numeroDeCachorros = numeroDeCachorros + ;
//        numeroDeCachorros++;
//    }
//
//    ////////////////////////////////////////////////////
//    // MÉTODOS
//    ////////////////////////////////////////////////////
//
//
//    public static int getNumeroDeCachorros() {
//        return numeroDeCachorros;
//    }
//
//    public static void setNumeroDeCachorros(int numeroDeCachorros) {
//        Cachorro.numeroDeCachorros = numeroDeCachorros;
//    }
//
//    public void comer(){}
//    public void soar(){
//        System.out.println("AU AU");
//    }
//    public String pegar(){
//        return "bolinha";
//    }
//
//
//    public String interagir(String acao){
//        switch(acao){
//            case "carinho" : this.estadoDeEspirito = "feliz"; break;
//            case "Vai Dormir!" : this.estadoDeEspirito = "bravo"; break;
//            case "pisar na patinha" : this.estadoDeEspirito = "triste"; break;
//            default: this.estadoDeEspirito = "neutro"; break;
//        }
//        return estadoDeEspirito;
//    }
//}










package animais;

public class Cachorro extends Animal{

    static int numeroDeCachorros = 1;
    private int tamanhoDoRabo;
    public String estadoDeEspirito;

    public Cachorro(String nome, String cor, int altura, double peso) {
        super(nome, cor, altura, peso);
    }

    public String getEstadoDeEspirito() {
        return estadoDeEspirito;
    }

    public void setEstadoDeEspirito(String estadoDeEspirito) {
        this.estadoDeEspirito = estadoDeEspirito;
    }

    @Override
    public void soar() {
        System.out.println("AUAU");
    }

    // botão direito > generate > toString
    //definindo o que vai ser retornado pelo metodo toString
    @Override
    public String toString() {
        return "Cachorro{" +
                "nome='" + nome + '\'' +
                '}';
    }


}