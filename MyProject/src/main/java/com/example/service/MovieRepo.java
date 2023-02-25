package com.example.service;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.beans.MovieDetails;

@Repository
public interface MovieRepo extends JpaRepository<MovieDetails, Long> {

}