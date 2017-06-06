package com.greenfox.exam.Control;

import com.greenfox.exam.Model.Answer;
import com.greenfox.exam.Model.AnswerBody;
import com.greenfox.exam.Model.ProjectListBody;
import com.greenfox.exam.Model.QuestionsResponse;
import com.greenfox.exam.Service.QuizService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ExamRestControl {

  @Autowired
  QuizService quizService;
  QuestionsResponse questionsResponse;

  @GetMapping("/questions")
  public ResponseEntity<?> getFiveQuestions(){
    questionsResponse = quizService.getFiveRandomQuestions();
    return new ResponseEntity(questionsResponse, HttpStatus.OK);
  }

  @PostMapping("/answers")
  public ResponseEntity<?> checkAnswers(@RequestBody AnswerBody answerBody){
    for (Answer a : answerBody.getAnswers()) {
    if (a.getAnswer() == questionsResponse.getQuestions().   ...){
      return new ResponseEntity(new ProjectListBody(), HttpStatus.OK);
    } else {
      return new ResponseEntity(new ProjectListBody(), HttpStatus.BAD_REQUEST);
    }

