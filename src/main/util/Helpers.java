import java.util.*;
//Java everything is a pointer accept primitive types.
public final class Helpers{
    static int[] a = {1,2,3,4,5,6,7,8,9};
    static ArrayList<Integer> al = new ArrayList<Integer>();
    al.add(1);al.add(2);

    public static void disInta(int[] input){
        System.out.println("Array: " + Arrays.toString(input));
    }

    public static void disInta(ArrayList<Integer> input){
        System.out.println("ArrayList: " + Arrays.toString(input));
    }

    public static void main(String args[]){
        disInta(a);
        disInta(al);
    }
}