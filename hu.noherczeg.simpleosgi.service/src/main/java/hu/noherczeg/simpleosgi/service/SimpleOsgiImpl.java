package hu.noherczeg.simpleosgi.service;

import hu.noherczeg.simpleosgi.api.SimpleOsgi;
import org.osgi.service.component.annotations.Activate;
import org.osgi.service.component.annotations.Component;
import org.osgi.service.component.annotations.Deactivate;
import org.osgi.service.metatype.annotations.AttributeDefinition;
import org.osgi.service.metatype.annotations.AttributeType;
import org.osgi.service.metatype.annotations.Designate;
import org.osgi.service.metatype.annotations.ObjectClassDefinition;

@Component(immediate = true)
@Designate(ocd = SimpleOsgiImpl.Config.class)
public class SimpleOsgiImpl implements SimpleOsgi {

    private static final String FOO_DEFAULT = "baz";
    private String foo;

    @ObjectClassDefinition
    public @interface Config {
        @AttributeDefinition(name = "Foo", description = "Foo description", type = AttributeType.STRING)
        String fooBar() default FOO_DEFAULT;
    }

    public String helloOsgi() {
        return foo;
    }

    @Activate
    void activate(final Config config) {
        foo = config.fooBar();
        System.out.println(foo);
    }

    @Deactivate
    void deactive() {
        System.out.println("Good Bye! :<");
    }

}
