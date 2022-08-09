// 插入排序就像打牌一样，手里的牌已经从小到大排好序了，新牌从尾部从大到小挨个比较，然后插入
public class InsertSort {

  public static void InsertSort(int[] arr){
    if (arr==null || arr.length<2){
      return;
    }
    int n = arr.length;

    // 假设被插入的数组最后一位是end,把end作为初始值赋值给新插入数字的index
    for (int end = 1; end < n ; end++) {
      int newIndex = end;
      // 如果newIndex位置前面有数字，且比它大,那么交换,交换后，newIndex前移一个位置
      while (newIndex - 1 >= 0 && arr[newIndex - 1] > arr[newIndex]) {
        Util.swap(arr, newIndex - 1, newIndex);
        newIndex--;
      }
    }
  }

  public static void main(String[] args) {
    int[] arr = {4,6,2,6,1,8,3,5,7};
    Util.printArr(arr);
    InsertSort(arr);
    Util.printArr(arr);
  }
}
