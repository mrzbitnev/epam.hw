package com.zbitnev.epam.seabattle.ships;

import org.junit.Assert;
import org.junit.Test;

public class ShipCreatorTest {
    CoordinatesList coordinatesList = new CoordinatesList();
    int deck = 4;
    String ship = "◼";

    @Test
    public void testSetShip() {
        int shipIndex = 0;
        ShipCreator shipCreator = new ShipCreator();
        shipCreator.setShip(coordinatesList, deck);

        for (Coordinates coordinates : coordinatesList.getList()) {
            if (coordinates.getValue().equals(ship)) {
                shipIndex++;
            }
        }
        Assert.assertEquals(deck, shipIndex);
    }
}