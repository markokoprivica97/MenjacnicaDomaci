
public class Valuta {
private String nazivValute;
private String skraceniNaziv;
private int dan, mesec, godina;
private double kupovniKurs, srednjiKurs, prodajniKurs;


public String getSkraceniNaziv() {
	return skraceniNaziv;
}

public void setSkraceniNaziv(String skraceniNaziv) {
	this.skraceniNaziv = skraceniNaziv;
}

public int getDan() {
	return dan;
}

public void setDan(int dan) {
	this.dan = dan;
}

public int getMesec() {
	return mesec;
}

public void setMesec(int mesec) {
	this.mesec = mesec;
}

public int getGodina() {
	return godina;
}

public void setGodina(int godina) {
	this.godina = godina;
}

public double getKupovniKurs() {
	return kupovniKurs;
}

public void setKupovniKurs(double kupovniKurs) {
	this.kupovniKurs = kupovniKurs;
}

public double getSrednjiKurs() {
	return srednjiKurs;
}

public void setSrednjiKurs(double srednjiKurs) {
	this.srednjiKurs = srednjiKurs;
}

public double getProdajniKurs() {
	return prodajniKurs;
}

public void setProdajniKurs(double prodajniKurs) {
	this.prodajniKurs = prodajniKurs;
}

public String getNazivValute() {
	return nazivValute;
}

public void setNazivValute(String nazivValute) {
	this.nazivValute = nazivValute;
}

}
