package SintaxeJava.Metodos.ControlarTv;

public class ControleTv {
    boolean ligada = false;
    int canal = 1;
    int volume = 10;

    public void ligarTv (){
        ligada = true;
    }
    public void desligarTv (){
        ligada = false;
    }
    public void aumentarCanal (){
        canal++;
        System.out.println("Canal: " + canal);
    }
    public void diminuirCanal (){
        canal--;
        System.out.println("Canal: " + canal);
    }
    public void mudarCanal (int novoCanal) {
        canal = novoCanal;
        System.out.println("Canal: " + canal);
    }

    public void aumentarVolume (){
        volume++;
        System.out.println("Volume: " + volume);
    }
    public void diminuirVolume (){
        volume--;
        System.out.println("Volume: " + volume);
    }

    
}
