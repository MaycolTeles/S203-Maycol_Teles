package com.inatel.arquitetura;

public class Pizza {

    private Boolean flagCheese = false;
    private Boolean flagPepperoni = false;
    private Integer size = 0;


    public Boolean getFlagCheese() {
        return flagCheese;
    }

    public void setFlagCheese(Boolean flagCheese) {
        this.flagCheese = flagCheese;
    }

    public Boolean getFlagPepperoni() {
        return flagPepperoni;
    }

    public void setFlagPepperoni(Boolean flagPepperoni) {
        this.flagPepperoni = flagPepperoni;
    }

    public Integer getSize() {
        return size;
    }

    public void setSize(Integer size) {
        this.size = size;
    }

}
