package com.inatel.arquitetura;

import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

/**
 * Unit test for CarroBuilderFluente Class.
 */
public class CarroBuilderFluenteTest {

    @Test
    public void deveConstruirUmCarro() {
        
        // CRIANDO OS OBJETOS
        Motor motorVTEC = new Motor();
        Porta portaMotorista = new Porta();
        Porta portaPassageiro = new Porta();
        Porta[] portas = {portaMotorista, portaPassageiro};
        ComputadorBordo computadorBordoSiemens = new ComputadorBordo();
        FreioABS freioBosch = new FreioABS();

        // INVOCANDO O CarroBuilderFluente
        Carro carro = new CarroBuilderFluente()
            .buildMotor(motorVTEC)
            .buildPortas(portas)
            .buildComputadorBordo(computadorBordoSiemens)
            .buildFreioABS(freioBosch)
            .getCarro();

        // REALIZANDO OS TESTES
        assertNotNull(carro);
        assertNotNull(carro.getMotor());
        assertNotNull(carro.getPortas());
        assertTrue(carro.getPortas().length == 2);
        assertNotNull(carro.getComputadorBordo());
        assertNotNull(carro.getFreioABS());
    }
}