package br.com.aspotato.mailchimpapi.service;

import java.util.ArrayList;

import br.com.aspotato.mailchimpapi.dao.TemplateDAO;
import br.com.aspotato.mailchimpapi.entity.Template;

public class TemplateService {

	public TemplateService() {
	}
	
	private static TemplateDAO templateDAO = new TemplateDAO();
	
	public ArrayList<Template> findAll() throws Exception {
		return templateDAO.findAll();
	}

}
