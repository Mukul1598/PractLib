package com.acciojob.Practice_Library_Management_System.Repositories;

import com.acciojob.Practice_Library_Management_System.Entities.LibraryCard;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CardRepository extends JpaRepository<LibraryCard, Integer> {
}
