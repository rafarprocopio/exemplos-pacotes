package PilaresPOO;
public class Carroformaencapsulada {
    public void ligar(){
        confereCambio();
        confereCombustivel();
        System.out.println("CARRO LIGADO");
    }
    private void confereCombustivel() {
        System.out.println("Conferindo combustível");
    }
    private void confereCambio() {
    System.out.println("Conferindo câmbio em P");
    }
}
