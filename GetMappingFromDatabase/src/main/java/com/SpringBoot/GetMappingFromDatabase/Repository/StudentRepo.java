package com.SpringBoot.GetMappingFromDatabase.Repository;

import com.SpringBoot.GetMappingFromDatabase.Entity.Student;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StudentRepo extends JpaRepository<Student, Integer> {


}
