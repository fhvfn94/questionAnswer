package com.questionAnswer.QuestionAnswerRep;

import com.questionAnswer.module.QuestionAnswer;
import org.springframework.stereotype.Repository;

import javax.annotation.PostConstruct;
import java.util.HashMap;
import java.util.Map;

@Repository
public class QuestionAnswerRep {
    private final Map<String, String> map = new HashMap<>();

    @PostConstruct
    public void base() {
        map.put("Какая страна самая большая на земле?", "Россия");
        map.put("Какая планета самая большая в солнечной системе?", "Юпитер");
        map.put("Столица Китая?", "Пекин");
        map.put("Сколько на земле людей?", "8 млрд");
    }

    public String add(String question, String answer) {
        if (!map.containsKey(question)) {
            map.put(question, answer);
            return "Добавили вопрос и ответ";
        }
        throw new RuntimeException();
    }
}
