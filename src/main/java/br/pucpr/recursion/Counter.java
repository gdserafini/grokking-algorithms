package br.pucpr.recursion;

public class Counter {

    public int count(int value){
        if(value <= 0) {
            System.err.println();
            return value;
        }
        
        System.out.print(value + " ");
        return count(value - 1);
    }

}
