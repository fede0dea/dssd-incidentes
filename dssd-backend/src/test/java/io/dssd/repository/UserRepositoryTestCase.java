package io.dssd.repository;

import junit.framework.TestCase;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.transaction.TransactionConfiguration;

import static org.junit.Assert.*;

@RunWith(SpringJUnit4ClassRunner.class)
//@ContextConfiguration(locations = "classpath:applicationContext.xml")
//@TransactionConfiguration(defaultRollback = true, transactionManager = "transactionManager")
public class UserRepositoryTestCase extends TestCase {

    @Test
    public void getById() throws Exception {
        Assert.assertTrue(true);
    }

}