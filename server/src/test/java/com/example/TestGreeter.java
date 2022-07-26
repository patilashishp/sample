package com.example;

import org.junit.Before;
import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.Matchers.greaterThan;
import static org.junit.Assert.assertThat;
import static org.junit.matchers.JUnitMatchers.containsString;

public class TestGreeter {

  private Greeter greeter;

  @Before
  public void setup() {
    greeter = new Greeter();
  }

  @Test
  public void greetShouldIncludeTheOneBeingGreeted() {
    String someone = "World";

    assertThat(greeter.greet(someone), containsString(someone));
  }

  @Test
  public void greetShouldIncludeGreetingPhrase() {
    String someone = "World";

    assertThat(greeter.greet(someone).length(), is(greaterThan(someone.length())));
  }
  
  @Test
  public void greetShouldIncludeTheOneBeingGreeted1() {
    String someone = "World";

    assertThat(greeter.greet(someone), containsString(someone));
  }

  @Test
  public void greetShouldIncludeGreetingPhrase1() {
    String someone = "World";

    assertThat(greeter.greet(someone).length(), is(greaterThan(someone.length())));
  }
  
  @Test
  public void greetShouldIncludeTheOneBeingGreeted2() {
    String someone = "World";

    assertThat(greeter.greet(someone), containsString(someone));
  }

  @Test
  public void greetShouldIncludeGreetingPhrase2() {
    String someone = "World";

    assertThat(greeter.greet(someone).length(), is(greaterThan(someone.length())));
  }
  
  @Test
  public void greetShouldIncludeTheOneBeingGreeted3() {
    String someone = "World";

    assertThat(greeter.greet(someone), containsString(someone));
  }

  @Test
  public void greetShouldIncludeGreetingPhrase3() {
    String someone = "World";

    assertThat(greeter.greet(someone).length(), is(greaterThan(someone.length())));
  }
  
  @Test
  public void greetShouldIncludeTheOneBeingGreeted4() {
    String someone = "World";

    assertThat(greeter.greet(someone), containsString(someone));
  }

  @Test
  public void greetShouldIncludeGreetingPhrase4() {
    String someone = "World";

    assertThat(greeter.greet(someone).length(), is(greaterThan(someone.length())));
  }
  
  @Test
  public void greetShouldIncludeTheOneBeingGreeted5() {
    String someone = "World";

    assertThat(greeter.greet(someone), containsString(someone));
  }

  @Test
  public void greetShouldIncludeGreetingPhrase5() {
    String someone = "World";

    assertThat(greeter.greet(someone).length(), is(greaterThan(someone.length())));
  }
  
  @Test
  public void greetShouldIncludeTheOneBeingGreeted6() {
    String someone = "World";

    assertThat(greeter.greet(someone), containsString(someone));
  }

  @Test
  public void greetShouldIncludeGreetingPhrase6() {
    String someone = "World";

    assertThat(greeter.greet(someone).length(), is(greaterThan(someone.length())));
  }
}
