package construtor;

public class Consulta {
 String NomePcnt;
 String NomeDents;
 int data;

//Construtor padrão é criado mesmo que não explicitado
	public Consulta () {
		}
	
	//Método construtor com argumento
	public Consulta(String nome) {
		this.NomePcnt = NomePcnt;
	}
	public Consulta(String NomePcnt, String NomeDents, int data) {
		this.NomePcnt = NomePcnt;
		this.NomeDents = NomeDents;
		this.data = data;
	}
        public String getNomePcnt() {
	   	 return NomePcnt;
	    }
	    public void setNomePcnt (String NomePcnt) {
	   	 this.NomePcnt = NomePcnt;
	    }
	    public String getNomeDents() {
	        return NomeDents;
	     }
	     public void setNomeDents(String NomeDents) {
	        this.NomeDents = NomeDents;
	     }
	     public int getData() {
		        return data;
		     }
		     public void setData(int data) {
		        this.data = data;
}
}