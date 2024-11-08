package com.khanh.springsecurity.entities;


import com.khanh.springsecurity.entities.enums.UserStatus;
import jakarta.persistence.*;
import java.time.LocalDateTime;
import java.util.Set;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@Entity
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "users")
@ToString
public class User extends BaseEntity{

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "phone_number", length = 10)
    private String phoneNumber;

    @Column(name = "password", length = 250)
    private String password;

    @Column(name = "full_name", length = 150)
    private String fullName;

    @Column(name = "gender")
    private Integer gender;

    @Column(name = "email", length = 100)
    private String email;

    @Column(name = "identification_images", columnDefinition = "JSON")
    private String identificationImages;  // JSON lưu dưới dạng String

    @ManyToMany
    @JoinTable(
            name = "user_roles", // Tên bảng phụ
            joinColumns = @JoinColumn(name = "user_id"), // Cột ngoại khóa tham chiếu đến bảng users
            inverseJoinColumns = @JoinColumn(name = "role_id") // Cột ngoại khóa tham chiếu đến bảng roles
    )
    private Set<Role> roles;


    @Column(name = "status")
    @Enumerated(EnumType.ORDINAL)
    private UserStatus status;
}
