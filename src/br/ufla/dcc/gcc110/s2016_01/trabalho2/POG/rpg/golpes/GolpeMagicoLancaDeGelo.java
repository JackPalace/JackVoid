/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.ufla.dcc.gcc110.s2016_01.trabalho2.POG.rpg.golpes;

import br.ufla.dcc.gcc110.s2016_01.trabalho2.POG.rpg.xbuff.XBuff;

/**
 *
 * @author neche
 */
public class GolpeMagicoLancaDeGelo extends GolpeMagico{
    private XBuff congelamento;
    /**
     * Construtor onde defino como o golpe sera executado.
     * @param nome nome do golpe
     */
    public GolpeMagicoLancaDeGelo(String nome){
        super(nome);
        setDano(1);
        setChanceDeAcerto(6);
        setCustoDeAcao(2);
        congelamento = new XBuff("congelamento",0, 1, 1);
    }

    @Override
    public void setDanoEmBatalha(int valorDoDado) {
        setDano(getDano() + valorDoDado/2);
    }

    @Override
    public XBuff getXBuff() {
        return congelamento;
    }
    
    @Override
    public String getTipo() {
        return "gelo";
    }
}
