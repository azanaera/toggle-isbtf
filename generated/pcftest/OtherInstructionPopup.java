package pcftest;

import gw.lang.SimplePropertyProcessing;
import gw.smoketest.platform.web.ClickableActionElement;
import gw.smoketest.platform.web.MessagesElement;
import gw.smoketest.platform.web.OptionElement;
import gw.smoketest.platform.web.PCFElement;
import gw.smoketest.platform.web.PCFElementId;
import gw.smoketest.platform.web.PCFLocation;
import gw.smoketest.platform.web.SelectElement;
import gw.smoketest.platform.web.ValueElement;
import gw.smoketest.platform.web.ValueElementWithSetAndRefresh;
import gw.testharness.ISmokeTest;
import javax.annotation.processing.Generated;
import pcftest.OtherInstructionPopup.Cancel;
import pcftest.OtherInstructionPopup.Edit;
import pcftest.OtherInstructionPopup.LocalizedValues;
import pcftest.OtherInstructionPopup.OtherInstructionPopup_UpLink;
import pcftest.OtherInstructionPopup.Update;
import pcftest.OtherInstructionPopup._Paging;
import pcftest.OtherInstructionPopup.__crumb__;
import pcftest.OtherInstructionPopup._msgs;

@SimplePropertyProcessing
@Generated(comments = "config/web/pcf/admin/specialhandling/OtherInstructionPopup.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
public class OtherInstructionPopup extends PCFLocation {
  public final static String CHECKSUM = "caa3063f8fb0cbb95beb42a66d16c95f";
  
  public OtherInstructionPopup(ISmokeTest helper)  {
    super(helper, new gw.smoketest.platform.web.PCFElementId("OtherInstructionPopup"));
  }
  
  public Cancel getCancel() {
    return getOrCreateProperty("Cancel", "Cancel", null, pcftest.OtherInstructionPopup.Cancel.class);
  }
  
  public ValueElement getComment() {
    return getOrCreateProperty("Comment", "Comment", null, gw.smoketest.platform.web.ValueElement.class);
  }
  
  public Edit getEdit() {
    return getOrCreateProperty("Edit", "Edit", null, pcftest.OtherInstructionPopup.Edit.class);
  }
  
  public pcftest.OtherInstructionPopup.InstructionCategory getInstructionCategory() {
    return getOrCreateProperty("InstructionCategory", "InstructionCategory", null, pcftest.OtherInstructionPopup.InstructionCategory.class);
  }
  
  public pcftest.OtherInstructionPopup.InstructionType getInstructionType() {
    return getOrCreateProperty("InstructionType", "InstructionType", null, pcftest.OtherInstructionPopup.InstructionType.class);
  }
  
  public LocalizedValues getLocalizedValues() {
    return getOrCreateProperty("LocalizedValues", "LocalizedValues", null, pcftest.OtherInstructionPopup.LocalizedValues.class);
  }
  
  public OtherInstructionPopup_UpLink getOtherInstructionPopup_UpLink() {
    return getOrCreateProperty("OtherInstructionPopup_UpLink", "OtherInstructionPopup_UpLink", null, pcftest.OtherInstructionPopup.OtherInstructionPopup_UpLink.class);
  }
  
  public pcftest.OtherInstructionPopup.PolicyType getPolicyType() {
    return getOrCreateProperty("PolicyType", "PolicyType", null, pcftest.OtherInstructionPopup.PolicyType.class);
  }
  
  public Update getUpdate() {
    return getOrCreateProperty("Update", "Update", null, pcftest.OtherInstructionPopup.Update.class);
  }
  
  public _Paging get_Paging() {
    return getOrCreateProperty("_Paging", "_Paging", null, pcftest.OtherInstructionPopup._Paging.class);
  }
  
  public __crumb__ get__crumb__() {
    return getOrCreateProperty("__crumb__", "__crumb__", null, pcftest.OtherInstructionPopup.__crumb__.class);
  }
  
  public _msgs get_msgs() {
    return getOrCreateProperty("_msgs", "_msgs", null, pcftest.OtherInstructionPopup._msgs.class);
  }
  
  public ValueElement getpolicyTypeReadOnly() {
    return getOrCreateProperty("policyTypeReadOnly", "policyTypeReadOnly", null, gw.smoketest.platform.web.ValueElement.class);
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/admin/specialhandling/OtherInstructionPopup.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class Cancel extends ClickableActionElement {
    public Cancel(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/admin/specialhandling/OtherInstructionPopup.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class Edit extends ClickableActionElement {
    public Edit(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/admin/specialhandling/OtherInstructionPopup.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class InstructionCategory extends SelectElement {
    public InstructionCategory(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public OptionElement getOptionByTypeKey(typekey.InstructionCategory arg) {
      return getOptionByValue(arg == null ? null : arg.getCode());
    }
    
    public typekey.InstructionCategory getTypeKeyValue() {
      String myValue = getValue();return myValue == null || myValue.isEmpty() ? null : typekey.InstructionCategory.getTypeKey(myValue);
    }
    
    public void setTypeKeyValue(typekey.InstructionCategory arg) {
      setValue(arg == null ? null : arg.getCode());
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/admin/specialhandling/OtherInstructionPopup.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class InstructionType extends SelectElement {
    public InstructionType(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public OptionElement getOptionByTypeKey(typekey.InstructionType arg) {
      return getOptionByValue(arg == null ? null : arg.getCode());
    }
    
    public typekey.InstructionType getTypeKeyValue() {
      String myValue = getValue();return myValue == null || myValue.isEmpty() ? null : typekey.InstructionType.getTypeKey(myValue);
    }
    
    public void setTypeKeyValue(typekey.InstructionType arg) {
      setValue(arg == null ? null : arg.getCode());
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/admin/specialhandling/OtherInstructionPopup.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class LocalizedValues extends PCFElement {
    public LocalizedValues(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public LocalizedValuesDV getLocalizedValuesDV() {
      return getOrCreateProperty("LocalizedValuesDV", "LocalizedValuesDV", null, pcftest.LocalizedValuesDV.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/admin/specialhandling/OtherInstructionPopup.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class OtherInstructionPopup_UpLink extends ClickableActionElement {
    public OtherInstructionPopup_UpLink(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/admin/specialhandling/OtherInstructionPopup.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class PolicyType extends SelectElement {
    public PolicyType(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public OptionElement getOptionByTypeKey(typekey.PolicyType arg) {
      return getOptionByValue(arg == null ? null : arg.getCode());
    }
    
    public typekey.PolicyType getTypeKeyValue() {
      String myValue = getValue();return myValue == null || myValue.isEmpty() ? null : typekey.PolicyType.getTypeKey(myValue);
    }
    
    public void setTypeKeyValue(typekey.PolicyType arg) {
      setValue(arg == null ? null : arg.getCode());
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/admin/specialhandling/OtherInstructionPopup.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class Update extends ClickableActionElement {
    public Update(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/admin/specialhandling/OtherInstructionPopup.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class _Paging extends ValueElementWithSetAndRefresh {
    public _Paging(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/admin/specialhandling/OtherInstructionPopup.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class __crumb__ extends ClickableActionElement {
    public __crumb__(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/admin/specialhandling/OtherInstructionPopup.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class _msgs extends MessagesElement {
    public _msgs(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  
}