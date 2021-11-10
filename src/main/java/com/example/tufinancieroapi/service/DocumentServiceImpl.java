package com.example.tufinancieroapi.service;

import com.example.tufinancieroapi.domain.model.Document;
import com.example.tufinancieroapi.domain.repository.DocumentRepository;
import com.example.tufinancieroapi.domain.service.DocumentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

@Service
public class DocumentServiceImpl implements DocumentService {
    @Autowired
    DocumentRepository _documentRepository;

    @Override
    public Page<Document> getAllDocuments(Pageable pageable) {
        Page<Document> documents = _documentRepository.findAll(pageable);
        return documents;
    }

    @Override
    public Document createDocument(Document document) {
        return _documentRepository.save(document);
    }

    @Override
    public Page<Document> getAllDocumentsByReceptorId(Pageable pageable, int emisorId) {
        Page<Document>docs = _documentRepository.findAllByRepectorId(pageable, emisorId);
        return docs;
    }
}
