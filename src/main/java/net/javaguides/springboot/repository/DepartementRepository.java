package net.javaguides.springboot.repository;

import net.javaguides.springboot.model.Department;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DepartementRepository extends JpaRepository<Department,Long> {
}
