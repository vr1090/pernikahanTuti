package example.dagger.inu.de.pernikahantuti

import android.support.v7.app.AppCompatActivity
import android.os.Bundle

import javax.inject.Inject

import example.dagger.inu.de.pernikahantuti.harapan_interface.IBunga
import example.dagger.inu.de.pernikahantuti.harapan_interface.ICatering
import example.dagger.inu.de.pernikahantuti.harapan_interface.IGedung
import example.dagger.inu.de.pernikahantuti.harapan_interface.IMusik

class PernikahanTutiActivity : AppCompatActivity() {

    @Inject
    var musik: IMusik? = null

    @Inject
    var gedung: IGedung? = null

    @Inject
    var bunga: IBunga? = null

    @Inject
    var catering: ICatering? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        //Dagger.builder().build().isiAcara(this)
    }
}
