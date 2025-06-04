package br.pucpr.sort;

import java.util.Arrays;

public class QuickSort<T extends Comparable<T>> {

    private T[] array;
    private int counter;

    public QuickSort(){
        this.counter = 0;
    }

    public T[] sort(T[] array){
        if(array.length <= 1) return array;
      
        if(counter == 0) this.array = array;
        counter++;
      
        T pivot = array[0];
        T[] less = sort(filterArray(array, e -> e.compareTo(pivot) < 0));
        T[] greater = sort(filterArray(array, e -> e.compareTo(pivot) > 0));

        return concatArrays(less, pivot, greater);
    }

    private T[] filterArray(T[] array, Predicate<T> predicate){
        return Arrays
            .stream(array)
            .filter(predicate)
            .toArray(size -> Arrays.copyOf(array, size));
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
