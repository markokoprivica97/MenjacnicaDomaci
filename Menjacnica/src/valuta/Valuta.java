package valuta;

public class Valuta {
private String nazivValute;
private String skraceniNaziv;
private int dan, mesec, godina;
private double kupovniKurs, srednjiKurs, prodajniKurs;


@Override
public int hashCode() {
	final int prime = 31;
	int result = 1;
	result = prime * result + dan;
	result = prime * result + godina;
	long temp;
	temp = Double.doubleToLongBits(kupovniKurs);
	result = prime * result + (int) (temp ^ (temp >>> 32));
	result = prime * result + mesec;
	result = prime * result + ((nazivValute == null) ? 0 : nazivValute.hashCode());
	temp = Double.doubleToLongBits(prodajniKurs);
	result = prime * result + (int) (temp ^ (temp >>> 32));
	result = prime * result + ((skraceniNaziv == null) ? 0 : skraceniNaziv.hashCode());
	temp = Double.doubleToLongBits(srednjiKurs);
	result = prime * result + (int) (temp ^ (temp >>> 32));
	return result;
}

@Override
public boolean equals(Object obj) {
	if (this == obj)
		return true;
	if (obj == null)
		return false;
	if (getClass() != obj.getClass())
		return false;
	Valuta other = (Valuta) obj;
	if (dan != other.dan)
		return false;
	if (godina != other.godina)
		return false;
	if (Double.doubleToLongBits(kupovniKurs) != Double.doubleToLongBits(other.kupovniKurs))
		return false;
	if (mesec != other.mesec)
		return false;
	if (nazivValute == null) {
		if (other.nazivValute != null)
			return false;
	} else if (!nazivValute.equals(other.nazivValute))
		return false;
	if (Double.doubleToLongBits(prodajniKurs) != Double.doubleToLongBits(other.prodajniKurs))
		return false;
	if (skraceniNaziv == null) {
		if (other.skraceniNaziv != null)
			return false;
	} else if (!skraceniNaziv.equals(other.skraceniNaziv))
		return false;
	if (Double.doubleToLongBits(srednjiKurs) != Double.doubleToLongBits(other.srednjiKurs))
		return false;
	return true;
}

@Override
public String toString() {
	return "Valuta [nazivValute=" + nazivValute + ", skraceniNaziv=" + skraceniNaziv + ", dan=" + dan + ", mesec="
			+ mesec + ", godina=" + godina + ", kupovniKurs=" + kupovniKurs + ", srednjiKurs=" + srednjiKurs
			+ ", prodajniKurs=" + prodajniKurs + "]";
}

public String getSkraceniNaziv() {
	return skraceniNaziv;
}

public void setSkraceniNaziv(String skraceniNaziv) {
	if(skraceniNaziv == null)
		throw new RuntimeException("Null");
	this.skraceniNaziv = skraceniNaziv;
}

public int getDan() {
	return dan;
}

public void setDan(int dan) {
	if(dan == 0)
		throw new RuntimeException("Dan je 0");
	this.dan = dan;
}

public int getMesec() {
	return mesec;
}

public void setMesec(int mesec) {
	if(mesec == 0)
		throw new RuntimeException("Greska u mesecu");
	this.mesec = mesec;
}

public int getGodina() {
	return godina;
}

public void setGodina(int godina) {
	if(godina == 0)
		throw new RuntimeException("Greska u godini");
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
