package com.inatel.arquitetura;

/**
 * Hello world!
 *
 */
public class CarroBuilder {

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

    public CarroBuilder() {
        this.carro = new Carro();
    }

    public void buildPortas(Porta[] portas) {
        carro.setPortas(portas);
    }

    public void buildMotor(Motor motor) {
        carro.setMotor(motor);
    }

    public void buildComputadorBordo(ComputadorBordo computadorBordo) {
        carro.setComputadorBordo(computadorBordo);
    }

    public void buildFreioABS(FreioABS freioABS) {
        carro.setFreioABS(freioABS);
    }

    public Carro getCarro() {
        validarPortas();
        validarMotor();

        return carro;
    }

}
