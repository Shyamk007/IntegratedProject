package com.project.service;

import org.springframework.mail.SimpleMailMessage;

public interface EmailService {
	
	SimpleMailMessage sendPasswordChangeOTPMail(String userName);
	SimpleMailMessage sendSuccessfullyEvaluatedProjectEmail(Long prn);
	SimpleMailMessage sendProjectNeedSomeWork(Long prn);

}
