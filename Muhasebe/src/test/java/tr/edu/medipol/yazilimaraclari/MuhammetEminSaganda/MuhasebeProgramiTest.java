package tr.edu.medipol.yazilimaraclari.MuhammetEminSaganda;

import static org.junit.Assert.*;

import org.junit.Assert;
import org.junit.Test;


import tr.edu.medipol.yazilimaraclari.MuhammetEminSaganda.MuhasebeProgrami;




public class MuhasebeProgramiTest {

	@Test	
	public void test() {
		
		MuhasebeProgrami sonuc = new MuhasebeProgrami();
		int calisilanSaat,saatlikUcret;
		int hesapla = sonuc.ucretHesapla();
		Assert.assertEquals(sonuc, calisilanSaat,saatlikUcret);
	    System.out.println("Sonuç: " + sonuc);
			
	    return ucretHesapla;
	    
		
	}

}
