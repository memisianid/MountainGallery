package com.codeusingjava.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.codeusingjava.model.ModelGallery;
import com.codeusingjava.repo.GalleryRepository;



@Service
public class GalleryService {

	@Autowired
	private GalleryRepository imageGalleryRepository;

	//save method
	public void saveImage(ModelGallery modelGallery) {
		imageGalleryRepository.save(modelGallery);
	}


	public List<ModelGallery> getAllImages() {
		return imageGalleryRepository.findAll();
	}


	public Optional<ModelGallery> getImageById(Long id) {
		return imageGalleryRepository.findById(id);
	}
}

