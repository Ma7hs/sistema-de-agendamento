package br.senai.sp.jandira.testes;

import br.senai.sp.jandira.dao.PlanoSaudeDao;
import br.senai.sp.jandira.model.PlanoSaude;

public class TestDao {

	public static void main(String[] args) {
		String[] linha0 = {"Cotia", "Itapevi", "Jandira"};
		String[] linha1 = {"Barueri", "Carapicuíba", "Osasco"};
		String[] linha2 = {"Alphaville", "São Roque", "Itu"};
		String[] linha3 = {"Presidente Prudente", "Pinheiros", "Santo Amaro"};
                
                String[][] linhas = {linha0,linha1,linha2,linha3};
                
                System.out.println(linhas[2][2]);
                
                
                String[][] frutas = {
                    {"Banana", "Pera", "Maçã"}, 
                    {"Melancia", "Uva", "Abacate"},
                    {"Morango", "Manga", "Abacaxi"},
                        
                    {"Banana", "Pera", "Maçã"}, 
                    {"Melancia", "Uvaxxxxx", "Abacate"},
                    {"Morango", "Manga", "Abacaxi"}
                };
                
                System.out.println(frutas[1][1]);
		
		PlanoSaude plano1 = new PlanoSaude("Amil","Basicc");
		PlanoSaude plano2 = new PlanoSaude("Alians","Bronze");
		PlanoSaude plano3 = new PlanoSaude("Unimed","Prata");
		PlanoSaude plano4 = new PlanoSaude("Notedrame","Advacend");
		PlanoSaude plano5 = new PlanoSaude();
		
		//chamando a classe get contador, método compartilhado
	//quantos planos de saúde eu tenho
		System.out.println(PlanoSaude.getContador());
		
		System.out.println(plano1.getCodigo());
		//System.out.println(plano2.getCodigo());
		System.out.println(plano5.getCodigo());
		
		PlanoSaudeDao.gravar(plano1);
		PlanoSaudeDao.gravar(plano4);
		//
		
		System.out.println("-------------");
		for (PlanoSaude p : PlanoSaudeDao.listarTodos()) {
			System.out.println("Codigo : " + p.getCodigo());
			System.out.println("Operadora" + p.getOperadora());
		}
		
//		PlanoDeSaudeDao dao = new PlanoDeSaudeDao();
//		dao.gravar(plano1);
//		dao.gravar(plano2);
//		
//		
//		System.out.println(dao.listarTodos().size());
//		
//		for (PlanoDeSaude plano : dao.listarTodos()) {
//			System.out.println("*****");
//			System.out.println(plano.getOperadora());
//		}
//		
//		PlanoDeSaudeDao dao2 = new PlanoDeSaudeDao();
//		dao2.gravar(plano3);
//		dao2.gravar(plano4);
		
		
	}

}
