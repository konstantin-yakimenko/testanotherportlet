package com.vottvoydom.portlets.testanotherportlet;

import java.net.MalformedURLException;
import java.util.Arrays;

import javax.portlet.RenderRequest;
import javax.portlet.RenderResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.portlet.bind.annotation.RenderMapping;


@Controller("TestanotherportletPortletApp")
@RequestMapping({"VIEW"})
public class TestanotherportletPortletController
{
	@Autowired
	private ApplicationContext _applicationContext;
	
	
	@RenderMapping
	public String handleRenderRequest(RenderRequest request, RenderResponse response, Model model)
	    throws MalformedURLException {
		
		Anotherbean anotherbean = (Anotherbean)_applicationContext.getBean(Anotherbean.class);
		System.out.println("YakimKY --- Anotherbean founded str = " + anotherbean.getStr());

		return "TestanotherportletViewPage";
	}
}
