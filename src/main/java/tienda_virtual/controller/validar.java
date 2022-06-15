package tienda_virtual.controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import tienda_virtual.dao.EmpleadoDao;
import tienda_virtual.modelo.Empleado;

/**
 * Servlet implementation class validar
 */
@WebServlet("/validar")
public class validar extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
	EmpleadoDao edao = new EmpleadoDao();
	Empleado em = new Empleado();
	
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public validar() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
		String accion = request.getParameter("accion");
		if(accion.equalsIgnoreCase("Ingresar")) {
			String username = request.getParameter("username");
			String password = request.getParameter("password");
			em = edao.consultarUsuario(username, password);
			if(em != null) {
				request.getRequestDispatcher("controlador?accion=Principal").forward(request, response);
			}else {
				request.getRequestDispatcher("index.jsp").forward(request, response);
			}
		}else {
			request.getRequestDispatcher("index.jsp").forward(request, response);
		}
	}

}
