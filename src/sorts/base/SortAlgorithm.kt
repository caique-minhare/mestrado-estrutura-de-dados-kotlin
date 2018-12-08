package sorts.base

abstract class SortAlgorithm{
    abstract fun<T : Comparable<T>> perform(arr: Array<T>)
}