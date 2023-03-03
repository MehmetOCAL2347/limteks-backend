package com.demo.ecommerce.dataAccess;

import com.demo.ecommerce.entities.concretes.Collection;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CollectionRepository extends JpaRepository<Collection, Integer> {
}
