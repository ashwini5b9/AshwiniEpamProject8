package epamcom.tddAndJunit;

import org.junit.jupiter.api.BeforeEach;

import static org.junit.Assert.*;

import org.junit.Test;

public class TestingClass {	
	RemoveAsInFirstTwoChars remove;
	@BeforeEach
	public void setUp() {
		remove = new RemoveAsInFirstTwoChars();
	}
	@Test
	public void test0Char() {
		remove = new RemoveAsInFirstTwoChars();
	}
	@Test
	public void test1RemoveA() {
		assertEquals("", remove.removeCharA("A"));
	}
	
	@Test
	public void test1CharAAtFirst() {
		assertEquals("B", remove.removeCharA("B"));
	}
	@Test
	public void test2Chars2AChars() {
		assertEquals("", remove.removeCharA("AA"));
	}
	@Test
	public void test2CharsAFirst() {
		assertEquals("B", remove.removeCharA("AB"));
	}
	@Test
	public void test2CharsASecond() {
		assertEquals("B", remove.removeCharA("BA"));
	}
	@Test
	public void test4Chars2A() {
		assertEquals("CD", remove.removeCharA("AACD"));
	}
	
	@Test
	public void test4Chars1A() {
		assertEquals("BCD", remove.removeCharA("ABCD"));
	}
	
	@Test
	public void test4CharsASecond() {
		assertEquals("BCD", remove.removeCharA("BACD"));
	}
	
	@Test
	public void test4CharsNoAFirst() {
		assertEquals("BBAA", remove.removeCharA("BBAA"));
	}
	
	@Test
	public void test4CharsNoA() {
		assertEquals("BCDE", remove.removeCharA("BCDE"));
	}
	
	@Test
	public void testNChars() {
		assertEquals("BAADA", remove.removeCharA("AABAADA"));
	}
	
	@Test
	public void testNCharsAatPosition() {
		assertEquals("BCDABAAD", remove.removeCharA("BCDABAAD"));
	}
	
	@Test
	public void testNCharsOfAllACharacters() {
		assertEquals("AAAAAA", remove.removeCharA("AAAAAAAA"));
	}
}
