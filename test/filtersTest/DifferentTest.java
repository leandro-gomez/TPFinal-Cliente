package filtersTest;


import org.junit.Before;
import org.junit.Test;
import interfaces.IEmail;
import client.*;
import filter.Different;
import filter.Sender;


import static org.junit.Assert.*;
import static org.mockito.Mockito.*;

//Corre
public class DifferentTest {
	
	Different dif;
	IEmail e;
    boolean res;
	
    @Before
	public void setUp() throws Exception {
		//Mock de Sender
    	Sender sen =mock(Sender.class);
    	when(sen.getField(e)).thenReturn("Google");
    	//Mock de Email
    	e=mock(Email.class);
    	
    	Different dif =new Different("TPI",sen);
		res=dif.satisfy(e);
	}

	
	@Test
	public void differentTest(){
		//Al ser el sender diferente al que yo quiero("TPI"),satisfy debe ser True 
		assertTrue(res);
	}
	
}