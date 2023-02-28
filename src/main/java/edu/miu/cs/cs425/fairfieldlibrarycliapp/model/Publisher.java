package edu.miu.cs.cs425.fairfieldlibrarycliapp.model;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotBlank;

@Entity
@Table(name = "publishers")
public class Publisher {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer publisherId;

    //  @NotNull(message = "Publisher name cannot be null")
    //  @NotEmpty(message = "Publisher name cannot be empty or null")
  @NotBlank(message = "Publisher name cannot be blank or empty or null")
  @Column(name = "publisher_name", nullable = false)
    private String name;
    private String phoneNum;
    private String emailAddress;
   @OneToOne(cascade = CascadeType.PERSIST)
   @JoinColumn(name = "primary_address_id",nullable = true)
    private Address primaryAddress;

    // If bidirectional
//    @OneToMany
//    private List<Book> books;

    public Publisher(Integer publisherId, String name, String phoneNum, String emailAddress,Address primaryAddress) {
        this.publisherId = publisherId;
        this.name = name;
        this.phoneNum = phoneNum;
        this.emailAddress = emailAddress;
       this.primaryAddress=primaryAddress;
    }
    public Publisher(){
        this(null,null,null,null,null);
    }

    public Integer getPublisherId() {
        return publisherId;
    }

    public void setPublisherId(Integer publisherId) {
        this.publisherId = publisherId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPhoneNum() {
        return phoneNum;
    }

    public void setPhoneNum(String phoneNum) {
        this.phoneNum = phoneNum;
    }

    public String getEmailAddress() {
        return emailAddress;
    }

    public void setEmailAddress(String emailAddress) {
        this.emailAddress = emailAddress;
    }

    public Address getPrimaryAddress() {
        return primaryAddress;
    }

    public void setPrimaryAddress(Address primaryAddress) {
        this.primaryAddress = primaryAddress;
    }

    @Override
    public String toString() {
        return "Publisher{" +
                "publisherId=" + publisherId +
                ", name='" + name + '\'' +
                ", phoneNum='" + phoneNum + '\'' +
                ", emailAddress='" + emailAddress + '\'' +
                ", primaryAddress=" + primaryAddress +
                '}';
    }
}
