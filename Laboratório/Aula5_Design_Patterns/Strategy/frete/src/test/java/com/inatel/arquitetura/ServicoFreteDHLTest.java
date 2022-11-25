package com.inatel.arquitetura;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

public class ServicoFreteDHLTest {

    ServicoFreteDHL servicoFreteDHL;

    @Before
    public void setUp() throws Exception {
        servicoFreteDHL = new ServicoFreteDHL();
    }

    @Test
    public void deveCalcularValorPesoLeve() {
        double valor = servicoFreteDHL.calcularValor(5);

        assertEquals(100.00, valor, 1.0);
    }

    @Test
    public void deveCalcularValorPesoPesado() {
        double valor = servicoFreteDHL.calcularValor(20);

        assertEquals(90.00, valor, 1.0);
    }

}