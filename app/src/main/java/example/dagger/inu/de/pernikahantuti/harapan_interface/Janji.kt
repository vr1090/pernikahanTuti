package example.dagger.inu.de.pernikahantuti.harapan_interface

interface IBunga {
    val isHarum: Boolean
    fun tipeBunga(): String
}

interface ICatering {
    val menu: List<String>
    val isEnak: Boolean
}

interface IGedung {
    val isTidakRoboh: Boolean
    fun namaGedung(): String
}

interface IMusik {
    val isBergoyang: Boolean
    fun tipeMusik(): String
}
