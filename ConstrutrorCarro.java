package construtor;

public class ConstrutrorCarro {

	public static void main(String[] args) {
		Carro carro1 = new Carro ("JKR3M92", 543499682);
        Carro carro2 = new Carro ("LHN1D24", 312116544);
        Carro carro3 = new Carro ("GAE7F07", 969867456);

        System.out.println(carro1.getNumChassi());
        System.out.println(carro1.getPlaca());
        System.out.println(carro2.getNumChassi());
        System.out.println(carro2.getPlaca());
        System.out.println(carro3.getNumChassi());
        System.out.println(carro3.getPlaca());
	}

}
