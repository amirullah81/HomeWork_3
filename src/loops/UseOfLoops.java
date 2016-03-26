package loops;
import java.util.*;

public class UseOfLoops {

	public static void main(String[] args) {
		int x;
		int i = 0;
		Scanner s = new Scanner(System.in);
		System.out.println("No of Numbers you want to input: ");
		x = s.nextInt();
		
		int arr[] = new int[x];
		System.out.println("Enter all Numbers");
		for (int z=0; z<x; z++)
		{
			arr[z] = s.nextInt(); 
			//i++;
		}
		s.close();
		System.out.println("Odd Numbers: ");
		//for (i=0; i<x; i++)
		while (i < x)
		{
			if (arr[i]%2 != 0){
				System.out.println(arr[i]);
			}
			i++;
		}
		System.out.println();
		System.out.println("Even Numbers: ");
		for (i=0; i<x; i++)
		{
			if (arr[i]%2 == 0){
				System.out.println(arr[i]);
			}
		}
	}
		
}