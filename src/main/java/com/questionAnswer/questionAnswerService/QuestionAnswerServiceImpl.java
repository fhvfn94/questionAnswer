package com.questionAnswer.questionAnswerService;

import com.questionAnswer.QuestionAnswerRep.QuestionAnswerRep;
import org.springframework.stereotype.Service;

@Service
public class QuestionAnswerServiceImpl implements QuestionAnswerService {
    private final QuestionAnswerRep questionAnswerRep;

    public QuestionAnswerServiceImpl(QuestionAnswerRep questionAnswerRep) {
        this.questionAnswerRep = questionAnswerRep;
    }
    @Override
    public String getRandomQuestion(Integer count) {
        return questionAnswerRep.getRandomQuestion(count);
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
    public String getAllQuestion() {
        return questionAnswerRep.getAllQuestion();
    }

}
