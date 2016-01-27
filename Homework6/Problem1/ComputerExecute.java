package Problem1;

public class ComputerExecute {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Computer pravec = new Computer(1988, 110, 5);
		Computer dell = new Computer(2009, 980, 65545, true, "Windows7");
		pravec.changeOS("DOS");
		dell.useMemory(15637);
	}

}
