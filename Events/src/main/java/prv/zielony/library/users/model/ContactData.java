package prv.zielony.library.users.model;

import javax.persistence.*;

/**
 * Created by zielony on 22.01.16.
 */
@Entity
@Table(name = "CONTACT_DATA")
public class ContactData {
    @Id
    private Long id;

    @Version
    private Long version;

    @Column( name = "PHONE_NUMBER")
    private String phoneNumber;

    private String email;

    private String address;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getVersion() {
        return version;
    }

    public void setVersion(Long version) {
        this.version = version;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }
}
