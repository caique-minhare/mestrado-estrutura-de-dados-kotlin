package util

fun <T> For(it: Iterator<T>, cb: (T) -> Unit){
    while (it.hasNext())
        cb(it.next())
}