package com.greenfox.exam;

import com.greenfox.exam.Model.Question;
import com.greenfox.exam.Repository.QuestionRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Application implements CommandLineRunner {

	@Autowired
	QuestionRepo questionRepo;

	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		questionRepo.save(new Question("When did your course start? (yyyy.mm.dd)", "2017.03.13"));
		questionRepo.save(new Question("What type of dog Barbi has?", "Whippet"));
		questionRepo.save(new Question("What is HerrNorbert's favourite color?", "Green"));
		questionRepo.save(new Question("How many classes are learning at Green Fox Academy at this moment?","4"));
		questionRepo.save(new Question("How many mentors teach at Green Fox at this moment?", "16"));
		questionRepo.save(new Question("What was the name of the first Green Fox class?","Vulpes"));
		questionRepo.save(new Question("How many likes do we have on facebook?","~3300"));
		questionRepo.save(new Question("What is Tojas's horoscope?","Libra"));
		questionRepo.save(new Question("What is the color code of Green Fox?", "#3CB879"));
		questionRepo.save(new Question("When was Green Fox founded?(yyyy.mm.)","2015.09."));
	}
}
