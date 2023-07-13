package com.questionAnswer;

import com.questionAnswer.questionAnswerRep.QuestionAnswerRep;
import com.questionAnswer.module.Question;
import com.questionAnswer.questionAnswerService.ExaminerService;
import com.questionAnswer.questionAnswerService.JavaQuestionService;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.Mockito.when;

@ExtendWith(MockitoExtension.class)
class QuestionAnswerApplicationTests {
	@Mock
	private QuestionAnswerRep questionAnswerRep;

	@InjectMocks
	private JavaQuestionService questionAnswerService;

	@InjectMocks
	private ExaminerService examinerService;

	Question question1 = new Question("Сколько на земле человек", "8 млрд");
	Question question2 = new Question("Сколько на земле человек", "8 млрд");
	Question question3 = new Question("Как звали первого человека", "Адам");
	Question question4 = new Question("Как называется фильм, где главный злодей Джокер", "Темный рыцарь");
	Question question5 = new Question("Какого цвета Солнце", "белый");
	Question question6 = new Question("Что кричал волк зайцу", "Ну погоди!");
	Question question7 = new Question("Сколько пальцев на руке", "5");

	@Test
	public void getRandomQuestion() {
		when(questionAnswerRep.getRandomQuestion())
				.thenReturn(new Question(question1.getQuestion(), question1.getAnswer()));
		Question result = examinerService.getRandomQuestion();
		assertEquals("bad request", result);
	}

	@Test
	public void add() {
		when(questionAnswerRep.add(question1.getQuestion(), question1.getAnswer()))
				.thenReturn("Добавили " + " " + question1.getQuestion() + " и " + question1.getAnswer());
		String result = questionAnswerService.add(question1.getQuestion(), question1.getAnswer());
		assertEquals("Добавили " + " " + question1.getQuestion() + " и " + question1.getAnswer(), result);
	}

	@Test
	public void remove() {
		when(questionAnswerRep.remove(question1.getQuestion(), question1.getAnswer()))
				.thenReturn("Удалили " + " " + question1.getQuestion() + " и " + question1.getAnswer());
		String result = questionAnswerService.remove(question1.getQuestion(), question1.getAnswer());
		assertEquals("Удалили " + " " + question1.getQuestion() + " и " + question1.getAnswer(), result);
	}



}
