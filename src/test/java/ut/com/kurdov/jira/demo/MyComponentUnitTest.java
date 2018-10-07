package ut.com.kurdov.jira.demo;

import org.junit.Test;
import com.kurdov.jira.demo.api.MyPluginComponent;
import com.kurdov.jira.demo.impl.MyPluginComponentImpl;

import static org.junit.Assert.assertEquals;

public class MyComponentUnitTest
{
    @Test
    public void testMyName()
    {
        MyPluginComponent component = new MyPluginComponentImpl(null);
        assertEquals("names do not match!", "myComponent",component.getName());
    }
}