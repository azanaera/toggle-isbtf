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
import pcftest.ClaimAssociationDetailDV.EditableClaimsInAssociationLV_tb;
import pcftest.ClaimAssociationDetailDV.EditableClaimsInAssociationLV_tb.Add;
import pcftest.ClaimAssociationDetailDV.EditableClaimsInAssociationLV_tb.Remove;
import pcftest.ClaimAssociationDetailDV.Type;
import typekey.ClaimAssocType;

@SimplePropertyProcessing
@Generated(comments = "config/web/pcf/claim/lossdetails/associations/ClaimAssociationDetailDV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
public class ClaimAssociationDetailDV extends DetailViewElement {
  public final static String CHECKSUM = "0ec456b6ba4b558dac56652ce8cee44d";
  
  public ClaimAssociationDetailDV(ISmokeTest helper, PCFElementId componentId)  {
    super(helper, componentId);
  }
  
  public ValueElement getDescription() {
    return getOrCreateProperty("Description", "Description", null, gw.smoketest.platform.web.ValueElement.class);
  }
  
  public EditableClaimsInAssociationLV getEditableClaimsInAssociationLV() {
    return getOrCreateProperty("EditableClaimsInAssociationLV", "EditableClaimsInAssociationLV", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListView, pcftest.EditableClaimsInAssociationLV.class);
  }
  
  public EditableClaimsInAssociationLV_tb getEditableClaimsInAssociationLV_tb() {
    return getOrCreateProperty("EditableClaimsInAssociationLV_tb", "EditableClaimsInAssociationLV_tb", null, pcftest.ClaimAssociationDetailDV.EditableClaimsInAssociationLV_tb.class);
  }
  
  public ValueElement getTitle() {
    return getOrCreateProperty("Title", "Title", null, gw.smoketest.platform.web.ValueElement.class);
  }
  
  public Type getType() {
    return getOrCreateProperty("Type", "Type", null, pcftest.ClaimAssociationDetailDV.Type.class);
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/claim/lossdetails/associations/ClaimAssociationDetailDV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class EditableClaimsInAssociationLV_tb extends PCFElement {
    public EditableClaimsInAssociationLV_tb(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public Add getAdd() {
      return getOrCreateProperty("Add", "Add", null, pcftest.ClaimAssociationDetailDV.EditableClaimsInAssociationLV_tb.Add.class);
    }
    
    public Remove getRemove() {
      return getOrCreateProperty("Remove", "Remove", null, pcftest.ClaimAssociationDetailDV.EditableClaimsInAssociationLV_tb.Remove.class);
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/claim/lossdetails/associations/ClaimAssociationDetailDV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class Add extends ClickableActionElement {
      public Add(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public PCFLocation click() {
        return clickThis(gw.smoketest.platform.web.PCFLocation.class);
      }
      
      
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/claim/lossdetails/associations/ClaimAssociationDetailDV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
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
  @Generated(comments = "config/web/pcf/claim/lossdetails/associations/ClaimAssociationDetailDV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class Type extends SelectElement {
    public Type(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public OptionElement getOptionByTypeKey(ClaimAssocType arg) {
      return getOptionByValue(arg == null ? null : arg.getCode());
    }
    
    public ClaimAssocType getTypeKeyValue() {
      String myValue = getValue();return myValue == null || myValue.isEmpty() ? null : typekey.ClaimAssocType.getTypeKey(myValue);
    }
    
    public void setTypeKeyValue(ClaimAssocType arg) {
      setValue(arg == null ? null : arg.getCode());
    }
    
    
  }
  
  
}