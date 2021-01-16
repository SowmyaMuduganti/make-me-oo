package org.oop;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class PointTest {
    @Test
    void twoPointsWithSameXAndYCoordinatesShouldHaveADistanceOfZero() {
        Point origin = new Point(0, 0);

        double actualDistance = origin.distance(origin);

        assertEquals(0, actualDistance);
    }

    @Test
    void distanceBetweenOriginAndPointOnUnitCircleShouldBeOne() {
        Point origin = new Point(0, 0);
        Point pointOnUnitCircle = new Point(1, 0);

        double actualDistance = origin.distance(pointOnUnitCircle);

        assertEquals(1, actualDistance);
    }

    @Test
    void distanceBetweenTwoOppositePointsOnUnitCircleShouldBeTwo() {
        Point point1 = new Point(1, 0);
        Point point2 = new Point(-1, 0);

        double actualDistance = point1.distance(point2);

        assertEquals(2, actualDistance);
    }

    @Test
    void originAndPointOnPositiveXAxisShouldBeZeroRadiansAway() {
        Point origin = new Point(0, 0);
        Point pointOnPositiveXAxis = new Point(1, 0);

        double actualDirection = origin.direction(pointOnPositiveXAxis);

        assertEquals(0, actualDirection);
    }

    @Test
    void originAndPointOnNegativeXAxisShouldBePiRadiansAway() {
        Point origin = new Point(0, 0);
        Point pointOnNegativeXAxis = new Point(-1, 0);

        double actualDirection = origin.direction(pointOnNegativeXAxis);

        assertEquals(Math.PI, actualDirection);
    }

    @Test
    void originAndPointOnYAxisShouldBeHalfPiRadiansAway() {
        Point origin = new Point(0, 0);
        Point pointOnPositiveYAxis = new Point(0, 1);

        double actualDirection = origin.direction(pointOnPositiveYAxis);

        assertEquals(Math.PI / 2, actualDirection);
    }
}
