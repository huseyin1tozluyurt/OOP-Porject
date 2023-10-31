import java.util.Scanner;
public class MatrixOperation {
	static void MatrixAddition(){
		System.out.println("Matrix Addition");
		Scanner input =new Scanner(System.in);
		int rows,coloums;
		
		System.out.print("Rows: ");
		rows=input.nextInt();
		System.out.println("");
		System.out.print("Coloums: ");
		coloums=input.nextInt();
		int size=rows*coloums;
		double[][]matrix= new double [rows][coloums];
		//getting the first matrix
		System.out.printf("Enter your matrix: ");
		for(int i=0;i<rows;i++)
		{
			for(int j=0;j<coloums;j++)
			{
				int arrayElement;
				arrayElement= input.nextInt();
				matrix [i][j]=arrayElement;
			}
				
		}
		//Printing the matrix 1
		System.out.printf("[ ");
		for(int i=0;i<rows;i++)
		{
			System.out.printf("[ ");
			for(int j=0;j<coloums;j++)
			{
				double value=matrix[i][j];
				if(j==coloums-1)
				{
					System.out.printf(" %f  ",value);
				}
				else
				{
					System.out.printf(" %f , ",value);
	
				}
				
			}
			if(i==rows-1)
			{
				System.out.printf(" ]");
			}
			else
			{
				System.out.printf(" ],");
			}
		}
		System.out.printf(" ]");
			//2nd Matrix
					
		
		
		
		}
	static void MatrixSubtraction() {
		System.out.println("Matrix Subtraction");
	}
	static void MatrixMultiplication() {
		System.out.println("Matrix Multiplication");
	}
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int decision;
		do
		{
			System.out.println("Choose your matrix operation below: ");
			System.out.println("1-)Matrix addition\n2-)Matrix Subtraction\n3-)Matrix Multiplication\4-)Scalar Multiplication");
			System.out.print("Operation: ");
			decision=input.nextInt();
		}while(decision<0 || decision>4);

		if(decision==1)
		{
			MatrixAddition();
		}
		if(decision==2)
		{
			MatrixSubtraction();
		}
		if(decision==3)
		{
			MatrixMultiplication();
		}
		
		
		
	}

}
