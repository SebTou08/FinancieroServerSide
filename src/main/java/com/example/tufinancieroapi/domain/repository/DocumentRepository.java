package com.example.tufinancieroapi.domain.repository;

import com.example.tufinancieroapi.domain.model.Document;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

@Repository
public interface DocumentRepository extends JpaRepository<Document, Integer> {
    @Query("SELECT d FROM Document d WHERE d.userReceptorId =?1")
    public Page<Document> findAllByRepectorId(Pageable pageable, int receptorId);

}
