## Java client for JCDecaux Open Data

This project is a simple client library for JC Decaux Open Data. In order to use this API, you need to get a key at http://developer.jcdecaux.com.

## Get it

JCD Open Data Client is available in Maven Central repository.

```xml
<dependency>
    <groupId>com.jcdecaux.opendata</groupId>
    <artifactId>opendata-client</artifactId>
    <version>1.1.0</version>
</dependency>
```

## Features

>Note: The client is thread-safe.

### Bike sharing system

```java
// ...
import static com.jcdecaux.opendata.client.vls.v1.VLSClient.vlsClient;

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

We will update this client according to updates to our Opendata API

## License

This software is licenced under the Apache Software License v2.0, you can find it in the LICENCE file.
