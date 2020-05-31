import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        // put your code here

        Scanner scanner = new Scanner(System.in);
        int aux = -1;
        boolean flag = false;
        // false, desc
        // true, asc

        boolean toreturn = true;
        boolean firsttime = true;
        boolean secondtime = true;


        while(scanner.hasNext()) {
            int n = scanner.nextInt();

            if (n == 0) break;
            if (aux == n) continue;

            if (firsttime){
                aux = n;
                firsttime = false;

            }else if (secondtime){
                if(aux > n)
                    flag = false;
                else
                    flag = true;

                secondtime = false;

            }else{
                if(flag && aux > n || !flag && aux < n)
                    toreturn = false;

                aux = n;

            }

        }

        System.out.println(toreturn);
    }
}