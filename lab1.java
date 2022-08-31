import java.util.ArrayList;
import java.util.Scanner;

public class lab1 {
    public static void main(String[] args) {
        ArrayList<fibonacci> fiboList = new ArrayList<>();
        int N, digit;

        if (args.length > 0){
            N = Integer.parseInt(args[0]);
            digit = Integer.parseInt(args[1]);
        }
        else{
            Scanner scan = new Scanner(System.in);
            System.out.print(" Enter how many first numbers would be taken: ");
            N = scan.nextInt();
            System.out.print(" Enter on which number fibonacci should end: ");
            digit= scan.nextInt();
            scan.close();
        }

        for(int i=1, j=1, n=1; n<=N; n++){
            fibonacci Obj = new fibonacci(n, i);
            if (Obj.lastDigit(digit)) {
                System.out.println(" The number " + Obj.getValue() + " is suitable:" 
                                        + "\n " + Obj.getValue() + "%10 = " + digit);
                fiboList.add(Obj);
            }
            int t = j;
            j = t+i;
            i = t;
        }
    }
}
