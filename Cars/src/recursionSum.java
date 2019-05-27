import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class recursionSum {
    public static void main(String[] args) throws IOException {
        BufferedReader stdin = new BufferedReader(new InputStreamReader(System.in));
        int num = Integer.parseInt(stdin.readLine());
        Sum sum = new Sum();
        System.out.print(Sum.sum(num));
    }

   static class Sum {
        // рекурсивный метод
        static int sum(int n) {
            int result;

            if (n == 1)
                return 1;
            result = sum(n - 1) + n;
            return result;
        }
    }
}
