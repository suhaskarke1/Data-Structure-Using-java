package Calculator;

public class InsertionSort
{
    public static void display(int a[])
    {
        for (int i = 0; i < a.length; i++)
        {
            System.out.print(a[i] + " ");
        }
        System.out.println();
    }

    public static void insertionSort(int a[])
    {
        for (int i = 1; i < a.length; i++)
        {
            int current = a[i];
            int j = i - 1;

           
            while (j >= 0 && a[j] > current)
            {
                a[j + 1] = a[j];
                j = j - 1;
            }
            a[j + 1] = current;
        }
    }

    public static void main(String[] args)
    {
        int a[] = {21, 12, 31, 4, 75};

        System.out.print("Original array: ");
        display(a);


        insertionSort(a);

        System.out.print("Sorted array: ");
        display(a);
    }
}
