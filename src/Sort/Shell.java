package Sort;

import java.util.ArrayList;

public class Shell {
    public int[] sort(int[] arr)
    {
        for (int gap=arr.length/2;gap>0;gap=gap/2) {
            for (int i=gap; i<arr.length;i++){
                int j=i-gap;
                int tmp=arr[i];
                while (j >= 0 && arr[j] > tmp) {
                    arr[j + gap] = arr[j];
                    j=j-gap;
                }
                arr[j+gap] = tmp;
            }
        }
        return arr;
    }
}
