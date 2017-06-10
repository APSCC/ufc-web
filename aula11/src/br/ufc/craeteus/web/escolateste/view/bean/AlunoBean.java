package br.ufc.craeteus.web.escolateste.view.bean;

import java.util.List;

import javax.faces.bean.ManagedBean;

import br.ufc.craeteus.web.escolateste.model.Aluno;
import br.ufc.craeteus.web.escolateste.repository.AlunoRepository;

@ManagedBean
public class AlunoBean {

	private Aluno aluno;
	private boolean showId = false;
	
	public AlunoBean() {
		setAluno(new Aluno());
	}

	public Aluno getAluno() {
		return aluno;
	}

	public void setAluno(Aluno aluno) {
		this.aluno = aluno;
	}
	
	public boolean isShowId() {
		return showId;
	}

	public void setShowId(boolean showId) {
		this.showId = showId;
	}

	public List<Aluno> getAlunos(){
		return AlunoRepository.getAlunos();
	}
	
	public String salvar(){
		if(AlunoRepository.getById(aluno.getId()) == null)
			AlunoRepository.save(aluno);
		else AlunoRepository.update(aluno);
		aluno = new Aluno();
		return "/aluno";
	}
	
	public String carregar(Aluno a){
		aluno = a;
		setShowId(true);
		return "/aluno";
	}
	
	public String remover(Aluno a){
		AlunoRepository.delete(a);
		return "/aluno";
	}
	
}
