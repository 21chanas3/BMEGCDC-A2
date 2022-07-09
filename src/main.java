class main {
    public static void main(String[] args) {
        int n = 5;
        int[] smallarr = {0,1,2,3,4};

        int m = 100;
        int[] bigarr = new int[100];

        for(int i = 0; i < m; i++) {
            bigarr[i] = i;
        }

        System.out.println("The total nuber of even numbers in smallarr are: " + countEvenNum(smallarr, n));
        System.out.println("The total nuber of even numbers in bigarr are: " + countEvenNum(bigarr, m));

    }

    public static int countEvenNum(int[] arr, int size) {
        int count = 0;
        for (int i = 0; i < size; i++) {
            if(arr[i] % 2 == 0) {count++;}
        }
        return count;
    }
}