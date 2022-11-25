package com.inatel.arquitetura;

public class CalculadoraFrete {

    public double calcularValor(String servico, float pesoEmKgs) {

        if(servico == "sedex"){
            if(pesoEmKgs < 35.00)
                return 0;
            return 50;
        }

    }

}
