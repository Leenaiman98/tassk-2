package jo.secondestep.sort;

public class SelectionSort {


    void selectionSort(int arr[])
    {
        int realLength = arr.length ;
        int min_position;
        int temp ;
 
        for (int i = 0; i < realLength; i++)
        {
            min_position = i;
            for (int j = i+1; j < realLength; j++)
                if (arr[j] < arr[min_position])
                	min_position = j;
 
           
            temp = arr[min_position];
            arr[min_position] = arr[i];
            arr[i] = temp;
        }
    }
 
 
}
	

