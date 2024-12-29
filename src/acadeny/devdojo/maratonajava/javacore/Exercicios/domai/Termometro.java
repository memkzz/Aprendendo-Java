package acadeny.devdojo.maratonajava.javacore.Exercicios.domai;

public class Termometro {
    public double temperaturaAtual = 24;

    public double aumentarTemperatura(){
        return temperaturaAtual++;
    }
    public double diminuirTemperatura(){
        return temperaturaAtual--;
    }
    public void exibirTemperartura(){
        System.out.println("Temperatura atual é de: "+temperaturaAtual);
    }
}
