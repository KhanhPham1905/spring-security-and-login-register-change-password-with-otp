package com.khanh.springsecurity.entities;

import lombok.*;

import java.time.LocalDateTime;
import jakarta.persistence.*;

@Getter
@Setter
@Entity
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "users")
@ToString
public class Company extends BaseEntity{

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "phone_number", length = 10)
    private String phoneNumber;

    @Column(name = "name", length = 150)
    private String name;

    @Column(name = "business_registration_number", length = 10)
    private String businessRegistrationNumber;

    @Column(name = "address", length = 150)
    private String address;

    @Column(name = "email", length = 100)
    private String email;

    @Column(name = "full_name", length = 150)
    private String fullName;

    @Column(name = "position", length = 100)
    private String position;

}
