package uabc.videoclubs.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import uabc.videoclubs.entities.Staff;

@Repository
public interface StaffRepository extends JpaRepository<Staff, Integer>{
    public abstract Staff findByUsername(String userName);
}
