package pcftest;

import gw.lang.SimplePropertyProcessing;
import gw.smoketest.platform.web.ClickableActionElement;
import gw.smoketest.platform.web.DetailViewElement;
import gw.smoketest.platform.web.OptionElement;
import gw.smoketest.platform.web.PCFElement;
import gw.smoketest.platform.web.PCFElementId;
import gw.smoketest.platform.web.PCFLocation;
import gw.smoketest.platform.web.SelectElement;
import gw.smoketest.platform.web.ValueElement;
import gw.testharness.ISmokeTest;
import javax.annotation.processing.Generated;
import pcftest.NewServiceRequestDV.IncompatibleServicesAlert;
import pcftest.NewServiceRequestDV.IncompatibleServicesAlertText;
import pcftest.NewServiceRequestDV.InstructionServicesLV_tb;
import pcftest.NewServiceRequestDV.InstructionServicesLV_tb.Add;
import pcftest.NewServiceRequestDV.InstructionServicesLV_tb.AddMultipleServices;
import pcftest.NewServiceRequestDV.InstructionServicesLV_tb.Remove;
import pcftest.NewServiceRequestDV.Specialist;
import pcftest.NewServiceRequestDV.Specialist.MenuItem_Search;
import pcftest.NewServiceRequestDV.Specialist.MenuItem_ViewDetails;
import pcftest.NewServiceRequestDV.SpecialistName;

@SimplePropertyProcessing
@Generated(comments = "config/web/pcf/claim/newother/NewServiceRequestDV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
public class NewServiceRequestDV extends DetailViewElement {
  public final static String CHECKSUM = "52e2f3dc252551ca25596fc9666af7af";
  
  public NewServiceRequestDV(ISmokeTest helper, PCFElementId componentId)  {
    super(helper, componentId);
  }
  
  public IncompatibleServicesAlert getIncompatibleServicesAlert() {
    return getOrCreateProperty("IncompatibleServicesAlert", "IncompatibleServicesAlert", null, pcftest.NewServiceRequestDV.IncompatibleServicesAlert.class);
  }
  
  public IncompatibleServicesAlertText getIncompatibleServicesAlertText() {
    return getOrCreateProperty("IncompatibleServicesAlertText", "IncompatibleServicesAlertText", null, pcftest.NewServiceRequestDV.IncompatibleServicesAlertText.class);
  }
  
  public InstructionServicesLV_default getInstructionServicesLV_default() {
    return getOrCreateProperty("InstructionServicesLV_default", "InstructionServicesLV", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListView, pcftest.InstructionServicesLV_default.class);
  }
  
  public InstructionServicesLV_tb getInstructionServicesLV_tb() {
    return getOrCreateProperty("InstructionServicesLV_tb", "InstructionServicesLV_tb", null, pcftest.NewServiceRequestDV.InstructionServicesLV_tb.class);
  }
  
  public SelectElement getKind() {
    return getOrCreateProperty("Kind", "Kind", null, gw.smoketest.platform.web.SelectElement.class);
  }
  
  public NewServiceRequestInstructionInputSet_default getNewServiceRequestInstructionInputSet_default() {
    return getOrCreateProperty("NewServiceRequestInstructionInputSet_default", "NewServiceRequestInstructionInputSet", null, pcftest.NewServiceRequestInstructionInputSet_default.class);
  }
  
  public NewServiceRequestInstructionInputSet_rental getNewServiceRequestInstructionInputSet_rental() {
    return getOrCreateProperty("NewServiceRequestInstructionInputSet_rental", "NewServiceRequestInstructionInputSet", null, pcftest.NewServiceRequestInstructionInputSet_rental.class);
  }
  
  public SelectElement getRelatedTo() {
    return getOrCreateProperty("RelatedTo", "RelatedTo", null, gw.smoketest.platform.web.SelectElement.class);
  }
  
  public ValueElement getRelatedToName() {
    return getOrCreateProperty("RelatedToName", "RelatedToName", null, gw.smoketest.platform.web.ValueElement.class);
  }
  
  public Specialist getSpecialist() {
    return getOrCreateProperty("Specialist", "Specialist", null, pcftest.NewServiceRequestDV.Specialist.class);
  }
  
  public ValueElement getSpecialistAddress() {
    return getOrCreateProperty("SpecialistAddress", "SpecialistAddress", null, gw.smoketest.platform.web.ValueElement.class);
  }
  
  public pcftest.NewServiceRequestDV.SpecialistCommMethod getSpecialistCommMethod() {
    return getOrCreateProperty("SpecialistCommMethod", "SpecialistCommMethod", null, pcftest.NewServiceRequestDV.SpecialistCommMethod.class);
  }
  
  public SpecialistName getSpecialistName() {
    return getOrCreateProperty("SpecialistName", "SpecialistName", null, pcftest.NewServiceRequestDV.SpecialistName.class);
  }
  
  public ValueElement getSpecialistPhone() {
    return getOrCreateProperty("SpecialistPhone", "SpecialistPhone", null, gw.smoketest.platform.web.ValueElement.class);
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/claim/newother/NewServiceRequestDV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class IncompatibleServicesAlert extends ClickableActionElement {
    public IncompatibleServicesAlert(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/claim/newother/NewServiceRequestDV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class IncompatibleServicesAlertText extends ClickableActionElement {
    public IncompatibleServicesAlertText(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/claim/newother/NewServiceRequestDV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class InstructionServicesLV_tb extends PCFElement {
    public InstructionServicesLV_tb(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public Add getAdd() {
      return getOrCreateProperty("Add", "Add", null, pcftest.NewServiceRequestDV.InstructionServicesLV_tb.Add.class);
    }
    
    public AddMultipleServices getAddMultipleServices() {
      return getOrCreateProperty("AddMultipleServices", "AddMultipleServices", null, pcftest.NewServiceRequestDV.InstructionServicesLV_tb.AddMultipleServices.class);
    }
    
    public Remove getRemove() {
      return getOrCreateProperty("Remove", "Remove", null, pcftest.NewServiceRequestDV.InstructionServicesLV_tb.Remove.class);
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/claim/newother/NewServiceRequestDV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class Add extends ClickableActionElement {
      public Add(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public PCFLocation click() {
        return clickThis(gw.smoketest.platform.web.PCFLocation.class);
      }
      
      
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/claim/newother/NewServiceRequestDV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class AddMultipleServices extends ClickableActionElement {
      public AddMultipleServices(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public PCFLocation click() {
        return clickThis(gw.smoketest.platform.web.PCFLocation.class);
      }
      
      
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/claim/newother/NewServiceRequestDV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class Remove extends ClickableActionElement {
      public Remove(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public PCFLocation click() {
        return clickThis(gw.smoketest.platform.web.PCFLocation.class);
      }
      
      
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/widgets/ClaimContactWidget.xml", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class Specialist extends SelectElement {
    public Specialist(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public ClaimContactDetailPopup click() {
      return clickThis(pcftest.ClaimContactDetailPopup.class);
    }
    
    public ClaimNewServiceRequestSpecialistPickerMenuItemSet getClaimNewServiceRequestSpecialistPickerMenuItemSet() {
      return getOrCreateProperty("ClaimNewServiceRequestSpecialistPickerMenuItemSet", "ClaimNewServiceRequestSpecialistPickerMenuItemSet", null, pcftest.ClaimNewServiceRequestSpecialistPickerMenuItemSet.class);
    }
    
    public MenuItem_Search getMenuItem_Search() {
      return getOrCreateProperty("MenuItem_Search", "MenuItem_Search", null, pcftest.NewServiceRequestDV.Specialist.MenuItem_Search.class);
    }
    
    public MenuItem_ViewDetails getMenuItem_ViewDetails() {
      return getOrCreateProperty("MenuItem_ViewDetails", "MenuItem_ViewDetails", null, pcftest.NewServiceRequestDV.Specialist.MenuItem_ViewDetails.class);
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/widgets/ClaimContactWidget.xml", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class MenuItem_Search extends ClickableActionElement {
      public MenuItem_Search(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public AddressBookPickerPopup click() {
        return clickThis(pcftest.AddressBookPickerPopup.class);
      }
      
      
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/widgets/ClaimContactWidget.xml", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class MenuItem_ViewDetails extends ClickableActionElement {
      public MenuItem_ViewDetails(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public PCFLocation click() {
        return clickThis(gw.smoketest.platform.web.PCFLocation.class);
      }
      
      
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/claim/newother/NewServiceRequestDV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class SpecialistCommMethod extends SelectElement {
    public SpecialistCommMethod(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public OptionElement getOptionByTypeKey(typekey.SpecialistCommMethod arg) {
      return getOptionByValue(arg == null ? null : arg.getCode());
    }
    
    public typekey.SpecialistCommMethod getTypeKeyValue() {
      String myValue = getValue();return myValue == null || myValue.isEmpty() ? null : typekey.SpecialistCommMethod.getTypeKey(myValue);
    }
    
    public void setTypeKeyValue(typekey.SpecialistCommMethod arg) {
      setValue(arg == null ? null : arg.getCode());
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/claim/newother/NewServiceRequestDV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class SpecialistName extends ValueElement {
    public SpecialistName(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public ClaimContactDetailPopup click() {
      return clickThis(pcftest.ClaimContactDetailPopup.class);
    }
    
    
  }
  
  
}