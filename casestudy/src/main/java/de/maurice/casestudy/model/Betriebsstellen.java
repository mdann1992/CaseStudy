package de.maurice.casestudy.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="dbnetz_betriebsstellenverzeichnis_stand2021_07")
public class Betriebsstellen {

	@Id
	@Column(name = "RL100Code")
	private String RL100Code;
	
	@Column(name = "PLC")
	private String PLC;
	
	@Column(name = "RL100Langname")
	private String RL100Langname;
	
	@Column(name = "RL100Kurzname")
	private String RL100Kurzname;
	
	@Column(name = "TypKurz")
	private String TypKurz;
	
	@Column(name = "TypLang")
	private String TypLang;
	
	@Column(name = "Betriebszustand")
	private String Betriebszustand;
	
	@Column(name = "DatumAb")
	private String DatumAb;
	
	@Column(name = "DatumBis")
	private String DatumBis;
	
	@Column(name = "Niederlassung")
	private String Niederlassung;
	
	@Column(name = "Regionalbereich")
	private String Regionalbereich;
	
	@Column(name = "LetzteÄnderung")
	private String LetzteÄnderung;
	
	public Betriebsstellen() {
		
	}
	
	public Betriebsstellen(String PLC,
			String RL100Code,
			String RL100Langname,
			String RL100Kurzname,
			String TypKurz,
			String TypLang,
			String Betriebszustand,
			String DatumAb,
			String DatumBis,
			String Niederlassung,
			String Regionalbereich,
			String LetzteÄnderung) {
		
		this.PLC = PLC;
		this.RL100Code = RL100Code;
		this.RL100Langname = RL100Langname;
		this.RL100Kurzname = RL100Kurzname;
		this.TypKurz = TypKurz;
		this.TypLang = TypLang;
		this.Betriebszustand = Betriebszustand;
		this.DatumAb = DatumAb;
		this.DatumBis = DatumBis;
		this.Niederlassung = Niederlassung;
		this.Regionalbereich = Regionalbereich;
		this.LetzteÄnderung = LetzteÄnderung;
	}
	
	
	
	public String getRL100Code() {
		return RL100Code;
	}

	public void setRL100Code(String rL100Code) {
		RL100Code = rL100Code;
	}

	public String getPLC() {
		return PLC;
	}

	public void setPLC(String pLC) {
		PLC = pLC;
	}

	public String getRL100Langname() {
		return RL100Langname;
	}

	public void setRL100Langname(String rL100Langname) {
		RL100Langname = rL100Langname;
	}

	public String getRL100Kurzname() {
		return RL100Kurzname;
	}

	public void setRL100Kurzname(String rL100Kurzname) {
		RL100Kurzname = rL100Kurzname;
	}

	public String getTypKurz() {
		return TypKurz;
	}

	public void setTypKurz(String typKurz) {
		TypKurz = typKurz;
	}

	public String getTypLang() {
		return TypLang;
	}

	public void setTypLang(String typLang) {
		TypLang = typLang;
	}

	public String getBetriebszustand() {
		return Betriebszustand;
	}

	public void setBetriebszustand(String betriebszustand) {
		Betriebszustand = betriebszustand;
	}

	public String getDatumAb() {
		return DatumAb;
	}

	public void setDatumAb(String datumAb) {
		DatumAb = datumAb;
	}

	public String getDatumBis() {
		return DatumBis;
	}

	public void setDatumBis(String datumBis) {
		DatumBis = datumBis;
	}

	public String getNiederlassung() {
		return Niederlassung;
	}

	public void setNiederlassung(String niederlassung) {
		Niederlassung = niederlassung;
	}

	public String getRegionalbereich() {
		return Regionalbereich;
	}

	public void setRegionalbereich(String regionalbereich) {
		Regionalbereich = regionalbereich;
	}

	public String getLetzteÄnderung() {
		return LetzteÄnderung;
	}

	public void setLetzteÄnderung(String letzteÄnderung) {
		LetzteÄnderung = letzteÄnderung;
	}
	
}
