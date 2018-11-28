package queue

import util.DataStructure
import util.For
import util.Node

class Queue<T> : Collection<T> {
    override val size: Int = 0
    private var head: Node<T>? = null
    private var tail: Node<T>? = null

    override fun contains(element: T): Boolean {
        for(obj in this){
            if( obj == element )
                return true
        }
        return false
    }

    override fun isEmpty(): Boolean {
        return size == 0
    }

    override fun containsAll(elements: Collection<T>): Boolean {
        for(element in elements){
            if(!contains(element)) return false
        }
        return true
    }

    override fun iterator(): Iterator<T> {
        return object: Iterator<T>{
            var node = head
            override fun hasNext(): Boolean {
                return node != null
            }

            override fun next(): T {
                if (!hasNext()) throw NoSuchElementException()
                val current = node!!
                node = current.next
                return current.value
            }
        }
    }

    fun add(item: T) {
        val newItem = Node(item)
        val tail = this.tail
        if (tail == null) {
            head = newItem
            this.tail = newItem
        } else {
            tail.next = newItem
            this.tail = newItem
        }
        size++
    }

    fun peek(): T {
        if (size == 0) throw NoSuchElementException()
        head?.let {
            return it.value
        }
    }


}