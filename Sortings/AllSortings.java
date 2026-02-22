package Sortings;
import java.util.*;
public class AllSortings {

    public static void BubbleSort(int[] arr)
    {
        int n=arr.length;

        for(int i=0;i<arr.length;i++)
        {
            for(int j=0;j<n-i-1;j++)
            {
                if(arr[j]>arr[j+1])
                {
                    int temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                }
            }
        }
    }

    public static void SelectionSort(int[] arr)
    {
        int n=arr.length;

        for(int i=0;i<n-1;i++)
        {
            int minIndex=i;
            for (int j=i+1;j<n;j++)
            {
                if(arr[j]<arr[minIndex])
                {
                    minIndex=j;
                }
            }

            int temp = arr[minIndex];
            arr[minIndex]=arr[i];
            arr[i]=temp;
        }
    }

    public static void InsertionSort(int[] arr)
    {
        int n=arr.length;

        for(int i=0;i<=n-1;i++)
        {
            int j=i;
            while(j>0 && arr[j-1]>arr[j])
            {
                int temp = arr[j-1];
                arr[j-1]=arr[j];
                arr[j]=temp;

                j--;
            }
        }
    }

    public static void mergeSort(int[] arr , int low , int high)
    {
        if(low>=high)
        {
            return;
        }

        int mid = (low+high)/2;
        mergeSort(arr, low, mid);
        mergeSort(arr, mid+1, high);
        merge(arr,low,mid,high);
    }

    public static void merge(int[] arr , int low , int mid , int high)
    {
        int left = low;
        int right = mid+1;
        ArrayList<Integer> temp = new ArrayList<>();

        while(left<=mid && right <= high)
        {
            if(arr[left]<=arr[right])
            {
                temp.add(arr[left]);
                left++;
            }
            else
            {
                temp.add(arr[right]);
                right++;
            }
        }

        while (left<=mid) {
            temp.add(arr[left]);
            left++;
        }

        while (right<=high) {
            temp.add(arr[right]);
            right++;
        }


        for(int i=low;i<=high;i++)
        {
            arr[i]=temp.get(i-low);
        }
    }

    public static void quickSort(int[] arr, int low, int high)
    {
        if (low < high)
        {
            int pIndex = partition(arr, low, high);
            quickSort(arr, low, pIndex - 1);
            quickSort(arr, pIndex + 1, high);
        }
    }

    public static int partition(int[] arr, int low, int high)
    {
        int pivot = arr[low];
        int i = low;
        int j = high;

        while (i < j)
        {
            while (i <= high && arr[i] <= pivot)
            {
                i++;
            }

            while (j >= low && arr[j] > pivot)
            {
                j--;
            }

            if (i < j)
            {
                swap(arr, i, j);
            }
        }

        swap(arr, low, j);
        return j;
    }

    public static void swap(int[] arr, int i, int j)
    {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr={9,0,4,5,6,7,2,1};

        if(arr.length==0)
        {
            System.out.println("Array is Empty!");
        }
        else
        {
            System.out.println("1.Bubble Sort");
            System.out.println("2.Selection Sort");
            System.out.println("3.Insertion Sort");
            System.out.println("4.Merge Sort");
            System.out.println("5.Quick Sort");

            System.out.println("Enter Your Sorting Choice : ");
            int choice = sc.nextInt();

            System.out.println("Array before Sorting : ");
            for(int num : arr)
            {
                System.out.print(num +" ");
            }

            switch(choice)
            {
                case 1:
                    BubbleSort(arr);
                    break;
                case 2:
                    SelectionSort(arr);
                    break;
                case 3:
                    InsertionSort(arr);
                    break;
                case 4:
                    mergeSort(arr, 0, arr.length-1);
                    break;
                case 5:
                    quickSort(arr, 0, arr.length-1);
                    break;
                default:
                    System.out.println("Invalid Input");
                    
            }
            sc.close();

            System.out.println("\nArray After Sorting : ");
            for(int num : arr)
            {
                System.out.print(num +" ");
            }
        }
        

        
    }   
}
