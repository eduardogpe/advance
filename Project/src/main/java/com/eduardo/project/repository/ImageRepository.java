package com.eduardo.project.repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.eduardo.project.models.Image;

public interface ImageRepository extends CrudRepository<Image, Long>{
	List<Image> findAll();
}
