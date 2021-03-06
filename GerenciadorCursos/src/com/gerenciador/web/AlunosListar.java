package com.gerenciador.web;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.gerenciador.dao.AlunoDAO;

public class AlunosListar implements Acao {

	@Override
	public String execute(HttpServletRequest request, HttpServletResponse response) {
		
		String page = "/WEB-INF/alunoslistar.jsp";
		
		if (request.getMethod().equals("GET")){
			AlunoDAO alunoDAO = new AlunoDAO();
			
			request.setAttribute("alunos", alunoDAO.list());
		}
		
		return page;
	}

}
