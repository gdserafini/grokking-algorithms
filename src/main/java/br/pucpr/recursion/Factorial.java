package br.pucpr.recursion;

public class Factorial {

    public int calc(int value){
        validateValue(value);
        if(value == 0 || value == 1) return 1;
        return value * calc(value - 1);
    }

    private int calcTailHelper(int value, int acc){
        if(value == 0 || value == 1) return acc;
        return calcTailHelper(value - 1, value * acc);
    }

    /*
     *Note: The JVM do not optmize for tail recurssion
     *Java still uses the call stack
    */
    public int calcTail(int value){
        validateValue(value);
        return calcTailHelper(value, 1);
    }

    private void validateValue(int value){
        if(value < 0) {
            throw new IllegalArgumentException(
                "Invalid value: " + value
            );
        }
    }
}
