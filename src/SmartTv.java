public class SmartTv {
  boolean ligada = false;
  int canal = 5;
  int volume = 25;

  //criando os metodos para manipular os estados 

  public void ligarTv() {
    ligada = true;
  };

  public void desligarTv() {
    ligada = false;
  };

  public void aumentarVolume() {
    volume++;
    System.out.println("Aumentando o volume para: " + volume);
  }

  public void diminuirVolume() {
    volume--;
    System.out.println("Diminuindo o volume para: " + volume);
  }

  public void mudarDeCanal(int novoCanal) {
    canal = novoCanal;
    // aumentarCanal();
    // diminuirCanal();
  }

  public void aumentarCanal() {
    canal++;
  }
  
   public void diminuirCanal(){
      canal--;
    }
  }
