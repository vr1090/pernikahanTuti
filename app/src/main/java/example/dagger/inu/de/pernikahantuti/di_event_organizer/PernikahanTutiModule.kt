package example.dagger.inu.de.pernikahantuti.di_event_organizer

import dagger.Module
import dagger.Provides
import example.dagger.inu.de.pernikahantuti.harapan_interface.IBunga
import example.dagger.inu.de.pernikahantuti.harapan_interface.ICatering
import example.dagger.inu.de.pernikahantuti.harapan_interface.IGedung
import example.dagger.inu.de.pernikahantuti.harapan_interface.IMusik
import example.dagger.inu.de.pernikahantuti.provider_concrete.*

@Module
open class PernikahanTutiModule {
    @Provides fun bunga():IBunga{
        return TokoBungaHarum()
    }

    @Provides fun gedung():IGedung{
        return GedungBaru()
    }

    open @Provides fun katering():ICatering{
        return KateringMbakYu()
    }

    @Provides fun musik():IMusik{
        return DangdutKoplo()
    }
}


class VegetarianModule:PernikahanTutiModule(){
    override fun katering(): ICatering {
        return KateringVeggie()
    }
}