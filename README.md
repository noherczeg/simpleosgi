# Simple OSGi

## Build
```
mvn clean install
```

## Start Karaf
```
karaf clean debug
```

Optionally you can install the webconsole feature which gives a nice admin 
panel where you can check and manage bundles and features.

```
feature:install webconsole
```

The web console is available by default at `http://localhost:8181/system/console`. 
The default username and password is `karaf`.

## Deployment

The Declarative Services annotations require an implementation to work. Therefore
we need to install one. The standard is `scr`.

```
feature:install scr
```

Then we need to register the repository/repositories to our features:
```
feature:repo-add mvn:hu.noherczeg/hu.noherczeg.simpleosgi.api/1.0.0-SNAPSHOT/xml/features
feature:repo-add mvn:hu.noherczeg/hu.noherczeg.simpleosgi.service/1.0.0-SNAPSHOT/xml/features
```

Lastly we can install said features:

```
feature:install noherczeg-simpleosgi-api
feature:install noherczeg-simpleosgi-service
```

## Further reading

- [Karaf Container](http://karaf.apache.org/manual/latest/)