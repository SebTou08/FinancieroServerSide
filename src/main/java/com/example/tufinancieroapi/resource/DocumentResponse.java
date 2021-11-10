package com.example.tufinancieroapi.resource;

import com.example.tufinancieroapi.domain.model.Cost;
import com.example.tufinancieroapi.domain.model.User;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDateTime;
import java.util.List;

@Getter
@Setter
public class DocumentResponse {
    private LocalDateTime emisionDate;
    private LocalDateTime paymentDate;
    private Double totalFacturado;
    private Double retencion;
    private int daysPerYear;
    private float plazoTaza;
    private LocalDateTime discountDate;
    private int periodoCapitaliza;
    private User emisor;
    private int userReceptorId;
    private List<Cost> costos;

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
