private val fizzChars = intArrayOf(0b1000110, 0b1110101, 0b1100011, 0b1101011);
private val buzzChars = intArrayOf(0b1010100, 0b1101000, 0b1101001, 0b1110011);
private val fizz = fizzChars.map { it.toChar() }.toTypedArray()
    .joinToString(separator = "") { it.toString() };
private val buzz = buzzChars.map { it.toChar() }.toTypedArray()
    .joinToString(separator = "") { it.toString() };

fun main() {
    println(getFizzBuzz(15))
}

fun getFizzBuzz(n: Int): String {
    var out = "";
    val test1 = 3;
    val test2 = 5;

    if (n % test1 == 0) {
        out += fizz;
    }
    if (n % test2 == 0) {
        out += buzz;
    }

    if (out.isEmpty()) out += n;

    return out;
}