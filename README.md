## Java client for JCDecaux Open Data

This project is a simple client library for JC Decaux Open Data. In order to use this API, you need to get a key at http://developer.jcdecaux.com.

## Features

>Note: The client is thread-safe.

### Bike sharing system

```java
import static fr.bluepyth.opendata.jcdecaux.client.vls.v1.VLSCLient.vlsClient;

public class MyClass {

  private static final String myApiKey = "xxxxx";

  public void myMethod() {
    // Get all stations
    List<StationDTO> stations = vlsClient.getStations(apiKey, null);

    // Get all contracts
    List<ContractDTO> contracts = vlsClient.getContracts(apiKey);

    // Get all stations for one contract (Paris)
    List<StationDTO> stationsOfParis = vlsClient.getStations(apiKey, "Paris");

    // Get one station of Paris
    StationsDTO stationOfParis = vlsClient.getStation(apiKey, "Paris", "35010");
  }

}
```

## Roadmap

I intend to follow JC Decaux API evolutions and to include all their APIs in this library.

## License

Copyright Romain Sertelon 2013

This software is licenced under the Apache Software License v2.0, you can find it in the LICENCE file.