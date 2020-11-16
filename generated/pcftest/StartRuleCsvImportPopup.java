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
import pcftest.StartRuleCsvImportPopup.CancelButton;
import pcftest.StartRuleCsvImportPopup.File;
import pcftest.StartRuleCsvImportPopup.ImportButton;
import pcftest.StartRuleCsvImportPopup.StartRuleCsvImportPopup_UpLink;
import pcftest.StartRuleCsvImportPopup.UploadSummaryAlert;
import pcftest.StartRuleCsvImportPopup.UploadSummaryAlert.CloseBtn;
import pcftest.StartRuleCsvImportPopup._Paging;
import pcftest.StartRuleCsvImportPopup.__crumb__;
import pcftest.StartRuleCsvImportPopup._msgs;

@SimplePropertyProcessing
@Generated(comments = "config/web/pcf/bizrules/StartRuleCsvImportPopup.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
public class StartRuleCsvImportPopup extends PCFLocation {
  public final static String CHECKSUM = "a20ff48cc8e39f3b22ed7a678e77a669";
  
  public StartRuleCsvImportPopup(ISmokeTest helper)  {
    super(helper, new gw.smoketest.platform.web.PCFElementId("StartRuleCsvImportPopup"));
  }
  
  public CancelButton getCancelButton() {
    return getOrCreateProperty("CancelButton", "CancelButton", null, pcftest.StartRuleCsvImportPopup.CancelButton.class);
  }
  
  public File getFile() {
    return getOrCreateProperty("File", "File", null, pcftest.StartRuleCsvImportPopup.File.class);
  }
  
  public ImportButton getImportButton() {
    return getOrCreateProperty("ImportButton", "ImportButton", null, pcftest.StartRuleCsvImportPopup.ImportButton.class);
  }
  
  public StartRuleCsvImportPopup_UpLink getStartRuleCsvImportPopup_UpLink() {
    return getOrCreateProperty("StartRuleCsvImportPopup_UpLink", "StartRuleCsvImportPopup_UpLink", null, pcftest.StartRuleCsvImportPopup.StartRuleCsvImportPopup_UpLink.class);
  }
  
  public UploadSummaryAlert getUploadSummaryAlert() {
    return getOrCreateProperty("UploadSummaryAlert", "UploadSummaryAlert", null, pcftest.StartRuleCsvImportPopup.UploadSummaryAlert.class);
  }
  
  public _Paging get_Paging() {
    return getOrCreateProperty("_Paging", "_Paging", null, pcftest.StartRuleCsvImportPopup._Paging.class);
  }
  
  public __crumb__ get__crumb__() {
    return getOrCreateProperty("__crumb__", "__crumb__", null, pcftest.StartRuleCsvImportPopup.__crumb__.class);
  }
  
  public _msgs get_msgs() {
    return getOrCreateProperty("_msgs", "_msgs", null, pcftest.StartRuleCsvImportPopup._msgs.class);
  }
  
  public ValueElement getfileLabel() {
    return getOrCreateProperty("fileLabel", "fileLabel", null, gw.smoketest.platform.web.ValueElement.class);
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/bizrules/StartRuleCsvImportPopup.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class CancelButton extends ClickableActionElement {
    public CancelButton(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/bizrules/StartRuleCsvImportPopup.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class File extends ValueElement {
    public File(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/bizrules/StartRuleCsvImportPopup.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class ImportButton extends ClickableActionElement {
    public ImportButton(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/bizrules/StartRuleCsvImportPopup.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class StartRuleCsvImportPopup_UpLink extends ClickableActionElement {
    public StartRuleCsvImportPopup_UpLink(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/bizrules/StartRuleCsvImportPopup.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class UploadSummaryAlert extends ClickableActionElement {
    public UploadSummaryAlert(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    public CloseBtn getCloseBtn() {
      return getOrCreateProperty("CloseBtn", "CloseBtn", null, pcftest.StartRuleCsvImportPopup.UploadSummaryAlert.CloseBtn.class);
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/bizrules/StartRuleCsvImportPopup.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class CloseBtn extends ClickableActionElement {
      public CloseBtn(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public PCFLocation click() {
        return clickThis(gw.smoketest.platform.web.PCFLocation.class);
      }
      
      
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/bizrules/StartRuleCsvImportPopup.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class _Paging extends ValueElementWithSetAndRefresh {
    public _Paging(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/bizrules/StartRuleCsvImportPopup.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class __crumb__ extends ClickableActionElement {
    public __crumb__(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/bizrules/StartRuleCsvImportPopup.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class _msgs extends MessagesElement {
    public _msgs(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  
}