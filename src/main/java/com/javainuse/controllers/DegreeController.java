package com.javainuse.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.javainuse.model.Degree;
import com.javainuse.service.impl.DegreeService;

@Controller
public class DegreeController {
	
	@Autowired
	private DegreeService service;
	
	@RequestMapping("/getDegree")
	public String viewIndexPage(Model model){
		List<Degree> degreeList = service.listAll();
		model.addAttribute("getAllDegree", degreeList);
		return "getDegree";
	}
	
	@RequestMapping("/addDegree")
	public String viewNewDegreeForm(Model model) {
		Degree degree = new Degree();
		model.addAttribute("degree", degree);
		return "addDegree";
	}
	
	@RequestMapping(value = "/save_degree", method = RequestMethod.POST)
	public String addNewDegree(@ModelAttribute("degree") Degree degree) {
		service.create(degree);
		return "redirect:/showDegree";
	}
	
	@RequestMapping("/delete/{id}")
	public String deleteDegree(@PathVariable(name = "id") long id) {
		
		service.delete(id);
		return "redirect:/getDegree";
	}

	@RequestMapping("/")
	public ModelAndView firstPage() {
		return new ModelAndView("welcome");
	}
	@RequestMapping(value = "/login", method = RequestMethod.GET)
	public String login(Model model, String error, String logout) {
		if (error != null)
			model.addAttribute("errorMsg", "Your username and password are invalid.");

		if (logout != null)
			model.addAttribute("msg", "You have been logged out successfully.");

		return "login";
	}

	
}
