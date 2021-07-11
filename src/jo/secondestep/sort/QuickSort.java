package jo.secondestep.sort;

public class QuickSort{
 
	
	static void swap(int[] arr, int i, int j)
	{
	    int temp = arr[i];
	    arr[i] = arr[j];
	    arr[j] = temp;
	}
	 
	
	static int Qsort(int[] arr, int start, int end)
	{
	     
	  
	    int pivot = arr[end];
	    int i = start - 1;
	 
	    for(int j = start; j <=  end - 1; j++)
	    {
	       if (arr[j] < pivot)
	        {   
	        	i++;
	            swap(arr, i, j);
	        }
	    }
	    swap(arr, i + 1, end);
	    return (i + 1);
	}
	 
	static void quickSort(int[] arr, int start, int end)
	{
	    if (start < end)
	    {
	        
	        int pi = Qsort(arr, start, end);
	 
	        
	        quickSort(arr, start, pi - 1);
	        quickSort(arr, pi + 1, end);
	    }
	}
	}
	 