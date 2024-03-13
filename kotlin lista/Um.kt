fun isPar(num: Int): Boolean {
    if (num % 2 == 0) {
        return true
    }
    return false
}

fun main() {
    println(" o número é par? ${isPar(2)}")
}
