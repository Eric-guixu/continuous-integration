package Samples;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class Test001 {
	 @Test
	 public void testA() {
			assertEquals(3, FloorSquareRoot.floorSqrt(11));
	 }

	 @Test
	 public void testB() {
			assertEquals(4, FloorSquareRoot.floorSqrt(20));
	 }
     @Test
     public void testC() {
        assertEquals(2, Samples.FloorSquareRoot.floorSqrt(2));
    }
}

