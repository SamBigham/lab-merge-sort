import java.util.Arrays;
import java.util.Comparator;

/**
 * A simple way to sort arrays using merge sort.
 *
 * @author YourName Here
 * @author Your NameHere
 * @author Samuel A. Rebelsky
 */
public class MergeSorter {

  // +------------------+--------------------------------------------
  // | Exported methods |
  // +------------------+

  /**
   * Sort an array using the merge sort algorithm.
   */
  public static <T> void sort(T[] vals, Comparator<? super T> comparator) {
    // STUB
  } // sort

  // +-----------------+---------------------------------------------
  // | Local utilities |
  // +-----------------+

  /**
   * Merge the values from positions [lo..mid) and [mid..hi) back into
   * the same part of the array.
   *
   * Preconditions: Each subarray is sorted accorting to comparator.
   */

  static <T> void merge(T[] vals, int lo, int mid, int hi, Comparator<? super T> comparator) {
    
    T[] temparr = Arrays.copyOfRange(vals, lo, hi);

    for(int i = 0; i < hi; i++){
    if(comparator.compare(vals[lo], vals[mid]) > 0){
      temparr[i]= vals[mid];
      mid++;
    }else{
      temparr[i] = vals[lo];
      lo++;
    }
  }//for

  vals = temparr;

  } // merge


} // class MergeSorter
