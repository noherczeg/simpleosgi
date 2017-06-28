# Simple OSGi

## Install

### Build
```
mvn clean install
```

### Deploy
```
karaf clean debug
```

In Karaf console:
```
install mvn:hu.noherczeg/hu.noherczeg.simpleosgi.api/1.0.0-SNAPSHOT
install mvn:hu.noherczeg/hu.noherczeg.simpleosgi.service/1.0.0-SNAPSHOT
```