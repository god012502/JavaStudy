package quiz0324;
public class QuUpgradeGuGu {
	public static void main(String[] args) {	
		int sum = 1;

		for(int i=2; i<=9; i++) {
			System.out.println(i + " x 1 = " + i);

			for(int j=1; j<=8; j++) {
				for(int k=1; k<=j+1; k++) {
					sum = sum * i;
					if(k == (j+1)) {
						System.out.println(i + " = " + sum);
					} 
					else {
						System.out.print(i + " x ");
					}
				}
				sum = 1;
			}
		}
	}
}