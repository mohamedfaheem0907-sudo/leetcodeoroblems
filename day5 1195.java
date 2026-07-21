import java.util.concurrent.Semaphore;
import java.util.function.IntConsumer;

class FizzBuzz {
    private int n;
    // Define your semaphores here for coordination
    // e.g., private Semaphore fizzSem = new Semaphore(0);

    public FizzBuzz(int n) {
        this.n = n;
    }

    // printFizz.run() outputs "fizz".
    public void fizz(Runnable printFizz) throws InterruptedException {
        for (int i = 1; i <= n; i++) {
            // 1. Check if i is divisible by 3 and NOT by 5
            // 2. Wait for your turn
            // 3. printFizz.run()
            // 4. Signal the next thread
        }
    }

    // printBuzz.run() outputs "buzz".
    public void buzz(Runnable printBuzz) throws InterruptedException {
        // Implement logic for divisible by 5 and NOT by 3
    }

    // printFizzBuzz.run() outputs "fizzbuzz".
    public void fizzbuzz(Runnable printFizzBuzz) throws InterruptedException {
        // Implement logic for divisible by 15
    }

    // printNumber.accept(int) outputs "n", where n is an integer.
    public void number(IntConsumer printNumber) throws InterruptedException {
        // Implement logic for numbers not divisible by 3 or 5
    }
}
