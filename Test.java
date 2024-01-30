import java.util.Scanner;


public class Test {
    //Main Method
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        //char vs int
        /* 
        char num1 = '2'; //char '2' is 50 in decimal
        int num2 = 8;
        int sum = num1 + num2; //will get 58
        System.out.println(sum);



        char num3 = '2' - '0'; //char '2' is 50 in decimal. char '0' is 48 in decimal. subtracting them gives just 2 the int.
        int num4 = 8;
        int total = num3 + num4; //will get 10
        System.out.println(total);

        System.out.println("=============");

        char ch = 33; //without quotes, it will be decimal value 33, which will output '!'
        System.out.println(ch); */

        /*
        //Math.random range
        for (int i = 0; i < 10 ; i++){
            int newIndex = (int)(Math.random() * 52); //will grant random number from 0 and up to but not including 52. convert to int
            System.out.println(newIndex);
        }  */
        /*
        Scanner input = new Scanner(System.in);
        System.out.print("Enter numbers: ");
        String line = input.nextLine();
        System.out.println(line);
        int number = Integer.parseInt(line.substring(0, 3));
        System.out.println(number);
         */

        System.out.print("Enter ints: ");
        int int1 = input.nextInt();
        
        //System.out.print("Enter 2nd int: ");
        
        int int2 = input.nextInt();

        System.out.println(int1 + " " + int2);





    }

}
