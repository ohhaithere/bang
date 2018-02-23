package com.bang.repository;

import com.bang.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

/**
 * Created by johnnyGrimes on 22/02/2018.
 */
@Repository
public interface UserRepository extends CrudRepository<User, Long> {
}
