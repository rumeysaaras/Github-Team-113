package day18_multiDimensionalArrays;

public class C07_MDA {
    public static void main(String[] args) {

        int[][] arr = {{13,25,37},{41,52,63,74},{11,25},{37}};

        // 20 ile 40 arasında olan sayıların toplamını bulun

        int istenenElementlerinToplami=0;

        for (int i = 0; i <arr.length ; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                if (arr[i][j] >= 20 && arr[i][j] <= 40) {
                    istenenElementlerinToplami += arr[i][j];

                }
            }
            System.out.println("istenen elementlerin toplamı :" + istenenElementlerinToplami);
        }
    }
}
