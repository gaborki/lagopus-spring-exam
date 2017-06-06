package com.greenfox.exam.Repository;


import com.greenfox.exam.Model.Answer;
import com.greenfox.exam.Model.AnswerBody;
import java.util.List;
import org.springframework.data.repository.CrudRepository;

public interface AnswerBodyRepo extends CrudRepository<AnswerBody, Long>{

  List<AnswerBody> findAll();

}
