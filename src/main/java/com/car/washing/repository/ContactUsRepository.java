package com.car.washing.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.car.washing.model.ContactUs;

@Repository
public interface ContactUsRepository extends JpaRepository<ContactUs, Long>{

}
