package br.senai.sp.jandira.testes;

import br.senai.sp.jandira.dao.PlanoSaudeDao;

public class TestDaoXpto {

	public static void main(String[] args) {
		//chamando man do test dao
		TestDao.main(args);
		
		//PlanoDeSaudeDao dao = new PlanoDeSaudeDao();
		System.out.println(PlanoSaudeDao.listarTodos().size());

	}

}
