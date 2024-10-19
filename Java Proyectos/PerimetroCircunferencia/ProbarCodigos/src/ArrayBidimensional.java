public class ArrayBidimensional {
	public static void main(String[] args) {
		int[][]cajon= new int[5][6];
		cajon[0][0]=6;
		cajon[0][1]=4;
		cajon[0][2]=3;
		cajon[0][3]=2;
		cajon[0][4]=1;
		cajon[0][5]=8;
		
		cajon[1][0]=20;
		cajon[1][1]=18;
		cajon[1][2]=40;
		cajon[1][3]=15;
		cajon[1][4]=232;
		cajon[1][5]=5;
		
		cajon[2][0]=41;
		cajon[2][1]=500;
		cajon[2][2]=1000;
		cajon[2][3]=58;
		cajon[2][4]=30;
		cajon[2][5]=22;
		
		cajon[3][0]=67;
		cajon[3][1]=93;
		cajon[3][2]=11;
		cajon[3][3]=32;
		cajon[3][4]=27;
		cajon[3][5]=16;
		
		cajon[4][0]=14;
		cajon[4][1]=19;
		cajon[4][2]=24;
		cajon[4][3]=56;
		cajon[4][4]=82;
		cajon[4][5]=92;
		
		for(int a=0; a<5; a++) {
			System.out.println(" ");
			for(int b=0; b<6; b++) {
				System.out.print(cajon[a][b] + " ");
			}
		}
	}

}
