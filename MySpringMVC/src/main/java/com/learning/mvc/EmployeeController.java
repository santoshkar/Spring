package com.learning.mvc;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("/emp")
public class EmployeeController {
	
	@Autowired
	private EmployeeService empService;
	
	/*@RequestMapping(value="/showEmp", method=RequestMethod.GET)
	public String showEmployeeData(Model model) {
		Employee emp = empService.findAnEmployee(1L);
		model.addAttribute("emp", emp);
		return "empView";
	}*/
	
	
	@RequestMapping(value="/showEmp", method=RequestMethod.GET)
	public ModelAndView showEmployeeData(ModelAndView mv) {
		Employee emp = empService.findAnEmployee(1L);
		mv.setViewName("empView");
		mv.addObject("emp", emp);
		return mv;
		
	}
	
	@RequestMapping(value="/saveEmp", method=RequestMethod.POST)
	public String saveEmp() {
		return "something2";
	}
}

// 			/emp/showEmp
//			/emp/saveEmp