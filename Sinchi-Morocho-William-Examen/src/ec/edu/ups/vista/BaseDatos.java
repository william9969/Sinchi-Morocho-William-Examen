package ec.edu.ups.vista;

import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;
import javax.servlet.annotation.WebListener;

import ec.edu.ups.dao.DAOFactory;
import ec.edu.ups.dao.OperadoraExamenDAO;
import ec.edu.ups.dao.TipoTelfExamenDAO;
import ec.edu.ups.entidades.OperadoraExamen;
import ec.edu.ups.entidades.TipoTelfExamen;

/**
 * Application Lifecycle Listener implementation class BaseDatos
 *
 */
@WebListener
public class BaseDatos implements ServletContextListener {

    /**
     * Default constructor. 
     */
    public BaseDatos() {
        // TODO Auto-generated constructor stub
    }

	/**
     * @see ServletContextListener#contextDestroyed(ServletContextEvent)
     */
    public void contextDestroyed(ServletContextEvent sce)  { 
         // TODO Auto-generated method stub
    }

	/**
     * @see ServletContextListener#contextInitialized(ServletContextEvent)
     */
    public void contextInitialized(ServletContextEvent sce)  { 
    	TipoTelfExamenDAO tipoDAO = DAOFactory.getFactory().getTipoTelfExamenDAO();
    	OperadoraExamenDAO operadoraDAO = DAOFactory.getFactory().getOperadoraExamenDAO();
    	
    	TipoTelfExamen tipo1=new TipoTelfExamen("Convencional");
    	tipoDAO.create(tipo1);
    	
    	TipoTelfExamen tipo2=new TipoTelfExamen("Celular");
    	tipoDAO.create(tipo2);
    	
    	
    	OperadoraExamen ope1=new OperadoraExamen("Claro");
    	OperadoraExamen ope2=new OperadoraExamen("Movistar");
    	OperadoraExamen ope3=new OperadoraExamen("Tuenti");
    	OperadoraExamen ope4=new OperadoraExamen("CNT");
    	operadoraDAO.create(ope1);
    	operadoraDAO.create(ope2);
    	operadoraDAO.create(ope3);
    	operadoraDAO.create(ope4);
    }
	
}
