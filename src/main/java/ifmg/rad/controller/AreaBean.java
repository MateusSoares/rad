package ifmg.rad.controller;

import java.io.Serializable;
import java.util.List;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

import ifmg.rad.modelo.Area;
import ifmg.rad.service.AreaService;
import ifmg.rad.util.FacesMensagens;

@ManagedBean
@SessionScoped
public class AreaBean implements Serializable{

	private List<Area> areas;
	private Area areEdicao = 
			             new Area();
	private AreaService areService =
			             new AreaService();
	
	
	public AreaBean() {
		
		setAreas(areService.buscarTodos());
		
	}
	
	public List<Area> getAreas() {
		return areas;
	}

	public void setAreas(List<Area> areas) {
		this.areas = areas;
	}

	public Area getAreEdicao() {
		return areEdicao;
	}

	public void setAreEdicao(Area areEdicao) {
		this.areEdicao = areEdicao;
	}

	public String novoArea(){
		areEdicao = new Area();
		return  "CadastroArea?faces-redirect=true";
	}
	
	public String editarArea(){
		return  "CadastroArea?faces-redirect=true";
	}	
	
	public void salvarArea(){
				
		try{
		areService.salvar(areEdicao);
		setAreas(areService.buscarTodos()); 
		
		FacesMensagens.info("Registro salvo com sucesso.");
		limpa();
		}
		catch (Exception e) {
			FacesMensagens.error(e.getMessage());
		}
	}

	public void excluirArea(){
		
		try{
		areService.excluir(areEdicao);
		setAreas(areService.buscarTodos()); 
		
		FacesMensagens.info("Registro excluído com sucesso.");
		}
		catch (Exception e) {
			FacesMensagens.error(e.getMessage());
		}
	}	
	
	
	private void limpa() {
		areEdicao = new Area();
	}
	
	
}
