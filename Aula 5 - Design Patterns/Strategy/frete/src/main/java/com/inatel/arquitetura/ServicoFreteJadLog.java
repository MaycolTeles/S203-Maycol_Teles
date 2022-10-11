package com.inatel.arquitetura;

public class ServicoFreteJadLog implements Fretavel{

    @Override
    public double calcularValor(float pesoEmKgs) {
        if(pesoEmKgs < 30.0)
            return 0.00;
        
        return 150.00;
    }
    
}
