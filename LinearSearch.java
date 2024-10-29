package Calculator;

import java.util.Scanner;

public class LinearSearch {
    
    public static int search(int a[], int target) 
    {
        for (int i = 0; i < a.length; i++) 
        {
            if (a[i] == target) {
                return i + 1; 
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int[] arr = new int[10];
        
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter elements:");
        for (int i = 0; i < arr.length; i++) 
        {
            arr[i] = sc.nextInt();
        }
        
        System.out.println("Enter element that you want to search:");
        int target = sc.nextInt();
        
        int result = search(arr, target);
       
        if (result != -1) 
        {
            System.out.println("Element found at position: " + result);
        } 
        else
        {
            System.out.println("Element not found in the array.");
        }
        
      
    }
}
