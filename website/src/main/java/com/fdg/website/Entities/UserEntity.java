package com.fdg.website.Entities;



import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Pattern;
import jakarta.validation.constraints.Size;
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

    @Pattern(regexp ="[\\p{L}\\p{Pd}\\p{Zs}]{2,100}", message="Le nom doit contenir uniquement des lettres, des tirets et des espaces ")
    @Column(name="name_user", nullable = false, length = 100)
    private String name;

    @Pattern(regexp ="[\\p{L}\\p{Pd}\\p{Zs}]{2,100}", message = "Le nom doit contenir uniquement des lettres, des tirets et des espaces")
    @Column(name="firstname_user", nullable = false, length = 100)
    private String firstname;

    @Pattern(regexp ="^[\\w\\-\\.]+@([\\w\\-]+\\.)+[\\w\\-]{2,4}$", message = "Veuillez saisir une adresse email valide")
    @Column(name="email_user", nullable = false, length = 150)
    private String email;

    @Pattern(regexp = "((\\+\\d{1,3}(-| )?\\(?\\d\\)?(-| )?\\d{1,5})|(\\(?\\d{2,6}\\)?))(-| )?(\\d{3,4})(-| )?(\\d{4})(( x| ext)\\d{1,5}){0,1}$", message = "Veuillez saisir un numéro de téléphone valide")
    @Column(name = "phone_number", nullable = false, length = 20)
    private String phone;

    @Column(name = "subject")
    private String subject;

    @NotBlank(message = "Le commentaire ne peut pas être vide")
    @Size(max = 500, message = "Le commentaire ne doit pas contenir plus de 500 caractères")
    @Column(nullable = false)
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
            ", comment='" + getComment() + "'" +
            "}";
    }

}
