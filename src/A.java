import java.util.Scanner;

public class A {
    public static void main(String[] args) {
        System.out.println("Hello World!");
        /*Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int n = scanner.nextInt();
        int m = scanner.nextInt();*/
        int a = 2;
        int b = 1;
        int n = 3;
        int m = 2;
        final int C = 1;
        double S = 0;

        /*if () {

        }*/
        boolean flag = true;
        for (int i = a; i <= n; i++) {
            if (i == C) {
                System.out.println("Ділення на нуль:(");
                flag = false;
                break;
            } else {
                for (int j = b; j <= m; j++) {
                    S = S + (i + j) / (i - C);
                }
            }
        }
        if (flag) {
            System.out.println(S);
        }
    }
}
//var a:integer;
//begin
//writeln('Hello World!')
//read(a);
//end.