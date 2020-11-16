package pcftest;

import gw.lang.SimplePropertyProcessing;
import gw.smoketest.platform.web.ClickableActionElement;
import gw.smoketest.platform.web.DateElement;
import gw.smoketest.platform.web.DetailViewElement;
import gw.smoketest.platform.web.PCFElement;
import gw.smoketest.platform.web.PCFElementId;
import gw.smoketest.platform.web.PCFLocation;
import gw.testharness.ISmokeTest;
import javax.annotation.processing.Generated;
import pcftest.NewReplacementServicesDV.EditableServiceProviderLV_tb;
import pcftest.NewReplacementServicesDV.EditableServiceProviderLV_tb.Add;
import pcftest.NewReplacementServicesDV.EditableServiceProviderLV_tb.Remove;

@SimplePropertyProcessing
@Generated(comments = "config/web/pcf/claim/newexposure/NewReplacementServicesDV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
public class NewReplacementServicesDV extends DetailViewElement {
  public final static String CHECKSUM = "014c160f375653783f9abc8b32a493c7";
  
  public NewReplacementServicesDV(ISmokeTest helper, PCFElementId componentId)  {
    super(helper, componentId);
  }
  
  public EditableServiceProviderLV getEditableServiceProviderLV() {
    return getOrCreateProperty("EditableServiceProviderLV", "EditableServiceProviderLV", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListView, pcftest.EditableServiceProviderLV.class);
  }
  
  public EditableServiceProviderLV_tb getEditableServiceProviderLV_tb() {
    return getOrCreateProperty("EditableServiceProviderLV_tb", "EditableServiceProviderLV_tb", null, pcftest.NewReplacementServicesDV.EditableServiceProviderLV_tb.class);
  }
  
  public DateElement getLostWagesBenefits_BenefitsBeginDate() {
    return getOrCreateProperty("LostWagesBenefits_BenefitsBeginDate", "LostWagesBenefits_BenefitsBeginDate", null, gw.smoketest.platform.web.DateElement.class);
  }
  
  public DateElement getLostWagesBenefits_BenefitsEndDate() {
    return getOrCreateProperty("LostWagesBenefits_BenefitsEndDate", "LostWagesBenefits_BenefitsEndDate", null, gw.smoketest.platform.web.DateElement.class);
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/claim/newexposure/NewReplacementServicesDV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class EditableServiceProviderLV_tb extends PCFElement {
    public EditableServiceProviderLV_tb(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public Add getAdd() {
      return getOrCreateProperty("Add", "Add", null, pcftest.NewReplacementServicesDV.EditableServiceProviderLV_tb.Add.class);
    }
    
    public Remove getRemove() {
      return getOrCreateProperty("Remove", "Remove", null, pcftest.NewReplacementServicesDV.EditableServiceProviderLV_tb.Remove.class);
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/claim/newexposure/NewReplacementServicesDV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class Add extends ClickableActionElement {
      public Add(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public PCFLocation click() {
        return clickThis(gw.smoketest.platform.web.PCFLocation.class);
      }
      
      
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/claim/newexposure/NewReplacementServicesDV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class Remove extends ClickableActionElement {
      public Remove(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public PCFLocation click() {
        return clickThis(gw.smoketest.platform.web.PCFLocation.class);
      }
      
      
    }
    
    
  }
  
  
}