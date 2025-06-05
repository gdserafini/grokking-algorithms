package br.pucpr.sort;

import java.util.Arrays;

public class QuickSort<T extends Comparable<T>> {

    private T[] array;
    private int counter;

    public QuickSort(){
        this.counter = 0;
    }

    public T[] sort(T[] values){
        if(values.length <= 1) return values;
      
        if(counter == 0) {
            this.array = values;
            this.counter++;
        }
      
        T pivot = values[0];
        T[] less = sort(filterArray(values, e -> e.compareTo(pivot) < 0));
        T[] greater = sort(filterArray(values, e -> e.compareTo(pivot) > 0));

        return concatArrays(less, pivot, greater);
    }

    private T[] filterArray(T[] values, Predicate<T> predicate){
        return Arrays
            .stream(values)
            .filter(predicate)
            .toArray(size -> Arrays.copyOf(values, size));
    }

    private T[] concatArrays(T[] less, T pivot, T[] greater){
        T[] result = Arrays.copyOf(this.array, this.array.length);  
        int index = 0;

        for(T e : less) result[index++] = e;
        result[index++] = pivot;
        for(T e : greater) result[index++] = e;

        return result;
    }
}
