package com.khanh.springsecurity.entities;


import com.khanh.springsecurity.entities.enums.RoleName;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.*;
import jakarta.persistence.*;

import java.util.Set;

@Getter
@Setter
@Entity
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "users")
@ToString
public class Role {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "description", length = 255)
    private String description;

    @Enumerated(EnumType.STRING)
    @Column(name = "name", nullable = false)
    private RoleName name;

    @ManyToMany(mappedBy = "roles")
    private Set<User> users;
}
