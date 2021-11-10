package com.example.tufinancieroapi.domain.model;

import com.fasterxml.jackson.annotation.JsonBackReference;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.time.LocalDateTime;
import java.util.List;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Entity
@Table(name="documents")
public class Document {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    private LocalDateTime emisionDate;
    private LocalDateTime paymentDate;
    private Double totalFacturado;
    private Double retencion;
    private int daysPerYear;
    private float plazoTaza;
    private LocalDateTime discountDate;
    private int periodoCapitaliza;

    @JsonBackReference
    @ManyToOne
    @JoinColumn(name ="user_id", nullable = false )
    private User emisor;

    private int userReceptorId;

    @JsonBackReference
    @OneToMany
    @JoinColumn(name ="cost_id", nullable = true )
    private List<Cost> costos;

    // TODO: i'm not sure about this

    private float tasaEfectivaAnual;
    private int diasTranscurridos;
    private float tasaEfectiva;
    private float tasaDescontada;
    private Double discountPerDays;
    private Double costesInicialesTotales;
    private Long valorNeto;
    private Long valorTotalARecibir;
    private float costesFinalesTotales;
    private Long valorTotalAEntregar;
    private float tasaCosteEfectivaAnual;



}
