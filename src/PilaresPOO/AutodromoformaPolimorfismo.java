package PilaresPOO;

public class AutodromoformaPolimorfismo {
    public static void main(String[] args) {
        CarroformaPolimorfismo jeep = new CarroformaPolimorfismo();
        jeep.setChassi("546484");
        jeep.ligar();

        MotoformaPolimorfismo Z400 = new MotoformaPolimorfismo();
        Z400.setChassi("45668");
        //Z400.ligar();

        //VeiculoformaPolimorfismo coringa = jeep;
        //coringa.ligar(); 

    

    }   
}
    

