package controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import model.Numeros;

@WebServlet(value = "/sortear")
public class Controlador extends HttpServlet {
	protected void service(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {

		HttpSession sessao = req.getSession();
		
		String paramAcao = req.getParameter("acao");
		String acao = paramAcao == null ? "" : paramAcao;
		
		Numeros numeros = new Numeros();
		
		if(acao.equals("sortear")) {
			numeros.sortear();
		} else {
			numeros = new Numeros();
		}
		
		sessao.setAttribute("numeros", numeros);
		
		
		req.getRequestDispatcher("index.jsp").forward(req, resp);
	}

}
