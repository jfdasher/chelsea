package ut.com.thermopylae.jira.chelsea;

import org.junit.Test;
import com.thermopylae.jira.chelsea.MyPluginComponent;
import com.thermopylae.jira.chelsea.MyPluginComponentImpl;

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