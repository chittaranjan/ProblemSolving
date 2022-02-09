package Sorting;

public class SelectionSort {

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
      int min = arr[i], index = i;
      for (int j=i; j<n; j++) { //Find n-i th minimum
        if (arr[j] < min) {
          min = arr[j];
          index = j;
        }
      }
      swap(arr, i, index);
    }
  }

  private void sortDescending(int[] arr) {
    int n = arr.length;
    for (int i=0; i<n; i++) { //For every i th  index
      int min = arr[i], index = i;
      for (int j=i; j<n; j++) { //Find n-i th maximum
        if (arr[j] > min) {
          min = arr[j];
          index = j;
        }
      }
      swap(arr, i, index);
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
    selectionSort.sort(arr, Order.ASC);
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
