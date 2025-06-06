package br.pucpr.sort;

import java.util.Arrays;
import java.util.function.Predicate;

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
      
        T pivot = values[values.length / 2];
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
        int totalLength = less.length + 1 + greater.length;
        T[] result = Arrays.copyOf(this.array, totalLength);  
        int index = 0;

        for(T e : less) result[index++] = e;
        result[index++] = pivot;
        for(T e : greater) result[index++] = e;

        return result;
    }
}
