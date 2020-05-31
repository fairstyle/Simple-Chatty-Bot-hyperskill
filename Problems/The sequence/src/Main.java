import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        // put your code here

        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int number = 1;
        int count = 0;
        do{
            for (int i = 1; i <= number;i++){
                System.out.print(number+" ");
                count++;
                if(count >= n) break;
            }
            number++;
            //if(count >= n) break;
        }while(count < n);

    }
}