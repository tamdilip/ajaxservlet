package com.ajax.test;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class StateController
 */
@WebServlet("/StateController")
public class StateController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public StateController() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//response.getWriter().append("Served at: ").append(request.getContextPath());
		
		
		String country = request.getParameter("Country").trim();
		System.out.println(country);
		String states = "No match";
		if(country.equalsIgnoreCase("India")){
			List<String> stateList = new ArrayList<>();
			stateList.add("Tamil Nadu");
			stateList.add("Andhra Pradesh");
	        stateList.add("Kerala");
	        states = stateList.toString();
		}
		else if(country.equalsIgnoreCase("United States")){
			List<String> stateList = new ArrayList<>();
			stateList.add("California");
			stateList.add("Florida");
	        stateList.add("Texas");
	        states = stateList.toString();
		}
		
		
		response.setContentType("text/plain");
		response.getWriter().write(states);

	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
