package com.inatel.arquitetura;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

public class ServicoFreteSedexTest {

    ServicoFreteSedex servicoFreteSedex;

    @Before
    public void setUp() throws Exception {
        servicoFreteSedex = new ServicoFreteSedex();
    }

    @Test
    public void deveCalcularValorPesoLeve() {
        double valor = servicoFreteSedex.calcularValor(5);

        assertEquals(50.00, valor, 1.0);
    }

    @Test
    public void deveCalcularValorPesoMedio() {
        double valor = servicoFreteSedex.calcularValor(15);

        assertEquals(70.00, valor, 1.0);
    }

    @Test
    public void deveCalcularValorPesoPesado() {
        double valor = servicoFreteSedex.calcularValor(20);

        assertEquals(90.00, valor, 1.0);
    }

}