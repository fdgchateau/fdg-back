package com.fdg.website.Entities;



import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Table(name="MESSAGE")
@NoArgsConstructor
@AllArgsConstructor

@Entity
public class MessageEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY )
    @Column(name = "id_message")
    private Integer id;

    @Column(nullable = false)
    private String commentaire;

    @Column(name="date_envoi", nullable = false)
    private String dateEnvoi;

    @ManyToOne
    @JoinColumn(name = "user_id")
    private UserEntity user;
   
}
