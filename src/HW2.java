
import java.util.Scanner;


public class HW2 {
    public static void main(String[] args) {

        String secretword = "test";
        String stop = "stop";
        Scanner scan = new Scanner(System.in);
        String input = scan.next();
        //System.out.println("Enter a phrase with more than ");
        int indexOfFirst = firstWordIndex(input, secretword);
        System.out.println(findStr(input,stop));


    }

    public static boolean findStr(String input,String key) {
        boolean flag = false;
        if (StringLength(input) < StringLength(key)) {
            return false;
        }
        for (int i = 0; i < StringLength(input) - StringLength(key)+1; i++) {
            boolean innerflag = true;
            for (int j = 0; j < StringLength(key); j++) {
                if (key.charAt(j) != input.charAt(i + j)) {
                    innerflag = false;
                }
            }
            if (innerflag)
            {
                flag = innerflag;
                break;
            }
        }
        return flag;
    }



    public static int StringLength(String str) {
        int i = 0;
        try {
            while (str != null) {
                str.charAt(i);
                i++;
            }
        } catch (Exception e) {
            return i;
        }
        return -1;
    }

    public static int firstWordIndex(String input, String secretword) {
        for (int j = 0; j < StringLength(input); j++) {

            if (input.charAt(j) == secretword.charAt(0)) {
                return j;
            }
        }
        return -1;
    }


}


