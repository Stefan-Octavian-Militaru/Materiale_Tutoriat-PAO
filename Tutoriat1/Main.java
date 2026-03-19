import java.util.Scanner;
import java.util.Arrays;
//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void matrices(){
        int[][] v1 =  {
                {1,2},
                {2,3},
                {3,4},
        };
        int[][] v2 =  {
                {1,2},
                {2,3},
                {3,4},
        };
        System.out.println(Arrays.equals(v1, v2));
        System.out.println(Arrays.deepEquals(v1, v2));

        System.out.println(v1);
        System.out.println(Arrays.toString(v1));
        System.out.println(Arrays.toString(v2));
        System.out.println(Arrays.deepToString(v1));
        System.out.println(Arrays.deepToString(v2));
    }
    public static void ex6(){
        int[] array = new int[10];
        int[] array2 = array;
        int[] copie = Arrays.copyOf(array, array.length);
        array2[0] = 100;
        copie[0] = 101;
        System.out.println(Arrays.toString(array));
        System.out.println(Arrays.toString(array2));
        System.out.println(Arrays.toString(copie));
    }
    public static void createString_ex5(){
        String a = new String("text");
        String b = new String("text");
        System.out.println(a == b); // false
        System.out.println(a.equals(b)); // true
        String c = new String();
        if (c.isEmpty()){
            System.out.println("c is null");
        }
        else{
            System.out.println(c.equals(a));
        }
    }
    public static void readArray_ex4(){
        int[] array = {3, 10, 7, 100, 4, 1};
        System.out.println(Arrays.toString(array));
        Arrays.sort(array);
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int nr_cautat = Arrays.binarySearch(array,n);
        System.out.println(nr_cautat);

    }
    public static void readArray() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the size of the array");
        int size = scanner.nextInt();
        int[] array = new int[size];
        System.out.println("Enter the elements of the array");
        for (int i = 0; i < size; i++) {
            array[i] = scanner.nextInt();
        }
        int suma = 0;
        for (int i = 0; i < array.length; i++) {
            suma += array[i];
        }
        int media = suma / size;
        int max = array[0];
        for (int i = 1; i < array.length; i++) {
            if (array[i] > max) {
                max = array[i];
            }
        }
        Arrays.sort(array);
        int min = array[0];
        System.out.println("Suma: " + suma);
        System.out.println("Media: " + media);
        System.out.println("Max: " + max);
        System.out.println("Min: " + min);

    }
    public static void compareObjects(){
        int a = 10;
        int b = a;
        b = 11;
        System.out.println(a);
        System.out.println(b);
        int[] a_array = {10};
        int[] b_array = a_array;
        b_array[0] = 11;
        System.out.println(Arrays.toString(a_array));
        System.out.println(Arrays.toString(b_array));
    }
    public static void readNumbers(){
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        System.out.println(a + b);
        System.out.println(a - b);
        System.out.println(a * b);
        System.out.println(a / b);
        System.out.println(a % b);
        System.out.println(a > b ? a : b);
    }
    public static void main(String[] args) {
        matrices();
    }
}