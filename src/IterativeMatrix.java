import java.util.*;

public class IterativeMatrix {


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int matrix[][];
	int check = 0;	
	System.out.print("Enter 1 if you want to run iterative matrix multiplication and 2 for strassen multiplication \n");
	Scanner in = new Scanner(System.in);
	check = in.nextInt();
	 	if(check == 1){
	 		iterativematrixMutiplication();
	 	}else if (check == 2){
	 		System.out.print("Strassen");
	 	}
	 }
	
	private static void iterativematrixMutiplication() {
		// TODO Auto-generated method stub

		int row1,column1,row2,column2,sum = 0;
		Random rn = new Random();
		
		Scanner input = new Scanner(System.in);
		System.out.print("Enter rows and column of first matrix \n");
		row1 = input.nextInt();
		column1 = input.nextInt();
		
		 int matrix1[][] = new int[row1][column1];
		
		//populating matrix 1 with random numbers
		for(int  i = 0; i < row1 ; i++){
			for(int j = 0; j < column1; j++){
				matrix1[i][j] = rn.nextInt(10);
			}
		}
		
		System.out.print("Enter rows and column of second matrix \n");
		row2 = input.nextInt();
		column2 = input.nextInt();
		
		int matrix2[][] = new int[row2][column2];
		
		int multiply[][] = new int[row1][column2]; 
		
		//populating matrix 2 with random numbers
		for(int  i = 0; i < row2 ; i++){
			for(int j = 0; j < column2; j++){
				matrix2[i][j] = rn.nextInt(10);
			}
		}
		
		if(column1 != row2){
			System.out.print("The number of columns of the 1st matrix must equal the number of rows of the 2nd matrix. \n");
		}else{
			
			for(int i = 0; i < row1; i++){
				for(int j =0; j < column2; j++){
					for(int k = 0; k < row2; k++){
						sum = sum + matrix1[i][k]*matrix2[k][j];
					}
					multiply[i][j] = sum;
					sum = 0;
				}
			}
		}
		 System.out.println("Product of entered matrices");
		 
		 for(int  i = 0; i < row1 ; i++){
				for(int j = 0; j < column2; j++){
					System.out.print(multiply[i][j]+"\t");
				}
	            System.out.print("\n");
			
			}
		 
		 
	}

	
	

}
