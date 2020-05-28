public class Partner {
	
	private String name = "";
	private boolean kooperation = false;
	
	public Partner(String aName) {
		name = aName;
		kooperation = true;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public boolean isKooperation() {
		return kooperation;
	}

	public void setKooperation(boolean kooperation) {
		this.kooperation = kooperation;
	}
	
	public void boost() {
		System.out.println("ICH BIN BESSER");
	}

}
