package edu.conteudos.metodos.exercicios;

public class SmartTv {
    // aqui mesmo passar as variaveis
    boolean ligada = false;
    int canal =2;
    int volume = 30;

    public void ligar(){
        ligada = true;
    }

    public void desligar(){
        ligada = false;
    }

    public void mudarCanal(){
        canal++;
    }
    public void voltarCanal(){
        canal--;
    }

    public void escolherCanal(int novoCanal){
        canal = novoCanal;

    }

    public void aumentarVolume(){
        volume++;
    }

    public void diminuirVolume(){
        volume--;
    }


}