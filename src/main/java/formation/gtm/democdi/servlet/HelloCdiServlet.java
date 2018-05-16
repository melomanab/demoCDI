package formation.gtm.democdi.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.inject.Inject;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import formation.gtm.democdi.service.ClientService;

/**
 * Classe servlet HTTP
 * @author Stagiaire
 *
 */

// @WebServlet( name="HelloCdi", urlPatterns = "/hellocdi" )
public class HelloCdiServlet extends HttpServlet{
	
	private static final long serialVersionUID = 1L;
    
	/**
	 * Proprietée annotée @Inject
	 * Annotation CDI pour standardiser l'injection d'un beans
	 */
	@Inject
	ClientService service;

	/* (non-Javadoc)
	 * Methode qui se déclenche avec une requête GET sur l'url: /hellocdi
	 * @see javax.servlet.http.HttpServlet#doGet(javax.servlet.http.HttpServletRequest, javax.servlet.http.HttpServletResponse)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		response.setContentType("text/html");		
		service.creerClient();
		
		PrintWriter out = response.getWriter();
		out.println("Mise en oeuvre CDI ok. Bravo !!");
		out.close();
	}
		

}
