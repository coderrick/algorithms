import java.util.*;
//Java everything is a pointer accept primitive types.
//Why should utility classes be final?
public final class Helpers{
    static int[] a = {1,2,3,4,5,6,7,8,9};
    static ArrayList<Integer> al = new ArrayList<Integer>();
    //System.out.println("fdgfgfgf");

    private Helpers(ArrayList<Integer> al) {
	// Utility classes should always be final and have a private constructor
    //Try using this to see if actually adds [1,2] to the arraylist
    al.add(1);
    al.add(2);
	}


    public static void disInta(int[] input){
        System.out.println("Array: " + Arrays.toString(input));
    }

    public static void disInta(ArrayList<Integer> input){
        //input.add(1);
        //input.add(2);
        System.out.println("ArrayList: " + Arrays.toString(input.toArray()));
    }

    public static void main(String args[]){
        disInta(a);
        disInta(al);
    }
}