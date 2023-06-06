package com.fdg.website.Entities;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import jakarta.validation.constraints.NotBlank;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;



@Data
@Table(name="USER")
@Entity
@NoArgsConstructor
@AllArgsConstructor
public class UserEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="id_user")
    private Integer idUser;

    @Column(name="name_user", nullable = false)
    private String name;

    @Column(name="firstname_user", nullable = false)
    private String firstname;

    @Column(name="email_user", nullable = false)
    private String email;

    @Column(nullable = false)
    @NotBlank
    private Integer phone;
}
