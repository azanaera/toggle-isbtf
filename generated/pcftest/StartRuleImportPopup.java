package pcftest;

import gw.lang.SimplePropertyProcessing;
import gw.smoketest.platform.web.ClickableActionElement;
import gw.smoketest.platform.web.MessagesElement;
import gw.smoketest.platform.web.PCFElementId;
import gw.smoketest.platform.web.PCFLocation;
import gw.smoketest.platform.web.ValueElement;
import gw.smoketest.platform.web.ValueElementWithSetAndRefresh;
import gw.testharness.ISmokeTest;
import javax.annotation.processing.Generated;
import pcftest.StartRuleImportPopup.CancelButton;
import pcftest.StartRuleImportPopup.File;
import pcftest.StartRuleImportPopup.ImportButton;
import pcftest.StartRuleImportPopup.StartRuleImportPopup_UpLink;
import pcftest.StartRuleImportPopup._Paging;
import pcftest.StartRuleImportPopup.__crumb__;
import pcftest.StartRuleImportPopup._msgs;

@SimplePropertyProcessing
@Generated(comments = "config/web/pcf/bizrules/StartRuleImportPopup.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
public class StartRuleImportPopup extends PCFLocation {
  public final static String CHECKSUM = "b1b5490993876d82365f1a7138789aac";
  
  public StartRuleImportPopup(ISmokeTest helper)  {
    super(helper, new gw.smoketest.platform.web.PCFElementId("StartRuleImportPopup"));
  }
  
  public CancelButton getCancelButton() {
    return getOrCreateProperty("CancelButton", "CancelButton", null, pcftest.StartRuleImportPopup.CancelButton.class);
  }
  
  public File getFile() {
    return getOrCreateProperty("File", "File", null, pcftest.StartRuleImportPopup.File.class);
  }
  
  public ImportButton getImportButton() {
    return getOrCreateProperty("ImportButton", "ImportButton", null, pcftest.StartRuleImportPopup.ImportButton.class);
  }
  
  public StartRuleImportPopup_UpLink getStartRuleImportPopup_UpLink() {
    return getOrCreateProperty("StartRuleImportPopup_UpLink", "StartRuleImportPopup_UpLink", null, pcftest.StartRuleImportPopup.StartRuleImportPopup_UpLink.class);
  }
  
  public _Paging get_Paging() {
    return getOrCreateProperty("_Paging", "_Paging", null, pcftest.StartRuleImportPopup._Paging.class);
  }
  
  public __crumb__ get__crumb__() {
    return getOrCreateProperty("__crumb__", "__crumb__", null, pcftest.StartRuleImportPopup.__crumb__.class);
  }
  
  public _msgs get_msgs() {
    return getOrCreateProperty("_msgs", "_msgs", null, pcftest.StartRuleImportPopup._msgs.class);
  }
  
  public ValueElement getfileLabel() {
    return getOrCreateProperty("fileLabel", "fileLabel", null, gw.smoketest.platform.web.ValueElement.class);
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/bizrules/StartRuleImportPopup.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class CancelButton extends ClickableActionElement {
    public CancelButton(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/bizrules/StartRuleImportPopup.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class File extends ValueElement {
    public File(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/bizrules/StartRuleImportPopup.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class ImportButton extends ClickableActionElement {
    public ImportButton(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/bizrules/StartRuleImportPopup.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class StartRuleImportPopup_UpLink extends ClickableActionElement {
    public StartRuleImportPopup_UpLink(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/bizrules/StartRuleImportPopup.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class _Paging extends ValueElementWithSetAndRefresh {
    public _Paging(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/bizrules/StartRuleImportPopup.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class __crumb__ extends ClickableActionElement {
    public __crumb__(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/bizrules/StartRuleImportPopup.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class _msgs extends MessagesElement {
    public _msgs(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  
}