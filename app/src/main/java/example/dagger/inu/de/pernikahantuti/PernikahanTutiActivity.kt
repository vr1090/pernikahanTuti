package example.dagger.inu.de.pernikahantuti

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import example.dagger.inu.de.pernikahantuti.di_event_organizer.DaggerTifaComponent
import example.dagger.inu.de.pernikahantuti.di_event_organizer.TifaComponent
import example.dagger.inu.de.pernikahantuti.di_event_organizer.VegetarianModule

import javax.inject.Inject

import example.dagger.inu.de.pernikahantuti.harapan_interface.IBunga
import example.dagger.inu.de.pernikahantuti.harapan_interface.ICatering
import example.dagger.inu.de.pernikahantuti.harapan_interface.IGedung
import example.dagger.inu.de.pernikahantuti.harapan_interface.IMusik

class PernikahanTutiActivity : AppCompatActivity() {

    @Inject
    lateinit var musik: IMusik

    @Inject
    lateinit var gedung: IGedung

    @Inject
    lateinit var bunga: IBunga

    @Inject
    lateinit var catering: ICatering

    lateinit var deskripsiGedung:TextView
    lateinit var deskripsiBunga:TextView
    lateinit var deskripsiKatering:TextView
    lateinit var deskripsiMusik:TextView
    lateinit var statusAcara:TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        deskripsiGedung = findViewById(R.id.profile_gedung)
        deskripsiMusik = findViewById(R.id.profile_musik)
        deskripsiBunga = findViewById(R.id.profile_bunga)
        deskripsiKatering = findViewById(R.id.profile_katering)
        statusAcara = findViewById(R.id.status_acara)

        val tifaComponent:TifaComponent = DaggerTifaComponent
                .builder()
               // .pernikahanTutiModule(VegetarianModule()) //un comment me!!
                .build()
        tifaComponent.inject(this)
        setupView()
        setupStatusAcara()
    }

    private fun setupView(){
        deskripsiGedung.text = gedung.generateOutput()
        deskripsiBunga.text = bunga.generateOutput()
        deskripsiMusik.text = musik.generateOutput()
        deskripsiKatering.text = catering.generateOutput()
    }

    private fun setupStatusAcara(){
        val isSuccess = musik.isBergoyang && gedung.isTidakRoboh && catering.isEnak &&bunga.isHarum

        statusAcara.text = if(isSuccess) "Sukses" else "Gagal"

    }
}
