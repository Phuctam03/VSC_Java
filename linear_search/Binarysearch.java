package linear_search;

public class Binarysearch {

    public Binarysearch() {
    }

    static int Binaraysearch(int a[], int x) {
        int left = 0;
        int right = a.length - 1;
        int mid;

        while (left <= right) {
            mid = (left + right) / 2;
            System.out.println(mid);

            if (x < a[mid]) {
                right = mid - 1;
            } else if (x > a[mid]) {
                left = mid + 1;
            } else {
                return mid;
            }

        }
        return -1;

    }

    public static void main(String[] args) {

        int a[] = { 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20 };
        System.out.println(Binaraysearch(a, 20));

    }

}