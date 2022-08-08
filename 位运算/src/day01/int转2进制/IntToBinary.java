package day01.int转2进制;


public class IntToBinary {
    public static void IntToBinary(int num){
        for (int i = 31; i >=0 ; i--) {
            // 假设输入的数字转化为32位的2进制，逐个遍历这32位，与1进行 与运算 ，只有该位是1的情况下，结果不为0
            // 所以只要 num & (1<<i) ！= 0 ，那么该位置的数字便是1，反之该位数字就是0
            System.out.print((num & (1<<i)) != 0 ? "1" : "0");
        }
    }
    public static void main(String[] args) {
        IntToBinary(100);
    }
}
