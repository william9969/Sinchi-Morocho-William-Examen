package ec.edu.ups.vista;

import java.io.IOException;

import ec.edu.ups.dao.DAOFactory;
import ec.edu.ups.entidades.*;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import java.util.*;

/**
 * Servlet implementation class EnviarTipYOpe
 */
@WebServlet("/EnviarTipYOpe")
public class EnviarTipYOpe extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public EnviarTipYOpe() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		List<TipoTelfExamen> tipos= DAOFactory.getFactory().getTipoTelfExamenDAO().listaTiposTelefonos();
		List<OperadoraExamen> operadoras = DAOFactory.getFactory().getOperadoraExamenDAO().listaOperadorasTel();
		HttpSession session = request.getSession(true);
		
		session.setAttribute("tiposTelf", tipos);
		session.setAttribute("operadorasTel", operadoras);
		request.getRequestDispatcher("/agregarUsuarios.jsp").forward(request,response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
