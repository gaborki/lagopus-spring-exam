package com.greenfox.exam.Model;

import java.util.List;
import org.springframework.stereotype.Component;

@Component
public class QuestionsResponse {

  private long id = 1;

  private List<QuestionToList> questions;

  public QuestionsResponse() {
  }

  public QuestionsResponse(List<QuestionToList> questions) {
    this.questions = questions;
  }

  public long getId() {
    return id;
  }

  public void setId(long id) {
    this.id = id;
  }

  public List<QuestionToList> getQuestions() {
    return questions;
  }

  public void setQuestions(List<QuestionToList> questions) {
    this.questions = questions;
  }
}
