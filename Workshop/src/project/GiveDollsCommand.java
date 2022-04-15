package project;

public class GiveDollsCommand implements Command {

	private Dwarf dwarf;
	
	public GiveDollsCommand(Dwarf dwarf) {
		this.dwarf = dwarf;
	}
	
	@Override
	public void execute() {
		this.dwarf.giveDolls();
	}
}