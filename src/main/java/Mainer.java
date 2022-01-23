import java.util.Scanner;

public class Mainer {

    public static void main(String[] args) {


        for (int i = 0; i < 5; i++) {


            System.out.println("NUmber"+ i);

        }

        Scanner s = new Scanner(System.in);
        int ss;

        ss= s.nextInt();

        System.out.println(ss);


        Car chevy = new Car(500,"red");


        chevy.drive(12);





    }
}
