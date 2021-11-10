package com.example.tufinancieroapi.resource;

import com.example.tufinancieroapi.domain.model.Cost;

import java.time.LocalDateTime;
import java.util.List;

public class DocumentRequest {
    private LocalDateTime emisionDate;
    private LocalDateTime paymentDate;
    private Double totalFacturado;
    private Double retencion;
    private int daysPerYear;
    private float plazoTaza;
    private LocalDateTime discountDate;
    private int periodoCapitaliza;
    private int emisorId;
    private int userReceptorId;
    private List<Cost> costos;
}
