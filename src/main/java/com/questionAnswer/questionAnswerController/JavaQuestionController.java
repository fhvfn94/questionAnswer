package com.questionAnswer.questionAnswerController;

import com.questionAnswer.module.Question;
import com.questionAnswer.questionAnswerService.QuestionService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/exam/java/")
public class JavaQuestionController {
    private final QuestionService questionService;

    public JavaQuestionController(QuestionService questionService) {
        this.questionService = questionService;
    }



    @GetMapping("add")
    public String add(@RequestParam("question") String question, @RequestParam("answer") String answer) {
        return questionService.add(question, answer);
    }

    @GetMapping("remove")
    public String remove(@RequestParam("question") String question, @RequestParam("answer") String answer) {
        return questionService.remove(question, answer);
    }

    @GetMapping
    public List<Question> getAllQuestion() {
        return questionService.getAllQuestion();
    }
}
