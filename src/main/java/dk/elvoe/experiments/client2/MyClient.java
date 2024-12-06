package dk.elvoe.experiments.client2;

import jakarta.ws.rs.GET;
import org.eclipse.microprofile.rest.client.inject.RegisterRestClient;

@RegisterRestClient(configKey = "myConfig2")
public interface MyClient {

  @GET
  String get();

}
