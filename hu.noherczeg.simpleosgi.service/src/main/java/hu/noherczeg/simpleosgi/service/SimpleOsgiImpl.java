package hu.noherczeg.simpleosgi.service;

import hu.noherczeg.simpleosgi.api.SimpleOsgi;
import org.apache.felix.scr.annotations.*;
import org.osgi.service.component.ComponentContext;

@Component(metatype = true, immediate = true)
@Service(SimpleOsgi.class)
@Properties(value = {
        @Property(name = "fooBar", value = "bar")
})
public class SimpleOsgiImpl implements SimpleOsgi {
    private String foo = "";

    public String helloOsgi() {
        return foo;
    }

    @Activate
    public void activate(ComponentContext context) {
        foo = (String)context.getProperties().get("fooBar");
        System.out.println(foo);
    }

    @Deactivate
    public void deactive() {
        System.out.println("Good Bye! :<");
    }
}
