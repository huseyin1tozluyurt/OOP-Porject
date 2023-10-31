import java.util.Scanner;
public class project1 {

    static double[][] getMatrix1(int columns, int rows)
    {
        Scanner input =new Scanner(System.in);
        double[][] matrix1= new double [columns][rows];
        //getting the first matrix
        System.out.print("Enter your matrix: ");
        for(int i=0;i<rows;i++)
        {
            for(int j=0;j<columns;j++)
            {
                double arrayElement;
                arrayElement= input.nextInt();
                matrix1[j][i]=arrayElement;
            }
        }
        return matrix1;
    }
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

        System.out.println("Matrix Addition");
        int rows,columns;

        System.out.print("Rows: ");
        rows=input.nextInt();
        System.out.println("");
        System.out.print("columns: ");
        columns=input.nextInt();
        int size=rows*columns;

        if(decision==1)
        {
            double[][] matrix1 = getMatrix1(columns, rows);
            double[][] matrix2 = getMatrix2(columns, rows);
            double[][] matrix3 = MatrixAddition(matrix1, matrix2, columns, rows);
            printMatrix(matrix3, columns, rows);
        }
    }
}
