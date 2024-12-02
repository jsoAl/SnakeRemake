package org.psnbtech;

import static org.junit.Assert.*;
import org.junit.Test;

public class TileTypeTest {

    @Test
    public void testTileTypes() {
        // Test if the enum values are correctly defined
        assertEquals("Fruit", TileType.Fruit.toString());
        assertEquals("SnakeHead", TileType.SnakeHead.toString());
        assertEquals("SnakeBody", TileType.SnakeBody.toString());
    }
}