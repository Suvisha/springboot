package tutorial;

import org.springframework.data.repository.CrudRepository;
import org.springframework.security.access.prepost.PreAuthorize;

public interface EmployeeRepository extends CrudRepository<Employee, Long> {

    @PreAuthorize("hasAuthority('http://localhost:8089')")
    @Override
    void delete(Long aLong);

}
