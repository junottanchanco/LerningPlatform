package com.codingdojo.learningPlatform.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/")
public class HomeController {
	@RequestMapping("")
	public String index() {
		return "index.jsp";
	}
	@RequestMapping("/m/{chapter}/0483/{assignmentNumber}")
	public String assignment(Model model, @PathVariable("chapter") String discard, @PathVariable("assignmentNumber") String assignmentNumber) {
		if(assignmentNumber.equals("0345")) {
			model.addAttribute("assignment", "Coding Forms");
		}
		else if(assignmentNumber.equals("2342")) {
			model.addAttribute("assignment", "Fortran to Binary");
		}else {
			model.addAttribute("assignment", "Uknown assignment");
		}
		return "assignment.jsp";
	}
	@RequestMapping("/m/{chapter}/0553/{lessonNumber}")
	public String lesson(Model model, @PathVariable("chapter") String chapter, @PathVariable("lessonNumber") String lessonNumber) {
		if(lessonNumber.equals("0733")) {
			model.addAttribute("lesson", "Setting up your servers");
		}
		else if(lessonNumber.equals("0342")) {
			model.addAttribute("lesson", "Punch Cards");
		}
		else if(lessonNumber.equals("0348")){
			model.addAttribute("lesson", "Advanced Fortran Intro");
		}else {
			model.addAttribute("lesson", "Uknown lesson");
		}
		return "lesson.jsp";
	}
}
