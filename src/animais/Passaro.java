package animais;

public class Passaro extends Animal{

    public Passaro(String nome, String cor, int altura, double peso) {
        super(nome, cor, altura, peso);
    }

    @Override
    public void soar() {
        System.out.println("PIU PIU");
    }

    @Override
    public String toString() {
        return "Passaro{" +
                "nome='" + nome + '\'' +
                '}';
    }
}
