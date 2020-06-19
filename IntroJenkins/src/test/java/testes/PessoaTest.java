/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package testes;

import com.mycompany.introjenkins.Pessoa;
import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;

/**
 *
 * @author victo
 */
public class PessoaTest {
    
    Pessoa p;
    
    @Before
    public void init(){
        p = new Pessoa();
    }
    
    @Test
    public void deveriaValidarNomePessoa(){
        p.setNome("José");
        assertTrue(p.getNome().length() > 1);
    }
    
    @Test
    public void deveriaValidarCPF(){
        p.setCpf("12345678901");
        assertEquals(11, p.getCpf().length());
        
    }
    
    
}
