import java.util.Scanner;

public class Main3 {
    public static void main(String[] args) {
        int num = 0, count = -1, num1 = 1, firstcount = 0;
        Scanner s = new Scanner(System.in);
        char [] chararray = new char[30];
        char [] tav = new char[1];
        System.out.println("give me any char pls");
        tav[0] = s.next().charAt(0);
        for(int i = 0; i < 30; i++){
            System.out.println("give me any char that you want");
            chararray[i] = s.next().charAt(0);
            count++;
            if(tav[0] == chararray[i]) {
                num++;
                if(num1 == 1)
                    firstcount = count;
                    num1 = 0;
            }
        }
        System.out.println("you had " + num + " chars that was the same as tav's char");
        System.out.println("the first number to be the same as tav's char is " + firstcount);
    }
}
