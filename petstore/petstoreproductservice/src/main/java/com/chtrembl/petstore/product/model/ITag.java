package com.chtrembl.petstore.product.model;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ITag extends JpaRepository<Tag, Long> {
}
