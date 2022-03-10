package edu.miu.dnd.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import edu.miu.dnd.domain.User;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {

}
