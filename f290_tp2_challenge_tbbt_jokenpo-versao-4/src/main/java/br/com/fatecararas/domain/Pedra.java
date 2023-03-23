/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.fatecararas.domain;

/**
 *
 * @author User
 */
public class Pedra extends Algoritmo {

    @Override
    public Map<String, String> executar(Tipo pTipo) {
        switch (pTipo) {
            case PAPEL -> valor = "Perdeu! Papel embrulha a pedra!";
            case TESOURA -> valor = "Ganhou! Pedra quebra a tesoura!";
            case PEDRA -> valor = "Empate. Pedra empata com pedra!";
            case LAGARTO -> valor = "Ganhou! Pedra esmaga o lagarto!";
            case SPOCK -> valor = "Perdeu! Spock vaporiza a pedra!";
            default -> valor = "Empatou! Opção inválida!";
        }

        resultado.put(KEY, valor);
        return resultado;
    }
}