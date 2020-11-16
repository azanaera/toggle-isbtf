package pcftest;

import gw.lang.SimplePropertyProcessing;
import gw.smoketest.platform.web.PCFElementId;
import gw.smoketest.platform.web.ValueElement;
import gw.testharness.ISmokeTest;
import javax.annotation.processing.Generated;

@SimplePropertyProcessing
@Generated(comments = "config/web/pcf/bizrules/ExpressionFragCell.empty.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
public class ExpressionFragCell_empty extends ExpressionFragCell {
  public final static String CHECKSUM = "60c581e7704a8e5a69a874b943a6c915";
  
  public ExpressionFragCell_empty(ISmokeTest helper, PCFElementId componentId)  {
    super(helper, componentId);
  }
  
  public ValueElement getEmptyCell() {
    return getOrCreateProperty("EmptyCell", "EmptyCell", null, gw.smoketest.platform.web.ValueElement.class);
  }
  
  
}