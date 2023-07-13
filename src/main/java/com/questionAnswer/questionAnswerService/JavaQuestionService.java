package com.questionAnswer.questionAnswerService;

import com.questionAnswer.module.Question;
import com.questionAnswer.questionAnswerRep.QuestionAnswerRep;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class JavaQuestionService implements QuestionService {
    private final QuestionAnswerRep questionAnswerRep;

    public JavaQuestionService(QuestionAnswerRep questionAnswerRep) {
        this.questionAnswerRep = questionAnswerRep;
    }

    @Override
    public String add(String question, String answer) {
        return questionAnswerRep.add(question, answer);
    }

    @Override
    public String remove(String question, String answer) {
        return questionAnswerRep.remove(question, answer);
    }



    @Override
    public List<Question> getAllQuestion() {
        return questionAnswerRep.getAllQuestion();
    }

}
