package kr.co.itcen.springcontainer.videosystem;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

import org.junit.Rule;
import org.junit.Test;
import org.junit.contrib.java.lang.system.SystemOutRule;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**
 * Explicit(명시적) Configuration - XML Config
 * @Bean
*/

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {"classpath:config/videosystem/VideoSystemConfig.xml"})
public class VideoSystemXmlConfigTest {
	@Rule
	public final SystemOutRule systemOutRule = new SystemOutRule().enableLog();
	
	@Autowired
	private Avengers dvd1;
	
	@Test
	public void testDVD1Null() {
		assertNotNull(dvd1);
	}
	
	@Autowired
	@Qualifier("ironMan")
	private IronMan dvd2;
	
	@Test
	public void testDVD2Null() {
		assertNotNull(dvd2);
	}
	
	@Autowired
	@Qualifier("avengersInfinityWar")
	private BlankDisc dvd3;
	
	@Test
	public void testDVD3Null() {
		assertNotNull(dvd3);
		System.out.println(dvd3);
		assertEquals("BlankDisc [title=Avengers Infinity War, studio=MARVEL, actors=null]", systemOutRule.getLog().replace("\r\n", "").replace("\n", ""));
	}
	
	@Autowired
	@Qualifier("avengersEndgame")
	private DisitalVideoDisc dvd4;
	
	@Test
	public void testDVD4Null() {
		assertNotNull(dvd4);
		System.out.println(dvd4);
		assertEquals("BlankDisc [title=Avengers Endgame, studio=MARVEL, actors=null]", systemOutRule.getLog().replace("\r\n", "").replace("\n", ""));
	}
	
	@Autowired
	@Qualifier("avengersAgeofUltron")
	private DisitalVideoDisc dvd5;
	
	@Test
	public void testDVD5Null() {
		assertNotNull(dvd5);
		System.out.println(dvd5);
		assertEquals("BlankDisc [title=Avengers Age of Ultron, studio=MARVEL, actors=null]", systemOutRule.getLog().replace("\r\n", "").replace("\n", ""));
	}
	
	@Autowired
	@Qualifier("captainAmerica")
	private DisitalVideoDisc dvd6;
	
	@Test
	public void testDVD6Null() {
		assertNotNull(dvd6);
		System.out.println(dvd6);
		assertEquals("BlankDisc [title=Captain America, studio=MARVEL, actors=null]", systemOutRule.getLog().replace("\r\n", "").replace("\n", ""));
	}
	
	@Autowired
	@Qualifier("avengersDirectorEdition")
	private DisitalVideoDisc dvd7;
	
	@Test
	public void testDVD7Null() {
		assertNotNull(dvd7);
		System.out.println(dvd7);
		assertEquals("BlankDisc [title=Avengers Director's Edition, studio=MARVEL, actors=[Chris Evans, Mark Ruffalo, Chris Hemsworth]]", systemOutRule.getLog().replace("\r\n", "").replace("\n", ""));
	}
	
	@Autowired
	@Qualifier("avengersExpansionPack")
	private DisitalVideoDisc dvd8;
	
	@Test
	public void testDVD8Null() {
		assertNotNull(dvd8);
		System.out.println(dvd8);
		assertEquals("BlankDisc [title=Avengers Expansion Pack, studio=MARVEL, actors=[Chris Evans, Mark Ruffalo, Chris Hemsworth]]", systemOutRule.getLog().replace("\r\n", "").replace("\n", ""));
	}
	
	@Autowired
	@Qualifier("avengersExpansionPack2")
	private DisitalVideoDisc dvd9;
	
	@Test
	public void testDVD9Null() {
		assertNotNull(dvd9);
		System.out.println(dvd9);
		assertEquals("BlankDisc [title=Avengers Expansion Pack2, studio=MARVEL, actors=[Chris Evans, Mark Ruffalo, Chris Hemsworth]]", systemOutRule.getLog().replace("\r\n", "").replace("\n", ""));
	}
	
	@Autowired
	@Qualifier("avengersTriplePack")
	private DVDPack dvdPack;
	
	@Test
	public void testDVDPackNull() {
		assertNotNull(dvdPack);
		System.out.println(dvdPack);
	}
	
	@Autowired
	@Qualifier("player1")
	private DVDPlayer player1;
	
	@Test
	public void testDVDPlayer1Null() {
		assertNotNull(player1);
	}
	
	@Test
	public void testDVD1Play() {
		player1.play();
		assertEquals("Playing Movie MARVEL's IronMan", systemOutRule.getLog().replace("\r\n", "").replace("\n", ""));
	}
	
	@Autowired
	@Qualifier("player2")
	private DVDPlayer player2;
	
	@Test
	public void testDVDPlayer2Null() {
		assertNotNull(player2);
	}
	
	@Test
	public void testDVD2Play() {
		player2.play();
		assertEquals("Playing Movie MARVEL's IronMan", systemOutRule.getLog().replace("\r\n", "").replace("\n", ""));
	}
	
	@Autowired
	@Qualifier("player3")
	private DVDPlayer player3;
	
	@Test
	public void testDVDPlayer3Null() {
		assertNotNull(player3);
	}
	
	@Test
	public void testDVD3Play() {
		player3.play();
		assertEquals("Playing Movie MARVEL's IronMan", systemOutRule.getLog().replace("\r\n", "").replace("\n", ""));
	}
	
	@Autowired
	@Qualifier("player4")
	private DVDPlayer player4;
	
	@Test
	public void testDVDPlayer4Null() {
		assertNotNull(player4);
	}
	
	@Test
	public void testDVD4Play() {
		player4.play();
		assertEquals("Playing Movie MARVEL's Avengers Director's Edition", systemOutRule.getLog().replace("\r\n", "").replace("\n", ""));
	}
	
	@Autowired
	@Qualifier("player5")
	private DVDPlayer player5;
	
	@Test
	public void testDVDPlayer5Null() {
		assertNotNull(player5);
	}
	
	@Test
	public void testDVD5Play() {
		player5.play();
		assertEquals("Playing Movie MARVEL's Captain America", systemOutRule.getLog().replace("\r\n", "").replace("\n", ""));
	}
	
}