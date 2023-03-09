package data

class Street(jalan: String, kelurahan: String, kecamatan: String) {

    var jalan = jalan
    var kelurahan = kelurahan
    var kecamatan = kecamatan

    constructor(jalan: String, kelurahan: String) : this(jalan, kelurahan, "")

    constructor(jalan: String) : this(jalan, "")
}