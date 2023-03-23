package br.com.fatecararas;

import br.com.fatecararas.domain.Algoritmo;
import br.com.fatecararas.domain.Jokenpo;
import br.com.fatecararas.domain.Lagarto;
import br.com.fatecararas.domain.Papel;
import br.com.fatecararas.domain.Pedra;
import br.com.fatecararas.domain.Spoock;
import br.com.fatecararas.domain.Tesoura;
import br.com.fatecararas.domain.Tipo;

import java.util.Random;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        var jokenpo = new Jokenpo();

        System.out.println("Escolha uma das opções [ 1-PAPEL, 2-TESOURA, 3-PEDRA, LAGARTO-LAGARTO, 5-SPOCK ]\n");
        int jogada = in.nextInt();

        Algoritmo algoritmo = getAlgoritmo(jogada);
        jokenpo.setAlgoritmo(algoritmo);

        int computador = new Random().nextInt(5) + 1;
        Tipo tipoJogadaComputador = Tipo.getInstance(computador);

        System.out.println("O COMPUTADOR escolheu: " + tipoJogadaComputador);

        jokenpo.jogar(tipoJogadaComputador);

        in.close();

    }

    private static Algoritmo getAlgoritmo(Integer pId) {
        Algoritmo algoritmo = null;
        switch (pId) {
            case 1 -> algoritmo = new Papel();
            case 2 -> algoritmo = new Tesoura();
            case 3 -> algoritmo = new Pedra();
            case 4 -> algoritmo = new Lagarto();
            case 5 -> algoritmo = new Spoock();
            default -> throw new IllegalStateException("Unexpected value: " + pId);
        }
        return algoritmo;
    }
}
