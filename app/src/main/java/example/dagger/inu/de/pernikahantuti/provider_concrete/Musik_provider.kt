package example.dagger.inu.de.pernikahantuti.provider_concrete

import example.dagger.inu.de.pernikahantuti.harapan_interface.IMusik

class DangdutKoplo : IMusik {
    override val namaProvider = "koplo gang"
    override val isBergoyang = true
    override fun tipeMusik() = "dangdut progresif"

    override fun generateOutput(): String {
        return "nama provider:$namaProvider\n"+
                "tipe musik:${tipeMusik()}\n"+
                "isBergoyang:$isBergoyang"
    }
}

class Orchestra:IMusik{
    override val namaProvider = "Berlin Symphoniker"
    override val isBergoyang = false
    override fun tipeMusik() = "Classic orkestra"

    override fun generateOutput(): String {
        return "nama provider:$namaProvider\n"+
                "tipe musik:${tipeMusik()}\n"+
                "isBergoyang:$isBergoyang"
    }
}

