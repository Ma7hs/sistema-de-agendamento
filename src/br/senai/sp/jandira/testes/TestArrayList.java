package br.senai.sp.jandira.testes;

import java.io.ObjectInputStream.GetField;
import java.lang.reflect.Array;
import java.security.PublicKey;
import java.util.ArrayList;

import javax.swing.plaf.synth.SynthOptionPaneUI;

import br.senai.sp.jandira.dao.PlanoSaudeDao;
import br.senai.sp.jandira.model.Especialidade;
import br.senai.sp.jandira.model.PlanoSaude;

public class TestArrayList {

	public static void main(String[] args) {
//		// TODO Auto-generated method stub
//
//		// =new PlanoDeSaude(); => método construtor da classe
//		// faz a construção da classe
//		//
//		PlanoDeSaude plano1 = new PlanoDeSaude();
//		plano1.setOperadora("Unimed");
//		plano1.setTipoDoPlano("Bronze");
//		// Vetor de classe com 3 planosde saúde
//		PlanoDeSaude[] planos = { plano1, 
//				new PlanoDeSaude("Porto Seguro"),
//				new PlanoDeSaude("Allianz", "Ouro")};
//		
//		
//		
//		System.out.println(planos[0].getOperadora());
//		System.out.println(planos[0].getTipoDoPlano());
//		System.out.println(planos[1].getOperadora());
//		System.out.println(planos[1].getTipoDoPlano());
//		System.out.println(planos[2].getOperadora());
//		System.out.println(planos[2].getTipoDoPlano());
//		
//		// int []notas =new int [3];
//		// notas[0] = 5;
//		// notas[1] = 8;
//		// notas[2] = 7;
//
//		
//			//fazendo araylist no lugar de vetor
//					//tipo
//		ArrayList<String> cidades = new ArrayList<>();
//		//colocando strig
//		cidades.add("São Paulo");
//		cidades.add("Jandira");
//		cidades.add("Barueri");
//		cidades.add("Itapevi");
//		cidades.add("Cotia");
//		cidades.add("Carapicuiba");
//		
//		System.out.println(cidades.get(4));
//		System.out.println(cidades.size());
//		
//		ArrayList<PlanoDeSaude> planos2 = new ArrayList<>();
//		
//		planos2.add(new PlanoDeSaude("Notredame"));
//		planos2.add(new PlanoDeSaude("Ativia", "Advanced"));
//		planos2.add(new PlanoDeSaude("Bio Saúde"));
//		planos2.add(new PlanoDeSaude("Blue Med","exclusivo" ));
//		
//		PlanoDeSaude planoNovo = new PlanoDeSaude();
//		planoNovo.setOperadora("Ameplan");
//		planoNovo.setTipoDoPlano("Prata");
//		
//		
//		planos2.add(planoNovo);
//		
//		//adicionar o tipo de plano no plano Notedrame
//		
//		planos2.get(0).setTipoDoPlano("Basic");
//		System.out.println(planos2.get(4).getDadoDoPlano());
//		System.out.println(planos2.get(0).getDadoDoPlano());
//		
//		int nota1 = 10;
//		Integer nota2 = 5;
//		
//		ArrayList<Double> precosList = new ArrayList<>();
//		precosList.add(5.9);
		
		//criando listas
		PlanoSaude plano1 = new PlanoSaude("Amil","Basicc");
		PlanoSaude plano2 = new PlanoSaude("Alians","Bronze");
		PlanoSaude plano3 = new PlanoSaude("Unimed","Prata");
		PlanoSaude plano4 = new PlanoSaude("Notedrame","Advacend");
		//adicionando listas
		ArrayList<PlanoSaude> planos =new ArrayList<>();
		planos.add(plano1);
		planos.add(plano2);
		planos.add(plano3);
		planos.add(plano4);
		
		//imprimindo os nomes das operadores dentro do Array  usando while
		
		System.out.println("saiu do looping");
		int i = 0;
		
		//size : retorna o múmeros dentro da lista 
		//while
	while (i < planos.size()) {
		System.out.println(planos.get(i).getOperadora());
			i++;
		}
		
		//System.out.println("saiu do looping");
		
	System.out.println("---------- Utilizando FOR ---------");
	for (int contador=0; contador < planos.size(); contador++) {
		System.out.println(planos.get(contador).getOperadora());
	}
	
		
	for (PlanoSaude plano : planos) {
		System.out.println(plano.getOperadora());
	}
	System.out.println("---------- Utilizando FOR EACh ---------");
	//Criar 3 especialidade, guardar especialidades em um arrayList
	//exibir dados usando FOR EACh
	
	Especialidade e1 = new Especialidade();
	e1.setNome("Cardiologia");
	e1.setDescricao("Cuida do coração");
	
	Especialidade e2 = new Especialidade();
	e2.setNome("otorrinno");
	e2.setDescricao("Cuida do ouvido");
	
	Especialidade e3 = new Especialidade();
	e3.setNome("fisioterapia");
	e3.setDescricao("Cuida dos ossos e musculos");
	
	
	ArrayList<Especialidade> especialidades = new ArrayList<>();
	especialidades.add(e1);
	especialidades.add(e2);
	especialidades.add(e3);
	
	
	for (Especialidade e : especialidades) {
		System.out.printf("%s --%s\n", e.getNome(),e.getDescricao());
	}
//		PlanoDeSaudeDao dao = new PlanoDeSaudeDao(plano1);
//		
//		dao.gravar(plano1);
//		dao.gravar(plano2);
//		
//		System.out.println(dao.listarTodos());
	}

}
