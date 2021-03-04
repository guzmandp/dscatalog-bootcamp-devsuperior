package com.guzmandp.dscatalog.repositories;

import java.util.List;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.guzmandp.dscatalog.entities.Category;
import com.guzmandp.dscatalog.entities.Product;
@Repository
public interface ProductRepository extends JpaRepository<Product, Long>{
	
	@Query("SELECT DISTINCT obj FROM Product obj INNER JOIN obj.categories cats WHERE "
			+ "(COALESCE(:categories) IS NULL OR cats IN :categories) AND "
			+ "(:name = '' OR LOWER (obj.name) LIKE LOWER (CONCAT('%',:name,'%')))")
	Page<Product> find(List <Category> categories, String name, Pageable pageable);
}
