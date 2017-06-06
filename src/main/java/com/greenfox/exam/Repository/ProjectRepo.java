package com.greenfox.exam.Repository;


import com.greenfox.exam.Model.Project;
import java.util.List;
import org.springframework.data.repository.CrudRepository;

public interface ProjectRepo extends CrudRepository<Project, Long> {

  List<Project> findAll();

}
