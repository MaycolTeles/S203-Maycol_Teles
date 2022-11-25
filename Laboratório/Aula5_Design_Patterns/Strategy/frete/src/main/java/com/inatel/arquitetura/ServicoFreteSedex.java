package com.inatel.arquitetura;

public class ServicoFreteSedex implements Fretavel{

    @Override
    public double calcularValor(float pesoEmKgs) {
        if(pesoEmKgs < 10.00)
            return 50.00;

        if(pesoEmKgs < 20.00)
            return 70.00;

        return 90.00;
    }
    
}
