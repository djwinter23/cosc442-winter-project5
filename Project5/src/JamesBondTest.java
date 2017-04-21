import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class JamesBondTest {

	private JamesBond bond;
	@Before
	public void setUp() throws Exception {
		bond = new JamesBond();
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void testCase0(){
		assertFalse(bond.bondRegex("( ( )"));
		}
	
	@Test
	public void testCase1(){
		assertTrue(bond.bondRegex("( ( 0 0 7 )"));
		}
	
	@Test
	public void testCase2(){
		assertFalse(bond.bondRegex("( ( 0 7 )"));
		}
	
	@Test
	public void testCase3(){
		assertFalse(bond.bondRegex("( ( 7 )"));
		}
	
	@Test
	public void testCase4(){
		assertFalse(bond.bondRegex("( )"));
		}
	
	@Test
	public void testCase5(){
		assertFalse(bond.bondRegex("( ) )"));
		}
	
	@Test
	public void testCase6(){
		assertTrue(bond.bondRegex("( ) 0 0 7 )"));
		}
	
	@Test
	public void testCase7(){
		assertFalse(bond.bondRegex("( ) 0 7 )"));
		}
	
	@Test
	public void testCase8(){
		assertFalse(bond.bondRegex("( ) 7 )"));
		}
	
	@Test
	public void testCase9(){
		assertFalse(bond.bondRegex("( 0 ( )"));
		}
	
	@Test
	public void testCase10(){
		assertTrue(bond.bondRegex("( 0 ( 0 0 7 )"));
		}
	
	@Test
	public void testCase11(){
		assertFalse(bond.bondRegex("( 0 ( 0 7 )"));
		}
	
	@Test
	public void testCase12(){
		assertFalse(bond.bondRegex("( 0 ( 7 )"));
		}
	
	@Test
	public void testCase13(){
		assertFalse(bond.bondRegex("( 0 )"));
		}
	
	@Test
	public void testCase14(){
		assertFalse(bond.bondRegex("( 0 ) )"));
		}
	
	@Test
	public void testCase15(){
		assertTrue(bond.bondRegex("( 0 ) 0 0 7 )"));
		}
	
	@Test
	public void testCase16(){
		assertFalse(bond.bondRegex("( 0 ) 0 7 )"));
		}
	
	@Test
	public void testCase17(){
		assertFalse(bond.bondRegex("( 0 ) 7 )"));
		}
	
	@Test
	public void testCase18(){
		assertFalse(bond.bondRegex("( 0 0 ( )"));
		}
	
	@Test
	public void testCase19(){
		assertTrue(bond.bondRegex("( 0 0 ( 0 0 7 )"));
		}

	@Test
	public void testCase20(){
		assertFalse(bond.bondRegex("( 0 0 ( 0 7 )"));
		}
	
	@Test
	public void testCase21(){
		assertFalse(bond.bondRegex("( 0 0 ( 7 )" ));
		}
	
	@Test
	public void testCase22(){
		assertFalse(bond.bondRegex("( 0 0 )"));
		}
	
	@Test
	public void testCase23(){
		assertFalse(bond.bondRegex("( 0 0 ) )"));
		}
	
	@Test
	public void testCase24(){
		assertTrue(bond.bondRegex("( 0 0 ) 0 0 7 )"));
		}
	
	@Test
	public void testCase25(){
		assertFalse(bond.bondRegex("( 0 0 ) 0 7 )"));
		}
	
	@Test
	public void testCase26(){
		assertFalse(bond.bondRegex("( 0 0 ) 7 )"));
		}
	
	@Test
	public void testCase27(){
		assertFalse(bond.bondRegex( "( 0 0 0 )" ));
		}
	
	@Test
	public void testCase28(){
		assertTrue(bond.bondRegex("( 0 0 0 0 0 7 )"));
		}
	
	@Test
	public void testCase29(){
		assertTrue(bond.bondRegex("( 0 0 0 0 7 )"));
		}
	
	@Test
	public void testCase30(){
		assertTrue(bond.bondRegex("( 0 0 0 7 )"));
		}
	
	@Test
	public void testCase31(){
		assertFalse(bond.bondRegex("( 0 0 1 )"));
		}
	
	@Test
	public void testCase32(){
		assertTrue(bond.bondRegex("( 0 0 1 0 0 7 )"));
		}
	
	@Test
	public void testCase33(){
		assertFalse(bond.bondRegex("( 0 0 1 0 7 )"));
		}
	
	@Test
	public void testCase34(){
		assertFalse(bond.bondRegex("( 0 0 1 7 )"));
		}
	
	@Test
	public void testCase35(){
		assertFalse(bond.bondRegex("( 0 0 2 )"));
		}
	
	@Test
	public void testCase36(){
		assertTrue(bond.bondRegex("( 0 0 2 0 0 7 )"));
		}
	
	@Test
	public void testCase37(){
		assertFalse(bond.bondRegex("( 0 0 2 0 7 )"));
		}
	
	@Test
	public void testCase38(){
		assertFalse(bond.bondRegex("( 0 0 2 7 )"));
		}
	
	@Test
	public void testCase39(){
		assertFalse(bond.bondRegex("( 0 0 3 )"));
		}
	
	@Test
	public void testCase40(){
		assertTrue(bond.bondRegex("( 0 0 3 0 0 7 )"));
		}
	
	@Test
	public void testCase41(){
		assertFalse(bond.bondRegex("( 0 0 3 0 7 )"));
		}
	
	@Test
	public void testCase42(){
		assertFalse(bond.bondRegex("( 0 0 3 7 )"));
		}
	
	@Test
	public void testCase43(){
		assertFalse(bond.bondRegex("( 0 0 4 )"));
		}
	
	@Test
	public void testCase44(){
		assertTrue(bond.bondRegex("( 0 0 4 0 0 7 )"));
		}
	
	@Test
	public void testCase45(){
		assertFalse(bond.bondRegex("( 0 0 4 0 7 )"));
		}
	
	@Test
	public void testCase46(){
		assertFalse(bond.bondRegex("( 0 0 4 7 )"));
		}
	
	@Test
	public void testCase47(){
		assertFalse(bond.bondRegex("( 0 0 5 )"));
		}
	
	@Test
	public void testCase48(){
		assertTrue(bond.bondRegex("( 0 0 5 0 0 7 )"));
		}
	
	@Test
	public void testCase49(){
		assertFalse(bond.bondRegex("( 0 0 5 0 7 )"));
		}
	
	@Test
	public void testCase50(){
		assertFalse(bond.bondRegex("( 0 0 5 7 )"));
		}
	
	@Test
	public void testCase51(){
		assertFalse(bond.bondRegex("( 0 0 6 )"));
		}
	
	@Test
	public void testCase52(){
		assertTrue(bond.bondRegex("( 0 0 6 0 0 7 )"));
		}
	
	@Test
	public void testCase53(){
		assertFalse(bond.bondRegex("( 0 0 6 0 7 )"));
		}
	
	@Test
	public void testCase54(){
		assertFalse(bond.bondRegex("( 0 0 6 7 )"));
		}
	
	@Test
	public void testCase55(){
		assertTrue(bond.bondRegex("( 0 0 7 ( )"));
		}
	
	@Test
	public void testCase56(){
		assertTrue(bond.bondRegex("( 0 0 7 ( 0 0 7 )"));
		}
	
	@Test
	public void testCase57(){
		assertTrue(bond.bondRegex("( 0 0 7 ( 0 7 )"));
		}
	
	@Test
	public void testCase58(){
		assertTrue(bond.bondRegex("( 0 0 7 ( 7 )"));
		}
	
	@Test
	public void testCase59(){
		assertTrue(bond.bondRegex("( 0 0 7 )"));
		}
	
	@Test
	public void testCase60(){
		assertTrue(bond.bondRegex("( 0 0 7 ) ( )"));
		}
	
	@Test
	public void testCase61(){
		assertTrue(bond.bondRegex("( 0 0 7 ) ( 0 0 7 )"));
		}
	
	@Test
	public void testCase62(){
		assertTrue(bond.bondRegex("( 0 0 7 ) ( 0 7 )"));
		}
	
	@Test
	public void testCase63(){
		assertTrue(bond.bondRegex("( 0 0 7 ) ( 7 )"));
		}
	
	@Test
		public void testCase64(){
		assertTrue(bond.bondRegex("( 0 0 7 ) )"));
		}
	
	@Test
	public void testCase65(){
		assertTrue(bond.bondRegex("( 0 0 7 ) ) )"));
		}
	
	@Test
	public void testCase66(){
		assertTrue(bond.bondRegex("( 0 0 7 ) ) 0 0 7 )"));
		}
	
	@Test
	public void testCase67(){
		assertTrue(bond.bondRegex("( 0 0 7 ) ) 0 7 )"));
		}
	
	@Test
	public void testCase68(){
		assertTrue(bond.bondRegex("( 0 0 7 ) ) 7 )"));
		}
	
	@Test
	public void testCase69(){
		assertTrue(bond.bondRegex("( 0 0 7 ) 0 )"));
		}
	
	@Test
		public void testCase70(){
		assertTrue(bond.bondRegex("( 0 0 7 ) 0 0 0 7 )"));
		}
	
	@Test
	public void testCase71(){
		assertTrue(bond.bondRegex("( 0 0 7 ) 0 0 7 )"));
		}
	
	@Test
	public void testCase72(){
		assertTrue(bond.bondRegex("( 0 0 7 ) 0 7 )"));
		}
	
	@Test
	public void testCase73(){
		assertTrue(bond.bondRegex("( 0 0 7 ) 1 )"));
		}
	
	@Test
	public void testCase74(){
		assertTrue(bond.bondRegex("( 0 0 7 ) 1 0 0 7 )"));
		}
	
	@Test
	public void testCase75(){
		assertTrue(bond.bondRegex("( 0 0 7 ) 1 0 7 )"));
		}
	
	@Test
	public void testCase76(){
		assertTrue(bond.bondRegex("( 0 0 7 ) 1 7 )"));
		}
	
	@Test
	public void testCase77(){
		assertTrue(bond.bondRegex("( 0 0 7 ) 2 )"));
		}
	
	@Test
	public void testCase78(){
		assertTrue(bond.bondRegex("( 0 0 7 ) 2 0 0 7 )"));
		}
	
	@Test
	public void testCase79(){
		assertTrue(bond.bondRegex("( 0 0 7 ) 2 0 7 )"));
		}
	
	@Test
	public void testCase80(){
		assertTrue(bond.bondRegex("( 0 0 7 ) 2 7 )"));
		}
	
	@Test
	public void testCase81(){
		assertTrue(bond.bondRegex("( 0 0 7 ) 3 )"));
		}
	
	@Test
	public void testCase82(){
		assertTrue(bond.bondRegex("( 0 0 7 ) 3 0 0 7 )"));
		}
	
	@Test
	public void testCase83(){
		assertTrue(bond.bondRegex("( 0 0 7 ) 3 0 7 )"));
		}
	
	@Test
	public void testCase84(){
		assertTrue(bond.bondRegex("( 0 0 7 ) 3 7 )"));
		}
	
	@Test
		public void testCase85(){
		assertTrue(bond.bondRegex("( 0 0 7 ) 4 )"));
		}
	
	@Test
	public void testCase86(){
		assertTrue(bond.bondRegex("( 0 0 7 ) 4 0 0 7 )"));
		}
	
	@Test
		public void testCase87(){
		assertTrue(bond.bondRegex("( 0 0 7 ) 4 0 7 )"));
		}
	
	@Test
	public void testCase88(){
		assertTrue(bond.bondRegex("( 0 0 7 ) 4 7 )"));
		}
	
	@Test
		public void testCase89(){
		assertTrue(bond.bondRegex("( 0 0 7 ) 5 )"));
		}
	
	@Test
	public void testCase90(){
		assertTrue(bond.bondRegex("( 0 0 7 ) 5 0 0 7 )"));
		}
	
	@Test
	public void testCase91(){
		assertTrue(bond.bondRegex("( 0 0 7 ) 5 0 7 )"));
		}
	
	@Test
	public void testCase92(){
		assertTrue(bond.bondRegex("( 0 0 7 ) 5 7 )"));
		}
	
	@Test
		public void testCase93(){
		assertTrue(bond.bondRegex("( 0 0 7 ) 6 )"));
		}
	
	@Test
	public void testCase94(){
		assertTrue(bond.bondRegex("( 0 0 7 ) 6 0 0 7 )"));
		}
	
	@Test
		public void testCase95(){
		assertTrue(bond.bondRegex("( 0 0 7 ) 6 0 7 )"));
		}
	
	@Test
	public void testCase96(){
		assertTrue(bond.bondRegex("( 0 0 7 ) 6 7 )"));
		}
	
	@Test
	public void testCase97(){
		assertTrue(bond.bondRegex("( 0 0 7 ) 7 )"));
		}
	
	@Test
	public void testCase98(){
		assertTrue(bond.bondRegex("( 0 0 7 ) 7 0 0 7 )"));
		}
	
	@Test
	public void testCase99(){
		assertTrue(bond.bondRegex("( 0 0 7 ) 7 0 7 )"));
		}
	
	@Test
	public void testCase100(){
		assertTrue(bond.bondRegex("( 0 0 7 ) 7 7 )"));
		}
	
	@Test
	public void testCase101(){
		assertTrue(bond.bondRegex("( 0 0 7 ) 8 )"));
		}
	
	@Test
	public void testCase102(){
		assertTrue(bond.bondRegex("( 0 0 7 ) 8 0 0 7 )"));
		}
	
	@Test
	public void testCase103(){
		assertTrue(bond.bondRegex("( 0 0 7 ) 8 0 7 )"));
		}
	
	@Test
	public void testCase104(){
		assertTrue(bond.bondRegex("( 0 0 7 ) 8 7 )"));
		}
	
	@Test
	public void testCase105(){
		assertTrue(bond.bondRegex("( 0 0 7 ) 9 )"));
		}
	
	@Test
	public void testCase106(){
		assertTrue(bond.bondRegex("( 0 0 7 ) 9 0 0 7 )"));
		}
	
	@Test
	public void testCase107(){
		assertTrue(bond.bondRegex("( 0 0 7 ) 9 0 7 )"));
		}
	
	@Test
	public void testCase108(){
		assertTrue(bond.bondRegex("( 0 0 7 ) 9 7 )"));
		}
	
	@Test
	public void testCase109(){
		assertTrue(bond.bondRegex("( 0 0 7 0 )"));
		}
	
	@Test
	public void testCase110(){
		assertTrue(bond.bondRegex("( 0 0 7 0 0 0 7 )"));
		}
	
	@Test
	public void testCase111(){
		assertTrue(bond.bondRegex("( 0 0 7 0 0 7 )"));
		}
	
	@Test
	public void testCase112(){
		assertTrue(bond.bondRegex("( 0 0 7 0 7 )"));
		}
	
	@Test
	public void testCase113(){
		assertTrue(bond.bondRegex("( 0 0 7 1 )"));
		}
	
	@Test
	public void testCase114(){
		assertTrue(bond.bondRegex("( 0 0 7 1 0 0 7 )"));
		}
	
	@Test
	public void testCase115(){
		assertTrue(bond.bondRegex("( 0 0 7 1 0 7 )"));
		}
	
	@Test
	public void testCase116(){
		assertTrue(bond.bondRegex("( 0 0 7 1 7 )"));
		}
	
	@Test
	public void testCase117(){
		assertTrue(bond.bondRegex("( 0 0 7 2 )"));
		}
	
	@Test
	public void testCase118(){
		assertTrue(bond.bondRegex("( 0 0 7 2 0 0 7 )"));
		}
	
	@Test
	public void testCase119(){
		assertTrue(bond.bondRegex("( 0 0 7 2 0 7 )"));
		}
	
	@Test
	public void testCase120(){
		assertTrue(bond.bondRegex("( 0 0 7 2 7 )"));
		}
	
	@Test
	public void testCase121(){
		assertTrue(bond.bondRegex("( 0 0 7 3 )"));
		}
	
	@Test
	public void testCase122(){
		assertTrue(bond.bondRegex("( 0 0 7 3 0 0 7 )"));
		}
	
	@Test
	public void testCase123(){
		assertTrue(bond.bondRegex("( 0 0 7 3 0 7 )"));
		}
	
	@Test
	public void testCase124(){
		assertTrue(bond.bondRegex("( 0 0 7 3 7 )"));
		}
	
	@Test
	public void testCase125(){
		assertTrue(bond.bondRegex("( 0 0 7 4 )"));
		}
	
	@Test
	public void testCase126(){
		assertTrue(bond.bondRegex("( 0 0 7 4 0 0 7 )"));
		}
	
	@Test
	public void testCase127(){
		assertTrue(bond.bondRegex("( 0 0 7 4 0 7 )"));
		}
	
	@Test
	public void testCase128(){
		assertTrue(bond.bondRegex("( 0 0 7 4 7 )"));
		}
	
	@Test
	public void testCase129(){
		assertTrue(bond.bondRegex("( 0 0 7 5 )"));
		}
	
	@Test
	public void testCase130(){
		assertTrue(bond.bondRegex("( 0 0 7 5 0 0 7 )"));
		}
	
	@Test
	public void testCase131(){
		assertTrue(bond.bondRegex("( 0 0 7 5 0 7 )"));
		}
	
	@Test
	public void testCase132(){
		assertTrue(bond.bondRegex("( 0 0 7 5 7 )"));
		}
	
	@Test
	public void testCase133(){
		assertTrue(bond.bondRegex("( 0 0 7 6 )"));
		}
	
	@Test
	public void testCase134(){
		assertTrue(bond.bondRegex("( 0 0 7 6 0 0 7 )"));
		}
	
	@Test
	public void testCase135(){
		assertTrue(bond.bondRegex("( 0 0 7 6 0 7 )"));
		}
	
	@Test
	public void testCase136(){
		assertTrue(bond.bondRegex("( 0 0 7 6 7 )"));
		}
	
	@Test
	public void testCase137(){
		assertTrue(bond.bondRegex("( 0 0 7 7 )"));
		}
	
	@Test
	public void testCase138(){
		assertTrue(bond.bondRegex("( 0 0 7 7 0 0 7 )"));
		}
	
	@Test
	public void testCase139(){
		assertTrue(bond.bondRegex("( 0 0 7 7 0 7 )"));
		}
	
	@Test
	public void testCase140(){
		assertTrue(bond.bondRegex("( 0 0 7 7 7 )"));
		}
	
	@Test
	public void testCase141(){
		assertTrue(bond.bondRegex("( 0 0 7 8 )"));
		}
	
	@Test
	public void testCase142(){
		assertTrue(bond.bondRegex("( 0 0 7 8 0 0 7 )"));
		}
	
	@Test
	public void testCase143(){
		assertTrue(bond.bondRegex("( 0 0 7 8 0 7 )"));
		}
	
	@Test
	public void testCase144(){
		assertTrue(bond.bondRegex("( 0 0 7 8 7 )"));
		}
	
	@Test
	public void testCase145(){
		assertTrue(bond.bondRegex("( 0 0 7 9 )"));
		}
	
	@Test
	public void testCase146(){
		assertTrue(bond.bondRegex("( 0 0 7 9 0 0 7 )"));
		}
	
	@Test
	public void testCase147(){
		assertTrue(bond.bondRegex("( 0 0 7 9 0 7 )"));
		}
	
	@Test
	public void testCase148(){
		assertTrue(bond.bondRegex("( 0 0 7 9 7 )"));
		}
	
	@Test
	public void testCase149(){
		assertFalse(bond.bondRegex("( 0 0 8 )"));
		}
	
	@Test
	public void testCase150(){
		assertTrue(bond.bondRegex("( 0 0 8 0 0 7 )"));
		}
	
	@Test
	public void testCase151(){
		assertFalse(bond.bondRegex("( 0 0 8 0 7 )"));
		}
	
	@Test
	public void testCase152(){
		assertFalse(bond.bondRegex("( 0 0 8 7 )"));
		}
	
	@Test
	public void testCase153(){
		assertFalse(bond.bondRegex("( 0 0 9 )"));
		}
	
	@Test
	public void testCase154(){
		assertTrue(bond.bondRegex("( 0 0 9 0 0 7 )"));
		}
	
	@Test
	public void testCase155(){
		assertFalse(bond.bondRegex("( 0 0 9 0 7 )"));
		}
	
	@Test
	public void testCase156(){
		assertFalse(bond.bondRegex("( 0 0 9 7 )"));
		}
	
	@Test
	public void testCase157(){
		assertFalse(bond.bondRegex("( 0 1 )"));
		}
	
	@Test
	public void testCase158(){
		assertTrue(bond.bondRegex("( 0 1 0 0 7 )"));
		}
	
	@Test
	public void testCase159(){
		assertFalse(bond.bondRegex("( 0 1 0 7 )"));
		}
	
	@Test
	public void testCase160(){
		assertFalse(bond.bondRegex("( 0 1 7 )"));
		}
	
	@Test
	public void testCase161(){
		assertFalse(bond.bondRegex("( 0 2 )"));
		}
	
	@Test
	public void testCase162(){
		assertTrue(bond.bondRegex("( 0 2 0 0 7 )"));
		}
	
	@Test
	public void testCase163(){
		assertFalse(bond.bondRegex("( 0 2 0 7 )"));
		}
	
	@Test
	public void testCase164(){
		assertFalse(bond.bondRegex("( 0 2 7 )"));
		}
	
	@Test
	public void testCase165(){
		assertFalse(bond.bondRegex("( 0 3 )"));
		}
	
	@Test
	public void testCase166(){
		assertTrue(bond.bondRegex("( 0 3 0 0 7 )"));
		}
	
	@Test
	public void testCase167(){
		assertFalse(bond.bondRegex("( 0 3 0 7 )"));
		}
	
	@Test
	public void testCase168(){
		assertFalse(bond.bondRegex("( 0 3 7 )"));
		}
	
	@Test
	public void testCase169(){
		assertFalse(bond.bondRegex("( 0 4 )"));
		}
	
	@Test
	public void testCase170(){
		assertTrue(bond.bondRegex("( 0 4 0 0 7 )"));
		}
	
	@Test
	public void testCase171(){
		assertFalse(bond.bondRegex("( 0 4 0 7 )"));
		}
	
	@Test
	public void testCase172(){
		assertFalse(bond.bondRegex("( 0 4 7 )"));
		}
	
	@Test
	public void testCase173(){
		assertFalse(bond.bondRegex("( 0 5 )"));
		}
	
	@Test
	public void testCase174(){
		assertTrue(bond.bondRegex("( 0 5 0 0 7 )"));
		}
	
	@Test
	public void testCase175(){
		assertFalse(bond.bondRegex("( 0 5 0 7 )"));
		}
	
	@Test
	public void testCase176(){
		assertFalse(bond.bondRegex("( 0 5 7 )"));
		}
	
	@Test
	public void testCase177(){
		assertFalse(bond.bondRegex("( 0 6 )"));
		}
	
	@Test
	public void testCase178(){
		assertTrue(bond.bondRegex("( 0 6 0 0 7 )"));
		}
	
	@Test
	public void testCase179(){
		assertFalse(bond.bondRegex("( 0 6 0 7 )"));
		}
	
	@Test
		public void testCase180(){
		assertFalse(bond.bondRegex("( 0 6 7 )"));
		}
	
	@Test
	public void testCase181(){
		assertFalse(bond.bondRegex("( 0 7 )"));
		}
	
	@Test
	public void testCase182(){
		assertTrue(bond.bondRegex("( 0 7 0 0 7 )"));
		}
	
	@Test
	public void testCase183(){
		assertFalse(bond.bondRegex("( 0 7 0 7 )"));
		}
	
	@Test
	public void testCase184(){
		assertFalse(bond.bondRegex("( 0 7 7 )"));
		}
	
	@Test
	public void testCase185(){
		assertFalse(bond.bondRegex("( 0 8 )"));
		}
	
	@Test
	public void testCase186(){
		assertTrue(bond.bondRegex("( 0 8 0 0 7 )"));
		}
	
	@Test
	public void testCase187(){
		assertFalse(bond.bondRegex("( 0 8 0 7 )"));
		}
	
	@Test
	public void testCase188(){
		assertFalse(bond.bondRegex("( 0 8 7 )"));
		}
	
	@Test
	public void testCase189(){
		assertFalse(bond.bondRegex("( 0 9 )"));
		}
	
	@Test
	public void testCase190(){
		assertTrue(bond.bondRegex("( 0 9 0 0 7 )"));
		}
	
	@Test
	public void testCase191(){
		assertFalse(bond.bondRegex("( 0 9 0 7 )"));
		}
	
	@Test
	public void testCase192(){
		assertFalse(bond.bondRegex("( 0 9 7 )"));
		}
	
	@Test
	public void testCase193(){
		assertFalse(bond.bondRegex("( 1 )"));
		}
	
	@Test
	public void testCase194(){
		assertTrue(bond.bondRegex("( 1 0 0 7 )"));
		}
	
	@Test
	public void testCase195(){
		assertFalse(bond.bondRegex("( 1 0 7 )"));
		}
	
	@Test
	public void testCase196(){
		assertFalse(bond.bondRegex("( 1 7 )"));
		}
	
	@Test
	public void testCase197(){
		assertFalse(bond.bondRegex("( 2 )"));
		}
	
	@Test
	public void testCase198(){
		assertTrue(bond.bondRegex("( 2 0 0 7 )"));
		}
	
	@Test
	public void testCase199(){
		assertFalse(bond.bondRegex("( 2 0 7 )"));
		}
	
	@Test
	public void testCase200(){
		assertFalse(bond.bondRegex("( 2 7 )"));
		}
	
	@Test
	public void testCase201(){
		assertFalse(bond.bondRegex("( 3 )"));
		}
	
	@Test
	public void testCase202(){
		assertTrue(bond.bondRegex("( 3 0 0 7 )"));
		}
	
	@Test
	public void testCase203(){
		assertFalse(bond.bondRegex("( 3 0 7 )"));
		}
	
	@Test
	public void testCase204(){
		assertFalse(bond.bondRegex("( 3 7 )"));
		}
	
	@Test
	public void testCase205(){
		assertFalse(bond.bondRegex("( 4 )"));
		}
	
	@Test
	public void testCase206(){
		assertTrue(bond.bondRegex("( 4 0 0 7 )"));
		}
	
	@Test
	public void testCase207(){
		assertFalse(bond.bondRegex("( 4 0 7 )"));
		}
	
	@Test
	public void testCase208(){
		assertFalse(bond.bondRegex("( 4 7 )"));
		}
	
	@Test
	public void testCase209(){
		assertFalse(bond.bondRegex("( 5 )"));
		}
	
	@Test
	public void testCase210(){
		assertTrue(bond.bondRegex("( 5 0 0 7 )"));
		}
	
	@Test
	public void testCase211(){
		assertFalse(bond.bondRegex("( 5 0 7 )"));
		}
	
	@Test
	public void testCase212(){
		assertFalse(bond.bondRegex("( 5 7 )"));
		}
	
	@Test
	public void testCase213(){
		assertFalse(bond.bondRegex("( 6 )"));
		}
	
	@Test
	public void testCase214(){
		assertTrue(bond.bondRegex("( 6 0 0 7 )"));
		}
	
	@Test
	public void testCase215(){
		assertFalse(bond.bondRegex("( 6 0 7 )"));
		}
	
	@Test
	public void testCase216(){
		assertFalse(bond.bondRegex("( 6 7 )"));
		}
	
	@Test
	public void testCase217(){
		assertFalse(bond.bondRegex("( 7 )"));
		}
	
	@Test 
	public void testCase218(){
	assertTrue(bond.bondRegex("( 7 0 0 7 )"));
	}
	
	@Test
	public void testCase219(){
	assertFalse(bond.bondRegex("( 7 0 7 )"));
	}
	

	@Test
	public void testCase220(){
		assertFalse(bond.bondRegex("( 7 7 )"));
	}
	@Test 
	public void testCase221(){
		assertFalse(bond.bondRegex("( 8 )"));
	}
	
	@Test
	public void testCase222(){
		assertTrue(bond.bondRegex("( 8 0 0 7 )"));
		}

	
	@Test
	public void testCase223(){
		assertFalse(bond.bondRegex("( 8 0 7 )"));
		}
	
	@Test
	public void testCase224(){
		assertFalse(bond.bondRegex("( 8 7 )"));
		}
	
	@Test
	public void testCase225(){
		assertFalse(bond.bondRegex("( 9 )"));
		}
	
	@Test
	public void testCase226(){
		assertTrue(bond.bondRegex("( 9 0 0 7 )"));
		}
	
	@Test
	public void testCase227(){
		assertFalse(bond.bondRegex("( 9 0 7 )"));
		}
	
	@Test
	public void testCase228(){
		assertFalse(bond.bondRegex("( 9 7 )"));
		}
	
	@Test
	public void testCase229(){
		assertFalse(bond.bondRegex(")"));
		}
	
	@Test
	public void testCase230(){
		assertFalse(bond.bondRegex(") )"));
		}
	
	@Test
	public void testCase231(){
		assertFalse(bond.bondRegex(") 0 0 7 )"));
		}
	
	@Test
	public void testCase232(){
		assertFalse(bond.bondRegex(") 0 7 )"));
		}
	
	@Test
	public void testCase233(){
		assertFalse(bond.bondRegex(") 7 )"));
		}
	
	@Test
	public void testCase234(){
		assertFalse(bond.bondRegex("0 )"));
		}
	
	@Test
	public void testCase235(){
		assertFalse(bond.bondRegex( "0 0 0 7 )" ));
		}
	
	@Test
	public void testCase236(){
		assertFalse(bond.bondRegex("0 0 7 )"));
		}
	
	@Test
	public void testCase237(){
		assertFalse(bond.bondRegex("0 7 )"));
		}
	
	@Test
	public void testCase238(){
		assertFalse(bond.bondRegex("1 )"));
		}
	
	@Test
	public void testCase239(){
		assertFalse(bond.bondRegex("1 0 0 7 )"));
		}
	
	@Test
	public void testCase240(){
		assertFalse(bond.bondRegex("1 0 7 )" ));
		}
	
	@Test
	public void testCase241(){
		assertFalse(bond.bondRegex("1 7 )"));
		}
	
	@Test
	public void testCase242(){
		assertFalse(bond.bondRegex("2 )"));
		}
	
	@Test
	public void testCase243(){
		assertFalse(bond.bondRegex("2 0 0 7 )"));
		}
	
	@Test
	public void testCase244(){
		assertFalse(bond.bondRegex("2 0 7 )"));
		}
	
	@Test
	public void testCase245(){
		assertFalse(bond.bondRegex("2 7 )"));
		}
	
	@Test
	public void testCase246(){
		assertFalse(bond.bondRegex("3 )"));
		}
	
	@Test
	public void testCase247(){
		assertFalse(bond.bondRegex("3 0 0 7 )"));
		}
	
	@Test
	public void testCase248(){
		assertFalse(bond.bondRegex("3 0 7 )"));
		}
	
	@Test
	public void testCase249(){
		assertFalse(bond.bondRegex("3 7 )"));
		}
	
	@Test
	public void testCase250(){
		assertFalse(bond.bondRegex("4 )"));
		}
	
	@Test
	public void testCase251(){
		assertFalse(bond.bondRegex("4 0 0 7 )"));
		}
	
	@Test
	public void testCase252(){
		assertFalse(bond.bondRegex("4 0 7 )"));
		}
	
	@Test
	public void testCase253(){
		assertFalse(bond.bondRegex("4 7 )"));
		}
	
	@Test
	public void testCase254(){
		assertFalse(bond.bondRegex("5 )"));
		}
	
	@Test
	public void testCase255(){
		assertFalse(bond.bondRegex("5 0 0 7 )"));
		}
	
	@Test
	public void testCase256(){
			assertFalse(bond.bondRegex("5 0 7 )"));
		}
	
	@Test
	public void testCase257(){
		assertFalse(bond.bondRegex("5 7 )"));
		}
	
	@Test
	public void testCase258(){
		assertFalse(bond.bondRegex("6 )"));
		}
	
	@Test
	public void testCase259(){
		assertFalse(bond.bondRegex("6 0 0 7 )"));
		}
	
	@Test
	public void testCase260(){
		assertFalse(bond.bondRegex("6 0 7 )"));
		}
	
	@Test
	public void testCase261(){
		assertFalse(bond.bondRegex("6 7 )"));
		}
		
	@Test
	public void testCase262(){
		assertFalse(bond.bondRegex("7 )"));
		}
	
	@Test
	public void testCase263(){
		assertFalse(bond.bondRegex("7 0 0 7 )"));
		}
	
	@Test
	public void testCase264(){
		assertFalse(bond.bondRegex("7 0 7 )"));
		}
	
	@Test
	public void testCase265(){
		assertFalse(bond.bondRegex("7 7 )"));
		}
	
	@Test
	public void testCase266(){
		assertFalse(bond.bondRegex("8 )"));
		}
	
	@Test
	public void testCase267(){
		assertFalse(bond.bondRegex("8 0 0 7 )"));
		}
	
	@Test
	public void testCase268(){
		assertFalse(bond.bondRegex("8 0 7 )"));
		}
	
	@Test
	public void testCase269(){
		assertFalse(bond.bondRegex("8 7 )"));
		}
	
	@Test
	public void testCase270(){
		assertFalse(bond.bondRegex("9 )"));
		}
	
	@Test
	public void testCase271(){
		assertFalse(bond.bondRegex("9 0 0 7 )"));
		}
	
	@Test
	public void testCase272(){
		assertFalse(bond.bondRegex("9 0 7 )"));
		}
	
	@Test
	public void testCase273(){
		assertFalse(bond.bondRegex("9 7 )"));
		}





}
