package com.example.tufinancieroapi.domain.service;

import com.example.tufinancieroapi.domain.model.Document;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

public interface DocumentService {
    Page<Document> getAllDocuments(Pageable pageable);
    Document createDocument(Document document);
    Page<Document>getAllDocumentsByReceptorId(Pageable pageable, int emisorId);
}
