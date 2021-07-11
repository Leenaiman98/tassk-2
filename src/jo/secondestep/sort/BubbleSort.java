package jo.secondestep.sort;

public class BubbleSort {
 static void bubbleSort (int[] arr)
 {
	 int realLength= arr.length -1 ;
	 int temp=0;
	 
	 for (int i=0 ; i<realLength ;i++)
	     
		   for (int j=0 ; j< realLength-i ;j++) 
		   {  
			   if (arr[j]>arr[j+1]) 
			   {
				   temp=arr[j];
				   arr[j] = arr[j+1];
				   arr[j+1]=temp;
			   }
			     
		   }
		 
		 
		   
 }
 
                        }

