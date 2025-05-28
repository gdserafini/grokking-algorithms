package br.pucpr.arrayList;

public class ArrayList<T extends Comparable<T>> {
    private Object[] values;
    private int size;
    private int lastEmptyIndex;
    private final int INIT_SIZE = 10;
    private final double INCREASE_FACTOR = 1.5;

    public ArrayList(){
        this.values = new Object[this.INIT_SIZE];
        this.size = this.INIT_SIZE;
        this.lastEmptyIndex = 0;
    }
}
