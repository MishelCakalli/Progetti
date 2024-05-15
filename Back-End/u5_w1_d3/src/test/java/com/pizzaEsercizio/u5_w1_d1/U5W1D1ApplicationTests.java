package com.pizzaEsercizio.u5_w1_d1;

import com.pizzaEsercizio.u5_w1_d1.bean.Ordine;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest
class U5W1D1ApplicationTests {
	private Ordine ordine;

	@Test
	public void testNumeroOrdine() {
		assertEquals(1, ordine.getTotalAmount());
	}

	@ParameterizedTest
	@ValueSource(ints = {2, 4, 6, 8})
	public void testNumeroCoperti(int numeroCoperti) {
		ordine.setOrderNumber(numeroCoperti);

	}
}
