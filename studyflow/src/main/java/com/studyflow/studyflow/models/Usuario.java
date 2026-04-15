package com.studyflow.studyflow.models;
import jakarta.persistence.*;

@Entity // Diz ao Spring que esta classe representa uma tabela do banco 
@Table(name = "usuarios") // Vincula esta classe à tabela exata que criou no MySQL 
public class Usuario {

    @Id // Define que este campo é a Chave Primária (o ID único) 
    @GeneratedValue(strategy = GenerationType.IDENTITY) // Faz o ID ser AUTO_INCREMENT no banco 
    private int id;

    @Column(nullable = false, length = 100) // Garante que o nome não seja nulo (NOT NULL) 
    private String nome;

    @Column(nullable = false, unique = true, length = 100) // Garante que o e-mail seja único 
    private String email;

    @Column(name = "senha_hash", nullable = false) // Mapeia o nome da variável para o nome da coluna no banco 
    private String senhaHash;

    @Column(name = "token_recuperacao")
    private String tokenRecuperacao;

    // Construtores, Getters e Setters...
}