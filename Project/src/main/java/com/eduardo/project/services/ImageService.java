package com.eduardo.project.services;

import java.util.List;
import java.util.Optional;

import com.eduardo.project.models.Image;
import com.eduardo.project.repository.ImageRepository;

public class ImageService {
private final ImageRepository imageRepo;
    
    public ImageService(ImageRepository imageRepo) {
        this.imageRepo = imageRepo;
    }
    // returns all the books
    public List<Image> allImage() {
        return imageRepo.findAll();
    }
    // creates a book
    public Image createImage(Image i) {
        return imageRepo.save(i);
    }
    // retrieves a book
    public Image findimage(Long id) {
        Optional<Image> optionalImg = imageRepo.findById(id);
        if(optionalImg.isPresent()) {
            return optionalImg.get();
        } else {
            return null;
        }
    }
}
