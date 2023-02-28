package edu.miu.cs.cs425.fairfieldlibrarycliapp.model;


import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor
@AllArgsConstructor
@Setter
@Getter
@Entity
@Table(name = "Addresses")
public class Address {
    @Id
    //@GeneratedValue(strategy = GenerationType.SEQUENCE)
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer addressId;
    private String houseNo;
    private String street;
    private String city;
    private String state;
    private String zipCode;
    @OneToOne(mappedBy = "primaryAddress")
    private Publisher publisher;
    @Override
    public String  toString(){
        return String.format("Address{addressId: %s, houseNo: %s, street: %s, city: %s, state: %s, zipCode: %s}", addressId, houseNo,street,city,state,zipCode);
    }

}
