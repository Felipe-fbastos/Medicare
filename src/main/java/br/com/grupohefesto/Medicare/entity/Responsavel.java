    package br.com.grupohefesto.Medicare.entity;

    import jakarta.persistence.*;
    import jakarta.validation.constraints.NotNull;

    import java.time.LocalDateTime;

    @Entity
    @Table(name = "RESPONSAVEL")
    public class Responsavel {

        @EmbeddedId
        private RelResponsavelUtilizadorID id;

        //Pesquisar como fazer relacionamento quando a chave é PK e FK na tabela

        @ManyToOne
        @MapsId("pacienteId")
        private Utilizador utilizador;

        //Pesquisar como fazer relacionamento quando a chave é PK e FK na tabela
        @ManyToOne
        @MapsId("responsavelId")
        private Utilizador responsavel;

        @ManyToOne
        @JoinColumn(name = "IDGRAUPARENTESCO")
        private GrauParentesco parentesco;

        @NotNull
        @Column(name = "DCRESPONSAVEL")
        private LocalDateTime dtCadastro;

        @NotNull
        @Column(name = "DURESPONSAVEL")
        private LocalDateTime dtUltimaAtualizacao;

        @NotNull
        @Column(name = "STRESPONSAVEL")
        private String status;

    }
