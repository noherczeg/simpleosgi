# Simple OSGi

## Install

### Build
```
mvn clean install
```

### Start Karaf
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

### Deploy as bundles

The service bundle requires `scr` to be installed

```
feature:install scr
```

Then we can install our bundles

```
install mvn:hu.noherczeg/hu.noherczeg.simpleosgi.api/1.0.0-SNAPSHOT
install mvn:hu.noherczeg/hu.noherczeg.simpleosgi.service/1.0.0-SNAPSHOT
```

### Deploy as features

Using the "feature" spec we do not need to manually install any dependencies 
because it's taken care of the features descriptors in the `features` folder 
of each module.

First we need to register the repository/repositories to our features:
```
feature:repo-add mvn:hu.noherczeg/hu.noherczeg.simpleosgi.api/1.0.0-SNAPSHOT/xml/features
feature:repo-add mvn:hu.noherczeg/hu.noherczeg.simpleosgi.service/1.0.0-SNAPSHOT/xml/features
```

Then we can install said features (with their configurations, and feature 
dependencies):

```
feature:install noherczeg-simpleosgi-api
feature:install noherczeg-simpleosgi-service
```

## Further reading

- [Karaf Container](http://karaf.apache.org/manual/latest/)