package com.nathanfeitoza.springmysqltest.repository;

import com.nathanfeitoza.springmysqltest.model.Contact;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ContactRepository extends JpaRepository<Contact, Long> {
}
