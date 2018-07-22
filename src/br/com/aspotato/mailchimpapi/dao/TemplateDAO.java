package br.com.aspotato.mailchimpapi.dao;

import java.util.ArrayList;

import org.json.JSONArray;
import org.json.JSONObject;

import com.mashape.unirest.http.HttpResponse;
import com.mashape.unirest.http.JsonNode;
import com.mashape.unirest.http.Unirest;

import br.com.aspotato.mailchimpapi.entity.Template;
import br.com.aspotato.mailchimpapi.util.Util;

public class TemplateDAO {


	public ArrayList<Template> findAll() throws Exception {

		ArrayList<Template> templates = new ArrayList<Template>();
		HttpResponse<JsonNode> jsonResponse = Unirest.get("https://us14.api.mailchimp.com/3.0/templates/")
				.header("accept", "application/json")
				.queryString("apikey", "dc3707785b86e85f6184fbe7405b23da-us14")
				.asJson();

		if(jsonResponse.getBody().getObject() != null && jsonResponse.getBody().getObject().has("templates")){
			JSONArray array = jsonResponse.getBody().getObject().getJSONArray("templates");
			for (int i = 0; i < array.length(); i++) {
				JSONObject result = array.getJSONObject(i);
				Template template = (Template) Util.convertJsonToObject(Template.class, result);
				templates.add(template);
			}

		}
		return templates;
	}

}
