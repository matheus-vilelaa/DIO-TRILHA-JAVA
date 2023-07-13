package SintaxeJava.Metodos.ControlarTv;

public class Televisao {
    public static void main(String[] args) {

        ControleTv controleTv = new ControleTv ();

        System.out.println("Tv ligada? " + controleTv.ligada);


        controleTv.ligarTv();
        System.out.println("Novo status - Tv ligada ? " + controleTv.ligada);
        System.out.println("Canal atual: " + controleTv.canal);
        System.out.println("Volume: " + controleTv.volume);

        controleTv.aumentarVolume();
        controleTv.aumentarVolume();
        controleTv.diminuirVolume();

        controleTv.aumentarCanal();
        controleTv.aumentarCanal();
        controleTv.aumentarCanal();
        controleTv.mudarCanal(18);
        controleTv.diminuirCanal();




        controleTv.desligarTv();
        System.out.println("Novo status - Tv ligada ? " + controleTv.ligada);

    }








}
