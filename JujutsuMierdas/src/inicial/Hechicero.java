package inicial;

import java.util.Scanner;

public class Hechicero {

	private Tecnica CT;
	private int CE;
	private int talent;

	public Hechicero(String ct, int cE, int talentValue) {
		for(Tecnica nct : Useful.CTLIST) {
			if(nct.getCode().equals(ct)) {
				this.CT = nct;
			}
		}
		this.CE = cE;
		this.talent = talentValue;
	}

	public Tecnica getCT() {
		return CT;
	}
	
	public int getCE() {
		return CE;
	}
	
	public int getTalent() {
		return talent;
	}

}
