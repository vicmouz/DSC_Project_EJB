/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package softwarecorporativo.ejb.test;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;

/**
 *
 * @author marcos
 */
@RunWith(Suite.class)
@Suite.SuiteClasses({AdministradorTest.class, ClienteTest.class, CorProdutoTest.class,
EnderecoTest.class, ImagemProdutoTest.class, PedidoTest.class, ProdutoTest.class,
TamanhoProdutoTest.class, TipoProdutoTest.class})
public class TestSuite {

    @BeforeClass
    public static void setUpClass() throws Exception {
    }

    @AfterClass
    public static void tearDownClass() throws Exception {
    }

    @Before
    public void setUp() throws Exception {
    }

    @After
    public void tearDown() throws Exception {
    }
    
}
