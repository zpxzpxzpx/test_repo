public class Main {
    public static int partition(int[] array,int left,int right){
        int tmp =array[left];
        while (left < right) {
            while (left < right && array[right] >= tmp){
                right--;
            }
            array[left] = array[right];
            while (left < right && array[left] <= tmp){
                left++;
            }
            array[right] = array[left];
        }
        array[left] = tmp;
        return left;
    }
    public static void quickSort(int[] array) {
        quick(array,0,array.length-1);
    }
    public static void quick(int[] array,int start,int end) {
        if (start >= end) {
            return;
        }
        //先划分，再左右递归
        int pivot = partition(array,start,end);
        quick(array,start,pivot-1);
        quick(array,pivot+1,end);
    }
}
