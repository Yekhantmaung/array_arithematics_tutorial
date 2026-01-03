import java.util.Scanner;
public class Array {
    public static void main(String []args){

        Scanner sca = new Scanner(System.in);
        System.out.print("Enter size of array : ");
        int size = sca.nextInt();


        int[] array1 = new int[size];
        for (int a = 0;a < size; a++) {
            System.out.print("Enter first number : ");
            array1[a] = sca.nextInt();
        }

        int[] array2 = new int[size];
        for (int a = 0;a < size; a++) {
            System.out.print("Enter second number : ");
            array2[a] = sca.nextInt();
        }

        int[] resultArray = new int[size];
        for (int a = 0;a < size; a++) {
            resultArray[a] = array1[a] + array2[a];
        }

        for (int array : resultArray) {
            System.out.println("The sum result value is : "+array);
            sca.close();
        }
    }
}