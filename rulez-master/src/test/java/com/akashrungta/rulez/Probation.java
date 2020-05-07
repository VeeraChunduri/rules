package com.akashrungta.rulez;

import com.akashrungta.rulez.annotations.Operand;

public class Probation {

  @Operand("DEPTID")
  private String DEPTID;

  @Operand("EMPLTYPE")
  private String EMPLTYPE;

  @Operand("PROBATION")
  private Integer PROBATION;

  public Probation(String DEPTID, String EMPLTYPE, Integer PROBATION) {
    this.DEPTID = DEPTID;
    this.EMPLTYPE = EMPLTYPE;
    this.PROBATION = PROBATION;
  }
}
