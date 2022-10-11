package com.inatel.arquitetura;

public class ServicoFreteDHL implements Fretavel {

    @Override
    public double calcularValor(float pesoEmKgs) {
        if(pesoEmKgs < 20.00)
            return 100.00;

        return 90.00;
    }
    
}
