import java.util.Scanner;;
public class Matrix {

	public static void main(String[] args) {
		int n=Integer.parseInt(args[0]);
		int i,j;

		int mat1[][]=new int[n][n];
		int mat2[][]=new int[n][n];
		int result[][]=new int[n][n];

		Scanner sc= new Scanner(System.in);
		System.out.println("\nEnter the elements in the Matrix 1: ");
		for(i=0;i<n;i++){
			for(j=0;j<n;j++){
				mat1[i][j]=sc.nextInt();
			}
		}
		System.out.println("\n Enter the elements in the Matrix 2: ");
		for(i=0;i<n;i++){
			for(j=0;j<n;j++){
				mat2[i][j]=sc.nextInt();
			}
		}
		for(i=0;i<n;i++){
			for(j=0;j<n;j++){
				result[i][j]=mat1[i][j]+mat2[i][j];

			}
		}
		System.out.println("\n The elements of resultant Matrix\n ");
		for(i=0;i<n;i++){
			for(j=0;j<n;j++){
				System.out.print(result[i][j]+" ");
			}
			System.out.println("");
		}
		
	}
}