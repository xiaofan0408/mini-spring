package my;

import my.beans.BeanDefinition;
import my.beans.factory.BeanFactory;
import my.beans.factory.support.DefaultBeanFactory;
import my.service.PetStoreService;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class BeanFactoryTest {




    @Test
    public void testGetBean() {
        BeanFactory factory = new DefaultBeanFactory("petstore-v1.xml");
        BeanDefinition bd = factory.getBeanDefinition("petStore");
        Assert.assertEquals("my.service.PetStoreService",bd.getBeanClassName());
        PetStoreService petStoreService = (PetStoreService)factory.getBean("petStore");
        Assert.assertNotNull(petStoreService);
    }

}
