public class Usuario {
  public static void main(String[] args) throws Exception {
        
    SmartTv smartTv = new SmartTv();

    smartTv.diminuirVolume();
    smartTv.diminuirVolume();
    smartTv.diminuirVolume();
    smartTv.aumentarVolume();

    System.out.println("Canal que estava antes: " + smartTv.canal);
    smartTv.mudarDeCanal(13);
    System.out.println("Canal atual: " + smartTv.canal);


    System.out.println("volume atual: " + smartTv.volume);


    // System.out.println("A TV esta: " + smartTv.ligada);
    // System.out.println("canal atual: " + smartTv.canal);
    // System.out.println("volume atual: " + smartTv.volume);

    smartTv.ligarTv();
    // System.out.println("novo status - tv ligada? " + smartTv.ligada);

    smartTv.desligarTv();
    // System.out.println("novo status - tv desligada? " + smartTv.ligada);

  }
}
