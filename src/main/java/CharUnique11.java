/*
Implement an algorithm to determine if a string has all unique characters. What
if you cannot use additional data structures?
*/
public class CharUnique11 {
    static String s = "aardvark";
    static char[] char_array = s.toCharArray();

    public static void isUchar(char[] input){
        for (int i = 0; i < input.length; i++){
            System.out.println(input[i]);
            for(int j = 0; j < input.length; j++){
                if (input[i] == 'a'){
                    System.out.println("grapes");
                }
            }
            System.out.println("YES");
        }
    }

    public static void main(String[] args) {
        isUchar(char_array);
    }
}