package br.pucpr.recursion;

public class Math {

    public int sum(int[] values, int start, int end){
        if(end - start == 0) return values[start];
        return values[start] + calc(values, start + 1, end);
    }

}
