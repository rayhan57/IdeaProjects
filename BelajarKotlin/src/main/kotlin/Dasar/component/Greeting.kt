package Dasar.component

import java.text.SimpleDateFormat
import java.time.LocalTime
import java.time.format.DateTimeFormatter

fun greeting(name: String) {
    val waktuSekarang = LocalTime.now()
    val jam = waktuSekarang.hour
    val formatWaktu = DateTimeFormatter.ofPattern("HH:mm")
    val ucapan = when (jam) {
        in 5..10 -> "Selamat Pagi"
        in 11..15 -> "Selamat Siang"
        in 16..18 -> "Selamat Sore"
        else -> "Selamat Malam"
    }
    println("$ucapan $name")
    println("Sekarang jam ${waktuSekarang.format(formatWaktu)}")
}