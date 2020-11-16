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
import pcftest.SumExpressionPopup.Cancel;
import pcftest.SumExpressionPopup.DescriptionText;
import pcftest.SumExpressionPopup.Edit;
import pcftest.SumExpressionPopup.IterableElementTypeDescription;
import pcftest.SumExpressionPopup.IterableErrors;
import pcftest.SumExpressionPopup.NumericTransformErrors;
import pcftest.SumExpressionPopup.SumExpressionPopup_UpLink;
import pcftest.SumExpressionPopup.Update;
import pcftest.SumExpressionPopup._Paging;
import pcftest.SumExpressionPopup.__crumb__;
import pcftest.SumExpressionPopup._msgs;

@SimplePropertyProcessing
@Generated(comments = "config/web/pcf/bizrules/SumExpressionPopup.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
public class SumExpressionPopup extends PCFLocation {
  public final static String CHECKSUM = "445d4523ce21de4b3dff6b0a7301f8ad";
  
  public SumExpressionPopup(ISmokeTest helper)  {
    super(helper, new gw.smoketest.platform.web.PCFElementId("SumExpressionPopup"));
  }
  
  public Cancel getCancel() {
    return getOrCreateProperty("Cancel", "Cancel", null, pcftest.SumExpressionPopup.Cancel.class);
  }
  
  public pcftest.SumExpressionPopup.ConditionBuilderPanelSet getConditionBuilderPanelSet() {
    return getOrCreateProperty("ConditionBuilderPanelSet", "ConditionBuilderPanelSet", null, pcftest.SumExpressionPopup.ConditionBuilderPanelSet.class);
  }
  
  public ConditionEnabledDV getConditionEnabledDV() {
    return getOrCreateProperty("ConditionEnabledDV", "ConditionEnabledDV", null, pcftest.ConditionEnabledDV.class);
  }
  
  public ConditionValidationToolbarButtonSet getConditionValidationToolbarButtonSet() {
    return getOrCreateProperty("ConditionValidationToolbarButtonSet", "ConditionValidationToolbarButtonSet", null, pcftest.ConditionValidationToolbarButtonSet.class);
  }
  
  public DescriptionText getDescriptionText() {
    return getOrCreateProperty("DescriptionText", "DescriptionText", null, pcftest.SumExpressionPopup.DescriptionText.class);
  }
  
  public Edit getEdit() {
    return getOrCreateProperty("Edit", "Edit", null, pcftest.SumExpressionPopup.Edit.class);
  }
  
  public ValueElement getIterable() {
    return getOrCreateProperty("Iterable", "Iterable", null, gw.smoketest.platform.web.ValueElement.class);
  }
  
  public IterableElementTypeDescription getIterableElementTypeDescription() {
    return getOrCreateProperty("IterableElementTypeDescription", "IterableElementTypeDescription", null, pcftest.SumExpressionPopup.IterableElementTypeDescription.class);
  }
  
  public IterableErrors getIterableErrors() {
    return getOrCreateProperty("IterableErrors", "IterableErrors", null, pcftest.SumExpressionPopup.IterableErrors.class);
  }
  
  public ValueElement getNumericTransform() {
    return getOrCreateProperty("NumericTransform", "NumericTransform", null, gw.smoketest.platform.web.ValueElement.class);
  }
  
  public NumericTransformErrors getNumericTransformErrors() {
    return getOrCreateProperty("NumericTransformErrors", "NumericTransformErrors", null, pcftest.SumExpressionPopup.NumericTransformErrors.class);
  }
  
  public ValueElement getSpace() {
    return getOrCreateProperty("Space", "Space", null, gw.smoketest.platform.web.ValueElement.class);
  }
  
  public SumExpressionPopup_UpLink getSumExpressionPopup_UpLink() {
    return getOrCreateProperty("SumExpressionPopup_UpLink", "SumExpressionPopup_UpLink", null, pcftest.SumExpressionPopup.SumExpressionPopup_UpLink.class);
  }
  
  public Update getUpdate() {
    return getOrCreateProperty("Update", "Update", null, pcftest.SumExpressionPopup.Update.class);
  }
  
  public _Paging get_Paging() {
    return getOrCreateProperty("_Paging", "_Paging", null, pcftest.SumExpressionPopup._Paging.class);
  }
  
  public __crumb__ get__crumb__() {
    return getOrCreateProperty("__crumb__", "__crumb__", null, pcftest.SumExpressionPopup.__crumb__.class);
  }
  
  public _msgs get_msgs() {
    return getOrCreateProperty("_msgs", "_msgs", null, pcftest.SumExpressionPopup._msgs.class);
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/bizrules/SumExpressionPopup.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class Cancel extends ClickableActionElement {
    public Cancel(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/bizrules/SumExpressionPopup.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class ConditionBuilderPanelSet extends PCFElement {
    public ConditionBuilderPanelSet(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public pcftest.ConditionBuilderPanelSet getConditionBuilderPanelSet() {
      return getOrCreateProperty("ConditionBuilderPanelSet", "ConditionBuilderPanelSet", gw.smoketest.platform.web.PCFElementId.PCFElementScope.PanelSet, pcftest.ConditionBuilderPanelSet.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/bizrules/SumExpressionPopup.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class DescriptionText extends ValueElement {
    public DescriptionText(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/bizrules/SumExpressionPopup.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class Edit extends ClickableActionElement {
    public Edit(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/bizrules/SumExpressionPopup.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class IterableElementTypeDescription extends ValueElement {
    public IterableElementTypeDescription(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/bizrules/SumExpressionPopup.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class IterableErrors extends PCFElement {
    public IterableErrors(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public ValidationPopupErrorsInputSet getValidationPopupErrorsInputSet() {
      return getOrCreateProperty("ValidationPopupErrorsInputSet", "ValidationPopupErrorsInputSet", null, pcftest.ValidationPopupErrorsInputSet.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/bizrules/SumExpressionPopup.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class NumericTransformErrors extends PCFElement {
    public NumericTransformErrors(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public ValidationPopupErrorsInputSet getValidationPopupErrorsInputSet() {
      return getOrCreateProperty("ValidationPopupErrorsInputSet", "ValidationPopupErrorsInputSet", null, pcftest.ValidationPopupErrorsInputSet.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/bizrules/SumExpressionPopup.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class SumExpressionPopup_UpLink extends ClickableActionElement {
    public SumExpressionPopup_UpLink(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/bizrules/SumExpressionPopup.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class Update extends ClickableActionElement {
    public Update(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/bizrules/SumExpressionPopup.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class _Paging extends ValueElementWithSetAndRefresh {
    public _Paging(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/bizrules/SumExpressionPopup.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class __crumb__ extends ClickableActionElement {
    public __crumb__(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/bizrules/SumExpressionPopup.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class _msgs extends MessagesElement {
    public _msgs(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  
}