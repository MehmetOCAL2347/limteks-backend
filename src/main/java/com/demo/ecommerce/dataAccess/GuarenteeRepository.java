package com.demo.ecommerce.dataAccess;

import com.demo.ecommerce.entities.concretes.Guarentee;
import org.springframework.data.jpa.repository.JpaRepository;

public interface GuarenteeRepository extends JpaRepository<Guarentee, Integer> {
}
