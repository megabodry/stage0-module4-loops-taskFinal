package school.mjc.stage0.loops.finalTask;

public class Power {
    public void printPower(int numberToPrint, int power) {
        int result = 1;
        while (power > 0) {
            result *= numberToPrint;
            power--;
        }
        System.out.println(result);
    }

    public static void main(String[] args) {
        new Power().printPower(10, 3);
    }
}
