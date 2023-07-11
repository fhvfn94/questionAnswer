package com.questionAnswer.QuestionAnswerRep;
import com.questionAnswer.module.Question;
import org.springframework.stereotype.Repository;

import javax.annotation.PostConstruct;
import java.util.*;

@Repository
public class QuestionAnswerRep {
    private final List<Question> list = new ArrayList<>();

    @PostConstruct
    public void base() {
        list.add(new Question("Какая страна самая большая на земле?", "Россия"));
        list.add(new Question("Какая планета самая большая в солнечной системе?", "Юпитер"));
        list.add(new Question("Столица Китая?", "Пекин"));
        list.add(new Question("Сколько на земле людей?", "8 млрд"));
    }

    public String getRandomQuestion(Integer count) {
        if (count > list.size()) {
            return "bad request";
        }
        Random random = new Random();
        List<Question> l = new ArrayList<>(); //
        List<Integer> index = new ArrayList<>(); // index (2, 4)
        for (int i = 0; i < count; i++) {
            Integer num = random.nextInt(list.size()); // num = 2, 4
            while (index.contains(num)) {
                num = random.nextInt(list.size()); // 4
            }
            index.add(num);
            l.add(list.get(num));


        }
        return l.toString();
    }
    public String add(String question, String answer) {
        if (!list.contains(new Question(question, answer))) {
            list.add(new Question(question, answer));
            return "Добавили " + " " + question + " и " + answer;
        }
        throw new IllegalArgumentException("Вопрос уже существует");
    }

    public String remove(String question, String answer) {
        if (list.contains(new Question(question, answer))) {
            list.remove(new Question(question, answer));
            return "Удалили " + " " + question + " и " + answer;
        }
        throw new IllegalArgumentException("Вопроса такого нет");
    }

    public String getAllQuestion() {
        return list.toString();
    }

}
