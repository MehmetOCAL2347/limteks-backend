package com.demo.ecommerce.dataAccess;

import com.demo.ecommerce.entities.concretes.Image;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ImageRepository extends JpaRepository<Image, Integer> {
}
