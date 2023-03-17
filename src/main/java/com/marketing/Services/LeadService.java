package com.marketing.Services;

import java.util.List;

import com.marketing.Entity.Lead;

public interface LeadService {

	public void savelead(Lead lead);

	public List<Lead> listAll();

	public void deleteById(long id);

	public Lead findOneLeadById(long id);



}
