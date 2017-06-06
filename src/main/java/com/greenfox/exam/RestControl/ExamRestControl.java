package com.greenfox.exam.RestControl;

import com.greenfox.exam.Model.QuestionsResponse;
import com.greenfox.exam.Service.QuizService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ExamRestControl {

  @Autowired
  QuizService quizService;

  @GetMapping("/questions")
  public QuestionsResponse getFiveQuestions(){
    return quizService.getFiveRandomQuestions();
  }
}
