package com.questionAnswer.questionAnswerController;

import com.questionAnswer.questionAnswerService.QuestionService;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/exam/java/")
public class QuestionAnswerController {
    private final QuestionService questionService;

    public QuestionAnswerController(QuestionService questionService) {
        this.questionService = questionService;
    }

    @GetMapping("random/{count}")
    public String getRandomQuestion(@PathVariable("count") Integer count) {
        return questionService.getRandomQuestion(count);
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
    public String getAllQuestion() {
        return questionService.getAllQuestion();
    }
}
