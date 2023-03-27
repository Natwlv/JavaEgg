package Guia02;

public class Guia02Extra12 {

	public static void main(String[] args) {
		String num1;
		String num2;
		String num3;
		
		for (int i=0; i <=9; i++){
			for (int j=0; j <=9; j++) {
				for (int k=0; k<=9; k++) {
					
					num1 = String.valueOf(i);
					num2 = String.valueOf(j);
					num3 = String.valueOf(k);
					
					num1 = num1.replace("3","E");
					num2 = num2.replace("3","E");
					num3 = num3.replace("3","E");


				System.out.println(num1 + " - " + num2 + " - " + num3);	
					
				}
			}
			
		}

	}

}
