package util

abstract class DataStructure<T>(var size: Int){
    abstract fun isEmpty() : Boolean
    abstract fun contains(element: T): Boolean
}