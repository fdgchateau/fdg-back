package com.fdg.website.Entities;



import java.util.List;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
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

    @Column(name="phone_user", nullable = false)
    private String phone;

    @OneToMany(mappedBy = "user")
    private List<MessageEntity> messages;
}
