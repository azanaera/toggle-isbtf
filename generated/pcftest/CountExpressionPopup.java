package pcftest;

import gw.lang.SimplePropertyProcessing;
import gw.smoketest.platform.web.ClickableActionElement;
import gw.smoketest.platform.web.MessagesElement;
import gw.smoketest.platform.web.PCFElement;
import gw.smoketest.platform.web.PCFElementId;
import gw.smoketest.platform.web.PCFLocation;
import gw.smoketest.platform.web.ValueElement;
import gw.smoketest.platform.web.ValueElementWithSetAndRefresh;
import gw.testharness.ISmokeTest;
import javax.annotation.processing.Generated;
import pcftest.CountExpressionPopup.Cancel;
import pcftest.CountExpressionPopup.CountExpressionPopup_UpLink;
import pcftest.CountExpressionPopup.DescriptionText;
import pcftest.CountExpressionPopup.Edit;
import pcftest.CountExpressionPopup.IterableElementTypeDescription;
import pcftest.CountExpressionPopup.IterableErrors;
import pcftest.CountExpressionPopup.Update;
import pcftest.CountExpressionPopup._Paging;
import pcftest.CountExpressionPopup.__crumb__;
import pcftest.CountExpressionPopup._msgs;

@SimplePropertyProcessing
@Generated(comments = "config/web/pcf/bizrules/CountExpressionPopup.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
public class CountExpressionPopup extends PCFLocation {
  public final static String CHECKSUM = "9f720fc0d97d303ad2b838d5edef78db";
  
  public CountExpressionPopup(ISmokeTest helper)  {
    super(helper, new gw.smoketest.platform.web.PCFElementId("CountExpressionPopup"));
  }
  
  public Cancel getCancel() {
    return getOrCreateProperty("Cancel", "Cancel", null, pcftest.CountExpressionPopup.Cancel.class);
  }
  
  public pcftest.CountExpressionPopup.ConditionBuilderPanelSet getConditionBuilderPanelSet() {
    return getOrCreateProperty("ConditionBuilderPanelSet", "ConditionBuilderPanelSet", null, pcftest.CountExpressionPopup.ConditionBuilderPanelSet.class);
  }
  
  public ConditionEnabledDV getConditionEnabledDV() {
    return getOrCreateProperty("ConditionEnabledDV", "ConditionEnabledDV", null, pcftest.ConditionEnabledDV.class);
  }
  
  public ConditionValidationToolbarButtonSet getConditionValidationToolbarButtonSet() {
    return getOrCreateProperty("ConditionValidationToolbarButtonSet", "ConditionValidationToolbarButtonSet", null, pcftest.ConditionValidationToolbarButtonSet.class);
  }
  
  public CountExpressionPopup_UpLink getCountExpressionPopup_UpLink() {
    return getOrCreateProperty("CountExpressionPopup_UpLink", "CountExpressionPopup_UpLink", null, pcftest.CountExpressionPopup.CountExpressionPopup_UpLink.class);
  }
  
  public DescriptionText getDescriptionText() {
    return getOrCreateProperty("DescriptionText", "DescriptionText", null, pcftest.CountExpressionPopup.DescriptionText.class);
  }
  
  public Edit getEdit() {
    return getOrCreateProperty("Edit", "Edit", null, pcftest.CountExpressionPopup.Edit.class);
  }
  
  public ValueElement getIterable() {
    return getOrCreateProperty("Iterable", "Iterable", null, gw.smoketest.platform.web.ValueElement.class);
  }
  
  public IterableElementTypeDescription getIterableElementTypeDescription() {
    return getOrCreateProperty("IterableElementTypeDescription", "IterableElementTypeDescription", null, pcftest.CountExpressionPopup.IterableElementTypeDescription.class);
  }
  
  public IterableErrors getIterableErrors() {
    return getOrCreateProperty("IterableErrors", "IterableErrors", null, pcftest.CountExpressionPopup.IterableErrors.class);
  }
  
  public ValueElement getSpace() {
    return getOrCreateProperty("Space", "Space", null, gw.smoketest.platform.web.ValueElement.class);
  }
  
  public Update getUpdate() {
    return getOrCreateProperty("Update", "Update", null, pcftest.CountExpressionPopup.Update.class);
  }
  
  public _Paging get_Paging() {
    return getOrCreateProperty("_Paging", "_Paging", null, pcftest.CountExpressionPopup._Paging.class);
  }
  
  public __crumb__ get__crumb__() {
    return getOrCreateProperty("__crumb__", "__crumb__", null, pcftest.CountExpressionPopup.__crumb__.class);
  }
  
  public _msgs get_msgs() {
    return getOrCreateProperty("_msgs", "_msgs", null, pcftest.CountExpressionPopup._msgs.class);
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/bizrules/CountExpressionPopup.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class Cancel extends ClickableActionElement {
    public Cancel(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/bizrules/CountExpressionPopup.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class ConditionBuilderPanelSet extends PCFElement {
    public ConditionBuilderPanelSet(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public pcftest.ConditionBuilderPanelSet getConditionBuilderPanelSet() {
      return getOrCreateProperty("ConditionBuilderPanelSet", "ConditionBuilderPanelSet", gw.smoketest.platform.web.PCFElementId.PCFElementScope.PanelSet, pcftest.ConditionBuilderPanelSet.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/bizrules/CountExpressionPopup.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class CountExpressionPopup_UpLink extends ClickableActionElement {
    public CountExpressionPopup_UpLink(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/bizrules/CountExpressionPopup.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class DescriptionText extends ValueElement {
    public DescriptionText(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/bizrules/CountExpressionPopup.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class Edit extends ClickableActionElement {
    public Edit(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/bizrules/CountExpressionPopup.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class IterableElementTypeDescription extends ValueElement {
    public IterableElementTypeDescription(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/bizrules/CountExpressionPopup.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class IterableErrors extends PCFElement {
    public IterableErrors(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public ValidationPopupErrorsInputSet getValidationPopupErrorsInputSet() {
      return getOrCreateProperty("ValidationPopupErrorsInputSet", "ValidationPopupErrorsInputSet", null, pcftest.ValidationPopupErrorsInputSet.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/bizrules/CountExpressionPopup.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class Update extends ClickableActionElement {
    public Update(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/bizrules/CountExpressionPopup.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class _Paging extends ValueElementWithSetAndRefresh {
    public _Paging(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/bizrules/CountExpressionPopup.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class __crumb__ extends ClickableActionElement {
    public __crumb__(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/bizrules/CountExpressionPopup.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class _msgs extends MessagesElement {
    public _msgs(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  
}