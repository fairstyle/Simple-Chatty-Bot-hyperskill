import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        // put your code here
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        int M = scanner.nextInt();
        int K = scanner.nextInt();

        if(N*M >= K && (K%N == 0 || K%M == 0))
            System.out.println("YES");
        else
            System.out.println("NO");

    }
}