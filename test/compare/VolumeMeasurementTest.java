package compare;

import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class VolumeMeasurementTest {

    @Test
    public void one_gallon_should_be_equals_to_three_point_seventy_eight_litres() throws Exception{
        VolumeMeasurement one_gallon= new VolumeMeasurement(1, VolumeUnit.GALLON);
        VolumeMeasurement  threePointSeventyEight_litre= new VolumeMeasurement(3.78 , VolumeUnit.LITRE);
        assertTrue(one_gallon.equalsTo(threePointSeventyEight_litre));
    }
    
    @Test
    public void add_should_add_one_gallon_with_one_litre_and_give_four_point_seven_eight_litres()throws Exception{
        VolumeMeasurement one_gallon= new VolumeMeasurement(1, VolumeUnit.GALLON);
        VolumeMeasurement one_litre = new VolumeMeasurement(1, VolumeUnit.LITRE);
        VolumeMeasurement fourPointSeventyEight_litre = new VolumeMeasurement(4.78, VolumeUnit.LITRE);
        assertEquals(fourPointSeventyEight_litre ,one_gallon.add(one_litre));
    }
}