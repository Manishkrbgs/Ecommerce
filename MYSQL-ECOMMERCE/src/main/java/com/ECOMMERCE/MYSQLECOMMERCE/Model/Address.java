package com.ECOMMERCE.MYSQLECOMMERCE.Model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Address {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer addressId;
    private String addressName;
    private String addressLandmark;
    private String addressPhonenumber;
    private String addressZipcode;
    private String addressState;
    @OneToOne
    @JoinColumn(name = "frk_userId")
    User user;

}
