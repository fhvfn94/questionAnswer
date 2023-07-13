package com.questionAnswer.questionAnswerController;

import com.questionAnswer.questionAnswerService.ExaminerService;
import com.questionAnswer.questionAnswerService.ExaminerServiceImpl;
import com.questionAnswer.questionAnswerService.QuestionService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ExamController {
    private final ExaminerService examinerService;

    public ExamController(ExaminerService examinerService) {
        this.examinerService = examinerService;
    }
    @GetMapping("random/{count}")
    public String getRandomQuestion(@PathVariable("count") Integer count) {
        return examinerService.getRandomQuestion(count);
    }
}
