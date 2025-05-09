package com.bazzar.bazzar.repositary;

import com.bazzar.bazzar.model.Category;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CategoryRepo extends JpaRepository<Category,Long> {

}
