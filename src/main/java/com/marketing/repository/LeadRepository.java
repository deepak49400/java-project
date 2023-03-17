package com.marketing.repository;


import org.springframework.data.repository.CrudRepository;

import com.marketing.Entity.Lead;

public interface LeadRepository extends CrudRepository<Lead, Long> {
 
}
