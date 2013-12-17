## Java client for JCDecaux Open Data

This project is a simple client library for JC Decaux Open Data. In order to use this API, you need to get a key at http://developer.jcdecaux.com.

## Get it

JCD Open Data Client is available in my maven repository (I'll apply for Maven Central deployment).

```xml
<!-- Repository -->
<repositories>
    <repository>
        <id>bluepyth</id>
        <name>BluePyth Repository</name>
        <url>http://repository.bluepyth.fr/content/groups/public</url>
    </repository>
</repositories>

<!-- Dependency -->
<dependency>
    <groupId>fr.bluepyth.opendata.jcdecaux</groupId>
    <artifactId>jcd-opendata-client</artifactId>
    <version>1.0.0</version>
</dependency>
```

## Features

>Note: The client is thread-safe.

### Bike sharing system

```java
import fr.bluepyth.opendata.jcdecaux.client.vls.v1.api.ContractDTO;
import fr.bluepyth.opendata.jcdecaux.client.vls.v1.api.StationDTO;

import java.util.List;

import static fr.bluepyth.opendata.jcdecaux.client.vls.v1.VLSClient.vlsClient;

public class MyClass {

  private static final String apiKey = "xxxxx";

  public void myMethod() {
    // Get all stations
    List<StationDTO> all = vlsClient.getStations(apiKey, null);

    // Get all contracts
    List<ContractDTO> c = vlsClient.getContracts(apiKey);

    // Get all stations for one contract (Paris)
    List<StationDTO> p = vlsClient.getStations(apiKey, "Paris");

    // Get one station of Paris
    StationDTO s = vlsClient.getStation(apiKey, "Paris", "35010");
  }

}
```

## Roadmap

I intend to follow JC Decaux API evolutions and to include all their APIs in this library.

## License

Copyright Romain Sertelon 2013

This software is licenced under the Apache Software License v2.0, you can find it in the LICENCE file.