package crud_spring.repository;

import crud_spring.entity.Department;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface DepartmentRepository extends JpaRepository<Department,Long> {
    public List<Department> findByDepartmentName(String departmentName);
}
