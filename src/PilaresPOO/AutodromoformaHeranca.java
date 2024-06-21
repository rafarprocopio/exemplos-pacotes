package PilaresPOO;
public class AutodromoformaHeranca {
    public static void main(String[] args) {
        CarroformaHeranca jeep = new CarroformaHeranca();
        jeep.setChassi("2548526");
        jeep.ligar();

        MotoformaHeranca Z400 = new MotoformaHeranca();
        Z400.setChassi("356589");
    }
}
