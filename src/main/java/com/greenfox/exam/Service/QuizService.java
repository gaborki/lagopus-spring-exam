package com.greenfox.exam.Service;

import com.greenfox.exam.Model.QuestionToList;
import com.greenfox.exam.Model.QuestionsResponse;
import com.greenfox.exam.Repository.QuestionToListRepo;
import com.greenfox.exam.Repository.QuestionRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class QuizService {

  @Autowired
  QuestionRepo questionRepo;
  @Autowired
  QuestionToListRepo questionToListRepo;

  public QuestionsResponse getFiveRandomQuestions() {
    long savedPreviousID = 0;
    long randomID = 0;
    for (int i = 0; i < 5; i++) {
      do {
        randomID = (int) ((Math.random() * 8) + 1);
      }
      while (randomID == savedPreviousID);
      questionToListRepo.save(new QuestionToList(questionRepo.findOne(randomID).getQuestion()));
      savedPreviousID = randomID;
    }
    QuestionsResponse questionsResponse = new QuestionsResponse(questionToListRepo.findAll());
    return questionsResponse;
  }

}
