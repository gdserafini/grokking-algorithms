package br.pucpr.sort;

public class BubbleSort<T extends Comparable<T>> {

    public T[] sort(T[] values){
        if(values == null || values.length == 0) return values;

        int subArraySizeDecrease = 0;
        
        for(int i = 0; i < values.length; i++){            
            for(int j = 0; j < values.length - 1 - subArraySizeDecrease; j++){
                if(values[i].compareTo(values[j + 1]) > 0){
                    T temp = values[j];
                    values[j] = values[j + 1];
                    values[j + 1] = temp;
                }
            }

            subArraySizeDecrease++;
        }
        return values;
    }
}
