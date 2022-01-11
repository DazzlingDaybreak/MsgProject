package kh.spring.controller;

import java.util.Locale;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import kh.spring.dao.MessageDAO;


@Controller
public class HomeController {
	
	
	// MessageDAO 미생성 관계로 merge시 주석풀고 클래스 import할 것.
	
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
	
//	@RequestMapping("inputProc")
//	public String inputProc(MessageDTO dto) throws Exception {
//		int result = dao.insert(dto);
//		return "redirect:/";
//	}

//	@RequestMapping("outputProc")
//	public String outputProc(Model model) throws Exception {
//		List<MessageDTO> list = dao.select();
//		model.addAttribute("list",list);
//		return "outputView";
//	}
	
//	@RequestMapping("deleteProc")
//	public String deleteProc(MessageDTO dto) throws Exception {
//		int result = dao.delete(dto);
//		return "redirect:outputProc";
//	}
	
	@RequestMapping("updateProc")
//	public String updateProc(MessageDTO dto) throws Exception {
//		int result = dao.update(dto);
//		return "redirect:outputProc";
//	}
	
//	@RequestMapping("search")
//	public String search(Model model, int seq) throws Exception {
//		List<MessageDTO> list = dao.search(seq);
//		model.addAttribute("list",list);
//		return "outputView";
//	}
	
	@ExceptionHandler(Exception.class)
	public String exceptionHandler(Exception e) {
		e.printStackTrace();
		return "redirect:/";
	}
}
