package pcftest;

import gw.lang.SimplePropertyProcessing;
import gw.smoketest.platform.web.BooleanValueElement;
import gw.smoketest.platform.web.ClickableActionElement;
import gw.smoketest.platform.web.DateElement;
import gw.smoketest.platform.web.DetailViewElement;
import gw.smoketest.platform.web.OptionElement;
import gw.smoketest.platform.web.PCFElement;
import gw.smoketest.platform.web.PCFElementId;
import gw.smoketest.platform.web.PCFLocation;
import gw.smoketest.platform.web.SelectElement;
import gw.smoketest.platform.web.ValueElement;
import gw.testharness.ISmokeTest;
import javax.annotation.processing.Generated;
import pcftest.PolicyVehicleDetailPanelSet.PolicyVehicleCoverageListDetail;
import pcftest.PolicyVehicleDetailPanelSet.PolicyVehicleCoverageListDetail.EditableVehicleCoveragesLV_tb;
import pcftest.PolicyVehicleDetailPanelSet.PolicyVehicleCoverageListDetail.EditableVehicleCoveragesLV_tb.Cancel;
import pcftest.PolicyVehicleDetailPanelSet.PolicyVehicleCoverageListDetail.EditableVehicleCoveragesLV_tb.Edit;
import pcftest.PolicyVehicleDetailPanelSet.PolicyVehicleCoverageListDetail.EditableVehicleCoveragesLV_tb.Update;
import pcftest.PolicyVehicleDetailPanelSet.PolicyVehicleDetailDV;
import pcftest.PolicyVehicleDetailPanelSet.PolicyVehicleDetailDV.EditableVehicleLienholdersLV_tb;
import pcftest.PolicyVehicleDetailPanelSet.PolicyVehicleDetailDV.OffRoadStyle;
import pcftest.PolicyVehicleDetailPanelSet.PolicyVehicleDetailDV.State;
import pcftest.PolicyVehicleDetailPanelSet.PolicyVehicleDetailDV.Style;
import pcftest.PolicyVehicleDetailPanelSet.PolicyVehicleDetailDV.status_ext;
import typekey.Jurisdiction;
import typekey.OffRoadVehicleStyle;
import typekey.PolicyStatus;
import typekey.VehicleStyle;

@SimplePropertyProcessing
@Generated(comments = "config/web/pcf/claim/policy/PolicyVehicleDetailPanelSet.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
public class PolicyVehicleDetailPanelSet extends PCFElement {
  public final static String CHECKSUM = "4c2d08883526c7f32935ce9964362279";
  
  public PolicyVehicleDetailPanelSet(ISmokeTest helper, PCFElementId componentId)  {
    super(helper, componentId);
  }
  
  public PolicyVehicleCoverageListDetail getPolicyVehicleCoverageListDetail() {
    return getOrCreateProperty("PolicyVehicleCoverageListDetail", "PolicyVehicleCoverageListDetail", null, pcftest.PolicyVehicleDetailPanelSet.PolicyVehicleCoverageListDetail.class);
  }
  
  public PolicyVehicleDetailDV getPolicyVehicleDetailDV() {
    return getOrCreateProperty("PolicyVehicleDetailDV", "PolicyVehicleDetailDV", null, pcftest.PolicyVehicleDetailPanelSet.PolicyVehicleDetailDV.class);
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/claim/policy/PolicyVehicleDetailPanelSet.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class PolicyVehicleCoverageListDetail extends PCFElement {
    public PolicyVehicleCoverageListDetail(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public ClaimPolicyCovTermsCV getClaimPolicyCovTermsCV() {
      return getOrCreateProperty("ClaimPolicyCovTermsCV", "ClaimPolicyCovTermsCV", null, pcftest.ClaimPolicyCovTermsCV.class);
    }
    
    public EditableVehicleCoveragesLV getEditableVehicleCoveragesLV() {
      return getOrCreateProperty("EditableVehicleCoveragesLV", "EditableVehicleCoveragesLV", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListView, pcftest.EditableVehicleCoveragesLV.class);
    }
    
    public EditableVehicleCoveragesLV_tb getEditableVehicleCoveragesLV_tb() {
      return getOrCreateProperty("EditableVehicleCoveragesLV_tb", "EditableVehicleCoveragesLV_tb", null, pcftest.PolicyVehicleDetailPanelSet.PolicyVehicleCoverageListDetail.EditableVehicleCoveragesLV_tb.class);
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/claim/policy/PolicyVehicleDetailPanelSet.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class EditableVehicleCoveragesLV_tb extends PCFElement {
      public EditableVehicleCoveragesLV_tb(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public pcftest.PolicyVehicleDetailPanelSet.PolicyVehicleCoverageListDetail.EditableVehicleCoveragesLV_tb.Add getAdd() {
        return getOrCreateProperty("Add", "Add", null, pcftest.PolicyVehicleDetailPanelSet.PolicyVehicleCoverageListDetail.EditableVehicleCoveragesLV_tb.Add.class);
      }
      
      public Cancel getCancel() {
        return getOrCreateProperty("Cancel", "Cancel", null, pcftest.PolicyVehicleDetailPanelSet.PolicyVehicleCoverageListDetail.EditableVehicleCoveragesLV_tb.Cancel.class);
      }
      
      public Edit getEdit() {
        return getOrCreateProperty("Edit", "Edit", null, pcftest.PolicyVehicleDetailPanelSet.PolicyVehicleCoverageListDetail.EditableVehicleCoveragesLV_tb.Edit.class);
      }
      
      public pcftest.PolicyVehicleDetailPanelSet.PolicyVehicleCoverageListDetail.EditableVehicleCoveragesLV_tb.Remove getRemove() {
        return getOrCreateProperty("Remove", "Remove", null, pcftest.PolicyVehicleDetailPanelSet.PolicyVehicleCoverageListDetail.EditableVehicleCoveragesLV_tb.Remove.class);
      }
      
      public Update getUpdate() {
        return getOrCreateProperty("Update", "Update", null, pcftest.PolicyVehicleDetailPanelSet.PolicyVehicleCoverageListDetail.EditableVehicleCoveragesLV_tb.Update.class);
      }
      
      @SimplePropertyProcessing
      @Generated(comments = "config/web/pcf/claim/policy/PolicyVehicleDetailPanelSet.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
      public static class Add extends ClickableActionElement {
        public Add(ISmokeTest helper, PCFElementId componentId)  {
          super(helper, componentId);
        }
        
        public PCFLocation click() {
          return clickThis(gw.smoketest.platform.web.PCFLocation.class);
        }
        
        
      }
      
      @SimplePropertyProcessing
      @Generated(comments = "config/web/pcf/claim/policy/PolicyVehicleDetailPanelSet.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
      public static class Cancel extends ClickableActionElement {
        public Cancel(ISmokeTest helper, PCFElementId componentId)  {
          super(helper, componentId);
        }
        
        public PCFLocation click() {
          return clickThis(gw.smoketest.platform.web.PCFLocation.class);
        }
        
        
      }
      
      @SimplePropertyProcessing
      @Generated(comments = "config/web/pcf/claim/policy/PolicyVehicleDetailPanelSet.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
      public static class Edit extends ClickableActionElement {
        public Edit(ISmokeTest helper, PCFElementId componentId)  {
          super(helper, componentId);
        }
        
        public PCFLocation click() {
          return clickThis(gw.smoketest.platform.web.PCFLocation.class);
        }
        
        
      }
      
      @SimplePropertyProcessing
      @Generated(comments = "config/web/pcf/claim/policy/PolicyVehicleDetailPanelSet.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
      public static class Remove extends ClickableActionElement {
        public Remove(ISmokeTest helper, PCFElementId componentId)  {
          super(helper, componentId);
        }
        
        public PCFLocation click() {
          return clickThis(gw.smoketest.platform.web.PCFLocation.class);
        }
        
        
      }
      
      @SimplePropertyProcessing
      @Generated(comments = "config/web/pcf/claim/policy/PolicyVehicleDetailPanelSet.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
      public static class Update extends ClickableActionElement {
        public Update(ISmokeTest helper, PCFElementId componentId)  {
          super(helper, componentId);
        }
        
        public PCFLocation click() {
          return clickThis(gw.smoketest.platform.web.PCFLocation.class);
        }
        
        
      }
      
      
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/claim/policy/PolicyVehicleDetailPanelSet.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class PolicyVehicleDetailDV extends DetailViewElement {
    public PolicyVehicleDetailDV(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public pcftest.PolicyVehicleDetailPanelSet.PolicyVehicleDetailDV.BoatType getBoatType() {
      return getOrCreateProperty("BoatType", "BoatType", null, pcftest.PolicyVehicleDetailPanelSet.PolicyVehicleDetailDV.BoatType.class);
    }
    
    public ValueElement getColor() {
      return getOrCreateProperty("Color", "Color", null, gw.smoketest.platform.web.ValueElement.class);
    }
    
    public EditableVehicleLienholdersLV getEditableVehicleLienholdersLV() {
      return getOrCreateProperty("EditableVehicleLienholdersLV", "EditableVehicleLienholdersLV", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListView, pcftest.EditableVehicleLienholdersLV.class);
    }
    
    public EditableVehicleLienholdersLV_tb getEditableVehicleLienholdersLV_tb() {
      return getOrCreateProperty("EditableVehicleLienholdersLV_tb", "EditableVehicleLienholdersLV_tb", null, pcftest.PolicyVehicleDetailPanelSet.PolicyVehicleDetailDV.EditableVehicleLienholdersLV_tb.class);
    }
    
    public ValueElement getLicensePlate() {
      return getOrCreateProperty("LicensePlate", "LicensePlate", null, gw.smoketest.platform.web.ValueElement.class);
    }
    
    public ValueElement getMake() {
      return getOrCreateProperty("Make", "Make", null, gw.smoketest.platform.web.ValueElement.class);
    }
    
    public ValueElement getModel() {
      return getOrCreateProperty("Model", "Model", null, gw.smoketest.platform.web.ValueElement.class);
    }
    
    public ValueElement getNumber() {
      return getOrCreateProperty("Number", "Number", null, gw.smoketest.platform.web.ValueElement.class);
    }
    
    public OffRoadStyle getOffRoadStyle() {
      return getOrCreateProperty("OffRoadStyle", "OffRoadStyle", null, pcftest.PolicyVehicleDetailPanelSet.PolicyVehicleDetailDV.OffRoadStyle.class);
    }
    
    public ValueElement getSerialNumber() {
      return getOrCreateProperty("SerialNumber", "SerialNumber", null, gw.smoketest.platform.web.ValueElement.class);
    }
    
    public State getState() {
      return getOrCreateProperty("State", "State", null, pcftest.PolicyVehicleDetailPanelSet.PolicyVehicleDetailDV.State.class);
    }
    
    public Style getStyle() {
      return getOrCreateProperty("Style", "Style", null, pcftest.PolicyVehicleDetailPanelSet.PolicyVehicleDetailDV.Style.class);
    }
    
    public ValueElement getVIN() {
      return getOrCreateProperty("VIN", "VIN", null, gw.smoketest.platform.web.ValueElement.class);
    }
    
    public ValueElement getYear() {
      return getOrCreateProperty("Year", "Year", null, gw.smoketest.platform.web.ValueElement.class);
    }
    
    public DateElement geteffective_date_ext() {
      return getOrCreateProperty("effective_date_ext", "effective_date_ext", null, gw.smoketest.platform.web.DateElement.class);
    }
    
    public DateElement getexpiration_date_ext() {
      return getOrCreateProperty("expiration_date_ext", "expiration_date_ext", null, gw.smoketest.platform.web.DateElement.class);
    }
    
    public BooleanValueElement getrideshare_use_ext() {
      return getOrCreateProperty("rideshare_use_ext", "rideshare_use_ext", null, gw.smoketest.platform.web.BooleanValueElement.class);
    }
    
    public status_ext getstatus_ext() {
      return getOrCreateProperty("status_ext", "status_ext", null, pcftest.PolicyVehicleDetailPanelSet.PolicyVehicleDetailDV.status_ext.class);
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/claim/policy/PolicyVehicleDetailPanelSet.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class BoatType extends SelectElement {
      public BoatType(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public OptionElement getOptionByTypeKey(typekey.BoatType arg) {
        return getOptionByValue(arg == null ? null : arg.getCode());
      }
      
      public typekey.BoatType getTypeKeyValue() {
        String myValue = getValue();return myValue == null || myValue.isEmpty() ? null : typekey.BoatType.getTypeKey(myValue);
      }
      
      public void setTypeKeyValue(typekey.BoatType arg) {
        setValue(arg == null ? null : arg.getCode());
      }
      
      
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/claim/policy/PolicyVehicleDetailPanelSet.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class EditableVehicleLienholdersLV_tb extends PCFElement {
      public EditableVehicleLienholdersLV_tb(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public pcftest.PolicyVehicleDetailPanelSet.PolicyVehicleDetailDV.EditableVehicleLienholdersLV_tb.Add getAdd() {
        return getOrCreateProperty("Add", "Add", null, pcftest.PolicyVehicleDetailPanelSet.PolicyVehicleDetailDV.EditableVehicleLienholdersLV_tb.Add.class);
      }
      
      public pcftest.PolicyVehicleDetailPanelSet.PolicyVehicleDetailDV.EditableVehicleLienholdersLV_tb.Remove getRemove() {
        return getOrCreateProperty("Remove", "Remove", null, pcftest.PolicyVehicleDetailPanelSet.PolicyVehicleDetailDV.EditableVehicleLienholdersLV_tb.Remove.class);
      }
      
      @SimplePropertyProcessing
      @Generated(comments = "config/web/pcf/claim/policy/PolicyVehicleDetailPanelSet.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
      public static class Add extends ClickableActionElement {
        public Add(ISmokeTest helper, PCFElementId componentId)  {
          super(helper, componentId);
        }
        
        public PCFLocation click() {
          return clickThis(gw.smoketest.platform.web.PCFLocation.class);
        }
        
        
      }
      
      @SimplePropertyProcessing
      @Generated(comments = "config/web/pcf/claim/policy/PolicyVehicleDetailPanelSet.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
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
    @Generated(comments = "config/web/pcf/claim/policy/PolicyVehicleDetailPanelSet.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class OffRoadStyle extends SelectElement {
      public OffRoadStyle(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public OptionElement getOptionByTypeKey(OffRoadVehicleStyle arg) {
        return getOptionByValue(arg == null ? null : arg.getCode());
      }
      
      public OffRoadVehicleStyle getTypeKeyValue() {
        String myValue = getValue();return myValue == null || myValue.isEmpty() ? null : typekey.OffRoadVehicleStyle.getTypeKey(myValue);
      }
      
      public void setTypeKeyValue(OffRoadVehicleStyle arg) {
        setValue(arg == null ? null : arg.getCode());
      }
      
      
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/claim/policy/PolicyVehicleDetailPanelSet.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class State extends SelectElement {
      public State(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public OptionElement getOptionByTypeKey(Jurisdiction arg) {
        return getOptionByValue(arg == null ? null : arg.getCode());
      }
      
      public Jurisdiction getTypeKeyValue() {
        String myValue = getValue();return myValue == null || myValue.isEmpty() ? null : typekey.Jurisdiction.getTypeKey(myValue);
      }
      
      public void setTypeKeyValue(Jurisdiction arg) {
        setValue(arg == null ? null : arg.getCode());
      }
      
      
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/claim/policy/PolicyVehicleDetailPanelSet.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class Style extends SelectElement {
      public Style(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public OptionElement getOptionByTypeKey(VehicleStyle arg) {
        return getOptionByValue(arg == null ? null : arg.getCode());
      }
      
      public VehicleStyle getTypeKeyValue() {
        String myValue = getValue();return myValue == null || myValue.isEmpty() ? null : typekey.VehicleStyle.getTypeKey(myValue);
      }
      
      public void setTypeKeyValue(VehicleStyle arg) {
        setValue(arg == null ? null : arg.getCode());
      }
      
      
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/claim/policy/PolicyVehicleDetailPanelSet.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class status_ext extends SelectElement {
      public status_ext(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public OptionElement getOptionByTypeKey(PolicyStatus arg) {
        return getOptionByValue(arg == null ? null : arg.getCode());
      }
      
      public PolicyStatus getTypeKeyValue() {
        String myValue = getValue();return myValue == null || myValue.isEmpty() ? null : typekey.PolicyStatus.getTypeKey(myValue);
      }
      
      public void setTypeKeyValue(PolicyStatus arg) {
        setValue(arg == null ? null : arg.getCode());
      }
      
      
    }
    
    
  }
  
  
}