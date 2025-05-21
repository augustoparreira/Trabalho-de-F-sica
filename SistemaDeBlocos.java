package br.edu.unespar.sistemadeblocos;

import java.util.Scanner;

public class SistemaDeBlocos {

    public static void main(String[] args) {
        new InterfaceDoProjeto().setVisible(true);

    }


    public static double calcularAceleracao(Bloco b1, Bloco b2, Bloco b3, double forcaTotal) {
        double massaTotal = b1.getMassa() + b2.getMassa() + b3.getMassa();
        return forcaTotal / massaTotal;
    }

    public static void calcularTensao(Bloco b1, Bloco b2, Bloco b3, double aceleracao) {
        
        double tensao1 = b1.getMassa() * aceleracao;
        b1.setTensao(tensao1);

        double tensao2 = b2.getMassa() * aceleracao + b1.getTensao();
        b2.setTensao(tensao2);

    }
    

}
