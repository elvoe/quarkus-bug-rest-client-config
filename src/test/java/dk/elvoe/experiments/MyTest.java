package dk.elvoe.experiments;

import static org.junit.jupiter.api.Assertions.assertEquals;

import io.quarkus.test.junit.QuarkusTest;
import jakarta.inject.Inject;
import org.eclipse.microprofile.rest.client.inject.RestClient;
import org.junit.jupiter.api.Test;

@QuarkusTest
class MyTest {

  @Inject
  @RestClient
  dk.elvoe.experiments.client1.MyClient myClient1;

  @Inject
  @RestClient
  dk.elvoe.experiments.client2.MyClient myClient2;

  @Test
  void test() {
    assertEquals("1", myClient1.get());
    assertEquals("2", myClient2.get());
  }
}
