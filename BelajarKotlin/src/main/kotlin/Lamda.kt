fun main() {
    val namaPanjang: (String, String, String) -> String =
        { namaDepan: String, namaTengah: String, namaBelakang: String ->
            val namapanjang = "$namaDepan $namaTengah $namaBelakang"
            namapanjang
        }
    println(namaPanjang("Rayhan", "Lingga", "Buana"))
}