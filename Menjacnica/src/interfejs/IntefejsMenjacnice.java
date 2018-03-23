package interfejs;

import valuta.Valuta;

public interface IntefejsMenjacnice {
	void dodajKurs(String skraceniNaziv,String naziv,int dan,int mesec,int godina,double srednji,double kupovni,double prodajni);
	void izbrisiKurs(String skraceniNaziv,int dan,int mesec,int godina);
Valuta nadjiKurs(String skraceniNaziv,int dan,int mesec,int godina);
	
	
}
