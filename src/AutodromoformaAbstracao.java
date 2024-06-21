public class AutodromoformaAbstracao {

    public static void main(String[] args) {
        CarroformaAbstracao jeep = new CarroformaAbstracao();
        jeep.setChassi("454564");
        jeep.ligar();

        MotoformaAbstracao Z400 = new MotoformaAbstracao();
        Z400.setChassi("87854");
        Z400.ligar();
    }   
}
