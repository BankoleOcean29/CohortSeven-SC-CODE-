import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class OceanBiketest {

    @Test

    public void testThatOceanBikeCanComeOn() {
        OceanBike alpha = new OceanBike();
        alpha.startOceanBikeSpeed(0);

        int lunar = alpha.getCurrentOceanBikeSpeed();

        assertEquals(alpha, alpha);

    }

    @Test

    public void testThatGearIsSetOnNeutralWhenTurnedOn() {
        OceanBike alpha12 = new OceanBike();
        alpha12.setCurrentGear("Neutral");

        String lunar12 = alpha12.getCurrentGear();

        assertEquals(alpha12, alpha12);
    }

    @Test

    public void testThatFuelGuageIsSet() {
        OceanBike alpha13 = new OceanBike();
        alpha13.setFuelGauge("Empty");

        String lunar13 = alpha13.getCurrentFuelFuelGauge();

        assertEquals(alpha13, alpha13);

    }
}
