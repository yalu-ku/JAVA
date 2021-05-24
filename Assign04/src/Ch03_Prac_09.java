
public class Ch03_Prac_09 {

	public static void main(String[] args) {
		int arr[][] = new int[4][4];
		for(int i=0; i<4; i++) {
			for(int j=0; j<4; j++) {
				arr[i][j] = (int)(Math.random()*10 +1);
				System.out.print(arr[i][j] + "\t");
			}
			System.out.println();
		}
		
	}

}
