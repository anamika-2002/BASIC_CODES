public class SpiralMatrixPrint {
    public static void main(String[] args) {
        int a[][] = { { 1, 2, 3, 4, 5 },
                { 6, 7, 8, 9, 10 },
                { 11, 12, 13, 14, 15 },
                { 16, 17, 18, 19, 20 },
                { 21, 22, 23, 24, 25 } };
        int n = a[0].length;
        int ri = 0, rf = n - 1, ci = 0, cf = n - 1;
        while (rf >= ri && cf >= ci) {
            for (int i = ci; i <= cf; i++)
                System.out.print(a[ri][i]+" ");
            ri++;

            for (int i = ri; i <= rf; i++)
                System.out.print(a[i][cf]+" ");
            cf--;
            if(ri<=rf)
            for (int i = cf; i >= ci; i--)
                System.out.print(a[rf][i]+" ");
            rf--;
            if(ci<=cf)
            for (int i = rf; i >= ri; i--)
                System.out.print(a[i][ci]+" ");
            ci++;

        }

    }

}