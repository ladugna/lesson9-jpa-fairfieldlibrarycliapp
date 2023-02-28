package edu.miu.cs.cs425.fairfieldlibrarycliapp.service.impl;

import edu.miu.cs.cs425.fairfieldlibrarycliapp.model.Address;
import edu.miu.cs.cs425.fairfieldlibrarycliapp.repository.AddressRepository;
import edu.miu.cs.cs425.fairfieldlibrarycliapp.service.AddressService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AddressServiceImpl implements AddressService {
    private AddressRepository addressRepository;

    public AddressServiceImpl(AddressRepository addressRepository) {
        this.addressRepository = addressRepository;
    }

    @Override
    public Address addNewAddress(Address newAddress) {
        return addressRepository.save(newAddress);
    }

}
