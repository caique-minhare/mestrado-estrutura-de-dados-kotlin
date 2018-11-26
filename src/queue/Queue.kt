package queue

import util.DataStructure
import util.Node

class Queue<T>(sizeOfTheQueue: Int) : DataStructure<T>(sizeOfTheQueue) {

    private var head : Node<T>? = null
    private var tail : Node<T>? = null

    override fun isEmpty(): Boolean {
        return size == 0
    }

    override fun contains(element: T): Boolean {
        for (obj in this){
            if(obj == element)
                return true
        }
        return false
    }

    fun add(item: T){
        val newItem = Node(item)
        val tail = this.tail
        if(tail == null){
            head = newItem
            this.tail = newItem
        }else{
            tail.next = newItem
            this.tail = newItem
        }
        size++
    }

    fun peek() : T{
        if(size == 0) throw NoSuchElementException()
        head?.let {
            return it.value
        }
    }


}