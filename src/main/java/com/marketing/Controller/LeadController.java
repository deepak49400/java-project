package com.marketing.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.marketing.Entity.Lead;
import com.marketing.Services.LeadService;
import com.marketing.dto.LeadData;

@Controller
public class LeadController {

	@Autowired
	LeadService leadservices;

	@RequestMapping("/createLead")
	public String createLead() {
		return "new_create_registration";
	}

	@RequestMapping("/saveLead")
	public String saveOneLead(@ModelAttribute("lead") Lead lead, ModelMap model) {

		leadservices.savelead(lead);
		model.addAttribute("saveMsg", "Record Is saved!!");
		return "new_create_registration";
	}

	@RequestMapping("/listLead")
	public String getAllLeads(ModelMap model) {

		List<Lead> leads = leadservices.listAll();

		model.addAttribute("leads", leads);
		return "search_result";
	}

	@RequestMapping("/delete")
	public String deleteLead(@RequestParam("id") long id, ModelMap model) {
		leadservices.deleteById(id);

		List<Lead> leads = leadservices.listAll();

		model.addAttribute("leads", leads);
		return "search_result";
	}

	@RequestMapping("/update")
	public String updateOneLead(@RequestParam("id") long id, ModelMap model) {
		Lead lead = leadservices.findOneLeadById(id);
		if (lead != null) {
			model.addAttribute("lead", lead);
			return "update_lead";
		} else {

			model.addAttribute("error", "invalid id!!");
			return "error_page";
		}

	}

	@RequestMapping("/updateLead")
	public String updateLead(LeadData data, ModelMap model) {
		
		Lead lead=new Lead();
		lead.setId(data.getId());
		lead.setFirstName(data.getFirstName());;
		lead.setLastName(data.getLastName());
		lead.setEmail(data.getEmail());
		lead.setMobile(data.getMobile());
		
		leadservices.savelead(lead);
		
		List<Lead> leads = leadservices.listAll();
		model.addAttribute("leads", leads);
		return "search_result";
	}
}