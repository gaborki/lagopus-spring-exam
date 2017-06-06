package com.greenfox.exam.Repository;


import com.greenfox.exam.Model.QuestionToList;
import java.util.List;
import org.springframework.data.repository.CrudRepository;

public interface QuestionToListRepo extends CrudRepository<QuestionToList, Long>{

  List<QuestionToList> findAll();

}
