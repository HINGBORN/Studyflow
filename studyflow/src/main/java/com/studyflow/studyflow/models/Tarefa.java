package com.studyflow.studyflow.models;

import java.time.LocalDate;
import jakarta.persistence.*;

@Entity // Diz ao Spring que esta classe representa uma tabela do banco
@Table(name = "tarefa") // Vincula esta classe à tabela exata que criou no MySQL
public class Tarefa {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(nullable = false, length = 100)
    private String titulo;

    @Column(nullable = false, length = 100)
    private String descricao;

    @Column(nullable = false)
    private LocalDate dataVencimento;

    @Column(nullable = false, length = 50)
    private String status;

    @ManyToOne // Muitos (Tarefas) para Um (Disciplina)
    @JoinColumn(name = "disciplina_id") // Nome da coluna no banco de dados
    private Disciplina disciplina;

}
