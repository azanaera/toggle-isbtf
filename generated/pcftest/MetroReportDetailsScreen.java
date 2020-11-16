package pcftest;

import gw.lang.SimplePropertyProcessing;
import gw.smoketest.platform.web.BooleanValueElement;
import gw.smoketest.platform.web.ClickableActionElement;
import gw.smoketest.platform.web.DateElement;
import gw.smoketest.platform.web.DetailViewElement;
import gw.smoketest.platform.web.MessagesElement;
import gw.smoketest.platform.web.OptionElement;
import gw.smoketest.platform.web.PCFElement;
import gw.smoketest.platform.web.PCFElementId;
import gw.smoketest.platform.web.PCFLocation;
import gw.smoketest.platform.web.SelectElement;
import gw.smoketest.platform.web.ValueElement;
import gw.testharness.ISmokeTest;
import javax.annotation.processing.Generated;
import pcftest.MetroReportDetailsScreen.Cancel;
import pcftest.MetroReportDetailsScreen.Edit;
import pcftest.MetroReportDetailsScreen.MetroReportDetailsDV;
import pcftest.MetroReportDetailsScreen.MetroReportDetailsDV.DeferralReasonLink;
import pcftest.MetroReportDetailsScreen.MetroReportDetailsDV.HoldReasonLink;
import pcftest.MetroReportDetailsScreen.MetroReportDetailsDV.MetroDeceased;
import pcftest.MetroReportDetailsScreen.MetroReportDetailsDV.MetroDeceased.MenuItem_Search;
import pcftest.MetroReportDetailsScreen.MetroReportDetailsDV.MetroDeceased.MenuItem_ViewDetails;
import pcftest.MetroReportDetailsScreen.MetroReportDetailsDV.MetroInvestAgencyState;
import pcftest.MetroReportDetailsScreen.MetroReportDetailsDV.MetroInvestAgency_Type;
import pcftest.MetroReportDetailsScreen.MetroReportDetailsDV.MetroStatus;
import pcftest.MetroReportDetailsScreen.Update;
import pcftest.MetroReportDetailsScreen._msgs;
import typekey.MetroAgencyType;
import typekey.MetroReportStatus;
import typekey.State;

@SimplePropertyProcessing
@Generated(comments = "config/web/pcf/claim/lossdetails/metro/MetroReportDetailsScreen.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
public class MetroReportDetailsScreen extends PCFElement {
  public final static String CHECKSUM = "f2f56a6a8ff1f97a0e7818a5820442ea";
  
  public MetroReportDetailsScreen(ISmokeTest helper, PCFElementId componentId)  {
    super(helper, componentId);
  }
  
  public Cancel getCancel() {
    return getOrCreateProperty("Cancel", "Cancel", null, pcftest.MetroReportDetailsScreen.Cancel.class);
  }
  
  public Edit getEdit() {
    return getOrCreateProperty("Edit", "Edit", null, pcftest.MetroReportDetailsScreen.Edit.class);
  }
  
  public MetroReportDetailsDV getMetroReportDetailsDV() {
    return getOrCreateProperty("MetroReportDetailsDV", "MetroReportDetailsDV", null, pcftest.MetroReportDetailsScreen.MetroReportDetailsDV.class);
  }
  
  public Update getUpdate() {
    return getOrCreateProperty("Update", "Update", null, pcftest.MetroReportDetailsScreen.Update.class);
  }
  
  public _msgs get_msgs() {
    return getOrCreateProperty("_msgs", "_msgs", null, pcftest.MetroReportDetailsScreen._msgs.class);
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/claim/lossdetails/metro/MetroReportDetailsScreen.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class Cancel extends ClickableActionElement {
    public Cancel(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/claim/lossdetails/metro/MetroReportDetailsScreen.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class Edit extends ClickableActionElement {
    public Edit(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/claim/lossdetails/metro/MetroReportDetailsScreen.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class MetroReportDetailsDV extends DetailViewElement {
    public MetroReportDetailsDV(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public DeferralReasonLink getDeferralReasonLink() {
      return getOrCreateProperty("DeferralReasonLink", "DeferralReasonLink", null, pcftest.MetroReportDetailsScreen.MetroReportDetailsDV.DeferralReasonLink.class);
    }
    
    public BooleanValueElement getForceDuplicate() {
      return getOrCreateProperty("ForceDuplicate", "ForceDuplicate", null, gw.smoketest.platform.web.BooleanValueElement.class);
    }
    
    public HoldReasonLink getHoldReasonLink() {
      return getOrCreateProperty("HoldReasonLink", "HoldReasonLink", null, pcftest.MetroReportDetailsScreen.MetroReportDetailsDV.HoldReasonLink.class);
    }
    
    public ValueElement getInsuredDriverAddress() {
      return getOrCreateProperty("InsuredDriverAddress", "InsuredDriverAddress", null, gw.smoketest.platform.web.ValueElement.class);
    }
    
    public ValueElement getInsuredDriverName() {
      return getOrCreateProperty("InsuredDriverName", "InsuredDriverName", null, gw.smoketest.platform.web.ValueElement.class);
    }
    
    public SelectElement getInsuredVehicle() {
      return getOrCreateProperty("InsuredVehicle", "InsuredVehicle", null, gw.smoketest.platform.web.SelectElement.class);
    }
    
    public DateElement getMetroDateReceived() {
      return getOrCreateProperty("MetroDateReceived", "MetroDateReceived", null, gw.smoketest.platform.web.DateElement.class);
    }
    
    public DateElement getMetroDateSent() {
      return getOrCreateProperty("MetroDateSent", "MetroDateSent", null, gw.smoketest.platform.web.DateElement.class);
    }
    
    public MetroDeceased getMetroDeceased() {
      return getOrCreateProperty("MetroDeceased", "MetroDeceased", null, pcftest.MetroReportDetailsScreen.MetroReportDetailsDV.MetroDeceased.class);
    }
    
    public DateElement getMetroDeceasedDOD() {
      return getOrCreateProperty("MetroDeceasedDOD", "MetroDeceasedDOD", null, gw.smoketest.platform.web.DateElement.class);
    }
    
    public ValueElement getMetroFailedReason() {
      return getOrCreateProperty("MetroFailedReason", "MetroFailedReason", null, gw.smoketest.platform.web.ValueElement.class);
    }
    
    public ValueElement getMetroInvestAgencyCity() {
      return getOrCreateProperty("MetroInvestAgencyCity", "MetroInvestAgencyCity", null, gw.smoketest.platform.web.ValueElement.class);
    }
    
    public MetroInvestAgencyState getMetroInvestAgencyState() {
      return getOrCreateProperty("MetroInvestAgencyState", "MetroInvestAgencyState", null, pcftest.MetroReportDetailsScreen.MetroReportDetailsDV.MetroInvestAgencyState.class);
    }
    
    public DateElement getMetroInvestAgency_DateReported() {
      return getOrCreateProperty("MetroInvestAgency_DateReported", "MetroInvestAgency_DateReported", null, gw.smoketest.platform.web.DateElement.class);
    }
    
    public ValueElement getMetroInvestAgency_Name() {
      return getOrCreateProperty("MetroInvestAgency_Name", "MetroInvestAgency_Name", null, gw.smoketest.platform.web.ValueElement.class);
    }
    
    public ValueElement getMetroInvestAgency_OfficerNumber() {
      return getOrCreateProperty("MetroInvestAgency_OfficerNumber", "MetroInvestAgency_OfficerNumber", null, gw.smoketest.platform.web.ValueElement.class);
    }
    
    public ValueElement getMetroInvestAgency_Precinct() {
      return getOrCreateProperty("MetroInvestAgency_Precinct", "MetroInvestAgency_Precinct", null, gw.smoketest.platform.web.ValueElement.class);
    }
    
    public ValueElement getMetroInvestAgency_ReportNumber() {
      return getOrCreateProperty("MetroInvestAgency_ReportNumber", "MetroInvestAgency_ReportNumber", null, gw.smoketest.platform.web.ValueElement.class);
    }
    
    public MetroInvestAgency_Type getMetroInvestAgency_Type() {
      return getOrCreateProperty("MetroInvestAgency_Type", "MetroInvestAgency_Type", null, pcftest.MetroReportDetailsScreen.MetroReportDetailsDV.MetroInvestAgency_Type.class);
    }
    
    public ValueElement getMetroLossDescription() {
      return getOrCreateProperty("MetroLossDescription", "MetroLossDescription", null, gw.smoketest.platform.web.ValueElement.class);
    }
    
    public ValueElement getMetroOrderBy() {
      return getOrCreateProperty("MetroOrderBy", "MetroOrderBy", null, gw.smoketest.platform.web.ValueElement.class);
    }
    
    public pcftest.MetroReportDetailsScreen.MetroReportDetailsDV.MetroReportType getMetroReportType() {
      return getOrCreateProperty("MetroReportType", "MetroReportType", null, pcftest.MetroReportDetailsScreen.MetroReportDetailsDV.MetroReportType.class);
    }
    
    public MetroStatus getMetroStatus() {
      return getOrCreateProperty("MetroStatus", "MetroStatus", null, pcftest.MetroReportDetailsScreen.MetroReportDetailsDV.MetroStatus.class);
    }
    
    public ValueElement getThirdPartyDriverAddress() {
      return getOrCreateProperty("ThirdPartyDriverAddress", "ThirdPartyDriverAddress", null, gw.smoketest.platform.web.ValueElement.class);
    }
    
    public ValueElement getThirdPartyDriverName() {
      return getOrCreateProperty("ThirdPartyDriverName", "ThirdPartyDriverName", null, gw.smoketest.platform.web.ValueElement.class);
    }
    
    public SelectElement getThirdPartyVehicle() {
      return getOrCreateProperty("ThirdPartyVehicle", "ThirdPartyVehicle", null, gw.smoketest.platform.web.SelectElement.class);
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/claim/lossdetails/metro/MetroReportDetailsScreen.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class DeferralReasonLink extends ClickableActionElement {
      public DeferralReasonLink(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public MetroURL click() {
        return clickThis(pcftest.MetroURL.class);
      }
      
      
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/claim/lossdetails/metro/MetroReportDetailsScreen.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class HoldReasonLink extends ClickableActionElement {
      public HoldReasonLink(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public MetroURL click() {
        return clickThis(pcftest.MetroURL.class);
      }
      
      
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/widgets/ClaimContactWidget.xml", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class MetroDeceased extends SelectElement {
      public MetroDeceased(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public ClaimContactDetailPopup click() {
        return clickThis(pcftest.ClaimContactDetailPopup.class);
      }
      
      public ClaimNewPersonOnlyPickerMenuItemSet getClaimNewPersonOnlyPickerMenuItemSet() {
        return getOrCreateProperty("ClaimNewPersonOnlyPickerMenuItemSet", "ClaimNewPersonOnlyPickerMenuItemSet", null, pcftest.ClaimNewPersonOnlyPickerMenuItemSet.class);
      }
      
      public MenuItem_Search getMenuItem_Search() {
        return getOrCreateProperty("MenuItem_Search", "MenuItem_Search", null, pcftest.MetroReportDetailsScreen.MetroReportDetailsDV.MetroDeceased.MenuItem_Search.class);
      }
      
      public MenuItem_ViewDetails getMenuItem_ViewDetails() {
        return getOrCreateProperty("MenuItem_ViewDetails", "MenuItem_ViewDetails", null, pcftest.MetroReportDetailsScreen.MetroReportDetailsDV.MetroDeceased.MenuItem_ViewDetails.class);
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
    @Generated(comments = "config/web/pcf/claim/lossdetails/metro/MetroReportDetailsScreen.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class MetroInvestAgencyState extends SelectElement {
      public MetroInvestAgencyState(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public OptionElement getOptionByTypeKey(State arg) {
        return getOptionByValue(arg == null ? null : arg.getCode());
      }
      
      public State getTypeKeyValue() {
        String myValue = getValue();return myValue == null || myValue.isEmpty() ? null : typekey.State.getTypeKey(myValue);
      }
      
      public void setTypeKeyValue(State arg) {
        setValue(arg == null ? null : arg.getCode());
      }
      
      
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/claim/lossdetails/metro/MetroReportDetailsScreen.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class MetroInvestAgency_Type extends SelectElement {
      public MetroInvestAgency_Type(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public OptionElement getOptionByTypeKey(MetroAgencyType arg) {
        return getOptionByValue(arg == null ? null : arg.getCode());
      }
      
      public MetroAgencyType getTypeKeyValue() {
        String myValue = getValue();return myValue == null || myValue.isEmpty() ? null : typekey.MetroAgencyType.getTypeKey(myValue);
      }
      
      public void setTypeKeyValue(MetroAgencyType arg) {
        setValue(arg == null ? null : arg.getCode());
      }
      
      
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/claim/lossdetails/metro/MetroReportDetailsScreen.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class MetroReportType extends SelectElement {
      public MetroReportType(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public OptionElement getOptionByTypeKey(typekey.MetroReportType arg) {
        return getOptionByValue(arg == null ? null : arg.getCode());
      }
      
      public typekey.MetroReportType getTypeKeyValue() {
        String myValue = getValue();return myValue == null || myValue.isEmpty() ? null : typekey.MetroReportType.getTypeKey(myValue);
      }
      
      public void setTypeKeyValue(typekey.MetroReportType arg) {
        setValue(arg == null ? null : arg.getCode());
      }
      
      
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/claim/lossdetails/metro/MetroReportDetailsScreen.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class MetroStatus extends SelectElement {
      public MetroStatus(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public OptionElement getOptionByTypeKey(MetroReportStatus arg) {
        return getOptionByValue(arg == null ? null : arg.getCode());
      }
      
      public MetroReportStatus getTypeKeyValue() {
        String myValue = getValue();return myValue == null || myValue.isEmpty() ? null : typekey.MetroReportStatus.getTypeKey(myValue);
      }
      
      public void setTypeKeyValue(MetroReportStatus arg) {
        setValue(arg == null ? null : arg.getCode());
      }
      
      
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/claim/lossdetails/metro/MetroReportDetailsScreen.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class Update extends ClickableActionElement {
    public Update(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/claim/lossdetails/metro/MetroReportDetailsScreen.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class _msgs extends MessagesElement {
    public _msgs(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  
}