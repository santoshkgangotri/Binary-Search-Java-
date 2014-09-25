// Binary Search Algorithm

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class BinarySearch {

	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO Auto-generated method stub
		
		int num[] = {10,20,30,40,70,80,90,70,80,70,100};
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter String To Find");
		int search_item = Integer.parseInt(br.readLine());
		
		int low=0;
		int high = (num.length)-1;
		int mid = 0;
		int i=0;
		boolean flag = false;
		
		while (low<=high)
		{
			mid = (low+high)/2;
		
			if(search_item == num[mid])
				{
				flag = true;
				break;
				}
			
			if (search_item < num[mid])
				high = mid - 1;
			else if (search_item > num[mid])
				low = mid + 1;
			
			System.out.println("Iterations :" + i);
		}
		
		if (flag)
			System.out.println("Item Found At " + (mid+1));
		else
			System.out.println("Item Not Found");

	}

}
