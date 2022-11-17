import java.util.Scanner;

public class GcfAndLcm {
    public static void main(String[] args) {


        int gcf=0,lcm=0,biggerOne,smallerOne,i=1;

        Scanner input = new Scanner (System.in);
        System.out.print("Enter First Number: ");
        int n1=input.nextInt();
        System.out.print("Enter Second Number: ");
        int n2=input.nextInt();


        if(n1>n2) {
            biggerOne=n1;
            smallerOne=n2;
        }else {
            biggerOne=n2;
            smallerOne=n1;
        }


        //Greatest Common Factor part

        while(i<=smallerOne) {
            if(n1%i==0 && n2%i==0) {
                gcf=i;
            }
            i++;
        }

        //Least Common Multiple part

        while(i<=n1*n2) {
            if(i%n1==0 && i%n2==0) {
                lcm=i;
                break;
            }
            i++;
        }

        System.out.println("GCF(Greatest Common Factor): " + gcf);
        System.out.println("LCM(Least Common Multiple): " + lcm);
    }
}
