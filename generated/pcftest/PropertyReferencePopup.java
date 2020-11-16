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
import pcftest.PropertyReferencePopup.Cancel;
import pcftest.PropertyReferencePopup.Edit;
import pcftest.PropertyReferencePopup.PropertyReferencePopup_UpLink;
import pcftest.PropertyReferencePopup.Update;
import pcftest.PropertyReferencePopup._Paging;
import pcftest.PropertyReferencePopup.__crumb__;
import pcftest.PropertyReferencePopup._msgs;

@SimplePropertyProcessing
@Generated(comments = "config/web/pcf/bizrules/PropertyReferencePopup.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
public class PropertyReferencePopup extends PCFLocation {
  public final static String CHECKSUM = "5668b483d06b42fede3b0227f1901351";
  
  public PropertyReferencePopup(ISmokeTest helper)  {
    super(helper, new gw.smoketest.platform.web.PCFElementId("PropertyReferencePopup"));
  }
  
  public Cancel getCancel() {
    return getOrCreateProperty("Cancel", "Cancel", null, pcftest.PropertyReferencePopup.Cancel.class);
  }
  
  public Edit getEdit() {
    return getOrCreateProperty("Edit", "Edit", null, pcftest.PropertyReferencePopup.Edit.class);
  }
  
  public ValueElement getProperty() {
    return getOrCreateProperty("Property", "Property", null, gw.smoketest.platform.web.ValueElement.class);
  }
  
  public PropertyReferencePopup_UpLink getPropertyReferencePopup_UpLink() {
    return getOrCreateProperty("PropertyReferencePopup_UpLink", "PropertyReferencePopup_UpLink", null, pcftest.PropertyReferencePopup.PropertyReferencePopup_UpLink.class);
  }
  
  public Update getUpdate() {
    return getOrCreateProperty("Update", "Update", null, pcftest.PropertyReferencePopup.Update.class);
  }
  
  public ValidationPopupErrorsInputSet getValidationPopupErrorsInputSet() {
    return getOrCreateProperty("ValidationPopupErrorsInputSet", "ValidationPopupErrorsInputSet", null, pcftest.ValidationPopupErrorsInputSet.class);
  }
  
  public _Paging get_Paging() {
    return getOrCreateProperty("_Paging", "_Paging", null, pcftest.PropertyReferencePopup._Paging.class);
  }
  
  public __crumb__ get__crumb__() {
    return getOrCreateProperty("__crumb__", "__crumb__", null, pcftest.PropertyReferencePopup.__crumb__.class);
  }
  
  public _msgs get_msgs() {
    return getOrCreateProperty("_msgs", "_msgs", null, pcftest.PropertyReferencePopup._msgs.class);
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/bizrules/PropertyReferencePopup.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class Cancel extends ClickableActionElement {
    public Cancel(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/bizrules/PropertyReferencePopup.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class Edit extends ClickableActionElement {
    public Edit(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/bizrules/PropertyReferencePopup.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class PropertyReferencePopup_UpLink extends ClickableActionElement {
    public PropertyReferencePopup_UpLink(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/bizrules/PropertyReferencePopup.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class Update extends ClickableActionElement {
    public Update(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/bizrules/PropertyReferencePopup.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class _Paging extends ValueElementWithSetAndRefresh {
    public _Paging(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/bizrules/PropertyReferencePopup.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class __crumb__ extends ClickableActionElement {
    public __crumb__(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/bizrules/PropertyReferencePopup.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class _msgs extends MessagesElement {
    public _msgs(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  
}