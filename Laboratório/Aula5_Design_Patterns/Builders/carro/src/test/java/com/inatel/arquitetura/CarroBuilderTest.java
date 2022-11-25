package com.inatel.arquitetura;

import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

/**
 * Unit test for CarroBuilder Class.
 */
public class CarroBuilderTest {

    @Test
    public void deveConstruirUmCarro() {
        
        // CRIANDO OS OBJETOS
        Motor motorVTEC = new Motor();
        Porta portaMotorista = new Porta();
        Porta portaPassageiro = new Porta();
        Porta[] portas = {portaMotorista, portaPassageiro};
        ComputadorBordo computadorBordoSiemens = new ComputadorBordo();
        FreioABS freioBosch = new FreioABS();

        // INVOCANDO O CarroBuilder
        CarroBuilder builder = new CarroBuilder();
        builder.buildMotor(motorVTEC);
        builder.buildPortas(portas);
        builder.buildComputadorBordo(computadorBordoSiemens);
        builder.buildFreioABS(freioBosch);
        Carro carroPronto = builder.getCarro();

        // REALIZANDO OS TESTES
        assertNotNull(carroPronto);
        assertNotNull(carroPronto.getMotor());
        assertNotNull(carroPronto.getPortas());
        assertTrue(carroPronto.getPortas().length == 2);
        assertNotNull(carroPronto.getComputadorBordo());
        assertNotNull(carroPronto.getFreioABS());
    }
}