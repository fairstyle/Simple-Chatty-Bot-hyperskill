import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int numero1 = scanner.nextInt();
        int numero2 = scanner.nextInt();
        int numero3 = scanner.nextInt();

        boolean check1 = numero1>0 && numero2>0;
        boolean check2 = numero1>0 && numero3>0;
        boolean check3 = numero2>0 && numero3>0;

        boolean notcheck1 = !check1;
        boolean notcheck2 = !check2;
        boolean notcheck3 = !check3;

        System.out.println((notcheck1 && notcheck2) && notcheck3);

    }
}