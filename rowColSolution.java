package project1;
import java.util.Scanner;
public class project1 {

    static int getrow()
    {
        Scanner input =new Scanner(System.in);
        return input.nextInt();
    }
    static int getcolumn()
    {
        Scanner input =new Scanner(System.in);
        return input.nextInt();
    }
    static double getScalar()
    {
        Scanner input =new Scanner(System.in);
        return input.nextDouble();
    }
    static double[][] getMatrix(int columns, int rows)
    {
        Scanner input =new Scanner(System.in);
        double[][] matrix= new double [rows][columns];
        //getting the first matrix
        System.out.print("Enter your matrix: ");
        for(int i=0;i<rows;i++)
        {
            for(int j=0;j<columns;j++)
            {
                double arrayElement;
                arrayElement= input.nextDouble();
                matrix[i][j]=arrayElement;
            }
        }
        return matrix;
    }
    static void printMatrix(double[][] matrix, int columns, int rows)
    {
        {
            for (int i = 0; i < rows; i++) {
                for (int j = 0; j < columns; j++)
                    System.out.print(matrix[i][j] + ", ");

                System.out.println();
            }
        }
    }
    static double[][] matrixAddition(double[][] matrix1,double[][] matrix2, int col, int row){
        double[][] matrix3 = new double[row][col];
        for(int i = 0; i < row; i++) {
            for(int j = 0; j < col; j++) {
                matrix3[i][j] = matrix1[i][j] + matrix2[i][j];
            }
        }
        return matrix3;
    }
    static double[][] matrixSubtraction(double[][] matrix1,double[][] matrix2, int col, int row){
        double[][] matrix3 = new double[row][col];
        for(int i = 0; i < row; i++) {
            for(int j = 0; j < col; j++) {
                matrix3[i][j] = matrix1[i][j] - matrix2[i][j];
            }
        }
        return matrix3;
    }
    static double[][] matrixMultiplication(double[][] matrix1,int rows1,int columns1,double[][] matrix2, int rows2, int columns2){
        double[][] matrix3 = new double[rows1][columns2];
        for(int i = 0; i < rows1; i++) {
            for(int j = 0; j < columns2; j++) {
                for(int k =0; k < rows2; k++) {
                    matrix3[i][j] += matrix1[i][k] * matrix2[k][j];
                }
            }
        }
        return matrix3;
    }
    static  double[][] scalarDivision(double[][] matrix, int rows, int columns, double scalar)
    {
        double[][] matrix3 = new double[columns][rows];

        for(int i = 0; i < rows; i++) {
            for(int j = 0; j < columns; j++) {
                matrix3[j][i] = matrix[j][i] / scalar;
            }
        }
        return matrix3;
    }
    static  double[][] scalarMultiplicaiton(double[][] matrix, int rows, int columns, double scalar)
    {
        double[][] matrix3 = new double[columns][rows];

        for(int i = 0; i < rows; i++) {
            for(int j = 0; j < columns; j++) {
                matrix3[j][i] = matrix[j][i] * scalar;
            }
        }
        return matrix3;
    }
    static double[][] matrixTranspose(double[][] matrix, int rows, int columns)
    {
        double[][] matrix3 = new double[rows][columns];
        for(int i = 0; i < rows; i++) {
            for(int j = 0; j < columns; j++) {
                matrix3[i][j] = matrix[j][i];
            }
        }
        return matrix3;
    }


    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int decision;
        do
        {
            System.out.println("Choose your matrix operation below: ");
            System.out.println("1-)Matrix addition\n2-)Matrix Subtraction\n3-)Matrix Multiplication\n4-)Scalar division of the matrix\n5-)Scalar multiplicaiton of the matrix" +
                    "\n6-)Transpose of the matrix\n7-)The inverse of the matrix ");
            System.out.print("Operation: ");
            decision=input.nextInt();
        }while(decision<0 || decision>10);

        int columns1, columns2, rows1, rows2;
        double[][] matrix1, matrix2, matrix3;
        double scalar;

        if(decision > 0 && decision <= 3)
        {
            System.out.println("Type column: ");
            columns1 = getcolumn();
            System.out.println("Type row: ");
            rows1 = getrow();
            matrix1 = getMatrix(columns1, rows1);
            System.out.println("Type column: ");
            columns2 = getcolumn();
            System.out.println("Type row: ");
            rows2 = getrow();
            matrix2 = getMatrix(columns2, rows2);

            switch(decision){
                case 1:
                    matrix3 = matrixAddition(matrix1, matrix2, columns1, rows1);
                    printMatrix(matrix3, columns1, rows1);
                    break;

                case 2:
                    matrix3 = matrixSubtraction(matrix1, matrix2, columns1, rows1);
                    printMatrix(matrix3, columns1, rows1);
                    break;

                case 3:
                    if (rows2 != columns1) {
                        System.out.println("\nMultiplication Not Possible");
                        break;
                    }
                    else
                    {
                        matrix3 = matrixMultiplication(matrix1, rows1, columns1, matrix2, rows2, columns2);
                        printMatrix(matrix3 ,rows1, columns2);
                        break;
                    }
            }
        } else if (decision == 4 || decision == 5)
        {
            System.out.println("Type column: ");
            columns1 = getcolumn();
            System.out.println("Type row: ");
            rows1 = getrow();
            matrix1 = getMatrix(columns1, rows1);
            System.out.println("Type double Scalar: ");
            scalar = getScalar();

            switch (decision)
            {
                case 4:
                    matrix3 = scalarDivision(matrix1, rows1, columns1, scalar);
                    printMatrix(matrix3, columns1, rows1);
                    break;
                case 5:
                    matrix3 = scalarMultiplicaiton(matrix1, rows1, columns1, scalar);
                    printMatrix(matrix3, columns1, rows1);
                    break;
            }

        } else if(decision == 6 || decision == 7)
        {
            System.out.println("Type column: ");
            columns1 = getcolumn();
            System.out.println("Type row: ");
            rows1 = getrow();
            matrix1 = getMatrix(columns1, rows1);

            switch(decision)
            {
                case 6:
                    matrix3 = matrixTranspose(matrix1, rows1, columns1);
                    printMatrix(matrix3, rows1, columns1);
                    break;
                //case 7: Inverse almak baya uzun bir kod o yüzden bunu package kullanmadan mı
                //yapalım yoksa package kullanarak mı hocaya sormak lazım.
            }
        }
    }
}
