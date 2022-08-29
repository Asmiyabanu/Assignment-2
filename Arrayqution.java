import java.util.Arrays;   
public class Arrayqution  
{   
public static void main(String[] args)   
  {   
    int n = 7;
   int [] array = new int [] {47,84,75,21,14,14,79};  
   Arrays.sort(array);   
   System.out.println("Elements of array sorted in ascending order: ");  

       for (int i = 0; i < array.length; i++)   
        {       
                 System.out.print(array[i]+  "     ");   
        }   
  
 //find median       
    int median=0;
	if(n%2==1)
	{
		median=array[(n+1)/2-1];
	}
	else
	{
		median=(array[n/2-1]+array[n/2])/2;
	}
	
	
       System.out.println("\nMedian :"+median);
	   
 //find max value      
         int max = array[0];  
        //Loop through the array  
        for (int i = 0; i < array.length; i++) {  
            //Compare elements of array with max  
           if(array[i] > max)  
               max = array[i];  
        }  
        System.out.println("hightest valu : " + max);  

//find mode value	
	int maxVal=0, count=0, maxCount=0;
		
		for(int i=0;i<n;i++) {
			count = 0;
			for(int j=0;j<n;j++) {
				if(array[i] == array[j]) {
					count++;
				}
			}
			if (count > maxCount) {
	                    maxCount = count;
	                    maxVal = array[i];
	               }
		}
		
		System.out.println("\nmode is : "+maxVal+" as count is : "+maxCount);
	
//find prime numbers	
	System.out.print("prime numbers in the array : ");
for(int i=0; i<array.length; i++){
        boolean isPrime = true;
        
        //check to see if the numbers are prime
        for (int j=2; j<array[i]; j++){
            
            if(array[i]%j==0){
                isPrime = false;
                break;
            }
        }
        //print the number
        if(isPrime)

            System.out.print(array[i]+ "  ");
            
	}
  }
}
   
