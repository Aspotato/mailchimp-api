import java.util.ArrayList;

import br.com.aspotato.mailchimpapi.entity.Template;
import br.com.aspotato.mailchimpapi.service.TemplateService;

public class Teste {

	public Teste() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) throws Exception {
		TemplateService service = new TemplateService();
		ArrayList<Template> templates = service.findAll();
		System.out.println(templates.size());

	}

}
