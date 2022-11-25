package com.inatel.arquitetura;

/**
 * Hello world!
 *
 */
public class CarroBuilderFluente {

    private Carro carro;

    private void validarPortas() {
        if (carro.getPortas() == null)
            throw new IllegalStateException("Não foi possível criar um Carro. O Carro está sem porta.");

        int numeroPortas = carro.getPortas().length;
        if (numeroPortas != 2 && numeroPortas != 4)
            throw new IllegalStateException("Não foi possível criar um Carro. O número de portas não é permitido (2 ou 4).");
    }

    private void validarMotor() {
        if (carro.getMotor() == null)
            throw new IllegalStateException("Não foi possível criar um Carro. O Carro está sem motor.");
    }

    public CarroBuilderFluente() {
        this.carro = new Carro();
    }

    public CarroBuilderFluente buildPortas(Porta[] portas) {
        carro.setPortas(portas);
        return this;
    }

    public CarroBuilderFluente buildMotor(Motor motor) {
        carro.setMotor(motor);
        return this;
    }

    public CarroBuilderFluente buildComputadorBordo(ComputadorBordo computadorBordo) {
        carro.setComputadorBordo(computadorBordo);
        return this;
    }

    public CarroBuilderFluente buildFreioABS(FreioABS freioABS) {
        carro.setFreioABS(freioABS);
        return this;
    }

    public Carro getCarro() {
        validarPortas();
        validarMotor();

        return carro;
    }

}
