package com.example.java5_s3_forms_databinding_sd18314.controllers;

import com.example.java5_s3_forms_databinding_sd18314.entities.Employee;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class EmployeeController {

    @RequestMapping(value = "/employee", method = RequestMethod.GET)
    public ModelAndView showForm() {
        return new ModelAndView("employeeHome", "employee", new Employee());
    }

    @RequestMapping(value = "/addEmployee", method = RequestMethod.POST)
    public String addEmployee(
            @ModelAttribute("employee") Employee employee,
            BindingResult bindingResult,
            ModelMap modelMap
    ) {

        if (bindingResult.hasErrors()) {
            return "error";
        }

        modelMap.addAttribute("name", employee.getName());
        modelMap.addAttribute("contactNumber", employee.getContactNumber());
        modelMap.addAttribute("id", employee.getId());
        modelMap.addAttribute("office", employee.getOffice());

        return "employeeView";
    }
}
