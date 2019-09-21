/** Enum Color class */
public enum Color {
	//discrete enum values and their abbreviated names
	RED("R"), GREEN("G"), BLUE("B"), YELLOW("Y"), MAGENTA("M"), CYAN("C"), WHITE("W");
	//data member
	private String abbrev;
	/** 1-arg constructor */
	private Color(String abbrev) {
		this.abbrev = abbrev;
	}
	/** abbrev getter */
	public String getAbbrev() {
		return this.abbrev;
	}
}
