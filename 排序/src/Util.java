/**
 * Student ID : 22038830 Name: Yunpeng Wang Campus: Parramatta South Tutor Name: Class Day : Wed
 * Class Time:9:00-11:00
 */
public class Util {
  public static void swap(int[] arr, int i,int j){
    int temp = arr[i];
    arr[i] = arr[j];
    arr[j] = temp;
  }
  public  static  void  printArr(int[] arr){
    for (int i = 0; i < arr.length; i++) {
      System.out.print(arr[i]+" ");
    }
    System.out.println();
  }

}
