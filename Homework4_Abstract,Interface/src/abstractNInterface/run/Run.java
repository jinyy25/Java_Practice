package abstractNInterface.run;

import abstractNInterface.controller.PhoneController;

public class Run {

	public static void main(String[] args) {
			
		PhoneController pc=new PhoneController();
			
			String[]result = pc.method();
			for(String v:result) {
				System.out.println(v);
			}
	}

}
