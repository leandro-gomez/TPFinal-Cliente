package filtersTest;
import java.util.ArrayList;

import filter.*;
import client.*;
import static org.junit.Assert.*;
import static org.mockito.Mockito.*;
import org.junit.Before;
import org.junit.Test;

public class AndTest {

	Different dif;
	Equal eq;
	Email e;
	CompoundAnd cAnd;
	boolean res;
	ArrayList<Rule>reglas=new ArrayList<Rule>();
	
	@Before
	public void setUp() throws Exception {
		//Mock de Different
		dif=mock(Different.class);
		when(dif.satisfy(e)).thenReturn(true);
		//Mock de Equal
		eq=mock(Equal.class);
		when(eq.satisfy(e)).thenReturn(true);
		
		reglas.add(dif);
		reglas.add(eq);
		cAnd=new CompoundAnd(reglas);
		res=cAnd.satisfy(e);
	}

	@Test
	public void testAndTrue(){
		//Las 2 reglas dan true por lo tanto la conuncion da true
		assertTrue(res);
		}
	
	public void testAndFalse(){
		//Una de las reglas es false, la conjuncion sera false
		when(eq.satisfy(e)).thenReturn(false);
	    assertFalse(res);
	    }
}