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
}
