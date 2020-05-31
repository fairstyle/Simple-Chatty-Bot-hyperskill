import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // put your code here
        int hora1 = scanner.nextInt();
        int minuto1 = scanner.nextInt();
        int segundo1 = scanner.nextInt();

        int hora2 = scanner.nextInt();
        int minuto2 = scanner.nextInt();
        int segundo2 = scanner.nextInt();

        int segundos = 0;
        segundos = (hora2-hora1)*3600;
        segundos += (minuto2-minuto1)*60;
        segundos += segundo2-segundo1;

        System.out.println(segundos);
    }
}