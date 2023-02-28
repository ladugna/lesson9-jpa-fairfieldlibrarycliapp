package edu.miu.cs.cs425.fairfieldlibrarycliapp.service;

import edu.miu.cs.cs425.fairfieldlibrarycliapp.model.Publisher;
import org.springframework.stereotype.Service;

import java.util.Optional;
@Service
public interface PublisherService {
    Publisher addNewPublisher(Publisher newPublisher);
    Iterable<Publisher> getAllPublisher();
    Optional<Publisher> getPublisherById(Integer publisherId);


    //    String deletePublisherById(Integer publisherId) ;
    void deletePublisherById(Integer publisherId) throws Exception;

    Publisher updatePublisherById(Integer publisherId, Publisher editedPublisher);
}
