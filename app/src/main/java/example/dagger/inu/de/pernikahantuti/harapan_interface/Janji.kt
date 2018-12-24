package example.dagger.inu.de.pernikahantuti.harapan_interface

interface general{
    val namaProvider:String
    fun generateOutput():String=""
}

interface IBunga: general {
    val isHarum: Boolean
    fun tipeBunga(): String
}

interface ICatering: general {
    val menu: List<String>
    val isEnak: Boolean
}

interface IGedung:general {
    val isTidakRoboh: Boolean
    fun namaRuangan(): String
}

interface IMusik:general {
    val isBergoyang: Boolean
    fun tipeMusik(): String
}
