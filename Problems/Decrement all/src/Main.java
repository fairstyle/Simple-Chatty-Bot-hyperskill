import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // put your code here
        int numeroUno = scanner.nextInt();
        int numeroDos = scanner.nextInt();
        int numeroTres = scanner.nextInt();
        int numeroCuatro = scanner.nextInt();

        System.out.print(--numeroUno+ " " + --numeroDos + " " + --numeroTres + " " + --numeroCuatro);
    }
}