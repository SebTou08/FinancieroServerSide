package com.example.tufinancieroapi.controller;

import com.example.tufinancieroapi.domain.model.Document;
import com.example.tufinancieroapi.domain.service.DocumentService;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.media.Content;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.responses.ApiResponses;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageImpl;
import org.springframework.data.domain.Pageable;
import org.springframework.web.bind.annotation.*;
import com.example.tufinancieroapi.resource.DocumentRequest;
import com.example.tufinancieroapi.resource.DocumentResponse;

import javax.validation.Valid;
import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/api")
public class DocumentController {
    @Autowired
    DocumentService _docService;

    @Autowired
    private ModelMapper modelMapper;

    private Document convertToEntity(DocumentRequest resource){
        return modelMapper.map(resource, Document.class);
    }
    private DocumentResponse convertToResource(Document entity){
        return modelMapper.map(entity, DocumentResponse.class);
    }

    @Operation(summary = "Get Users", description = "Get All User by Pages", tags = {"Users"})
    @ApiResponses(value = {
            @ApiResponse(responseCode = "200", description = "All Users returned", content = @Content(mediaType = "application/json")),
            @ApiResponse(responseCode = "404", description = "Users not found")
    })
    @GetMapping("/documents")
    public Page<DocumentResponse> getAllDocuments(Pageable pageable){
        Page<Document> docPage = _docService.getAllDocuments(pageable);
        List<DocumentResponse> resources = docPage.getContent()
                .stream()
                .map(this::convertToResource)
                .collect(Collectors.toList());
        return new PageImpl<>(resources,pageable, resources.size());
    }


    @Operation(summary = "Add User", description = "Create new user", tags = {"Users"})
    @ApiResponses(value = {
            @ApiResponse(responseCode = "200", description = "User created", content = @Content(mediaType = "application/json")),
    })
    @PostMapping("/document")
    public DocumentResponse createDocument(@Valid @RequestBody DocumentRequest resource){
        return convertToResource(_docService.createDocument(convertToEntity(resource)));
    }



}
