package org.psnbtech;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class DirectionTest {
	@Before
	public void setUp() throws Exception {
	}

	@After
	public void tearDown() throws Exception {
	}
	@Test
	public void testEnumValues() {
        assertEquals(Direction.North, Direction.valueOf("North"));
        assertEquals(Direction.East, Direction.valueOf("East"));
        assertEquals(Direction.South, Direction.valueOf("South"));
        assertEquals(Direction.West, Direction.valueOf("West"));
	}
}
