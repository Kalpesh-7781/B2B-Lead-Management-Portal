package com.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.model.Lead;
import com.repository.LeadRepository;

@Service
public class LeadServiceImpl implements LeadService {

    @Autowired
    private LeadRepository leadRepository;
    
    @Override
    public Lead createLead(Lead lead) {
    	Lead existingLead = leadRepository.findByEmailAndCampaign(lead.getEmail(), lead.getCampaign());

        if (existingLead != null) {
            
            throw new IllegalArgumentException("Duplicate email already exists for the same campaign ID");
        }
    	
        return leadRepository.save(lead);
    }
    
    
}