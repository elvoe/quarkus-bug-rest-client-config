package dk.elvoe.experiments;

import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;

@Path("/hello1")
public class MyController1 {

  @GET
  public String get() {
    return "1";
  }
}
