package pcftest;

import gw.lang.SimplePropertyProcessing;
import gw.smoketest.platform.web.ClickableActionElement;
import gw.smoketest.platform.web.PCFElementId;
import gw.testharness.ISmokeTest;
import javax.annotation.processing.Generated;
import pcftest.RuleExecutionInfoCell_default.Executing;
import pcftest.RuleExecutionInfoCell_default.NotExecuting;
import pcftest.RuleExecutionInfoCell_default.PrevExecuting;
import pcftest.RuleExecutionInfoCell_default.Unknown;

@SimplePropertyProcessing
@Generated(comments = "config/web/pcf/bizrules/RuleExecutionInfoCell.default.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
public class RuleExecutionInfoCell_default extends RuleExecutionInfoCell {
  public final static String CHECKSUM = "1a3cfc2f63fdcaafec81340b1fd62cf2";
  
  public RuleExecutionInfoCell_default(ISmokeTest helper, PCFElementId componentId)  {
    super(helper, componentId);
  }
  
  public Executing getExecuting() {
    return getOrCreateProperty("Executing", "Executing", null, pcftest.RuleExecutionInfoCell_default.Executing.class);
  }
  
  public NotExecuting getNotExecuting() {
    return getOrCreateProperty("NotExecuting", "NotExecuting", null, pcftest.RuleExecutionInfoCell_default.NotExecuting.class);
  }
  
  public PrevExecuting getPrevExecuting() {
    return getOrCreateProperty("PrevExecuting", "PrevExecuting", null, pcftest.RuleExecutionInfoCell_default.PrevExecuting.class);
  }
  
  public Unknown getUnknown() {
    return getOrCreateProperty("Unknown", "Unknown", null, pcftest.RuleExecutionInfoCell_default.Unknown.class);
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/bizrules/RuleExecutionInfoCell.default.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class Executing extends ClickableActionElement {
    public Executing(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/bizrules/RuleExecutionInfoCell.default.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class NotExecuting extends ClickableActionElement {
    public NotExecuting(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/bizrules/RuleExecutionInfoCell.default.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class PrevExecuting extends ClickableActionElement {
    public PrevExecuting(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/bizrules/RuleExecutionInfoCell.default.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class Unknown extends ClickableActionElement {
    public Unknown(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    
  }
  
  
}