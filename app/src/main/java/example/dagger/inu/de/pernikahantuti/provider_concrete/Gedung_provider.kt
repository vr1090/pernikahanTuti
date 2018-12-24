package example.dagger.inu.de.pernikahantuti.provider_concrete

import example.dagger.inu.de.pernikahantuti.harapan_interface.IGedung

class GedungBaru:IGedung{
    override val namaProvider = "Gedung hotel XYZ"
    override val isTidakRoboh = true
    override fun namaRuangan(): String {
        return "gedung XZY, Room 1"
    }

    override fun generateOutput(): String {
        return "nama provider:$namaProvider \n" +
                "nama ruangan:${namaRuangan()}\n " +
                "tidak roboh: $isTidakRoboh"
    }
}