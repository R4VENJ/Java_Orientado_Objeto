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

    public String estadoDeEspirito;
    public String interagir(String acao){
        if(acao.equals("carinho")){
            this.estadoDeEspirito = "feliz";
        } else if(acao.equals("Vai Dormir!")){
            this.estadoDeEspirito = "bravo";
        } else {
            this.estadoDeEspirito = "neutro";
        }
        return estadoDeEspirito;
    }
}

