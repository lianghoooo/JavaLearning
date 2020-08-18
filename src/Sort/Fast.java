package Sort;

public class Fast {
    public void quickSort(int[] arr, int leftIndex, int rightIndex){
        if (leftIndex >= rightIndex)
            return;
        int left = leftIndex;
        int right = rightIndex;
        int key = arr[left];

        while(left<right){
            while (right>left && arr[right]>=key){//注意是大于等于
                right--;
            }
            arr[left]=arr[right];
            while(left<right && arr[left]<= key){
                left++;
            }

            arr[right]=arr[left];
        }
        arr[left]=key;
        quickSort(arr,leftIndex,left-1);
        quickSort(arr,right+1,rightIndex);
    }
}
