package repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.entity.Student;

@Repository
public interface Sturepository extends JpaRepository<Student,i> {

    Student save(Student stu);


}
