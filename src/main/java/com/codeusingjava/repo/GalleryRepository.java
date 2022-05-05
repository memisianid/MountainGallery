package com.codeusingjava.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.codeusingjava.model.ModelGallery;


@Repository //JPA Repository
public interface GalleryRepository extends JpaRepository<ModelGallery, Long>{

}

