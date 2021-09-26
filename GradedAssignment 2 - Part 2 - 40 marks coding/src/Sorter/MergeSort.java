package Sorter;

public class MergeSort {

    public void merge(int[] arr, int beg, int mid, int end) {

        int l = mid - beg + 1;
        int r = end - mid;
        int[] left = new int[l];
        int[] right = new int[r];

        for (int i = 0; i < l; i++) {
            left[i] = arr[beg + i];
        }

        for (int j = 0; j < r; j++) {
            right[j] = arr[mid + 1 + j];
        }

        int i = 0;
        int j = 0;
        int key = beg;

        while (i < l && j < r) {
            if (left[i] < right[j]) {
                arr[key] = left[i];
                i++;
            } else {
                arr[key] = right[j];
                j++;
            }
            key++;
        }

        while (i < l) {
            arr[key] = left[i];
            i++;
            key++;
        }

        while (j < r) {
            arr[key] = right[j];
            j++;
            key++;
        }

    }

    public void msort(int[] arr, int beg, int end) {
        if (beg < end) {
            int mid = (beg + end) / 2;
            msort(arr, beg, mid);
            msort(arr, mid + 1, end);
            merge(arr, beg, mid, end);
        }
    }

}
