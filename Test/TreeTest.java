import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Daniela Batz
 */
public class TreeTest {
    
    public TreeTest() {
    }
    
    @BeforeClass

    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of addNode method, of class BinaryTree.
     */
    @Test
    public void testAddNode() {
        System.out.println("addNode");
        Object key = null;
        Object value = null;
        BinaryTree instance = new BinaryTree();
        instance.addNode(key, value);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    private void fail(String string) {
		// TODO Auto-generated method stub
		
	}

	/**
     * Test of inOrTree method, of class BinaryTree.
     */
    @Test
    public void testInOrTree() {
        System.out.println("inOrTree");
        Node FNode = null;
        BinaryTree instance = new BinaryTree();
        instance.inOrTree(FNode);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of preOrTree method, of class BinaryTree.
     */
    @Test
    public void testPreOrTree() {
        System.out.println("preOrTree");
        Node FNode = null;
        BinaryTree instance = new BinaryTree();
        instance.preOrTree(FNode);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of posOrTree method, of class BinaryTree.
     */
    @Test
    public void testPosOrTree() {
        System.out.println("posOrTree");
        Node FNode = null;
        BinaryTree instance = new BinaryTree();
        instance.posOrTree(FNode);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of EnNode method, of class BinaryTree.
     */
    @Test
    public void testFindNode() {
        System.out.println("EnNode");
        Object key = null;
        BinaryTree instance = new BinaryTree();
        Node expResult = null;
        Node result = instance.EnNode(key);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    private void assertEquals(Node expResult, Node result) {
		// TODO Auto-generated method stub
		
	}

	/**
     * Test of findValue method, of class BinaryTree.
     */
    @Test
    public void testFindValue() {
        System.out.println("findValue");
        String key = "";
        BinaryTree instance = new BinaryTree();
        String expResult = "";
        String result = instance.findValue(key);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

	private void assertEquals(String expResult, String result) {
		// TODO Auto-generated method stub
		
	}
}