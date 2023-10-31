import java.util.Scanner;
public class project1 {

    static double[][] getMatrix1()
    {

        System.out.println("Matrix Addition");
        Scanner input =new Scanner(System.in);
        int rows,columns;

        System.out.print("Rows: ");
        rows=input.nextInt();
        System.out.println("");
        System.out.print("columns: ");
        columns=input.nextInt();
        int size=rows*columns;
        double[][]matrix1= new double [columns][rows];
        //getting the first matrix
        System.out.printf("Enter your matrix: ");
        for(int i=0;i<rows;i++)
        {
            for(int j=0;j<columns;j++)
            {
                int arrayElement;
                arrayElement= input.nextInt();
                matrix1[i][j]=arrayElement;
            }
        }
        return matrix1;
    }
    static double[][] getMatrix2()
    {

        System.out.println("Matrix Addition");
        Scanner input =new Scanner(System.in);
        int rows,columns;

        System.out.print("Rows: ");
        rows=input.nextInt();
        System.out.println("");
        System.out.print("Columns: ");
        columns=input.nextInt();
        int size=rows*columns;
        double[][]matrix2= new double [columns][rows];
        //getting the first matrix
        System.out.printf("Enter your matrix: ");
        for(int i=0;i<rows;i++)
        {
            for(int j=0;j<columns;j++)
            {
                int arrayElement;
                arrayElement= input.nextInt();
                matrix2[i][j]=arrayElement;
            }

        }

        return matrix2;
    }

    static void printMatrix(double[][] matrix, int columns, int rows)
    {
        System.out.printf("[ ");
        for(int i=0;i<rows;i++)
        {
            System.out.printf("[ ");
            for(int j=0;j<columns;j++)
            {
                double value=matrix[i][j];
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
    static double[][] MatrixAddition(double[][] matrix1,double[][] matrix2, int row, int col){
        double[][] matrix3 = new double[col][row];
        for(int i = 0; i < row; i++)
        {
            for(int j = 0; j < col; j++)
            {
                matrix3[i][j] = matrix1[i][j] + matrix2[i][j];
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
            getMatrix1();
            getMatrix2();
            //printMatrix();
            printMatrix(MatrixAddition(), );
        }

    }

}
