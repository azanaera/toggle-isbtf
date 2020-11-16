package pcftest;

import gw.lang.SimplePropertyProcessing;
import gw.smoketest.platform.web.ClickableActionElement;
import gw.smoketest.platform.web.MessagesElement;
import gw.smoketest.platform.web.OptionElement;
import gw.smoketest.platform.web.PCFElement;
import gw.smoketest.platform.web.PCFElementId;
import gw.smoketest.platform.web.PCFLocation;
import gw.smoketest.platform.web.SelectElement;
import gw.smoketest.platform.web.ValueElementWithSetAndRefresh;
import gw.testharness.ISmokeTest;
import javax.annotation.processing.Generated;
import pcftest.CovTermPopup.Cancel;
import pcftest.CovTermPopup.CovTermPopup_UpLink;
import pcftest.CovTermPopup.CovTermTypeDetailsInputSet;
import pcftest.CovTermPopup.Edit;
import pcftest.CovTermPopup.ModelAggregation;
import pcftest.CovTermPopup.ModelRestriction;
import pcftest.CovTermPopup.Type;
import pcftest.CovTermPopup.Update;
import pcftest.CovTermPopup._Paging;
import pcftest.CovTermPopup.__crumb__;
import pcftest.CovTermPopup._msgs;
import typekey.CovTerm;
import typekey.CovTermModelAgg;
import typekey.CovTermModelRest;

@SimplePropertyProcessing
@Generated(comments = "config/web/pcf/claim/policy/CovTerm/CovTermPopup.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
public class CovTermPopup extends PCFLocation {
  public final static String CHECKSUM = "49c4577ec0dda6a815ffc62853c374e1";
  
  public CovTermPopup(ISmokeTest helper)  {
    super(helper, new gw.smoketest.platform.web.PCFElementId("CovTermPopup"));
  }
  
  public Cancel getCancel() {
    return getOrCreateProperty("Cancel", "Cancel", null, pcftest.CovTermPopup.Cancel.class);
  }
  
  public SelectElement getCovTermPattern() {
    return getOrCreateProperty("CovTermPattern", "CovTermPattern", null, gw.smoketest.platform.web.SelectElement.class);
  }
  
  public CovTermPopup_UpLink getCovTermPopup_UpLink() {
    return getOrCreateProperty("CovTermPopup_UpLink", "CovTermPopup_UpLink", null, pcftest.CovTermPopup.CovTermPopup_UpLink.class);
  }
  
  public CovTermTypeDetailsInputSet getCovTermTypeDetailsInputSet() {
    return getOrCreateProperty("CovTermTypeDetailsInputSet", "CovTermTypeDetailsInputSet", null, pcftest.CovTermPopup.CovTermTypeDetailsInputSet.class);
  }
  
  public Edit getEdit() {
    return getOrCreateProperty("Edit", "Edit", null, pcftest.CovTermPopup.Edit.class);
  }
  
  public ModelAggregation getModelAggregation() {
    return getOrCreateProperty("ModelAggregation", "ModelAggregation", null, pcftest.CovTermPopup.ModelAggregation.class);
  }
  
  public ModelRestriction getModelRestriction() {
    return getOrCreateProperty("ModelRestriction", "ModelRestriction", null, pcftest.CovTermPopup.ModelRestriction.class);
  }
  
  public Type getType() {
    return getOrCreateProperty("Type", "Type", null, pcftest.CovTermPopup.Type.class);
  }
  
  public Update getUpdate() {
    return getOrCreateProperty("Update", "Update", null, pcftest.CovTermPopup.Update.class);
  }
  
  public _Paging get_Paging() {
    return getOrCreateProperty("_Paging", "_Paging", null, pcftest.CovTermPopup._Paging.class);
  }
  
  public __crumb__ get__crumb__() {
    return getOrCreateProperty("__crumb__", "__crumb__", null, pcftest.CovTermPopup.__crumb__.class);
  }
  
  public _msgs get_msgs() {
    return getOrCreateProperty("_msgs", "_msgs", null, pcftest.CovTermPopup._msgs.class);
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/claim/policy/CovTerm/CovTermPopup.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class Cancel extends ClickableActionElement {
    public Cancel(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/claim/policy/CovTerm/CovTermPopup.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class CovTermPopup_UpLink extends ClickableActionElement {
    public CovTermPopup_UpLink(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/claim/policy/CovTerm/CovTermPopup.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class CovTermTypeDetailsInputSet extends PCFElement {
    public CovTermTypeDetailsInputSet(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public CovTermTypeDetailsInputSet_Classification getCovTermTypeDetailsInputSet_Classification() {
      return getOrCreateProperty("CovTermTypeDetailsInputSet_Classification", "CovTermTypeDetailsInputSet", null, pcftest.CovTermTypeDetailsInputSet_Classification.class);
    }
    
    public CovTermTypeDetailsInputSet_Financial getCovTermTypeDetailsInputSet_Financial() {
      return getOrCreateProperty("CovTermTypeDetailsInputSet_Financial", "CovTermTypeDetailsInputSet", null, pcftest.CovTermTypeDetailsInputSet_Financial.class);
    }
    
    public CovTermTypeDetailsInputSet_Numeric getCovTermTypeDetailsInputSet_Numeric() {
      return getOrCreateProperty("CovTermTypeDetailsInputSet_Numeric", "CovTermTypeDetailsInputSet", null, pcftest.CovTermTypeDetailsInputSet_Numeric.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/claim/policy/CovTerm/CovTermPopup.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class Edit extends ClickableActionElement {
    public Edit(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/claim/policy/CovTerm/CovTermPopup.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class ModelAggregation extends SelectElement {
    public ModelAggregation(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public OptionElement getOptionByTypeKey(CovTermModelAgg arg) {
      return getOptionByValue(arg == null ? null : arg.getCode());
    }
    
    public CovTermModelAgg getTypeKeyValue() {
      String myValue = getValue();return myValue == null || myValue.isEmpty() ? null : typekey.CovTermModelAgg.getTypeKey(myValue);
    }
    
    public void setTypeKeyValue(CovTermModelAgg arg) {
      setValue(arg == null ? null : arg.getCode());
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/claim/policy/CovTerm/CovTermPopup.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class ModelRestriction extends SelectElement {
    public ModelRestriction(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public OptionElement getOptionByTypeKey(CovTermModelRest arg) {
      return getOptionByValue(arg == null ? null : arg.getCode());
    }
    
    public CovTermModelRest getTypeKeyValue() {
      String myValue = getValue();return myValue == null || myValue.isEmpty() ? null : typekey.CovTermModelRest.getTypeKey(myValue);
    }
    
    public void setTypeKeyValue(CovTermModelRest arg) {
      setValue(arg == null ? null : arg.getCode());
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/claim/policy/CovTerm/CovTermPopup.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class Type extends SelectElement {
    public Type(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public OptionElement getOptionByTypeKey(CovTerm arg) {
      return getOptionByValue(arg == null ? null : arg.getCode());
    }
    
    public CovTerm getTypeKeyValue() {
      String myValue = getValue();return myValue == null || myValue.isEmpty() ? null : typekey.CovTerm.getTypeKey(myValue);
    }
    
    public void setTypeKeyValue(CovTerm arg) {
      setValue(arg == null ? null : arg.getCode());
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/claim/policy/CovTerm/CovTermPopup.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class Update extends ClickableActionElement {
    public Update(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/claim/policy/CovTerm/CovTermPopup.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class _Paging extends ValueElementWithSetAndRefresh {
    public _Paging(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/claim/policy/CovTerm/CovTermPopup.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class __crumb__ extends ClickableActionElement {
    public __crumb__(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/claim/policy/CovTerm/CovTermPopup.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class _msgs extends MessagesElement {
    public _msgs(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  
}