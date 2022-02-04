package Recursion;

import java.util.ArrayList;
import java.util.List;

public class TowerOfHanoi {
  public List<String> towerOfHanoi(int noOfDisc, char A, char C, char B) {
    List<String> result = new ArrayList<>();
    towerOfHanoiHelper(result, noOfDisc, A, C, B);
    return result;
  }

  private void towerOfHanoiHelper(List<String> result, int noOfDisc, char A, char C, char B) {
    if (noOfDisc == 0) {
      return;
    }
    towerOfHanoiHelper(result, noOfDisc -1, A, B, C);
    result.add(A + "-" + C);
    towerOfHanoiHelper(result,noOfDisc -1, B , C, A);
  }
}
