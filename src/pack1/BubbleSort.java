package pack1;
import java.util.Scanner;

public class BubbleSort {

	public static void main(String[] args) {
		
		Scanner s=new Scanner(System.in);
		int arr[]=new int[5];
		
		for(int i=0;i<5;i++)
		{
			System.out.print("Enter number: ");
			arr[i]=s.nextInt();
		}
		
		for(int i=arr.length-1;i>=0;i--)
		{
			for(int j=1;j<=i;j++)
			{
				if(arr[j-1]>arr[j])
				{
					int temp=arr[j-1];
					arr[j-1]=arr[j];
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
