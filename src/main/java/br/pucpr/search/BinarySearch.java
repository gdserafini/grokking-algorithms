package br.pucpr.search;

/**
 * Binary search return the position of a target value in a sorted list
 * The running time is O(log n) -> 2^x = n -> growth of number of operations
 * (x is number of operations, so, time = optime x n)
 */
public class BinarySearch {
    public static <T extends Comparable<T>> int search(T[] values, T target){
        if(!validParams(values, target)) return -1;

        int start = 0;
        int end = values.length - 1;
        
        //end of iterations -> start == end (final guess)
        while(start <= end){
            int mid = (start + end) / 2;
            validateMidValue(values, mid);
            int comparison = values[mid].compareTo(target); //compares values[mid] with target

            if(comparison == 0) return mid; //value[mid] is equal to target
            /**
             * values[mid] is less than target
             * So, the binary search will use the upper half of the list:
             * start = next position from mid (mid + 1)
             */
            if(comparison < 0) start = mid + 1;
            /**
             * values[mid] is greater than target
             * So, the BS will use the lower half of the list:
             * end = previous position from the mid (mid - 1)
             * @param <T>
             */
            if(comparison > 0) end = mid - 1;
        }
        
        return -1; //not find
    }

    private static <T> boolean validParams(T[] values, T target){
        return !(
            values == null || 
            target == null ||
            values.length == 0 
        );
    }

    private static <T> void validateMidValue(T[] values, int mid){
        if(values[mid] == null){
            throw new IllegalArgumentException(
                "Array contains a null value at index: " + mid
            );
        }
    }
}
