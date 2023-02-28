package edu.miu.cs.cs425.fairfieldlibrarycliapp.service.impl;

import edu.miu.cs.cs425.fairfieldlibrarycliapp.model.Publisher;
import edu.miu.cs.cs425.fairfieldlibrarycliapp.repository.PublisherRepository;
import edu.miu.cs.cs425.fairfieldlibrarycliapp.service.PublisherService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;
@Service
public class PublisherServiceImpl implements PublisherService {

    @Autowired
    private PublisherRepository publisherRepository;


    public PublisherServiceImpl(PublisherRepository publisherRepository) {
        this.publisherRepository = publisherRepository;
    }

    @Override
    public Publisher addNewPublisher(Publisher newPublisher) {
        return publisherRepository.save(newPublisher);
    }

    @Override
    public Iterable<Publisher> getAllPublisher() {
        return publisherRepository.findAll();
    }

    @Override
    public Optional<Publisher> getPublisherById(Integer publisherId) {
        return publisherRepository.findById(publisherId);
    }

    @Override
    public void deletePublisherById(Integer publisherId) {
      publisherRepository.deleteById(publisherId);
    }

    @Override
    public Publisher updatePublisherById(Integer publisherId, Publisher editedPublisher) {
        var thePublisher= publisherRepository.findById(publisherId).orElse(null);
        Publisher updatedPublisher=null;
        if(thePublisher!=null){
          thePublisher.setName(editedPublisher.getName());
          thePublisher.setEmailAddress(editedPublisher.getEmailAddress());
          thePublisher.setPhoneNum(editedPublisher.getPhoneNum());
          thePublisher.setPrimaryAddress(editedPublisher.getPrimaryAddress());
         updatedPublisher= publisherRepository.save(thePublisher);
        }
        return updatedPublisher;
    }


//    @Override
//    public String deletePublisherById(Integer publisherId) {
//        var thePublisher = publisherRepository.findById(publisherId).orElse(null);
//        if(thePublisher != null) {
//            publisherRepository.deleteById(publisherId);
//            return String.format("Publisher with id, %s is deleted.", publisherId);
//        }
//        return String.format("Publisher with id, %s is not found.", publisherId);
//    }
}
