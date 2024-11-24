package quizcompetition;
import java.util.*;

public class questionService {
	
	Questions[] Questions = new Questions[5];
	String[] answers = new String[5];
	
	public questionService() {
		Questions[0]=new Questions(1,"What1","Java","Cpp","Python","Csharp","Java");
		Questions[1]=new Questions(2,"What2","Java","Cpp","Python","Csharp","Java");
		Questions[2]=new Questions(3,"What3","Java","Cpp","Python","Csharp","Java");
		Questions[3]=new Questions(4,"What4","Java","Cpp","Python","Csharp","Java");
		Questions[4]=new Questions(5,"What5","Java","Cpp","Python","Csharp","Java");
	}
	
	public void playQuiz() {
		int i=0;
		for(Questions q : Questions) {
			System.out.println("Question No.:"+q.getId());
			System.out.println(q.getQuestion());
			System.out.println(q.getOpt1());
			System.out.println(q.getOpt2());
			System.out.println(q.getOpt3());
			System.out.println(q.getOpt4());
			Scanner sc =new Scanner(System.in);
			String answer = sc.nextLine();
			answers[i++]= answer;
		}
		for(String ans : answers) {
			System.out.print(ans+" ");
		}
	}
	public void calculatescore() {
		int count=0;
		for(int i=0;i<Questions.length;i++) {
			Questions que = Questions[i];
			String actualanswer = que.getAnswer();
			
			String useranswer = answers[i];
			
			if(actualanswer == useranswer) {
				count++;
			}
		}
		
		System.out.println("Your Score is : "+count);
	}
}
