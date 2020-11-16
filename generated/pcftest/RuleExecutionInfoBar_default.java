package pcftest;

import gw.lang.SimplePropertyProcessing;
import gw.smoketest.platform.web.ClickableActionElement;
import gw.smoketest.platform.web.PCFElementId;
import gw.testharness.ISmokeTest;
import javax.annotation.processing.Generated;
import pcftest.RuleExecutionInfoBar_default.Executing;
import pcftest.RuleExecutionInfoBar_default.NotExecuting;
import pcftest.RuleExecutionInfoBar_default.PrevExecuting;
import pcftest.RuleExecutionInfoBar_default.Unknown;

@SimplePropertyProcessing
@Generated(comments = "config/web/pcf/bizrules/RuleExecutionInfoBar.default.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
public class RuleExecutionInfoBar_default extends RuleExecutionInfoBar {
  public final static String CHECKSUM = "e01d8a96b59bc5d6003744541296f602";
  
  public RuleExecutionInfoBar_default(ISmokeTest helper, PCFElementId componentId)  {
    super(helper, componentId);
  }
  
  public Executing getExecuting() {
    return getOrCreateProperty("Executing", "Executing", null, pcftest.RuleExecutionInfoBar_default.Executing.class);
  }
  
  public NotExecuting getNotExecuting() {
    return getOrCreateProperty("NotExecuting", "NotExecuting", null, pcftest.RuleExecutionInfoBar_default.NotExecuting.class);
  }
  
  public PrevExecuting getPrevExecuting() {
    return getOrCreateProperty("PrevExecuting", "PrevExecuting", null, pcftest.RuleExecutionInfoBar_default.PrevExecuting.class);
  }
  
  public Unknown getUnknown() {
    return getOrCreateProperty("Unknown", "Unknown", null, pcftest.RuleExecutionInfoBar_default.Unknown.class);
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/bizrules/RuleExecutionInfoBar.default.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class Executing extends ClickableActionElement {
    public Executing(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/bizrules/RuleExecutionInfoBar.default.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class NotExecuting extends ClickableActionElement {
    public NotExecuting(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/bizrules/RuleExecutionInfoBar.default.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class PrevExecuting extends ClickableActionElement {
    public PrevExecuting(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/bizrules/RuleExecutionInfoBar.default.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class Unknown extends ClickableActionElement {
    public Unknown(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    
  }
  
  
}