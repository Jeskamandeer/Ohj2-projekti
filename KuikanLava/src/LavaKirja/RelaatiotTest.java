package LavaKirja;
// Generated by ComTest BEGIN
import java.io.File;
import java.util.List;
import java.util.Iterator;
import java.util.*;
import static org.junit.Assert.*;
import org.junit.*;
import LavaKirja.*;
// Generated by ComTest END
import kanta.SailoException;

/**
 * Test class made by ComTest
 * @version 2017.07.28 15:23:40 // Generated by ComTest
 *
 */
public class RelaatiotTest {



  // Generated by ComTest BEGIN
  /** 
   * testLueTiedostosta53 
   * @throws SailoException when error
   */
  @Test
  public void testLueTiedostosta53() throws SailoException {    // Relaatiot: 53
    Relaatiot relaatiot = new Relaatiot(); 
    String tiedNimi = "testiRelaatio"; 
    File ftied = new File(tiedNimi+".dat"); 
    ftied.delete(); 
    try {
    relaatiot.lueTiedostosta(tiedNimi); 
    fail("Relaatiot: 62 Did not throw SailoException");
    } catch(SailoException _e_){ _e_.getMessage(); }
    relaatiot.lisaa(1, 1); 
    relaatiot.lisaa(1, 2); 
    relaatiot.lisaa(1, 3); 
    relaatiot.lisaa(1, 4); 
    relaatiot.lisaa(1, 5); 
    relaatiot.tallenna(); 
    relaatiot = new Relaatiot(); 
    relaatiot.lueTiedostosta(tiedNimi); 
    Iterator<Relaatio> i = relaatiot.iterator(); 
    assertEquals("From: Relaatiot line: 72", true, i.hasNext()); 
    relaatiot.lisaa(1, 6); 
    relaatiot.tallenna(); 
    assertEquals("From: Relaatiot line: 75", true, ftied.delete()); 
    File fbak = new File(tiedNimi+".bak"); 
    assertEquals("From: Relaatiot line: 77", true, fbak.delete()); 
  } // Generated by ComTest END


  // Generated by ComTest BEGIN
  /** testAnnaRelaatio177 */
  @Test
  public void testAnnaRelaatio177() {    // Relaatiot: 177
    Relaatiot relaatiot = new Relaatiot(); 
    relaatiot.lisaa(1, 1); 
    relaatiot.lisaa(1, 2); 
    relaatiot.lisaa(1, 3); 
    relaatiot.lisaa(1, 4); 
    relaatiot.lisaa(1, 5); 
    List<Relaatio> loytyneet; 
    loytyneet = relaatiot.annaRelaatio(1); 
    assertEquals("From: Relaatiot line: 189", 1, loytyneet.size()); 
    loytyneet = relaatiot.annaRelaatio(2); 
    assertEquals("From: Relaatiot line: 191", 1, loytyneet.size()); 
    loytyneet = relaatiot.annaRelaatio(5); 
    assertEquals("From: Relaatiot line: 193", 1, loytyneet.size()); 
  } // Generated by ComTest END
}