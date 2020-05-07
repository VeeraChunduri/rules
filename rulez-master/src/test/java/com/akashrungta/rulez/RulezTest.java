package com.akashrungta.rulez;

import org.junit.Assert;
import org.junit.Test;

public class RulezTest {

  public static final String groupChnRule = "CHN";
  public static final String groupAusRule = "AUS";
  public static final String groupIndRule = "IND";


  @Test
  public void testChn(){
    Rulez rulez = Rulez.create("my_rule.yaml");
    boolean retA = rulez.run(new Probation("ALL", "RFS", 150), groupChnRule);
    Assert.assertEquals(true, retA);
  }

  @Test
  public void testAus(){
    Rulez rulez = Rulez.create("my_rule.yaml");
    boolean retA = rulez.run(new Probation("1020", "RFS", 150), groupAusRule);
    Assert.assertEquals(true, retA);
  }

  @Test
  public void testInd(){
    Rulez rulez = Rulez.create("my_rule.yaml");
    boolean retA = rulez.run(new Probation("ALL", "RFS", 50), groupIndRule);
    Assert.assertEquals(true, retA);
  }

}