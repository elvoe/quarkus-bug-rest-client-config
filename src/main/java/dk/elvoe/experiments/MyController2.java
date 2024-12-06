package dk.elvoe.experiments;

import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;

@Path("/hello2")
public class MyController2 {

  @GET
  public String get() {
    return "2";
  }
}
