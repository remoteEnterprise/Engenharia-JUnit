package testeunitario.test;

import static org.junit.Assert.*;

import org.junit.Test;

import testeunitario.model.Retangulo;

public class RetanguloTest {
	private Retangulo retangulo;
	
	public RetanguloTest() {
		this.retangulo = new Retangulo(10.0d, 15.0d);
	}
	
	@Test
	public void getArea() {
		assertEquals(150.0d, this.retangulo.getArea(), 0);
		assertNotEquals(100.0d, this.retangulo.getArea(), 0);
	}
	
	@Test
	public void getBase() {
		assertEquals(10.0d, this.retangulo.getBase(), 0);
		assertNotEquals(15.0d, this.retangulo.getBase(), 0);
	}
	@Test
	public void setBase() {
		this.retangulo.setBase(11.0d);
		assertEquals(11.0d, this.retangulo.getBase(), 0);
		assertNotEquals(16.0d, this.retangulo.getBase(), 0);
	}
	
	@Test
	public void setAltura() {
		this.retangulo.setAltura(16.0d);
		assertEquals(16.0d, this.retangulo.getAltura(), 0);
		assertNotEquals(15.0d, this.retangulo.getAltura(), 0);
	}
	
	@Test
	public void getAltura() {
		assertEquals(15.0d, this.retangulo.getAltura(), 0);
		assertNotEquals(10.0d, this.retangulo.getAltura(), 0);
	}
	
	@Test 
	public void equals() {
		Retangulo outro = new Retangulo(10.0d, 15.0d);
		assertEquals(outro, this.retangulo);
	}
}
