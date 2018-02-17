package br.com.inmetrics.calculadora;

import org.junit.Test;

import junit.framework.Assert;
public class CalculoTest {
	
	Operacoes operacoes = new Operacoes();
	
	@Before
	public void header() {
		System.out.println("Calculadora Inmetrics");
	}
	@Test(timeout = 300)
	public void calcular() throws InterruptedException {
		double a = 3.0; 
		double b = 4.0;
		
		Thread.sleep(200);
		
		double resultado = opracoes.somar(a, b);
		
		System.out.println("Operacão: " + a + " + " + b + "=" + resultado");
		Assert.assertEquals(7.0,  resultado, 0);
	}
	
	@After
	public void finalize() {
		System.out.println("Essa calculadora foi criada por especialista");
	}
	
}
	

 

    