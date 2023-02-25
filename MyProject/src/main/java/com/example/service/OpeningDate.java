package com.example.service;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.beans.CurrentDataOperation;

@Repository
public interface OpeningDate extends JpaRepository<CurrentDataOperation, Long> {

}