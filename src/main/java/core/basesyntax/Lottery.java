package core.basesyntax;

import java.util.Random;

public class Lottery {
    private final ColorSupplier colorSupplier = new ColorSupplier();
    private final Random random = new Random();

    private static final int MAX_NUMBER = 101;

    public Ball getRandomBall(){
        String color = colorSupplier.getRandomColor();
        int number = random.nextInt(MAX_NUMBER);

        return new Ball(color, number);
    }
}
