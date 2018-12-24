package example.dagger.inu.de.pernikahantuti.di_event_organizer

import dagger.Component
import example.dagger.inu.de.pernikahantuti.PernikahanTutiActivity
import javax.inject.Singleton

@Component(modules = arrayOf(PernikahanTutiModule::class))
@Singleton
interface TifaComponent{
    fun inject(acara:PernikahanTutiActivity)
}
