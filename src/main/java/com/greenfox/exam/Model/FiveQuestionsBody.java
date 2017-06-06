package com.greenfox.exam.Model;


import java.util.ArrayList;
import java.util.List;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

public class FiveQuestionsBody {

  @Id
  @GeneratedValue(strategy = GenerationType.AUTO)
  private long id;

  private List<Question> questions;

  public FiveQuestionsBody() {
    this.questions = new ArrayList<Question>();
  }

  public FiveQuestionsBody(List<Question> questions) {
    this.questions = questions;
  }

  public long getId() {
    return id;
  }

  public void setId(long id) {
    this.id = id;
  }

  public List<Question> getQuestions() {
    return questions;
  }

  public void setQuestions(List<Question> questions) {
    this.questions = questions;
  }
}
