package br.ufla.dcc.gcc110.s2016_01.trabalho2.POG.rpg;

/**
 *
 * @author Nechelley Alves
 */
public class InfInvalidoException extends RuntimeException{
    /**
     * Construtor da excecao
     * 
     * @param algo String dizendo oque est invalido
     * @param valor valor passado errado
     */
    public InfInvalidoException(String algo,String valor){
        super(algo + " invalid@ (" + valor + ")");
    }
}
