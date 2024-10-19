
public class Bidimensional {

	public static void main(String[] args) {
		int[][]cajon= {
				{6, 20, 41, 62, 74},
				{4, 18, 500, 93, 19},
				{3, 40, 1000, 11, 94},
				{2, 15, 58, 52, 36},
				{1, 232, 20, 27, 82},
		};
		for(int i=0; i<4; i++) {
			System.out.println();
			for (int j=0; j<5; j++) {
				System.out.print(cajon[i][j] + " ");
			}
		}
	}

}
