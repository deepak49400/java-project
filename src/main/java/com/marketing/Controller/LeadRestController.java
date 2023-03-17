package com.marketing.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.marketing.Entity.Lead;
import com.marketing.Services.LeadService;

@RestController
@RequestMapping("/leads")
public class LeadRestController {

	@Autowired
	private LeadService leadService;

	@GetMapping
	public List<Lead> getAllLeads() {

		List<Lead> leads = leadService.listAll();
		return leads;

	}

	@PostMapping
	public void saveOneLead(@RequestBody Lead lead) {

		leadService.savelead(lead);

	}

}
