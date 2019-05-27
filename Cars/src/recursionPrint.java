import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class recursionPrint {
    public static void main(String[] args) throws IOException {
        BufferedReader stdin = new BufferedReader(new InputStreamReader(System.in));
        int num = Integer.parseInt(stdin.readLine());
       printNum(num,num);
    }

    private static void printNum (int num, int i){
        System.out.print(num-i+1+" ");
        if(i==1)
            return;
        i--;
        printNum(num,i);
    }
}

