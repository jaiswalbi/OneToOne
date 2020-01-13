package com.binay.oneToOne.entity.repo;

import com.binay.oneToOne.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepo extends JpaRepository<User, Long> {

}
