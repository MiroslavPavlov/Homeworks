package computer;

public class ComputerMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Computer dell= new Computer();
		Computer hp=new Computer(2008,850.5,true,84268.4,63285,"Windows 7");
		dell.setPrice(680.9);
		dell.setHardDiskMemory(75364.2);
		dell.setYear(2006);
		dell.setNotebook(true);
		
		if(dell.comparePrice(hp)<0){
			System.out.println("The first computer is more expensive.");
		} else {
			if(dell.comparePrice(hp)==0){
				System.out.println("The two computers have the same price.");
			} else{
				System.out.println("The second computer is more expensive.");
			}
		}
	}

}
