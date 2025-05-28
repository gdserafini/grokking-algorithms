package br.pucpr.selectionSort;

public class SelectionSort<T extends Comparable<T>> {

    public T[] sort(T[] values){
        if(values == null || values.length == 0) return values;
        
        for(int i = 0; i < values.length; i++){
            for(int j = 0; j < values.length; j++){
                if(values[i].compareTo(values[j]) < 0){
                    changeElementsPosition(values[i], values[j]);
                }
            }
        }
        return values;
    }

    public void changeElementsPosition(T value1, T value2){
        T temp = value1;
        value1 = value2;
        value2 = temp;
    }
}
