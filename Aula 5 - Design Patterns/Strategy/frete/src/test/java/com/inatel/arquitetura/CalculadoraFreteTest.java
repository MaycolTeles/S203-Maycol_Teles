package com.inatel.arquitetura;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.fail;

import org.junit.Before;
import org.junit.Test;

public class CalculadoraFreteTest {

    CalculadoraFrete calculadoraFrete;

    @Before
    public void setUp() throws Exception {
        calculadoraFrete = new CalculadoraFrete();
    }

    @Test
    public void deveCalcularValorSedexPesoLeve() {
        ServicoFreteSedex servicoFreteSedex = new ServicoFreteSedex();
        double valor = calculadoraFrete.calcularValor(servicoFreteSedex, 5);

        assertEquals(50.00, valor, 1.0);
    }

    @Test
    public void deveCalcularValorSedexPesoMedio() {
        ServicoFreteSedex servicoFreteSedex = new ServicoFreteSedex();
        double valor = calculadoraFrete.calcularValor(servicoFreteSedex, 15);

        assertEquals(70.00, valor, 1.0);
    }

    @Test
    public void deveCalcularValorSedexPesoPesado() {
        ServicoFreteSedex servicoFreteSedex = new ServicoFreteSedex();
        double valor = calculadoraFrete.calcularValor(servicoFreteSedex, 40);

        assertEquals(90.00, valor, 1.0);
    }

    @Test
    public void deveCalcularValorDhlPesoLeve() {
        ServicoFreteDHL servicoFreteDHL = new ServicoFreteDHL();
        double valor = calculadoraFrete.calcularValor(servicoFreteDHL, 10);

        assertEquals(100.00, valor, 1.0);
    }

    @Test
    public void deveCalcularValorDhlPesoPesado() {
        ServicoFreteDHL servicoFreteDHL = new ServicoFreteDHL();
        double valor = calculadoraFrete.calcularValor(servicoFreteDHL,20);

        assertEquals(90.00, valor, 1.0);
    }

    @Test
    public void deveCalcularValorJadlogPesoLeve() {
        ServicoFreteJadLog servicoFreteJadLog = new ServicoFreteJadLog();
        double valor = calculadoraFrete.calcularValor(servicoFreteJadLog,20);

        assertEquals(0.00, valor, 1.0);
    }

    @Test
    public void deveCalcularValorJadlogPesoPesado() {
        ServicoFreteJadLog servicoFreteJadLog = new ServicoFreteJadLog();
        double valor = calculadoraFrete.calcularValor(servicoFreteJadLog,40);

        assertEquals(150.00, valor, 1.0);
    }
}
