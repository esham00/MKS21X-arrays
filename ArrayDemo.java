public class ArrayDemo {
  public static void main(String[] args) {
    int [] newArray = {2, 4, 6, 8, 10};
    int [][] twoD = new int [][]{
      {0, 1, 2, 3, 4},
      {0, 1, 2, 3, 4},
      {0, 1, 2, 3, 4},
      {0, 1, 2, 3, 4},
      {0, 1, 2, 3, 4}
    };
    printArray(newArray);
    printArray(twoD);
  }
  public static void printArray(int[]ary){
  for (int i = 0; i < ary.length; i++) {
    if (i == ary.length - 1) {
      System.out.print(ary[i]);
    }
    else {
    System.out.print(ary[i] + ", ");
      }
    }
  }
  public static void printArray(int[][]ary) {
    for (int i = 0; i < ary.length; i++) {
      System.out.println();
      for (int j = 0; j < ary[i].length; j++) {
        if (j == 0) {
          System.out.print(ary[i][j]);
        }
        else {
          System.out.print(", " + ary[i][j]);
        }
      }
    }
  }
}
