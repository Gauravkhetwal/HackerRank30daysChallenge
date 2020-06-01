package hackerrank;

import java.util.Scanner;

public class TwoDArrays {

	public static void main(String[] args) {
		Scanner scan =  new Scanner(System.in);
		int sum,max = 0,n=6;
		//int[][] arr = new int[6][6];
		int arr[][] ={{1,1,1,0,0,0},{0,1,0,0,0,0},{1,1,1,0,0,0},{0,0,2,4,4,0},{0,0,0,2,0,0},{0,0,1,2,4,0}};		
       
		for (int i = 0; i < 6; i++) {
            for (int j = 0; j < 6; j++) {
                //int arrItem = Integer.parseInt(arrRowItems[j]);
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
		
		
		for(int i = 0;i<=n-3;i++)
		{
			for(int j = 0;j<=n-3;j++)
			{ sum = 0;
				for(int k = j;k<j+3;k++){
					sum += arr[i][k]+arr[i+2][k];
				}
				sum += arr[i+1][j+1];
				if(sum>max)
					max = sum;			
			}
			
		}
		System.out.print(max +" ");
		
		
		scan.close();
		
	}

}
