import java.util.Scanner;

public class OddLetter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub


		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the input word ");
		String str = scanner.nextLine();
		char[] chararr = str.toCharArray();

		int m = chararr.length / 2;
		for (int i = 1; i <= chararr.length; i++) {
			int n = chararr.length / 2;
			int index = 0;
			for(int k = 1; k <=chararr.length-i; k++) {
				System.out.print(" ");
			}
			for (int j = i; j > 0; j--) {
				if (n < chararr.length) {

					System.out.print(chararr[n]);

					n++;
					} else if (n >= chararr.length && index < m) {
						
						System.out.print(chararr[index]);
						index++;

					}

				}
				System.out.println("\n");
			}

		}

	}