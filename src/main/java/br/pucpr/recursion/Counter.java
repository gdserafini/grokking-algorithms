package br.pucpr.recursion;

public class Counter {

    public void count(int value){
        if(value <= 0) {
            System.err.println();
            return;
        }
        
        System.out.print(value + " ");
        count(value - 1);
    }

}
