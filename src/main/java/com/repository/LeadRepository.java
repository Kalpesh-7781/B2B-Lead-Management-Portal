package com.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.model.Lead;

@Repository
public interface LeadRepository extends JpaRepository<Lead, Long> {
	Lead findByEmailAndCampaign(String email, String campaign);
}
