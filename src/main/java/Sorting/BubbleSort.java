package Sorting;

public class BubbleSort {
    public void sort(int[] arr, Order order) {
        switch (order) {
            case ASC:
                sortAscending(arr);
                break;
            case DESC:
                sortDescending(arr);
                break;
        }
    }

    private void sortAscending(int[] arr) {
        int n = arr.length;
        for (int i=0; i<n; i++) { //For every i th  index
            int swapCount = 0;
            for (int j=0; j<n-1-i; j++) { //keep the ith maximum at its place
                if (arr[j] > arr[j+1]) {
                    swapCount++;
                    swap(arr, j, j+1);
                }
            }
            if (swapCount == 0) { //all elements are in place, no swapping is done
                break;
            }
        }
    }

    private void sortDescending(int[] arr) {
        int n = arr.length;
        for (int i=0; i<n; i++) { //For every i th  index
            for (int j=0; j<n-1-i; j++) { //keep the ith maximum at its place
                if (arr[j] < arr[j+1]) {
                    swap(arr, j, j+1);
                }
            }
        }
    }

    private void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    public static void main(String[] args) {
        SelectionSort selectionSort = new SelectionSort();
        int[] arr = {5, 4 ,3, 2, 1};
        selectionSort.sort(arr, Order.DESC);
        for (int a : arr) {
            System.out.print(a + " ");
        }
        System.out.println();
        arr = new int[]{1, 2, 3, 4, 5};
        selectionSort.sort(arr, Order.DESC);
        for (int a : arr) {
            System.out.print(a + " ");
        }
    }
}
