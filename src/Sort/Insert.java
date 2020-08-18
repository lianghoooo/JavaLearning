package Sort;

public class Insert {
    public int[] sort(int[] arr)
    {
        for (int i=1; i<arr.length;i++)
        {
            int j=i;
            int tmp=arr[i];
            while (j-1>=0&&arr[j-1]>tmp)
//            for (j=i-1;j>=0&&arr[j]>tmp;j--)
            {
                arr[j]=arr[j-1];
                j--;
            }
            arr[j]=tmp;
        }
        return arr;
    }
}
