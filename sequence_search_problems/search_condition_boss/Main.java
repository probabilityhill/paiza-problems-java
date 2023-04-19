import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        final int N = sc.nextInt();
        final String[] NAMES = new String[N];
        final int[] SCORES = new int[N];
        for(int i = 0; i < N; i++) {
            NAMES[i] = sc.next();
            SCORES[i] = sc.nextInt();
        }
        final int PASSING_SCORE_MIN = sc.nextInt();
        final int PASSING_SCORE_MAX = sc.nextInt();
        for(int i = 0; i < N; i++) {
            if(SCORES[i] >= PASSING_SCORE_MIN && SCORES[i] <= PASSING_SCORE_MAX) {
                System.out.println(NAMES[i]);
            }
        }
    }
}
