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
install mvn:com.vigilworks/com.vigilworks.simpleosgi.api/1.0.0-SNAPSHOT
install mvn:com.vigilworks/com.vigilworks.simpleosgi.service/1.0.0-SNAPSHOT
```