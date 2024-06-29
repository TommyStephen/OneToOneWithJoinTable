package study.mapper;

import study.dto.StudentDTO;
import study.model.Student;

public interface StudentEntityMapper {

	public static StudentDTO mapFromStudent(Student student){
		
		StudentDTO studentDto = new StudentDTO();
		
		studentDto.setCity(student.getProfile().getCity());
		studentDto.setCountry(student.getProfile().getCountry());
		studentDto.setEmail(student.getEmail());
		studentDto.setId(student.getId());
		studentDto.setName(student.getName());
		studentDto.setStreet(student.getProfile().getStreet());
		return studentDto;
	}
}
