package Calculator;

public class BuubleSort
{

	 public static void display(int a[])
	 {
		 for(int i=0;i<a.length;i++)
		 {
			 System.out.printf(a[i]+ " ");
		 }
		 System.out.println();
	 }
	
	public static void bubblesort(int a[])
	{
		for(int i=0;i<a.length-1;i++)
		{
			for(int j=0;j<a.length-i-1;j++)
			{
				if(a[j] > a[j+1])
				{
					int temp = a[j];
					a[j] = a [j+1];
					a[j+1] = temp;
				}
			}
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
   int a[]= {21,12,31,4,75};
      
   bubblesort(a);
   
        display(a);
	}

}
