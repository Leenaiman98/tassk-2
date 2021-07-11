package jo.secondestep.sort;


public class MergSort {
	
public void mergeSort(int arr[], int start, int end)  
{  
    int mid;
    if(start==end) return;
    if(start<end)  
    {  
        mid = (start+end)/2;  
        mergeSort(arr,start,mid);  
        mergeSort(arr,mid+1,end);  
        merge(arr,start,mid,end);  
    }  
}  
void merge(int arr[], int start, int mid, int end)  
{  
    int i=start,j=mid+1,k,position = start;  
    
    int[] temp = {};  
    
    while(i<=mid && j<=end) 
    {  
        if(arr[i]<arr[j])  
        {  
            temp[position] = arr[i];  
            i++;  
        }  
        else   
        {  
            temp[position] = arr[j];  
            j++;   
        }  
        position++;  
    }  
    if(i>mid)  
    {  
        while(j<=end)  
        {  
            temp[position] = arr[j];  
            position++;  
            j++;  
        }  
    }  
    else   
    {  
        while(i<=mid)  
        {  
            temp[position] = arr[i];  
            position++;  
            i++;  
        }  
    }  
    k = start;  
    while(k<position)  
    {  
        arr[k]=temp[k];  
        k++;  
    }  
} 


}


