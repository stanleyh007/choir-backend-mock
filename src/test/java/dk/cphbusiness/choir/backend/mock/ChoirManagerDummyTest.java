package dk.cphbusiness.choir.backend.mock;

import dk.cphbusiness.choir.contract.ChoirManagerHolder;
import dk.cphbusiness.choir.contract.ChoirManagerTest;
import org.junit.Test;
import static org.junit.Assert.*;
import org.junit.BeforeClass;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;

@RunWith(Suite.class)
@Suite.SuiteClasses({
  ChoirManagerDummyWhiteboxTest.class,
  ChoirManagerTest.class
  })
public class ChoirManagerDummyTest {
  @BeforeClass
  public static void setupClass() {
    ChoirManagerHolder.manager = new ChoirManagerDummy();
    }
  }
