package Sort;
public class Merge {

    public void mergeSort(int[] arr,int left, int right)
    {
        if (left<right)
        {
            int middle=(left+right)/2;
            mergeSort(arr,left,middle);
            mergeSort(arr,middle+1,right);
            merge(arr,left,middle,right);
        }
    }

    public void merge(int[] arr, int left,int middle, int right) {
        int j=left;
        int k=middle+1;
        int i=0;
        int[] tmp=new int[right-left+1];
        while (j<=middle && k<=right)
        {
            if (arr[j]<arr[k])
                tmp[i++]=arr[j++];
            else
                tmp[i++]=arr[k++];
        }
        while(j<=middle)
        {
            tmp[i++]=arr[j++];
        }
        while(k<=right)
        {
            tmp[i++]=arr[k++];
        }

        for (int t=0;t<i;t++)
        {
            arr[t+left]=tmp[t];
        }
    }
}
