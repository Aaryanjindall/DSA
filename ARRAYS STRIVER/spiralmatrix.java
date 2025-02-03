import java.util.*;
public class spiralmatrix {

    public static void printSpiral(int matrix[][]){
        int startrow = 0;
        int startcol = 0;
        int endrow = matrix.length-1;
        int endcol = matrix[0].length -1;
        while(startrow <= endrow && startcol <=endcol){
            //top
            for(int col = startcol ; col<=endcol ; col++){
                System.out.print(matrix[startrow][col]+" ");

            }
            //right
            for(int row= startrow+1 ; row<=endrow ; row++){
                System.out.print(matrix[row][endcol]+" ");
            }
            //bottom
            for(int col = endcol -1 ; col>=startcol ; col--){
                if(startrow == endrow){
                    break;
                }
                System.out.print(matrix[endrow][col]+" ");
            }
            //left
            for(int row = endrow -1 ; row>=startrow+1 ; row--){
                if(startcol == endcol){
                    break;
                }
                System.out.print(matrix[row][startcol]+" ");
            }
            startrow++;
            startcol++;
            endcol--;
            endrow--;


        }
        System.out.println();
    }
   


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int matrix [][] = new int[4][4];
        // int n = 4;
        // int m = 4;
        //or 
        int n = matrix.length;
        int m = matrix[0].length;
        for(int i = 0 ; i<n ; i++){
            for(int j = 0 ; j<m ; j++){
                matrix[i][j] = sc.nextInt();

            }
        }
        for(int i = 0 ; i<n ; i++){
            for(int j = 0 ; j<m ; j++){
                System.out.print(matrix[i][j] + " ");
                
            }
            System.out.println();
        }
        printSpiral(matrix);


    }
}
