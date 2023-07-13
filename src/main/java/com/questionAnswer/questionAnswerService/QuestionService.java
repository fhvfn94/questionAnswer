package com.questionAnswer.questionAnswerService;

import com.questionAnswer.module.Question;

import java.util.List;

public interface QuestionService {


    String add(String question, String answer);

    String remove(String question, String answer);


    List<Question> getAllQuestion();
}
