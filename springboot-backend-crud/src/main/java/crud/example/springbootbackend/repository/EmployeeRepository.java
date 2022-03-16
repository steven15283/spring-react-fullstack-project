package crud.example.springbootbackend.repository;

import crud.example.springbootbackend.model.Employee;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EmployeeRepository extends JpaRepository<Employee, Long> {
    //crud database methods

}