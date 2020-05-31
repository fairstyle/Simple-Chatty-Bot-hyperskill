import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        // put your code here
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int aux = 0;

        for (int i = 1; i <= n; i++){
            int number = scanner.nextInt();
            if(number%4 == 0 && number > aux){
                    aux = number;
            }
        }
        System.out.println(aux);
    }
}