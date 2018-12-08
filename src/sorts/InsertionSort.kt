package sorts

import sorts.base.SortAlgorithm
import util.exchange

class InsertionSort : SortAlgorithm() {
    override fun <T : Comparable<T>> perform(arr: Array<T>) {
        for( i in 1 until arr.size){
            for( j in i downTo 1){
                if( arr[ j - 1 ] < arr[j] ) break
                arr.exchange(j, j-1)
            }
        }
    }
}