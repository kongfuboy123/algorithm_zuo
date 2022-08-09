/**
 * Student ID : 22038830 Name: Yunpeng Wang Campus: Parramatta South Tutor Name: Class Day : Wed
 * Class Time:9:00-11:00
 */
public class BubbleSort {
 public static void BubbleSort(int[] arr){
   if (arr == null || arr.length<2){
     return;
   }
   int n = arr.length;
   for (int end = n-1; end>=0; end--) {
     for (int second =1; second <= end; second++) {
       if (arr[second-1]>arr[second]){
         Util.swap(arr,second-1,second);
       }
     }
   }
 }

  public static void main(String[] args) {
    int[] arr = {1,5,3,7,2,9,4};
    Util.printArr(arr);
    BubbleSort(arr);
    Util.printArr(arr);
  }

}
