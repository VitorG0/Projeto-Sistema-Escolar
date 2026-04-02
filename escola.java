package entidade;

public class escola {
	public String endereço;
	public String nome;
	public int id_escola;
	
	public escola(String endereço, String nome,int id_escola) {
        this.nome = nome;
        this.id_escola = id_escola;
        this.endereço = endereço;
        }
	
	public void setid_escola(int id_escola) {
		this.id_escola = id_escola;
	}
	
	public int getid_escola() {
		return id_escola;
	}
	
	public void setnome(String nome) {
		this.nome = nome;
	}
	
	public String getnome(){
		return nome;
	}
	
	public void setendereço(String endereço) {
		this.endereço = endereço;
	}
	
	public String getendereço() {
		return endereço;
	}
}