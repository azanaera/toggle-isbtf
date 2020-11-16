package pcftest;

import gw.lang.SimplePropertyProcessing;
import gw.smoketest.platform.web.ClickableActionElement;
import gw.smoketest.platform.web.DateElement;
import gw.smoketest.platform.web.MessagesElement;
import gw.smoketest.platform.web.OptionElement;
import gw.smoketest.platform.web.PCFElementId;
import gw.smoketest.platform.web.PCFLocation;
import gw.smoketest.platform.web.SelectElement;
import gw.smoketest.platform.web.ValueElement;
import gw.smoketest.platform.web.ValueElementWithSetAndRefresh;
import gw.testharness.ISmokeTest;
import javax.annotation.processing.Generated;
import pcftest.RuleExportDetailsPopup.Download;
import pcftest.RuleExportDetailsPopup.RuleExportDetailsPopup_UpLink;
import pcftest.RuleExportDetailsPopup.RuleType;
import pcftest.RuleExportDetailsPopup._Paging;
import pcftest.RuleExportDetailsPopup.__crumb__;
import pcftest.RuleExportDetailsPopup._msgs;
import typekey.Rule;

@SimplePropertyProcessing
@Generated(comments = "config/web/pcf/bizrules/RuleExportDetailsPopup.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
public class RuleExportDetailsPopup extends PCFLocation {
  public final static String CHECKSUM = "bba89d937db3f2a1e0211b805624206d";
  
  public RuleExportDetailsPopup(ISmokeTest helper)  {
    super(helper, new gw.smoketest.platform.web.PCFElementId("RuleExportDetailsPopup"));
  }
  
  public DateElement getCreated() {
    return getOrCreateProperty("Created", "Created", null, gw.smoketest.platform.web.DateElement.class);
  }
  
  public Download getDownload() {
    return getOrCreateProperty("Download", "Download", null, pcftest.RuleExportDetailsPopup.Download.class);
  }
  
  public RuleExportDetailsPopup_UpLink getRuleExportDetailsPopup_UpLink() {
    return getOrCreateProperty("RuleExportDetailsPopup_UpLink", "RuleExportDetailsPopup_UpLink", null, pcftest.RuleExportDetailsPopup.RuleExportDetailsPopup_UpLink.class);
  }
  
  public RuleListPanelSet getRuleListPanelSet() {
    return getOrCreateProperty("RuleListPanelSet", "RuleListPanelSet", gw.smoketest.platform.web.PCFElementId.PCFElementScope.PanelSet, pcftest.RuleListPanelSet.class);
  }
  
  public RuleType getRuleType() {
    return getOrCreateProperty("RuleType", "RuleType", null, pcftest.RuleExportDetailsPopup.RuleType.class);
  }
  
  public ValueElement getStartedBy() {
    return getOrCreateProperty("StartedBy", "StartedBy", null, gw.smoketest.platform.web.ValueElement.class);
  }
  
  public ValueElement getStatus() {
    return getOrCreateProperty("Status", "Status", null, gw.smoketest.platform.web.ValueElement.class);
  }
  
  public _Paging get_Paging() {
    return getOrCreateProperty("_Paging", "_Paging", null, pcftest.RuleExportDetailsPopup._Paging.class);
  }
  
  public __crumb__ get__crumb__() {
    return getOrCreateProperty("__crumb__", "__crumb__", null, pcftest.RuleExportDetailsPopup.__crumb__.class);
  }
  
  public _msgs get_msgs() {
    return getOrCreateProperty("_msgs", "_msgs", null, pcftest.RuleExportDetailsPopup._msgs.class);
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/bizrules/RuleExportDetailsPopup.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class Download extends ClickableActionElement {
    public Download(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/bizrules/RuleExportDetailsPopup.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class RuleExportDetailsPopup_UpLink extends ClickableActionElement {
    public RuleExportDetailsPopup_UpLink(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/bizrules/RuleExportDetailsPopup.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class RuleType extends SelectElement {
    public RuleType(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public OptionElement getOptionByTypeKey(Rule arg) {
      return getOptionByValue(arg == null ? null : arg.getCode());
    }
    
    public Rule getTypeKeyValue() {
      String myValue = getValue();return myValue == null || myValue.isEmpty() ? null : typekey.Rule.getTypeKey(myValue);
    }
    
    public void setTypeKeyValue(Rule arg) {
      setValue(arg == null ? null : arg.getCode());
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/bizrules/RuleExportDetailsPopup.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class _Paging extends ValueElementWithSetAndRefresh {
    public _Paging(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/bizrules/RuleExportDetailsPopup.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class __crumb__ extends ClickableActionElement {
    public __crumb__(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/bizrules/RuleExportDetailsPopup.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class _msgs extends MessagesElement {
    public _msgs(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  
}