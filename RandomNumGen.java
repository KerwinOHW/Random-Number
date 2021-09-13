/**
 * @author OHW
 */
import java.util.Scanner;
public class RandomNumGen {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int b = 0;
        int c = 0;
        int n = scanner.nextInt();
        for (int i = 0; i < n; i++) {
            int a = (int)Math.floor(Math.random() * 100);
            System.out.println(a);
            if (a > 49){
                System.out.println("!");
                b++;
            } else {
                System.out.println("?");
                c++;
            }
            //sleep(2);
        }
        double v;
        v = (double) b / n;
        System.out.println(v);
    }


    public static void sleep(int second){
        try {
            Thread.sleep(500);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
