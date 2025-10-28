package h3;

public class H3_main {
    public static void main(String[] args) {
        int i = 2220, j = 9, k= 50;

        boolean A1 = (i > j);
        boolean A2 = (i > 200);
        boolean A3 = (j > 100);

        if (A1 && !A2 && !A3) {
            k = 1;
        } else if (A1 && A2 && !A3) {
            k = 2;
        } else if (A1 && A2 && A3) {
            k = 3;
        } else if (!A1 && !A2 && !A3) {
            k = 4;
        }
       
    }
}
