public class Cycle {	
    public static void main(String[] args) {
        int i;
        for(i = 0; i < 21; i++) {
            System.out.println("i = " + i);
        }

        i = 6;
        while (i >= -6) {
            System.out.println("i = " + i);
            i -= 2;
        }

        i = 10;
        int sum = 0;
        do {
            if (i % 2 != 0) {
                sum += i;
            }
            ++i;
        } while (i <= 20);
        System.out.println("sum = " + sum);
    }
}