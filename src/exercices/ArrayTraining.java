public class ArrayTraining {

    /**
     * @param n size of the array, eg: 3
     * @return an empty int array of size n, eg: {0, 0, 0}
     */
    public int[] emptyIntArray(int n) {
        int[] a = new int[n];
        return a;
    }

    /**
     * @param n size of the array, eg: 2
     * @return an empty String array of size n, eg: {null, null}
     */
    public String[] emptyStringArray(int n) {
        String[] a = new String[n];
        return a;
    }

    /**
     * @param a first value, eg: 3
     * @param b second value, eg: 2
     * @param c third value, eg: 1
     * @return an int array with a, b and c values, eg: {3, 2, 1}
     */
    public int[] intArray(int a, int b, int c) {
        int[] array = { a, b, c };
        return array;
    }

    /**
     * @param a first value, eg: "test"
     * @param b second value, eg: "sample"
     * @param c third value, eg: "value"
     * @return an int array with a, b and c values,
     * eg: {"test", sample", "value"}
     */
    public String[] stringArray(String a, String b, String c) {
        String[] array = { a, b, c };
        return array;
    }

    /**
     * @param array, eg: {1, 2, 3}
     * @return length of the array, eg: 1
     */
    public int length(int[] array) {
        int size = array.length;
        return size;
    }

    /**
     * @param array, eg: {3, 2, 1}
     * @return first value of the array, eg: 3
     */
    public int firstValue(int[] array) {
        int i = array[0];
        return i;
    }

    /**
     * @param array, eg: {3, 2, 1}
     * @return last value of the array, eg: 1
     */
    public int lastValue(int[] array) {

        int i = array[array.length - 1];
        return i;
    }

    /**
     * @param array,    eg: {3, 2, 1}
     * @param position, eg: 1
     * @return value of the array at position, eg: 2
     */
    public int valueAtPosition(int[] array, int position) {

        int i = array[position];
        return i;
    }

    /**
     * @param array,    eg: {3, 8, 5}
     * @param value,    eg: 4
     * @param position, eg: 1
     * @return the array with the value replaced at position, eg: {3, 4, 5}
     */
    public int[] replace(int[] array, int value, int position) {

        array[position] = value;
        return array;
    }

    /**
     * @param array, eg: {1, 2, 3}
     * @return sum of values of the array, eg: 6
     */
    public int sum(int[] array) {
        int sum = 0;
        for(int i : array) {
        sum += i;
        }
        return sum;
    }

    /**
     * @param array,  eg: {1, 2, 3}
     * @param search, eg: 2
     * @return if array contains searched value, eg: true
     */
    public boolean contains(int[] array, int search) {
        boolean bool = false;
        for(int i : array) {
            if (i == search ) {
                bool = true;
                break;
            } 
        }
        return bool;
    }

    /**
     * @param array, eg: {"sample", "value"}
     * @return array where all words are capitalized, eg: {"Sample", "Value"}
     */
    public String[] capitalize(String[] array) {

        for ( int i = 0; i <= array.length - 1; i++ ) {
            array[i] = array[i].substring( 0, 1 ).toUpperCase() + array[i].substring( 1, array[i].length() );
        }
        return array;
    }

    /**
     * @param first,  eg: {1, 2, 3}
     * @param second, eg: {3, 2, 1}
     * @return if values in first and second arrays, in the same position,
     * are equals, eg: false
     */
    public boolean equals(int[] first, int[] second) {
        boolean bool = true;
        // bool = Arrays.equals( first, second );
        if ( first.length == second.length ) {
            for ( int i = 0; i <= first.length - 1; i++ ) {
                if ( first[i] != second[i] ) {
                    bool = false;
                    break;
                }
            }
        }
        return bool;
    }

    /**
     * @param array, eg: {1, 2, 3}
     * @return array with reversed values, eg: {3, 2, 1}
     */
    public int[] reverse(int[] array) {

        int[] result = new int[array.length];
        int k = 0;
        for ( int i = array.length - 1; i >= 0; i-- ) {
            result[k] = array[i];
            k++;
        }

        return result;
    }

    /**
     * @param first,  eg: {1, 2, 3}
     * @param second, eg: {4, 5}
     * @return concatenates first and second values in one array,
     * eg: {1, 2, 3, 4, 5}
     */
    public int[] concat(int[] first, int[] second) {

        int[] result = new int[first.length + second.length];
        for ( int i = 0; i <= first.length - 1; i++ ) {
            result[i] = first[i];    
        }
        for ( int i = 0; i <= second.length - 1; i++ ) {
            result[first.length + i] = second[i];
        }
        return result;
    }
}
