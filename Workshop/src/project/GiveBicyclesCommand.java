package project;

public class GiveBicyclesCommand implements Command {

	private Dwarf dwarf;
	
	public GiveBicyclesCommand(Dwarf dwarf) {
		this.dwarf = dwarf;
	}
	
	@Override
	public void execute() {
		this.dwarf.giveBicycles();
	}

}
