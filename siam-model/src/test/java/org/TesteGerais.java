package org;

import junit.framework.Assert;
import org.apache.commons.lang3.StringUtils;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;

import java.text.ParseException;

/**
 * Created by admin on 31/05/14.
 */
public class TesteGerais {

    /*
     Para cada vez que não lembremeos do comportamento de algum comando
     Vai ser melhor fazer aqui, para que não comprometa outros testes.
    */

    @BeforeClass
    public static void beforeTestesGerais()
    {
    }

    @AfterClass
    public static void afterTestesGerais()
    {
    }


    @Test
    public void stringUtilsTest() throws ParseException {

        System.out.println( "\n\tComportamento do comando StringUtils.isEmpty(?)"
                            +"\n\t===============================================") ;
        System.out.println( "\tStringUtils.isEmpty(null) ..... : " + StringUtils.isEmpty(null) ) ;
        System.out.println( "\tStringUtils.isEmpty(\"\") ....... : " + StringUtils.isEmpty("") ) ;
        System.out.println( "\tStringUtils.isEmpty(\" \".trim()) : " + StringUtils.isEmpty(" ".trim()) ) ;
        System.out.println( "\n\tStringUtils.isEmpty(\" \") ...... : " + StringUtils.isEmpty(" ") ) ;
        System.out.println( "\tStringUtils.isEmpty(\"bob\") .... : " + StringUtils.isEmpty("bob") ) ;
        System.out.println( "\tStringUtils.isEmpty(\" bob \") .. : " + StringUtils.isEmpty(" bob ") ) ;

        Assert.assertTrue("Somente para testar StringUtils !", true);
    }

}
