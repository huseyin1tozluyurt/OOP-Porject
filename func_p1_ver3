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

    static double[][] getMatrix(int columns, int rows)
    {
        Scanner input =new Scanner(System.in);
        double[][] matrix= new double [columns][rows];
        //getting the first matrix
        System.out.print("Enter your matrix: ");
        for(int i=0;i<rows;i++)
        {
            for(int j=0;j<columns;j++)
            {
                double arrayElement;
                arrayElement= input.nextInt();
                matrix[j][i]=arrayElement;
            }
        }
        return matrix;
    }
    /*
    static double[][] getMatrix2(int columns, int rows)
    {
        Scanner input =new Scanner(System.in);
        double[][] matrix2= new double [columns][rows];

        System.out.printf("Enter your matrix: ");
        for(int i=0;i<rows;i++)
        {
            for(int j=0;j<columns;j++)
            {
                double arrayElement;
                arrayElement= input.nextInt();
                matrix2[j][i]=arrayElement;
            }

        }

        return matrix2;
    }

     */

    static void printMatrix(double[][] matrix, int columns, int rows)
    {
        System.out.print("[ ");
        for(int i=0;i<rows;i++)
        {
            System.out.print("[ ");
            for(int j=0;j<columns;j++)
            {
                double value=matrix[j][i];
                if(j==columns-1)
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
    }
    static double[][] MatrixAddition(double[][] matrix1,double[][] matrix2, int col, int row){
        double[][] matrix3 = new double[col][row];
        for(int i = 0; i < row; i++)
        {
            for(int j = 0; j < col; j++)
            {
                matrix3[j][i] = matrix1[j][i] + matrix2[j][i];
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
            System.out.println("1-)Matrix addition\n2-)Matrix Subtraction\n3-)Matrix Multiplication\4-)Scalar Multiplication");
            System.out.print("Operation: ");
            decision=input.nextInt();
        }while(decision<0 || decision>4);

        if(decision==1)
        {
            System.out.println("Type column: ");
            int columns1 = getcolumn();
            System.out.println("Type row: ");
            int rows1 = getrow();
            double[][] matrix1 = getMatrix(columns1, rows1);
            System.out.println("Type column: ");
            int columns2 = getcolumn();
            System.out.println("Type row: ");
            int rows2 = getrow();
            double[][] matrix2 = getMatrix(columns2, rows2);
            double[][] matrix3 = MatrixAddition(matrix1, matrix2, columns1, rows1);
            printMatrix(matrix3, columns1, rows1);
        }
    }
}
