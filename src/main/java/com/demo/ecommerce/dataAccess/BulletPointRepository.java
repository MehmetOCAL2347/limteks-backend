package com.demo.ecommerce.dataAccess;

import com.demo.ecommerce.entities.concretes.BulletPoint;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BulletPointRepository extends JpaRepository<BulletPoint, Integer> {
}
