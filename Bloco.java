package br.edu.unespar.sistemadeblocos;

public class Bloco {
    
    private double massa;
    private double tensao;

    public Bloco(double massa) {
        this.massa = massa;
        this.tensao = 0.0;
    }
    
    public double getMassa(){
        return massa;
    }
    
    public double getTensao(){
        return tensao;
    }
    
    public void setTensao(double tensao){
        this.tensao = tensao;
    }
    
}
