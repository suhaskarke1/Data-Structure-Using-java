package Calculator;  

public class SelectionSort
{  

    public static void display(int a[])
    {  
        for (int i = 0; i < a.length; i++)
        {  
            System.out.print(a[i] + " ");  
        }  
        System.out.println();  
    }  

    public static void selectionsort(int a[])
    {  
        int min;  
        for (int i = 0; i < a.length - 1; i++) 
        {  
            min = i;  
            for (int j = i + 1; j < a.length; j++) 
            {  
                if (a[j] < a[min])
                {  
                    min = j;  
                }  
            }  
           
            int temp = a[min];  
            a[min] = a[i];  
            a[i] = temp;  
        }  
    }  

    public static void main(String[] args)
    {  
        int a[] = {21, 12, 31, 4, 75};  

       
        System.out.print("Original array: ");  
        display(a);  

       
        selectionsort(a);  

        
        System.out.print("Sorted array: ");  
        display(a);  
    }  
}