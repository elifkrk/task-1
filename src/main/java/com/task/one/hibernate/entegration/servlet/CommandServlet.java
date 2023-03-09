package com.task.one.hibernate.entegration.servlet;

import java.io.BufferedReader;
import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.jdom2.JDOMException;

import com.task.one.hibernate.entegration.command.CommandExecutor;
import com.task.one.hibernate.entegration.command.ICommand;
import com.task.one.hibernate.entegration.daoImpl.CommandDaoImpl;
import com.task.one.hibernate.entegration.enums.CommandNameEnum;
import com.task.one.hibernate.entegration.handler.RequestHandler;
import com.task.one.hibernate.entegration.util.Utility;

/**
 * Servlet implementation class CommandServlet
 */
@WebServlet(name="CommandServlet", urlPatterns = "/commandServlet")
public class CommandServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public CommandServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
	    
	    String xmlRequest = "";
	    try (BufferedReader reader = request.getReader()) {
	        String line;
	        while ((line = reader.readLine()) != null) {
	            xmlRequest += line;
	        }
	        
		RequestHandler requestHandler = Utility.xmlParser(xmlRequest);
		ICommand commandExecutor = new CommandExecutor(new CommandDaoImpl());
		commandExecutor.execute(Utility.createCommandParameter(CommandNameEnum.valueOf(requestHandler.getCommandName()), requestHandler.getCustomer()));
		
	    } catch (JDOMException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	    } catch (IOException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	    } catch (Exception e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	    }
	    
	    response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
