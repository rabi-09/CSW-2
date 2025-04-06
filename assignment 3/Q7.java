import java.util.Scanner;

public class Q7 {
    public static void main(String[] args) {
        int [][] mat1 = makeMatrix();
        int [][] mat2 = makeMatrix();
        System.out.println("Matrix 1 is: ");
        printMatrix(mat1);
        System.out.println("Matrix 2 is: ");
        printMatrix(mat2);

        try{
            int [][] add = addMatrix(mat1, mat2);
            printMatrix(add);

            int[][] multiply = multiplyMatrix(mat1, mat2);
            printMatrix(multiply);

            System.out.println("Transpose of Matrix 1 is: ");
            printMatrix(getTranspose(mat1));
            System.out.println("Transpose of Matrix 2 is: ");
            printMatrix(getTranspose(mat2));

        }catch (NullPointerException n){
            System.out.println("Matrix is NULL");
        }catch (Exception e){
            System.out.println("ERROR: "+e.getMessage());
        }
    }
    public static int[][] makeMatrix(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter row and colum size of Matrix");
        int m = sc.nextInt(), n=sc.nextInt();
        int [][] matrix = new int[m][n];
        try{
            for (int i = 0; i < m; i++) {
                System.out.println("Enter "+(i+1)+" row elements");
                for (int j = 0; j < n; j++) {
                    matrix[i][j] = sc.nextInt();
                }
            }
        }
        catch(ArrayIndexOutOfBoundsException a){
            System.out.println("Index out of Bound Exception occurred from make Matrix method\nERROR: "+a.getMessage());
        }
        return matrix;
    }
    public static void printMatrix(int[][] arr){
        try{
            for (int i = 0; i < arr.length; i++) {
                for (int j = 0; j < arr[i].length; j++) {
                    System.out.print(arr[i][j]+" ");
                }
                System.out.println();
            }
        }
        catch(ArrayIndexOutOfBoundsException a){
            System.out.println("Index out of Bound Exception occurred from Print method\nERROR: "+a.getMessage());
        }
    }
    public static int[][] addMatrix(int[][] arr1, int[][] arr2){
        int r1 = arr1.length, r2 = arr2.length;
        int c1 = arr1[0].length, c2 = arr2[0].length;
            if((r1!=r2) || (c1!=c2)){
                throw new ArrayIndexOutOfBoundsException("Addition can't be performed due to mismatch in row and columns");
            }
            else {
                System.out.println("Addition of Matrix 1 & 2 are: ");
                int[][] arr = new int[arr1.length][arr1[0].length];
                for (int i = 0; i < arr.length; i++) {
                    for (int j = 0; j < arr[i].length; j++) {
                        arr[i][j] = arr1[i][j] + arr2[i][j];
                    }
                }
                return arr;
            }
    }
    public static int[][] multiplyMatrix(int[][] arr1, int[][] arr2){
        int r1 = arr1.length;
        int c1 = arr1[0].length;
        int r2 = arr2.length;
        int c2 = arr2[0].length;
            if((c2!=r1)){
                throw new ArrayIndexOutOfBoundsException("MULTIPLICATION can't be performed due to mismatch in row and columns");
            }
            else{
                System.out.println("Multiplication of Matrix 1 & 2 are: ");
                int [][] arr = new int[c1][r2];
                for (int i = 0; i < r1; i++) {
                    for (int j = 0; j < c2; j++) {
                        for (int k = 0; k < c1; k++) {
                            arr[i][j] += arr1[i][k] * arr2[k][j];
                        }
                    }
                }
                return arr;
            }

    }
    public static int[][] getTranspose(int[][] arr){
        int col = arr[0].length;
        int row = arr.length;
        int [][] transpose = new int[col][row];
        try{
            for (int i = 0; i < row; i++) {
               for (int j = 0; j < col; j++) {
                  transpose[j][i] = arr[i][j];
               }
            }
        }
        catch(ArrayIndexOutOfBoundsException a){
            System.out.println("Index out of Bound Exception occurred from GET_TRANSPOSE matrix method\nERROR: "+a.getMessage());
        }
        return transpose;
    }
}
