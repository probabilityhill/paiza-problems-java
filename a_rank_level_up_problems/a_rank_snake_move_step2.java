import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int y = sc.nextInt();
        int x = sc.nextInt();
        final int N = sc.nextInt();
        for(int i = 0; i < N; i++) {
            String dir = sc.next();
            if(dir.equals("N")) {
                y--;
            }
            else if(dir.equals("W")) {
                x--;
            }
            else if(dir.equals("E")) {
                x++;
            }
            else {
                y++;
            }
            System.out.println(y + " " + x);            
        }
    }
}
