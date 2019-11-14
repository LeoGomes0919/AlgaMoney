package br.com.money.api.config;

import java.util.Properties;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.mail.javamail.JavaMailSenderImpl;

import br.com.money.api.config.property.MoneyApiProperty;

@Configuration
public class MailConfig {
	
	@Autowired
	private MoneyApiProperty propety;

	@Bean
	public JavaMailSender javaMailSender() {
		Properties props = new Properties();
		props.put("mail.transport.protocol", "smtp");
		props.put("mail.smtp.auth", true);
		props.put("mail.smtp.starttls.enable", true);
		props.put("mail.smtp.connectiontimeout", 10000);

		JavaMailSenderImpl mailSender = new JavaMailSenderImpl();
		mailSender.setJavaMailProperties(props);
		mailSender.setHost(propety.getMail().getHost());
		mailSender.setPort(propety.getMail().getPort());
		mailSender.setUsername(propety.getMail().getUsername());
		mailSender.setPassword(propety.getMail().getPassword());
		
		return mailSender;
	}
}
