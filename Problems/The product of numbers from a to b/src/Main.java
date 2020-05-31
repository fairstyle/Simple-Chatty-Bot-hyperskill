import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        // put your code here

        Scanner scanner = new Scanner(System.in);
        int from = scanner.nextInt();
        int to = scanner.nextInt();
        long aux = 1;

        for (int i = from; i < to; i++){
            aux = aux * i;
        }

        System.out.println(aux);
    }
}