package com.inatel.arquitetura;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

public class ServicoFreteJadLogTest {

    ServicoFreteJadLog servicoFreteJadLog;

    @Before
    public void setUp() throws Exception {
        servicoFreteJadLog = new ServicoFreteJadLog();
    }

    @Test
    public void deveCalcularValorPesoLeve() {
        double valor = servicoFreteJadLog.calcularValor(25);

        assertEquals(0.00, valor, 1.0);
    }

    @Test
    public void deveCalcularValorPesoPesado() {
        double valor = servicoFreteJadLog.calcularValor(40);

        assertEquals(150.00, valor, 1.0);
    }

}