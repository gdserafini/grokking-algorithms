package br.pucpr.recursion;

public class Sum {

    public int calc(int[] values, int start, int end){
        if(end - start == 0) return values[start];
        return values[start] + calc(values, start + 1, end);
    }

}
