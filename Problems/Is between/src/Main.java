import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // put your code here
        int numero1 = scanner.nextInt();
        int numero2 = scanner.nextInt();
        int numero3 = scanner.nextInt();

        boolean check1 = numero1 >= numero2 && numero1 <= numero3;
        boolean check2 = numero1 >= numero3 && numero1 <= numero2;

        System.out.println(check1 || check2);
    }
}