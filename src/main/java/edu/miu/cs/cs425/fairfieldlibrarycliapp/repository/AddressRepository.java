package edu.miu.cs.cs425.fairfieldlibrarycliapp.repository;

import edu.miu.cs.cs425.fairfieldlibrarycliapp.model.Address;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AddressRepository extends CrudRepository<Address, Integer>  {
}
