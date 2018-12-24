package example.dagger.inu.de.pernikahantuti.provider_concrete;

import example.dagger.inu.de.pernikahantuti.harapan_interface.IMusik;

public class Orchestra implements IMusik {
    @Override
    public String tipeMusik() {
        return "classic";
    }

    @Override
    public boolean isBergoyang() {
        return false;
    }
}
