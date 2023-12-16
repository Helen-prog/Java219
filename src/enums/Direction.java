package enums;

import java.util.Random;

public enum Direction {
    TOP, RIGHT, BOTTOM, LEFT;
    private static final Random PRNG = new Random();
    public static Direction randomDirection()  {
        Direction[] directions = values();
        return directions[PRNG.nextInt(directions.length)];
    }
}
