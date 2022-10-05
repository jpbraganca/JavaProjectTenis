package test;

import java.util.Arrays;
import java.util.List;

import org.junit.Assert;
import org.junit.Test;

import control.Programa;


public class ProgramaTest {
	@Test
	public void testDefineGrupo1() 
	{
		List<String> vitorias = Arrays.asList("V", "V", "V", "V", "V", "V" );
		Assert.assertEquals(1, Programa.defineGrupo(vitorias), 0.0);
	}
	@Test
	public void testDefineGrupo2() 
	{
		List<String> vitorias = Arrays.asList("V", "V", "V", "V", "P", "P" );
		Assert.assertEquals(2, Programa.defineGrupo(vitorias), 0.0);
	}
	@Test
	public void testDefineGrupo3() 
	{
		List<String> vitorias = Arrays.asList("V", "V", "P", "P", "P", "P" );
		Assert.assertEquals(3, Programa.defineGrupo(vitorias), 0.0);
	}
	@Test
	public void testSemGrupo() 
	{
		List<String> vitorias = Arrays.asList("P", "P", "P", "P", "P", "P" );
		Assert.assertEquals(-1, Programa.defineGrupo(vitorias), 0.0);
	}

}







//import model.Conversor;
//public class ConversorTest {

	//@Test
	//public void testC2F() {
		//Conversor conversor = new Conversor();
		//Assert.assertEquals(33.8, conversor.c2f(1.0), 0.0);
	//}
	
//	@Test
	//public void testF2C() {
		//Conversor conversor = new Conversor();
		//Assert.assertEquals(-12.222, conversor.f2f(10.0), 0.1);
	//}
//}
