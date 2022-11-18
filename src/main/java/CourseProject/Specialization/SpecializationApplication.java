package CourseProject.Specialization;

import CourseProject.Specialization.service.SpecializationService;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;


@SpringBootApplication
public class SpecializationApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpecializationApplication.class, args);
		SpecializationService specializationService = new SpecializationService();
	}

}
