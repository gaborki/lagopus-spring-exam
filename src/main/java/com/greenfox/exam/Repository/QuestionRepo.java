package com.greenfox.exam.Repository;


import com.greenfox.exam.Model.Question;
import java.util.List;
import org.springframework.data.repository.CrudRepository;

public interface QuestionRepo extends CrudRepository<Question, Long>{

  List<Question> findAll();
  Question findOneByQuestion();

}
