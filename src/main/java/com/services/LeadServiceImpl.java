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
            // Handle duplicate based on requirements:
            // - Log a warning
            //log.warn("Duplicate lead found: email={}, campaign={}", lead.getEmail(), lead.getCampaign());
            // - Update existing lead information (if applicable)
            //   existingLead.updateWithNewData(lead);
            //   return existingLead;
            // - Throw an exception (for strict duplicate prevention)
            throw new IllegalArgumentException("Duplicate email already exists for the same campaign ID");
        }
    	
        return leadRepository.save(lead);
    }
    
    
}