package com.binay.oneToOne.entity.repo;

import com.binay.oneToOne.entity.Address;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AddressRepo extends JpaRepository<Address, Long> {
}
