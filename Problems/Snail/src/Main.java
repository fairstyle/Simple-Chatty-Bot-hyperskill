import java.util.Scanner;

class Main {
    public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in);
        int altura = scanner.nextInt();
        int sube = scanner.nextInt();
        int baja = scanner.nextInt();
        /*int dias = 0;


        while(altura >0){

            if (altura <= sube){
                dias++;
                break;
            }
            altura -= (sube - baja);
            dias++;

        }
        System.out.println(dias);*/

        System.out.println((altura - baja - 1) / (sube - baja) + 1);

    }

        // ATTEMP 1
        //DIA 1
        //+3
        //-2
        //=1

        //DIA 2
        //1+3
        //-2
        //=2

        //DIA 3
        //2+3
        //-2
        //=3

        //DIA 4
        //3+3
        //-2
        //=4

        //DIA 5
        //4+3
        //-2
        //=5

        //DIA 6
        //5+3
        //-2
        //=6

        //DIA 7
        //6+3
        //-2
        //=7

        //DIA 8
        //7+3
        //=10
        //NO ALCANZA A LLEGAR A LA NOCHE

        // ATTEMP 2
        //DIA 1
        //+7
        //-3
        //=4

        //DIA 2
        //4+7
        //-3
        //=8

        //DIA 3
        //8+7
        //-3
        //=12

        //DIA 4
        //12+7
        //-3
        //=16

        //DIA 1
        //16+7
        //=23
        //NO ALCANZA A LLEGAR A LA NOCHE

}