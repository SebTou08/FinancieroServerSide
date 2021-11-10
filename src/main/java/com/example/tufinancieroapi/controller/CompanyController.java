package com.example.tufinancieroapi.controller;

import com.example.tufinancieroapi.domain.model.Company;
import com.example.tufinancieroapi.domain.service.CompanyService;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.media.Content;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.responses.ApiResponses;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageImpl;
import org.springframework.data.domain.Pageable;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/api")
public class CompanyController {
    @Autowired
    private CompanyService _companyService;

    @Operation(summary = "Get Users", description = "Get All User by Pages", tags = {"Users"})
    @ApiResponses(value = {
            @ApiResponse(responseCode = "200", description = "All Users returned", content = @Content(mediaType = "application/json")),
            @ApiResponse(responseCode = "404", description = "Users not found")
    })
    @GetMapping("/companies")
    public Page<Company> getAllCosts(Pageable pageable){
        Page<Company> costPage = _companyService.getAllSubscriptions(pageable);
        List<Company> resources = new ArrayList<>(costPage.getContent());
        return new PageImpl<>(resources, pageable, resources.size());
    }


    @Operation(summary = "Add Cost", description = "Create new user", tags = {"Users"})
    @ApiResponses(value = {
            @ApiResponse(responseCode = "200", description = "User created", content = @Content(mediaType = "application/json")),
    })
    @PostMapping("/company")
    public Company createCost(@Valid @RequestBody Company comp){
        Company newCompany = _companyService.createCompany(comp);
        return newCompany;
    }
}
