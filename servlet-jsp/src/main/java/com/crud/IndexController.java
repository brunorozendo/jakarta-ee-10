package com.crud;

import java.util.ArrayList;

import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet("/")
public class IndexController extends Base {

	private static final long serialVersionUID = -6874811120813632685L;

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse res) {

		req.setAttribute("someVariable", "some content here");

		var list = new ArrayList<String>();
		list.add("item 1");
		list.add("item 2");

		req.setAttribute("someList", list);

		this.view("/WEB-INF/index.jsp", req, res);

	}

}