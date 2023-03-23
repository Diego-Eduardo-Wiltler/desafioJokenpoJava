package br.com.fatecararas.domain;

import java.util.HashMap;
import java.util.Map;

public abstract class Algoritmo {
    protected final String KEY = "resultado";

    protected String valor;

    protected Map<String, String> resultado = new HashMap<>();

    public abstract Tipo getNome();

    public abstract Map<String, String> executar();

    protected void resultadoEmpate() {
        valor = "Empate. " + getNome() + " empata com " + getNome() + "!";
        resultado.put(KEY, valor);
    }

    protected void resultadoVitoria(Tipo tipoOponente) {
        valor = "Ganhou! " + getNome() + " " + getNome().getAcao() + " " + tipoOponente.getNome() + "!";
        resultado.put(KEY, valor);
    }

    protected void resultadoDerrota(Tipo tipoOponente) {
        valor = "Perdeu! " + tipoOponente.getNome() + " " + tipoOponente.getAcao() + " " + getNome() + "!";
        resultado.put(KEY, valor);
    }
}
