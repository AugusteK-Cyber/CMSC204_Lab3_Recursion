/**
 * A recursive method to sum the values in an array of integers
 * @author Auguste K.
 *
 */
public class ArraySum {
	
	/**
	 * No-arg constructor
	 */
	public ArraySum() {}
	
	/**
	 * The recursive method to sum the elements of the array
	 * @param a an array of type Integer that is specified in the driver file
	 * @param index an integer that shows which number in the array to sum next
	 * @return sum of the elements of the array based on the index provided
	 */
	public int sumOfArray (Integer[] a,int index) {
		if (index < 0) {
			return 0; // return 0 for an index that is less than 0
		}
		return sumOfArray(a, index-1) + a[index]; // return statement
	}

}
