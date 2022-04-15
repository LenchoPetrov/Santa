package project;

public class MagicBoard {
	private Command command;

	public Command getCommand() {
		return command;
	}

	public void setCommand(Command command) {
		this.command = command;
	}
	
	public void sayMagicWords() {
		if(this.command == null) {
			System.out.println("Невалидна команда!");
			return;
		}
		this.command.execute();
	}
}
