import java.io.*;
import java.util.*;
public class LeadingPlus {

	public static void main(String[] args) throws IOException{
		// TODO Auto-generated method stub
		Scanner sf = new Scanner(new File("U:\\Workshop\\LeadingPlus\\src\\MyData.in"));
		String text[] = new String[1000];
		int maxIndx = -1;
		while(sf.hasNext()){
			maxIndx++;
			text[maxIndx] = sf.nextLine();
		}
		sf.close();
		String answer = "";
		int sum;
		for(int j = 0; j <=maxIndx; j++){
			Scanner sc = new Scanner(text[j]);
			sum = 0;
			answer = "";
			while(sc.hasNext()) {
				int i = sc.nextInt();
				answer = answer + " + " + i;
				sum = sum + i;
			}
			answer = answer + " = " + sum;
			answer = answer.substring(3);
			System.out.println(answer);
		}
	}

}
