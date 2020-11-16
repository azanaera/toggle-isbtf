package pcftest;

import gw.lang.SimplePropertyProcessing;
import gw.smoketest.platform.web.ClickableActionElement;
import gw.smoketest.platform.web.PCFElement;
import gw.smoketest.platform.web.PCFElementId;
import gw.smoketest.platform.web.PCFLocation;
import gw.testharness.ISmokeTest;
import javax.annotation.processing.Generated;
import pcftest.RuleEditPopupToolbarButtonSet.Cancel;
import pcftest.RuleEditPopupToolbarButtonSet.Update;

@SimplePropertyProcessing
@Generated(comments = "config/web/pcf/bizrules/RuleEditPopupToolbarButtonSet.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
public class RuleEditPopupToolbarButtonSet extends PCFElement {
  public final static String CHECKSUM = "c5267b5243955df9741094543c5d12c1";
  
  public RuleEditPopupToolbarButtonSet(ISmokeTest helper, PCFElementId componentId)  {
    super(helper, componentId);
  }
  
  public Cancel getCancel() {
    return getOrCreateProperty("Cancel", "Cancel", null, pcftest.RuleEditPopupToolbarButtonSet.Cancel.class);
  }
  
  public Update getUpdate() {
    return getOrCreateProperty("Update", "Update", null, pcftest.RuleEditPopupToolbarButtonSet.Update.class);
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/bizrules/RuleEditPopupToolbarButtonSet.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class Cancel extends ClickableActionElement {
    public Cancel(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/bizrules/RuleEditPopupToolbarButtonSet.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class Update extends ClickableActionElement {
    public Update(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  
}