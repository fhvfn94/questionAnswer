package com.questionAnswer.questionAnswerService;

import com.questionAnswer.questionAnswerRep.QuestionAnswerRep;
import org.springframework.stereotype.Service;

@Service
public class ExaminerServiceImpl implements ExaminerService {

    private final QuestionAnswerRep questionAnswerRep;

    public ExaminerServiceImpl(QuestionAnswerRep questionAnswerRep) {
        this.questionAnswerRep = questionAnswerRep;
    }
    @Override
    public String getRandomQuestion(Integer count) {
        return questionAnswerRep.getRandomQuestion(count);
    }
}
