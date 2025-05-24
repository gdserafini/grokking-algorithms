package br.pucpr.selectionSort;

public class SelectionSort<T extends Comparable<T>> {

    public T[] sort(T[] values){
        for(int i = 0; i < values.length; i++){
            for(int j = 0; j < values.length; j++){
                if(values[i].compareTo(values[j]) < 0){
                    T temp = values[i];
                    values[i] = values[j];
                    values[j] = temp;
                }
            }
        }
        return values;
    }
}
