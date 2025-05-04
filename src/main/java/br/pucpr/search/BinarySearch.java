package br.pucpr.search;

/**
 * Binary search return the position of a target value in a sorted list
 * The running time is O(log n) -> 2^x = n
 * (x is number of operations, so, time = optime x n)
 */
public class BinarySearch {
    public static <T extends Comparable<T>> int search(T[] values, T target){
        if(!validParams(values, target)) return -1;

        int start = 0;
        int end = values.length - 1;
        
        //end of iterations -> start == end (final guess)
        while(start <= end){
            int mid = getMidIndex(start, end);
            int comparison = getComparison(values[mid], target);

            if(comparison == 0) return mid; //value[mid] is equal to target
            /**
             * values[mid] is less than tagert
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
            values.length == 0 || 
            values == null || 
            target == null
        );
    }

    private static int getMidIndex(int start, int end){
        return ((start + end) / 2);
    }

    private static <T extends Comparable<T>> int getComparison(T value, T target){
        /**
         * Returns a negative value if values[mid] is less than target
         * Returns 0 if equal
         * Return a positive value if greater
         */
        return value.compareTo(target);
    }
}
