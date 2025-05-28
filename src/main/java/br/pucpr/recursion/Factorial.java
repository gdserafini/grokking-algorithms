package br.pucpr.recursion;

public class Factorial {

    public int calc(int value){
        if(value < 0) throw new IllegalArgumentException("Invalid value: " + value);
        if(value == 0) return 1;
        return value * calc(value - 1);
    }

}
