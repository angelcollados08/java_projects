public class QuestionService {

    Question [] questions = new Question [5];

    public QuestionService(){
        String [] example1 = {"1","2","3","4","5"};
        questions[0] = new Question(1,"Size of a",example1,"2");
        String [] example2 = {"1","2","3","4","5"};
        questions[1] = new Question(2,"Size of ab",example2,"2");
        String [] example3 = {"1","2","3","4","5"};
        questions[2] = new Question(3,"Size of abc",example3,"2");
        String [] example4 = {"1","2","3","4","5"};
        questions[3] = new Question(4,"Size of abcd",example4,"2");
        String [] example5 = {"1","2","3","4","5"};
        questions[4] = new Question(5,"Size of abcde",example5,"2");
    }

    public void displayQuestions(){
        for (Question q: questions){
            System.out.println(q);
        }
    }
}
