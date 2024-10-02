package construtor;

public class ConstrutorConsulta {

	public static void main(String[] args) {
		Consulta consulta1 = new Consulta ("Maria", "Dr. Renata", 24/05);
		Consulta consulta2 = new Consulta ("Julia", "Dr. Bruno", 15/12);
		Consulta consulta3 = new Consulta ("Pedro", "Dr. Lorena", 02/10);
	
	    System.out.println(consulta1.getNomePcnt());
	    System.out.println(consulta1.getNomeDents());
	    System.out.println(consulta2.getData());
	    System.out.println(consulta2.getNomePcnt());
	    System.out.println(consulta2.getNomeDents());
	    System.out.println(consulta2.getData());
	    System.out.println(consulta3.getNomePcnt());
	    System.out.println(consulta3.getNomeDents());
	    System.out.println(consulta3.getData());
	}

}
