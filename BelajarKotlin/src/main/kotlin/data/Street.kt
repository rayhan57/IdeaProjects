package data

class Street(paramJalan: String, paramKelurahan: String, paramKecamatan: String) {

    var jalan = paramJalan
    var kelurahan = paramKelurahan
    var kecamatan = paramKecamatan

    constructor(paramJalan: String, paramKelurahan: String) : this(paramJalan, paramKelurahan, "")

    constructor(paramJalan: String) : this(paramJalan, "")
}