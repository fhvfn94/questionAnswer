package com.questionAnswer.questionAnswerService;

public interface QuestionService {


    String add(String question, String answer);

    String remove(String question, String answer);


    String getAllQuestion();
}
