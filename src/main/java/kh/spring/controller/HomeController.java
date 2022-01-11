package kh.spring.controller;

import java.text.DateFormat;
import java.util.Date;
import java.util.List;
import java.util.Locale;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import kh.spring.dao.MessageDAO;
import kh.spring.dto.MessageDTO;


@Controller
public class HomeController {
	
	@Autowired
	MessageDAO dao;
	
	@RequestMapping(value = "/", method = RequestMethod.GET)
	public String home(Locale locale, Model model) {
		
		return "home";
	}
	
	@RequestMapping("inputForm")
	public String inputForm() {
		return "inputForm";
	}
	
	@RequestMapping("inputProc")
	public String inputProc(MessageDTO dto) throws Exception {
		int result = dao.insert(dto);
		return "redirect:/";
	}

	@RequestMapping("outputProc")
	public String outputProc(Model model, int seq) throws Exception {
		List<MessageDTO> list = dao.select(seq);
		model.addAttribute("list",list);
		return "outputView";
	}
	
	@RequestMapping("deleteProc")
	public String deleteProc(int seq) throws Exception {
		int result = dao.delete(seq);
		return "redirect:outputProc";
	}
	
	@RequestMapping("updateProc")
	public String updateProc(MessageDTO dto) throws Exception {
		int result = dao.update(dto);
		return "redirect:outputProc";
	}
	
	@RequestMapping("search")
	public String search(Model model, int seq) throws Exception {
		List<MessageDTO> list = dao.search(seq);
		model.addAttribute("list",list);
		return "outputView";
	}
	
	@ExceptionHandler(Exception.class)
	public String exceptionHandler(Exception e) {
		e.printStackTrace();
		return "redirect:/";
	}
}
