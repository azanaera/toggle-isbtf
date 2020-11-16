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
import pcftest.ContainsExpressionPopup.Cancel;
import pcftest.ContainsExpressionPopup.ContainsExpressionPopup_UpLink;
import pcftest.ContainsExpressionPopup.DescriptionText;
import pcftest.ContainsExpressionPopup.Edit;
import pcftest.ContainsExpressionPopup.Update;
import pcftest.ContainsExpressionPopup._Paging;
import pcftest.ContainsExpressionPopup.__crumb__;
import pcftest.ContainsExpressionPopup._msgs;

@SimplePropertyProcessing
@Generated(comments = "config/web/pcf/bizrules/ContainsExpressionPopup.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
public class ContainsExpressionPopup extends PCFLocation {
  public final static String CHECKSUM = "6f1b0b2fb84b4147606bc4c528461ce3";
  
  public ContainsExpressionPopup(ISmokeTest helper)  {
    super(helper, new gw.smoketest.platform.web.PCFElementId("ContainsExpressionPopup"));
  }
  
  public Cancel getCancel() {
    return getOrCreateProperty("Cancel", "Cancel", null, pcftest.ContainsExpressionPopup.Cancel.class);
  }
  
  public ConditionBuilderPanelSet getConditionBuilderPanelSet() {
    return getOrCreateProperty("ConditionBuilderPanelSet", "ConditionBuilderPanelSet", gw.smoketest.platform.web.PCFElementId.PCFElementScope.PanelSet, pcftest.ConditionBuilderPanelSet.class);
  }
  
  public ConditionValidationToolbarButtonSet getConditionValidationToolbarButtonSet() {
    return getOrCreateProperty("ConditionValidationToolbarButtonSet", "ConditionValidationToolbarButtonSet", null, pcftest.ConditionValidationToolbarButtonSet.class);
  }
  
  public ContainsExpressionPopup_UpLink getContainsExpressionPopup_UpLink() {
    return getOrCreateProperty("ContainsExpressionPopup_UpLink", "ContainsExpressionPopup_UpLink", null, pcftest.ContainsExpressionPopup.ContainsExpressionPopup_UpLink.class);
  }
  
  public DescriptionText getDescriptionText() {
    return getOrCreateProperty("DescriptionText", "DescriptionText", null, pcftest.ContainsExpressionPopup.DescriptionText.class);
  }
  
  public Edit getEdit() {
    return getOrCreateProperty("Edit", "Edit", null, pcftest.ContainsExpressionPopup.Edit.class);
  }
  
  public Update getUpdate() {
    return getOrCreateProperty("Update", "Update", null, pcftest.ContainsExpressionPopup.Update.class);
  }
  
  public _Paging get_Paging() {
    return getOrCreateProperty("_Paging", "_Paging", null, pcftest.ContainsExpressionPopup._Paging.class);
  }
  
  public __crumb__ get__crumb__() {
    return getOrCreateProperty("__crumb__", "__crumb__", null, pcftest.ContainsExpressionPopup.__crumb__.class);
  }
  
  public _msgs get_msgs() {
    return getOrCreateProperty("_msgs", "_msgs", null, pcftest.ContainsExpressionPopup._msgs.class);
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/bizrules/ContainsExpressionPopup.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class Cancel extends ClickableActionElement {
    public Cancel(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/bizrules/ContainsExpressionPopup.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class ContainsExpressionPopup_UpLink extends ClickableActionElement {
    public ContainsExpressionPopup_UpLink(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/bizrules/ContainsExpressionPopup.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class DescriptionText extends ValueElement {
    public DescriptionText(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/bizrules/ContainsExpressionPopup.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class Edit extends ClickableActionElement {
    public Edit(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/bizrules/ContainsExpressionPopup.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class Update extends ClickableActionElement {
    public Update(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/bizrules/ContainsExpressionPopup.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class _Paging extends ValueElementWithSetAndRefresh {
    public _Paging(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/bizrules/ContainsExpressionPopup.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class __crumb__ extends ClickableActionElement {
    public __crumb__(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/bizrules/ContainsExpressionPopup.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class _msgs extends MessagesElement {
    public _msgs(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  
}