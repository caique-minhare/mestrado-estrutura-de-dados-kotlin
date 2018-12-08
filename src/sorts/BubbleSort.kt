package sorts

import sorts.base.SortAlgorithm
import util.exchange

class BubbleSort : SortAlgorithm() {
    override fun <T : Comparable<T>> perform(arr: Array<T>) {
        var doesTheElementWasExchanged: Boolean
        do {
            doesTheElementWasExchanged = false
            for (i in 1 until arr.size) {
                if (arr[i] < arr[i - 1]) {
                    arr.exchange(i, i - 1)
                    doesTheElementWasExchanged = true
                }
            }
        } while (doesTheElementWasExchanged)
    }

}