
import java.util.Scanner;


public class HW2 {
    public static void main(String[] args) {

        Scanner scan=new Scanner(System.in);
        String secretWord="test";
        String stop="stop";
        System.out.println("Please enter a phrase that has more than "+StringLength(secretWord)+ " characters. You may type stop to end the program.");
        String lowerCase=toAllLower(scan.nextLine());


        while(!findStr(lowerCase,stop))
        {
            if(findStr(lowerCase,secretWord))
            {
                System.out.println("You found the secret word: "+ secretWord +"!");
                System.out.println("You may continue or type stop to end this program.");
                lowerCase=toAllLower(scan.nextLine());
            }
            else
            {
                System.out.println("Please try again.");
                lowerCase=toAllLower(scan.nextLine());
            }
        }
    }

    public static boolean findStr(String input,String key) {
        boolean flag = false;
        if (StringLength(input) < StringLength(key)) {
            return false;
        }
        for (int i = 0; i < StringLength(input) - StringLength(key)+1; i++) {
            boolean innerflag = true;
            if(input.charAt(i)==' ')
            {
                i++;
            }
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

    public static String toAllLower (String input)
    {
        String allLower="";
        int charvalue;
        for(int i =0;i<StringLength(input);i++)
        {
            char c=input.charAt(i);
            charvalue=c;
            if(c>32 &&c<91)
            {
                charvalue+=32;
                c=(char)charvalue;
            }
            allLower+=c;
        }
        return allLower;
    }



}


