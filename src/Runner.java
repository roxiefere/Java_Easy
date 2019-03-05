import java.util.Scanner;

public class Runner {


    public static void main(String[] args) {
        Question q = new Question();
        Scanner sc = new Scanner(System.in);

        for(int i =0; i<q.questions.length; i++) {
            System.out.println("The question is: ");
            System.out.println(q.questions[i]);
            q.answers[i] = sc.nextInt();
        }

        q.processInput();

    }
}
