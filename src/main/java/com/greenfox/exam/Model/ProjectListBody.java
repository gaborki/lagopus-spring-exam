package com.greenfox.exam.Model;

import java.util.ArrayList;
import java.util.List;
import org.springframework.stereotype.Component;

@Component
public class ProjectListBody {

  List<Project> projectList;

  public ProjectListBody() {
    this.projectList = new ArrayList<>();
  }

  public ProjectListBody(List<Project> projectList) {
    this.projectList = projectList;
  }

  public List<Project> getProjectList() {
    return projectList;
  }

  public void setProjectList(List<Project> projectList) {
    this.projectList = projectList;
  }
}
