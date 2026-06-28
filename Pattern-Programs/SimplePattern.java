public class SimplePattern {
    public static void main(String[] args) {
        int num = 4;
        for (int i = 1;  i <= num; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}

/*
C:\Users\pooja\Desktop\GitDemo\CoreJava-Practice\Pattern-Programs>java SimplePattern     
*
**
***
****
 */