package com.marketing.Services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.marketing.Entity.Lead;
import com.marketing.repository.LeadRepository;

@Service
public class LeadServiceImpl implements LeadService {

	@Autowired
	LeadRepository leadRepo;

	@Override
	public void savelead(Lead lead) {
		leadRepo.save(lead);
	}

	@Override
	public List<Lead> listAll() {
		List<Lead> leads = (List<Lead>) leadRepo.findAll();
		return leads;
	}

	@Override
	public void deleteById(long id) {
		leadRepo.deleteById(id);
	}

	@Override
	public Lead findOneLeadById(long id) {

		Optional<Lead> findById = leadRepo.findById(id);
		if (findById.isPresent()) {
			Lead lead = findById.get();
			return lead;
		} else {
			return null;

		}

	}

}
