import java.util.Scanner;
import java.util.*;


class RepeatAdditionQuiz{
	public static void main (String[] args){
		//datafield
		int a = (int) (Math.random()*10);
		int b = (int) (Math.random()*10);
		int answer;
		ArrayList arraylist = new ArrayList();
		//Create a new scanner
		Scanner scanner= new Scanner(System.in);
		System.out.println("what is"+ a + "*" + b+ "=");
		answer = scanner.nextInt();

	
	
	while(a*b !=answer){
		if(arraylist.contains(answer)){
			System.out.println("You have already input"+ answer +"!!");
		}
		System.out.println("Wrong answer! Please fill in another answer");
		answer = scanner.nextInt();
		arraylist.add(answer);
	}System.out.println("You are right!");//right answer
	}
}