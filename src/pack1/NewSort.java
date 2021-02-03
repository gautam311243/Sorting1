package pack1;
import java.util.Scanner;

public class NewSort {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int arr[]=new int[5];
		
		for(int i=0;i<5;i++)
		{
			System.out.print("Enter number: ");
			arr[i]=s.nextInt();
		}
		
		for(int i=0;i<arr.length;i++)
		{
			int min=i;
			for(int j=i+1;j<arr.length;j++)
			{
				if(arr[min]>arr[j])
				{
					int temp=arr[min];
					arr[min]=arr[j];
					arr[j]=temp;
				}
			}
		}
		
		System.out.print("Sorted array: ");
		for(int k=0;k<arr.length;k++)
		{
			System.out.print(arr[k]+" ");
		}
		

	}

}
