import java.util.*;

//Java everything is a pointer accept primitive types.
//Why should utility classes be final?
public final class Helpers{
    //Array
    static int[] a = {1,2,3,4,5,6,7,8,9};

    //ArrayList
    static ArrayList<Integer> al = new ArrayList<Integer>();

    /** Maps **/
    static TreeMap<Integer, String> tmap = new TreeMap<Integer, String>();//TreeMap
    static HashMap<Integer, String> hmap = new HashMap<Integer, String>();//HashMap
    static LinkedHashMap<Integer, String> lmap = new LinkedHashMap<Integer, String>();//LinkedHashMap

    //System.out.println("fdgfgfgf");

    private Helpers(ArrayList<Integer> al) {
	// Utility classes should always be final and have a private constructor
    //Try using this to see if actually adds [1,2] to the arraylist
    //al.add(1);
    //al.add(2);
	}


    public static void disInta(int[] input){
        System.out.println("Array: " + Arrays.toString(input) + "\n");
    }

    public static void disInta(ArrayList<Integer> input){
        input.add(1);
        input.add(2);
        System.out.println("ArrayList: " + Arrays.toString(input.toArray()) + "\n");
    }

    public static void disInta2(ArrayList<Integer> input){
        input.add(1);
        input.add(2);
        for(Integer i : input){
            System.out.println("ArrayListI: " + i );
        }
    }

    public static void disTreeMap(TreeMap<Integer, String> input){
        tmap.put(1, "Data-1");
        tmap.put(3, "Data-3");
        tmap.put(2, "Data-2");
        tmap.put(5, "Data-5");
        tmap.put(4, "Data-4");
        //Why does the TreeMap need to be inside of a set?
        Set<Map.Entry<Integer, String>> set = input.entrySet();
        for (Map.Entry<Integer, String> entry : set) {     
            System.out.println("Key: " + entry.getKey() + " Value: " + entry.getValue());
        }
    }

    public static void main(String args[]){
        disInta(a);
        disInta2(al);
        disInta(al);
        
        disTreeMap(tmap);
    }
}