package com.greenfox.exam.Model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class QuestionToList {

  @Id
  @GeneratedValue(strategy = GenerationType.AUTO)
  private long id;

  private String question;

  public QuestionToList() {
  }

  public QuestionToList(String question) {
    this.question = question;
  }

  public long getId() {
    return id;
  }

  public void setId(long id) {
    this.id = id;
  }

  public String getQuestion() {
    return question;
  }

  public void setQuestion(String question) {
    this.question = question;
  }
}
