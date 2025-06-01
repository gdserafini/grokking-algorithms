package br.pucpr.euclid;

import org.javatuples.Pair;

public class Euclid {

    public Pair<Integer, Integer> getMaxSides(int height, int width){
        int gcd = getGCD(height, width);
        return new Pair<Integer,Integer>(gcd, gcd);
    }

    public int getGCD(int value1, int value2){
        if(value2 == 0) return value1;
        return getGCD(value2, value1 % value2);
    }

}
