package br.pucpr.search;

public class BinarySearch {
    public static <T extends Comparable<T>> int search(T[] values, T target){
        if(values.length == 0 || values == null || target == null) {
            return -1;
        }

        int start = 0;
        int end = values.length - 1;

        while(start <= end){
            int mid = (start + end) / 2;
            int compare = values[mid].compareTo(target);

            if(compare == 0) return mid;
            if(compare < 0) start = mid + 1;
            if(compare > 0) end = mid - 1;
        }
        
        return -1;
    }
}
