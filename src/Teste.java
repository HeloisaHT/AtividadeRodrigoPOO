import java.util.ArrayList;

public class Teste {


	public static void main(String[] args) {
		
		ArrayList<Caminhao> caminhoes =new ArrayList<Caminhao>();
		Caminhao c1 = new Caminhao ("ABC-8455",1982,8);
		Caminhao c2 = new Caminhao ("GPP-7895",2000,3);
		Caminhao c3 = new Caminhao ("BNM-4712",2020,2);
		Caminhao c4 = new Caminhao ("POT-1234",1978,7);
		Caminhao c5 = new Caminhao ("FRE-9999",1995,4);
		caminhoes.add(c1);
		caminhoes.add(c2);
		caminhoes.add(c3);
		caminhoes.add(c4);
		caminhoes.add(c5);
		
		System.out.println(" caminhoes \n" + caminhoes );
		
		
		ArrayList<Onibus>bus =new ArrayList<Onibus>();
		Onibus on1 = new Onibus ("RET-8745",2002,3);
		Onibus on2 = new Onibus ("ZXC-8523",1984,7);
		Onibus on3 = new Onibus("QWE-4567",1965,4);
		Onibus on4 = new Onibus("ASA-7894",2022,2);
		Onibus on5 = new Onibus ("JKL-1597",2004,5);
		bus.add(on1);
		bus.add(on2);
		bus.add(on3);
		bus.add(on4);
		bus.add(on5);
		
		System.out.println(" Onibus:\n" + bus  );
		
	}

}
