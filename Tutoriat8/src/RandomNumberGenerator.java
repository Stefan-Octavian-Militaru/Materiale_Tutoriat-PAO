import java.util.function.Supplier;

public class RandomNumberGenerator {
    public int generateEvenNumbers (int min, int max) {
        Supplier<Integer> supplier = () -> (min + (int)(Math.random() * (max - min) / 2)) *2;
        return supplier.get();
    }
}
