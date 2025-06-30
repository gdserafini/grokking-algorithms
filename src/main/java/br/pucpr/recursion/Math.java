package br.pucpr.recursion;

public class Math {

    public int sum(int[] values, int start, int end){
        validateArrayIndexes(values, start, end);
        if(end - start == 0) return values[start];
        return values[start] + sum(values, start + 1, end);
    }

    public int size(int[] values, int start, int end){
        validateArrayIndexes(values, start, end);
        if(end - start == 0) return 1;
        return 1 + size(values, start + 1, end);
    }

    public int max(int[] values, int index, int max){
        if(index == values.length) return max;
        if(index < 0){
            throw new IllegalArgumentException("Invalid index");
        }
        if(values[index] > max) max = values[index];
        return max(values, index + 1, max);
    }

    private void validateArrayIndexes(int[] values, int start, int end){
        if(start < 0 || start >= values.length ||
            end < 0 || end >= values.length
        ){
            throw new IllegalArgumentException("Invalid index");
        }
    }

}
