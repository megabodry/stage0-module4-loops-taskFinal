package school.mjc.stage0.loops.finalTask;

public class Pyramid {
    public void printPyramid(int cathetusLength) {
        String pyramid = "";
        for (int i = 1; i <= cathetusLength; i++) {
            int space = cathetusLength - i;
            while (space > 0) {
                pyramid += " ";
                space--;
            }
            int temp = i;
            while (temp > 0) {
                pyramid += temp;
                temp--;
            }
            temp = 1;
            if (temp < i) {
                temp++;
                while (temp <= i) {
                    pyramid += temp;
                    temp++;
                }
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
        new Pyramid().printPyramid(7);
    }
}
