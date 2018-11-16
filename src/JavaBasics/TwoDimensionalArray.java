package JavaBasics;

public class TwoDimensionalArray {

	public static void main(String[] args) {
		String s[][]=new String[3][5];
		System.out.println("Row Length "+s.length);//s.length=> Total No. of Rows
		System.out.println("Column Length "+s[0].length);//Total No of Columns
		s[0][0]="A";
		s[0][1]="B";
		s[0][2]="C";
		s[0][3]="D";
		s[0][4]="E";
		s[0][5]="W";
		
		s[1][0]="F";
		s[1][1]="G";
		s[1][2]="H";
		s[1][3]="I";
		s[1][4]="J";
		
		s[2][0]="K";
		s[2][1]="L";
		s[2][2]="M";
		s[2][3]="N";
		s[2][4]="O";
		
		System.out.println("s[1][2]"+s[1][2]);
		System.out.println("s[2][2]"+s[2][2]);
		
		for(int row=0;row<s.length;row++) {
			for(int col=0;col<s[0].length;col++) {
				System.out.print(s[row][col]);
			}
			System.out.println();
		}
	}

}
