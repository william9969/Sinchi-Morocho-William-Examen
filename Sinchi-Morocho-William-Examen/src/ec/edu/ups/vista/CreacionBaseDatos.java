package ec.edu.ups.vista;

import javax.servlet.ServletRequestEvent;
import ec.edu.ups.dao.*;
import javax.servlet.ServletRequestListener;
import javax.servlet.annotation.WebListener;
import javax.servlet.http.HttpSessionEvent;
import javax.servlet.http.HttpSessionListener;
import ec.edu.ups.entidades.*;
/**
 * Application Lifecycle Listener implementation class CreacionBaseDatos
 *
 */
@WebListener
public class CreacionBaseDatos implements HttpSessionListener, ServletRequestListener {

    /**
     * Default constructor. 
     */
    public CreacionBaseDatos() {
        // TODO Auto-generated constructor stub
    }

	/**
     * @see HttpSessionListener#sessionCreated(HttpSessionEvent)
     */
    public void sessionCreated(HttpSessionEvent se)  { 
         // TODO Auto-generated method stub
    }

	/**
     * @see ServletRequestListener#requestDestroyed(ServletRequestEvent)
     */
    public void requestDestroyed(ServletRequestEvent sre)  { 
         // TODO Auto-generated method stub
    }

	/**
     * @see ServletRequestListener#requestInitialized(ServletRequestEvent)
     */
    public void requestInitialized(ServletRequestEvent sre)  { 
    	TipoTelfExamenDAO tipoDAO = DAOFactory.getFactory().getTipoTelfExamenDAO();
    	OperadoraExamenDAO operadoraDAO = DAOFactory.getFactory().getOperadoraExamenDAO();
    	
    	
    	
    	
    	
    	
    }

	/**
     * @see HttpSessionListener#sessionDestroyed(HttpSessionEvent)
     */
    public void sessionDestroyed(HttpSessionEvent se)  { 
         // TODO Auto-generated method stub
    }
	
}
