package linear_search;

public class BinaryRecusion {

    static int Binaraysearch(int mang[], int value, int left, int right) {
        int mid;
        if (left == right) {
            if (mang[left] == value)
                return mang[left];
            else
                return -1;
        } else {
            mid = (left + right) / 2;
            if (mang[mid] == value)
                return mid;
            else {
                if (mang[mid] < value) {
                    return Binaraysearch(mang, value, (mid + 1), right);
                } else {
                    return Binaraysearch(mang, value, left, mid - 1);
                }
            }

        }
    }

    public static void main(String[] args) {
        int left = 0;
        int a[] = { 1, 2, 3, 4, 5, 6, 7, 8, 10 };
        int right = a.length - 1;

        System.out.println("vị trí của phần tử trong mảng là " + Binaraysearch(a, 4, left, right));

    }

}
