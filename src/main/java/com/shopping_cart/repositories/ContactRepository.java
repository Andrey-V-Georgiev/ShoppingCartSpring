package com.shopping_cart.repositories;

import com.shopping_cart.models.entities.Contact;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface ContactRepository  extends JpaRepository<Contact, String> {

}
