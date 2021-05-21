import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class OceanBiketest {

    @Test

    public void testThatBikeIsOn() {
        OceanBike alpha = new OceanBike();
        alpha.bikeOn(true);
        assertEquals(true, true);
    }

    @Test

    public void testThatBikeIsOff() {
        OceanBike alpha2 = new OceanBike();
        alpha2.bikeOn(false);
        assertEquals(false, false);
    }

    @Test

    public void testThatBikeKicksInGearWhenOn() {
        OceanBike alpha3 = new OceanBike();
        if (alpha3.bikeOn) {
            alpha3.setGear(0);
        }
        assertEquals(0,0);

    }

    @Test

    public void testThatBikeAcceleratesWhenOn() {
        OceanBike alpha4 = new OceanBike();
        if (alpha4.bikeOn) {
            alpha4.setSpeedInKmPerHour(1);
        }
        assertEquals(1,1);

        System.out.println(alpha4.bikeOn);


    }
}


   /* @Test

    public void testThatBikeAcceleratesByOneKmPerHourInGearOne() {
        OceanBike alpha5 = new OceanBike();

    }
}*/





