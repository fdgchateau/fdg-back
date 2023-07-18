package com.fdg.website.Entities;



import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.validation.constraints.Pattern;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;


@Getter
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

    @Pattern(regexp ="[\\p{L}\\p{Pd}\\p{Zs}]{2,100}")
    @Column(name="name_user", nullable = false, length = 100)
    private String name;

    
    @Column(name="firstname_user", nullable = false, length = 100)
    private String firstname;

    
    @Column(name="email_user", nullable = false, length = 150, unique = true)
    private String email;

    
    @Column(name="phone_user", nullable = false, length = 15)
    private String phone;

    
    @Column(name = "subject")
    private String subject;

    @Column(nullable = false, length = 150)
    private String comment;


    @Override
    public String toString() {
        return "{" +
            " idUser='" + getIdUser() + "'" +
            ", name='" + getName() + "'" +
            ", firstname='" + getFirstname() + "'" +
            ", email='" + getEmail() + "'" +
            ", phone='" + getPhone() + "'" +
            ", subject='" + getSubject() + "'" +
            ", commentaire='" + getComment() + "'" +
            "}";
    }
   
}
