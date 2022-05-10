package com.mycompany.estudoheranca;

public abstract class Cafe {
        //fraco 0
        //normal 1
        //forte 2
    int tipo;
    
    public Cafe(){
        tipo = 1;
    }
    
    public Cafe(int t){
        this.tipo = tipo;
    }
    
    /* metodos assim não sabem como irão funcionar nas classes filhas */
    protected abstract void preparaCafe();
    
}
