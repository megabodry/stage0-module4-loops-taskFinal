package school.mjc.stage0.loops.finalTask;

public class HalfPyramid {
    public void printHalfPyramid(int cathetusLength) {
        String pyramid = "";
        for (int i = 1; i <= cathetusLength; i++) {
            int space = cathetusLength - i;
            while (space > 0) {
                pyramid += " ";
                space--;
            }
            int temp = i;
            while (temp > 0) {
                pyramid += "*";
                temp--;
            }
            if (i != cathetusLength) {
                pyramid += "\n";
            }
        }
        if (pyramid == "") {
            System.out.print(pyramid);
        } else {
            System.out.println(pyramid);
        }
    }

    public static void main(String[] args) {
        new HalfPyramid().printHalfPyramid(8);
    }
}
