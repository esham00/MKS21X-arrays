public class ArrayDemo {
  public static void main(String[] args) {
    int [] newArray = new int [5];
    for (int i = 0; i < newArray.length; i++) {
      newArray[i] = 10 + 2 * i;
    }
    printArray(newArray);
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
}
