package com.greenfox.exam.Model;

import java.util.ArrayList;
import java.util.List;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class AnswerBody {

  @Id
  @GeneratedValue(strategy = GenerationType.AUTO)
  private long id;

  private List<Answer> answers;

  public AnswerBody() {
    this.answers = new ArrayList<>();
  }

  public AnswerBody(List<Answer> answers) {
    this.answers = answers;
  }

  public long getId() {
    return id;
  }

  public void setId(long id) {
    this.id = id;
  }

  public List<Answer> getAnswers() {
    return answers;
  }

  public void setAnswers(List<Answer> answers) {
    this.answers = answers;
  }
}
