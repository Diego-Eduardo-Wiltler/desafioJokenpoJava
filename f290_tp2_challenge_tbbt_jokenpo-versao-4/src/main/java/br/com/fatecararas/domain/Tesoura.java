/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.fatecararas.domain;

/**
 *
 * @author User
 */
public class Tesoura extends Algoritmo {

    @Override
    public Map<String, String> executar(Tipo pTipo) {
        switch (pTipo) {
            case PAPEL -> valor = "Ganhou! Tesoura corta o papel!";
            case PEDRA -> valor = "Perdeu! Pedra esmaga a tesoura!";
            case LAGARTO -> valor = "Ganhou! Tesoura decapita o lagarto!";
            case SPOCK -> valor = "Perdeu! Spock esmaga a tesoura!";
            case TESOURA -> valor = "Empate. Tesoura empata com tesoura!";
            default -> valor = "Empatou! Opção inválida!";
        }

        resultado.put(KEY, valor);
        return resultado;
    }
}
