import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        // put your code here

        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();
        int d = 0, c = 0, b = 0, a = 0;

        for (int i = 1; i <= n; i++){
            int note = scanner.nextInt();
            if(note == 5)
                a++;
            else if(note == 4)
                b++;
            else if(note == 3)
                c++;
            else
                d++;
        }

        System.out.println(d+" "+c+" "+b+" "+a);
    }
}