package pcftest;

import gw.lang.SimplePropertyProcessing;
import gw.smoketest.platform.web.ClickableActionElement;
import gw.smoketest.platform.web.MessagesElement;
import gw.smoketest.platform.web.PCFElement;
import gw.smoketest.platform.web.PCFElementId;
import gw.smoketest.platform.web.PCFLocation;
import gw.smoketest.platform.web.SelectElement;
import gw.smoketest.platform.web.ValueElement;
import gw.smoketest.platform.web.ValueElementWithSetAndRefresh;
import gw.testharness.ISmokeTest;
import javax.annotation.processing.Generated;
import pcftest.ICD.Add_ICD_Code_Button;
import pcftest.ICD.ICDPanel;
import pcftest.ICD.ICD_UpLink;
import pcftest.ICD.Search_Button;
import pcftest.ICD._Paging;
import pcftest.ICD.__crumb__;
import pcftest.ICD._msgs;

@SimplePropertyProcessing
@Generated(comments = "config/web/pcf/admin/icd/ICD.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
public class ICD extends PCFLocation {
  public final static String CHECKSUM = "595608b4e34802e185bd8a904ce68526";
  
  public ICD(ISmokeTest helper)  {
    super(helper, new gw.smoketest.platform.web.PCFElementId("ICD"));
  }
  
  public Add_ICD_Code_Button getAdd_ICD_Code_Button() {
    return getOrCreateProperty("Add_ICD_Code_Button", "Add_ICD_Code_Button", null, pcftest.ICD.Add_ICD_Code_Button.class);
  }
  
  public SelectElement getFind_Body_System() {
    return getOrCreateProperty("Find_Body_System", "Find_Body_System", null, gw.smoketest.platform.web.SelectElement.class);
  }
  
  public ValueElement getFind_Code() {
    return getOrCreateProperty("Find_Code", "Find_Code", null, gw.smoketest.platform.web.ValueElement.class);
  }
  
  public ICDPanel getICDPanel() {
    return getOrCreateProperty("ICDPanel", "ICDPanel", null, pcftest.ICD.ICDPanel.class);
  }
  
  public ICD_UpLink getICD_UpLink() {
    return getOrCreateProperty("ICD_UpLink", "ICD_UpLink", null, pcftest.ICD.ICD_UpLink.class);
  }
  
  public Search_Button getSearch_Button() {
    return getOrCreateProperty("Search_Button", "Search_Button", null, pcftest.ICD.Search_Button.class);
  }
  
  public _Paging get_Paging() {
    return getOrCreateProperty("_Paging", "_Paging", null, pcftest.ICD._Paging.class);
  }
  
  public __crumb__ get__crumb__() {
    return getOrCreateProperty("__crumb__", "__crumb__", null, pcftest.ICD.__crumb__.class);
  }
  
  public _msgs get_msgs() {
    return getOrCreateProperty("_msgs", "_msgs", null, pcftest.ICD._msgs.class);
  }
  
  public BusinessSettings get_parent() {
    return getOrCreateProperty("_parent", pcftest.BusinessSettings.class);
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/admin/icd/ICD.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class Add_ICD_Code_Button extends ClickableActionElement {
    public Add_ICD_Code_Button(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public NewICDPopup click() {
      return clickThis(pcftest.NewICDPopup.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/admin/icd/ICD.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class ICDPanel extends PCFElement {
    public ICDPanel(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public ICDLV getICDLV() {
      return getOrCreateProperty("ICDLV", "ICDLV", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListView, pcftest.ICDLV.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/admin/icd/ICD.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class ICD_UpLink extends ClickableActionElement {
    public ICD_UpLink(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/admin/icd/ICD.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class Search_Button extends ClickableActionElement {
    public Search_Button(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/admin/icd/ICD.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class _Paging extends ValueElementWithSetAndRefresh {
    public _Paging(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/admin/icd/ICD.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class __crumb__ extends ClickableActionElement {
    public __crumb__(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/admin/icd/ICD.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class _msgs extends MessagesElement {
    public _msgs(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  
}