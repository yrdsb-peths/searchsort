package searchsort;

/**
 * Abstract class for sorting algorithms.
 * 
 */
public abstract class Sort {
    /**
     * Sort the array arr.
     * 
     * @param arr The array to be sorted.
     */
    abstract public void sort(int[] arr);

    /**
     * Sort the array and return the time taken in milliseconds.
     * 
     * @param arr The array to be sorted.
     * @return The time taken to sort the array in milliseconds.
     */
    public long timedSort(int[] arr) {
        long startTime = System.currentTimeMillis();
        sort(arr);
        long endTime = System.currentTimeMillis();
        return endTime - startTime;
    }
}
