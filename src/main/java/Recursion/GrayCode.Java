package Recursion;

import java.util.ArrayList;

public class GrayCode {
  public ArrayList<Integer> getGrayCode(int n) {
    ArrayList<Integer> list = new ArrayList<>();
    grayCodeHelper(list, n);
    return list;
  }

  private void grayCodeHelper(ArrayList<Integer> list, int n) {
    if (n == 0) {
      list.add(0);
      return;
    }
    grayCodeHelper(list, n-1);
    int size = list.size();
    int mask = (1 << (n-1));
    for (int i=size-1; i >= 0; i--) {
      list.add(list.get(i) | mask);
    }
  }

  public static void main(String[] args) {
    GrayCode grayCode = new GrayCode();
    for (Integer a : grayCode.getGrayCode(1)) {
      System.out.println(a);
    }
  }
}
