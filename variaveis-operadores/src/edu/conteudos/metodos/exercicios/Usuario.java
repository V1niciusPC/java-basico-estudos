package edu.conteudos.metodos.exercicios;

public class Usuario {

    public static void main(String[] args) {
        SmartTv smartTv = new SmartTv();

        System.out.println("TV Ligada?: "+ smartTv.ligada);
        System.out.println("canal atual: "+ smartTv.canal);
        System.out.println("volume atual:"+ smartTv.volume);

        smartTv.ligar();
        System.err.println("Status tv: "+ smartTv.ligada);

        smartTv.desligar();
        System.err.println("Status tv: "+ smartTv.ligada);

        smartTv.aumentarVolume();
        System.out.println("volume atual: "+ smartTv.volume);

        smartTv.diminuirVolume();
        System.out.println("volume atual: "+ smartTv.volume);


        smartTv.mudarCanal();
        System.out.println("canal atual: "+ smartTv.canal);

        smartTv.voltarCanal();
        System.out.println("canal atual: "+ smartTv.canal);

        smartTv.escolherCanal(98);
        System.out.println("canal atual: "+ smartTv.canal);
    }


}