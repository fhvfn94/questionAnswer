package com.questionAnswer.questionAnswerController;

import com.questionAnswer.questionAnswerService.QuestionAnswerService;
import org.springframework.web.bind.annotation.*;

import javax.annotation.PostConstruct;
import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import java.nio.charset.StandardCharsets;

@RestController
@RequestMapping("/exam/java/")
public class QuestionAnswerController {
    private final QuestionAnswerService questionAnswerService;

    public QuestionAnswerController(QuestionAnswerService questionAnswerService) {
        this.questionAnswerService = questionAnswerService;
    }

    @GetMapping("random/{count}")
    public String getRandomQuestion(@PathVariable("count") Integer count) {
        return questionAnswerService.getRandomQuestion(count);
    }

    @GetMapping("add")
    public String add(@RequestParam("question") String question, @RequestParam("answer") String answer) {
        return questionAnswerService.add(question, answer);
    }

    @GetMapping("remove")
    public String remove(@RequestParam("question") String question, @RequestParam("answer") String answer) {
        return questionAnswerService.remove(question, answer);
    }

    @GetMapping
    public String getAllQuestion() {
        return questionAnswerService.getAllQuestion();
    }
}
