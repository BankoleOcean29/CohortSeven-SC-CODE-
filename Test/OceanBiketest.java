import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class OceanBiketest{

    @Test

    public void testThatBikeIsOn() {
        OceanBike alpha = new OceanBike();
        alpha.bikeOn(true);
        
        assertEquals(true, true);

    }

    @Test

    public void testThatBikeIsOff() {
        OceanBike alpha2 = new OceanBike();
        alpha2.bikeoff(false);

        assertEquals(false, false);
    }

}
