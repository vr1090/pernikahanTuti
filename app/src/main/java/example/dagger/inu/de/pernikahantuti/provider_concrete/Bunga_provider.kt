package example.dagger.inu.de.pernikahantuti.provider_concrete

import example.dagger.inu.de.pernikahantuti.harapan_interface.IBunga

class TokoBungaHarum:IBunga{
    override val isHarum = true
    override val namaProvider = "Toko Bunga Harum"
    override fun tipeBunga() = "Mawar Merah Putih"

    override fun generateOutput(): String {
        return "nama provider:$namaProvider \n"+
                "tipe bunga: ${tipeBunga()} \n"+
                "isharum: $isHarum"
    }
}