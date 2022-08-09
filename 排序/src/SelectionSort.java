
public class SelectionSort {


    public static  void SelectionSort(int[] arr) {
        // 不用排序
        if (arr == null || arr.length<2){
            return;
        }
        int n = arr.length;
        for (int i = 0; i < n; i++) {
            // 先假定最小值的index值为每次循环第一个数字，并赋值给minVal
            int minVal = i;
            // 从第二数开始遍历，如果值小于 minVal所在的值， 就把该值的index，（ 也就是当前的j） 赋值给 minVal，然后j继续向后遍历
            for (int j = i+1; j < n ; j++) {
                minVal = arr[j] < arr[minVal] ? j : minVal;
            }
            Util.swap(arr,i,minVal); // 交换找到的最小值跟当前i对应的数的位置
        }
    }

    public static void main(String[] args) {
        int[] arr = {9,2,3,5,7,4};
        Util.printArr(arr);
        SelectionSort(arr);
        Util.printArr(arr);

    }

}
