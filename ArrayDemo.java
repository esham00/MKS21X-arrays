public class ArrayDemo {
  public static void main(String[] args) {
    int [] newArray = {2, 4, 6, 8, 10};
    int [][] twoD = new int [][]{
      {0, 1, 2, 3, -4},
      {0, 1, 2, 0, -4},
      {1, 0, -2, 3, -4},
      {1, 2, 0, -4, 0},
      {-6, 1, 2, 3, -4}
    };

    System.out.print("One-D array printing \n");
    printArray(newArray);
    System.out.println("\nTwo-D array printing");
    printArray(twoD);
    System.out.print("\nCounting Zeros \n");
    System.out.println(countZeros2D(twoD));
    System.out.println("Filling 2D with 1s and 3s (if negative)");
    printArray(fill2DCopy(twoD));
    System.out.println("\nFilling 2D with 1s and 3s (if row = column)");
    fill2D(twoD);
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
      if (i != 0) {System.out.println();}
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
 public static void fill2D(int [][] vals) {
   for (int i = 0; i < vals.length; i++) {
     for (int j = 0; j < vals[i].length; j++) {
       if (i == j) {
         vals[i][j] = 3;
       }
       else {
         vals[i][j] = 1;
       }
     }
   }
   printArray(vals);
 }
 public static int [][] fill2DCopy(int [][] vals) {
   int [][] brandNew;
   brandNew = new int [vals.length] [];
   for (int i = 0; i < vals.length; i++) {
     brandNew[i] = new int[vals[i].length];
     for (int j = 0; j < vals[i].length; j++) {
      if (vals[i][j] < 0) {
        brandNew[i][j] = 3;
      }
      else {
        brandNew[i][j] = 1;
      }
     }
   }
   return brandNew;
 }
}
