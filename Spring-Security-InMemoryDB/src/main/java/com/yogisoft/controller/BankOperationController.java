package com.yogisoft.controller;

import java.util.Map;
import java.util.Random;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class BankOperationController {
	
	
	
	@GetMapping("/")
	public String getHomePage() 
	{
		
		return "home";
	}
	
	
	@GetMapping("/offers")
	public String getOffers() 
	{
		
		return "offer";
		
	}
	
	@GetMapping("/loanApprove")
	public String approvedLoan(Map<String, Object> map) 
	{
	
		Integer loanAmount = new Random().nextInt(1000000);
		
		
		map.put("amount", loanAmount);
		
		
		return "loan";
		
		
	}
	
	
	@GetMapping("/balance")
	public String cheakBalance(Map<String,Object> map) 
	{
		Integer currentBalance = new Random().nextInt(1000);
		
		map.put("balance", currentBalance);
		
		
		return "show_balance";
		
		
		
	}
	
	@GetMapping("/denied")
	public String access_denied() 
	{
		
		
		
		return "access_denied";
		
		
		
	}
	
	@GetMapping("/logout")
	public String logout() 
	{
		
		
		
		return "logout";
		
		
		
	}

}
