public class IgnoreCase {
    public static void main(String[] args)
    {
       char t='d';
       char T='d';
       System.out.println(ignorecase(t,T));

    }
    public static Boolean ignorecase(char a,char b)
    {

        int value1=a;
        int value2=b;
        if (a!=b) {
            if (value1 - 32 == value2) {
                return true;
            } else if (value2 - 32 == value1) {
                return true;
            }
        }
        return false;
    }


}
