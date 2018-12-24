package example.dagger.inu.de.pernikahantuti.provider_concrete

import example.dagger.inu.de.pernikahantuti.harapan_interface.ICatering

class KateringMbakYu:ICatering{
    override val isEnak = true
    override val menu = listOf("ayam","daging", "no sayuran")
    override val namaProvider= "Katering mbak yu"

    override fun generateOutput(): String {
        return "nama provider:$namaProvider\n"+
                "menu:${menu.joinToString()}\n"+
                "enak:$isEnak"
    }
}

class KateringVeggie:ICatering{
    override val isEnak = false
    override val menu = listOf("brokoli","kentang")
    override val namaProvider= "vegetarian food"

    override fun generateOutput(): String {
        return "nama provider:$namaProvider\n"+
                "menu:${menu.joinToString()}\n"+
                "enak:$isEnak"
    }
}
