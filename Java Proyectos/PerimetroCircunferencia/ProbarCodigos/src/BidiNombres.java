public class BidiNombres {
	public static void main(String[] args) {
		String[][]names= {
				{"Jimin", "Luzu", "Yoongi", "Wilbur"},
				{"Jungkook", "Quacks", "Taehyung", "Juanito"},
				{"Namjoon", "Spreen", "Jin", "Roier"},
		};
		for(int i=0; i<3; i++) {
			System.out.println(" ");
			for(int b=0; b<4; b++) {
				System.out.print(names[i][b] + " ");
			}
		}
	}

}
