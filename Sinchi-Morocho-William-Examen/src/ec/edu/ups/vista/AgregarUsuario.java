package ec.edu.ups.vista;

import java.io.IOException;
import java.util.HashSet;
import java.util.Set;

import javax.print.attribute.HashAttributeSet;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import ec.edu.ups.dao.DAOFactory;
import ec.edu.ups.entidades.*;

/**
 * Servlet implementation class AgregarUsuario
 */
@WebServlet("/AgregarUsuario")
public class AgregarUsuario extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public AgregarUsuario() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String cedula= request.getParameter("cedUsuario");
		String nombre=request.getParameter("nomUsuario");
		String apellido=request.getParameter("apeUsuario");
		String correo=request.getParameter("corrUsuario");
		String contrasena=request.getParameter("contraUsuario");
		UsuarioExamen nuevoUsuario= new UsuarioExamen(cedula,nombre,apellido,correo,contrasena);
		System.out.println("Si llego");
		//Set<TelefonosExamen> telefonos = new HashSet<TelefonosExamen>() ;
		int numeroTelefono = Integer.parseInt(request.getParameter("cantidadTelefonos"));
		DAOFactory.getFactory().getUsuarioExamenDAO().create(nuevoUsuario);
		
		for (int i = 1; i <= numeroTelefono; i++) {
			String numTlfn = request.getParameter("num"+i);
			System.out.println("Numero de telefono"+numTlfn);
			String tipo = request.getParameter("tiptlf"+i);
			System.out.println("Tipo de Telefono"+tipo);
			String opera = request.getParameter("opetlf"+i);
			System.out.println("Operadora"+opera);
			TelefonosExamen tlf = new TelefonosExamen(numTlfn);
			System.out.println("Ya llegye");
			TipoTelfExamen tip = DAOFactory.getFactory().getTipoTelfExamenDAO().readByNombre(tipo);
			OperadoraExamen ope = DAOFactory.getFactory().getOperadoraExamenDAO().readByNombre(opera);
			tlf.setTipoTelefonotlf(tip);
			tlf.setOperadoraTelefono(ope);
			tlf.setUsuarioTelExamen(nuevoUsuario);
			DAOFactory.getFactory().getTelefonosExamenDAO().create(tlf);
		}
		
		//nuevoUsuario.setTelefonos(telefonos);
		
		
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
