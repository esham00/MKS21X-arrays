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
    System.out.print("One-D array printing \n");
    printArray(newArray);
    System.out.println("Two-D array printing");
    printArray(twoD);
    System.out.print("\nCounting Zeros \n");
    System.out.println(countZeros2D(twoD));
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
  public static int countZeros2D (int[][] nums) {
	 int zeros = 0;
	 for (int i = 0; i < nums.length; i++) {
		 for (int j = 0; j < nums[i].length; j++) {
			 if (nums[i][j] == 0) {
				 zeros++;
			 }
		 }
	 }
	 return zeros;
 }
}
