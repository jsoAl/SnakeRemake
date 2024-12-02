package org.psnbtech;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class ClockTest {
	private Clock clock;
	@Before
    public void setUp() {
    	// Set clock to 60 cycles per second
        clock = new Clock(60); 
    }

    @After
    public void tearDown() {
        clock = null;
    }
    @Test
    public void testClock() {
        // Check if the clock is initialized properly
        assertNotNull(clock);
    }
	@Test
    public void testReset() {
        
		// Update clock to have elapsed cycles
        clock.update();
        clock.update();

        // Reset the clock
        clock.reset();

        // Check if the elapsed cycles are reset
        assertFalse(clock.hasElapsedCycle());
    }
	@Test
    public void testIsPaused() {
        // Initially, the clock should not be paused
        assertFalse(clock.isPaused());
    }
}
