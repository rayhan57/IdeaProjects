fun hai(nama: String = ""): String {
    return if (nama == "") {
        "Hai guys"
    } else {
        "Hai $nama"
    }
}

fun main() {
    println(hai())
}