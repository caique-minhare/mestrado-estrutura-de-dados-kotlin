import queue.Queue

fun main(args: Array<String>){
    val queue = Queue<Int>(10)
    queue.add(10)
    print(queue.peek())
    print(queue.isEmpty())
}