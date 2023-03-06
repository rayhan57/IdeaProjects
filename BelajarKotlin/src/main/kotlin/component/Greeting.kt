package component

import java.time.LocalTime

fun greeting(name: String) {
    val jamSekarang = LocalTime.now().hour
    val ucapan = when (jamSekarang) {
        in 5..10 -> "Selamat Pagi"
        in 11..15 -> "Selamat Siang"
        in 16..18 -> "Selamat Sore"
        else -> "Selamat Malam"
    }
    println("$ucapan $name")
}