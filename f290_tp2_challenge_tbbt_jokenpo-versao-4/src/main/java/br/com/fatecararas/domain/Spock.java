/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.fatecararas.domain;

/**
 *
 * @author User
 */
public class Spock extends Algoritmo {

    @Override
    public Map<String, String> executar(Tipo pTipo) {
        switch (pTipo) {
            case PAPEL -> valor = "Perdeu! Papel refuta Spock!";
            case TESOURA -> valor = "Ganhou! Spock esmaga a tesoura!";
            case PEDRA -> valor = "Perdeu! Spock é vaporizado pela pedra!";
            case LAGARTO -> valor = "Ganhou! Spock envenena o lagarto!";
            case SPOCK -> valor = "Empate. Spock empata com Spock!";
            default -> valor = "Empatou! Opção inválida!";
        }

        resultado.put(KEY, valor);
        return resultado;
    }
}