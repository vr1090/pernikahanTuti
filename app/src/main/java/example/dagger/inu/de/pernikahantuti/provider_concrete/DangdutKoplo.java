package example.dagger.inu.de.pernikahantuti.provider_concrete;

import example.dagger.inu.de.pernikahantuti.harapan_interface.IMusik;

public class DangdutKoplo implements IMusik {
    @Override
    public String tipeMusik() {
        return "dangdut progresif";
    }

    @Override
    public boolean isBergoyang() {
        return true;
    }
}
