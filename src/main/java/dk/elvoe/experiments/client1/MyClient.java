package dk.elvoe.experiments.client1;

import jakarta.ws.rs.GET;
import org.eclipse.microprofile.rest.client.inject.RegisterRestClient;

@RegisterRestClient(configKey = "myConfig1")
public interface MyClient {

  @GET
  String get();

}
