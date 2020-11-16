package pcftest;

import gw.lang.SimplePropertyProcessing;
import gw.smoketest.platform.web.BooleanValueElement;
import gw.smoketest.platform.web.CheckboxValueElement;
import gw.smoketest.platform.web.ClickableActionElement;
import gw.smoketest.platform.web.DateElement;
import gw.smoketest.platform.web.IteratorEntries;
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
import pcftest.ClaimStatus.Cancel;
import pcftest.ClaimStatus.ClaimStatus2;
import pcftest.ClaimStatus.ClaimStatus_UpLink;
import pcftest.ClaimStatus.ClaimValidationLevel;
import pcftest.ClaimStatus.Edit;
import pcftest.ClaimStatus.LineOfBusiness;
import pcftest.ClaimStatus.PrimaryUser;
import pcftest.ClaimStatus.RemoveFlagButton;
import pcftest.ClaimStatus.ReopenedReason;
import pcftest.ClaimStatus.Resolution;
import pcftest.ClaimStatus.SpecialClaimPermission;
import pcftest.ClaimStatus.Update;
import pcftest.ClaimStatus.Workload;
import pcftest.ClaimStatus._Paging;
import pcftest.ClaimStatus.__crumb__;
import pcftest.ClaimStatus._msgs;
import pcftest.ClaimStatus.entry;
import pcftest.ClaimStatus.entry.IndicatorType;
import typekey.ClaimClosedOutcomeType;
import typekey.ClaimReopenedReason;
import typekey.ClaimSecurityType;
import typekey.ClaimState;
import typekey.LOBCode;
import typekey.ValidationLevel;

@SimplePropertyProcessing
@Generated(comments = "config/web/pcf/claim/summary/ClaimStatus.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
public class ClaimStatus extends PCFLocation {
  public final static String CHECKSUM = "ba82c80ce6f9877457423398fd83bfd3";
  
  public ClaimStatus(ISmokeTest helper)  {
    super(helper, new gw.smoketest.platform.web.PCFElementId("ClaimStatus"));
  }
  
  public Cancel getCancel() {
    return getOrCreateProperty("Cancel", "Cancel", null, pcftest.ClaimStatus.Cancel.class);
  }
  
  public pcftest.ClaimStatus.ClaimSegment getClaimSegment() {
    return getOrCreateProperty("ClaimSegment", "ClaimSegment", null, pcftest.ClaimStatus.ClaimSegment.class);
  }
  
  public ClaimStatus2 getClaimStatus() {
    return getOrCreateProperty("ClaimStatus", "ClaimStatus", null, pcftest.ClaimStatus.ClaimStatus2.class);
  }
  
  public ClaimStatus_UpLink getClaimStatus_UpLink() {
    return getOrCreateProperty("ClaimStatus_UpLink", "ClaimStatus_UpLink", null, pcftest.ClaimStatus.ClaimStatus_UpLink.class);
  }
  
  public pcftest.ClaimStatus.ClaimStrategy getClaimStrategy() {
    return getOrCreateProperty("ClaimStrategy", "ClaimStrategy", null, pcftest.ClaimStatus.ClaimStrategy.class);
  }
  
  public ClaimValidationLevel getClaimValidationLevel() {
    return getOrCreateProperty("ClaimValidationLevel", "ClaimValidationLevel", null, pcftest.ClaimStatus.ClaimValidationLevel.class);
  }
  
  public DateElement getCloseDate() {
    return getOrCreateProperty("CloseDate", "CloseDate", null, gw.smoketest.platform.web.DateElement.class);
  }
  
  public DateElement getCreateDate() {
    return getOrCreateProperty("CreateDate", "CreateDate", null, gw.smoketest.platform.web.DateElement.class);
  }
  
  public DateElement getDateReported() {
    return getOrCreateProperty("DateReported", "DateReported", null, gw.smoketest.platform.web.DateElement.class);
  }
  
  public ValueElement getDaysOpen() {
    return getOrCreateProperty("DaysOpen", "DaysOpen", null, gw.smoketest.platform.web.ValueElement.class);
  }
  
  public Edit getEdit() {
    return getOrCreateProperty("Edit", "Edit", null, pcftest.ClaimStatus.Edit.class);
  }
  
  public BooleanValueElement getISOEnabled() {
    return getOrCreateProperty("ISOEnabled", "ISOEnabled", null, gw.smoketest.platform.web.BooleanValueElement.class);
  }
  
  public CheckboxValueElement getIncidentOnly() {
    return getOrCreateProperty("IncidentOnly", "IncidentOnly", gw.smoketest.platform.web.PCFElementId.PCFElementScope.BooleanCheckboxValue, gw.smoketest.platform.web.CheckboxValueElement.class);
  }
  
  public LineOfBusiness getLineOfBusiness() {
    return getOrCreateProperty("LineOfBusiness", "LineOfBusiness", null, pcftest.ClaimStatus.LineOfBusiness.class);
  }
  
  public pcftest.ClaimStatus.LossType getLossType() {
    return getOrCreateProperty("LossType", "LossType", null, pcftest.ClaimStatus.LossType.class);
  }
  
  public pcftest.ClaimStatus.OtherRecoverableStatus getOtherRecoverableStatus() {
    return getOrCreateProperty("OtherRecoverableStatus", "OtherRecoverableStatus", null, pcftest.ClaimStatus.OtherRecoverableStatus.class);
  }
  
  public ValueElement getPrimaryGroup() {
    return getOrCreateProperty("PrimaryGroup", "PrimaryGroup", null, gw.smoketest.platform.web.ValueElement.class);
  }
  
  public PrimaryUser getPrimaryUser() {
    return getOrCreateProperty("PrimaryUser", "PrimaryUser", null, pcftest.ClaimStatus.PrimaryUser.class);
  }
  
  public DateElement getReOpenDate() {
    return getOrCreateProperty("ReOpenDate", "ReOpenDate", null, gw.smoketest.platform.web.DateElement.class);
  }
  
  public ReinsuranceInputSet getReinsuranceInputSet() {
    return getOrCreateProperty("ReinsuranceInputSet", "ReinsuranceInputSet", null, pcftest.ReinsuranceInputSet.class);
  }
  
  public RemoveFlagButton getRemoveFlagButton() {
    return getOrCreateProperty("RemoveFlagButton", "RemoveFlagButton", null, pcftest.ClaimStatus.RemoveFlagButton.class);
  }
  
  public ReopenedReason getReopenedReason() {
    return getOrCreateProperty("ReopenedReason", "ReopenedReason", null, pcftest.ClaimStatus.ReopenedReason.class);
  }
  
  public Resolution getResolution() {
    return getOrCreateProperty("Resolution", "Resolution", null, pcftest.ClaimStatus.Resolution.class);
  }
  
  public pcftest.ClaimStatus.SalvageStatus getSalvageStatus() {
    return getOrCreateProperty("SalvageStatus", "SalvageStatus", null, pcftest.ClaimStatus.SalvageStatus.class);
  }
  
  public SpecialClaimPermission getSpecialClaimPermission() {
    return getOrCreateProperty("SpecialClaimPermission", "SpecialClaimPermission", null, pcftest.ClaimStatus.SpecialClaimPermission.class);
  }
  
  public StorageInputSet getStorageInputSet() {
    return getOrCreateProperty("StorageInputSet", "StorageInputSet", null, pcftest.StorageInputSet.class);
  }
  
  public Update getUpdate() {
    return getOrCreateProperty("Update", "Update", null, pcftest.ClaimStatus.Update.class);
  }
  
  public Workload getWorkload() {
    return getOrCreateProperty("Workload", "Workload", null, pcftest.ClaimStatus.Workload.class);
  }
  
  @SuppressWarnings(value = "unchecked")
  public IteratorEntries<entry> get_Entries() {
    return getOrCreateEntries(null, pcftest.ClaimStatus.entry.class, gw.smoketest.platform.web.IteratorEntries.class);
  }
  
  public _Paging get_Paging() {
    return getOrCreateProperty("_Paging", "_Paging", null, pcftest.ClaimStatus._Paging.class);
  }
  
  public __crumb__ get__crumb__() {
    return getOrCreateProperty("__crumb__", "__crumb__", null, pcftest.ClaimStatus.__crumb__.class);
  }
  
  public _msgs get_msgs() {
    return getOrCreateProperty("_msgs", "_msgs", null, pcftest.ClaimStatus._msgs.class);
  }
  
  public ClaimSummaryGroup get_parent() {
    return getOrCreateProperty("_parent", pcftest.ClaimSummaryGroup.class);
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/claim/summary/ClaimStatus.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class Cancel extends ClickableActionElement {
    public Cancel(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/claim/summary/ClaimStatus.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class ClaimSegment extends SelectElement {
    public ClaimSegment(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public OptionElement getOptionByTypeKey(typekey.ClaimSegment arg) {
      return getOptionByValue(arg == null ? null : arg.getCode());
    }
    
    public typekey.ClaimSegment getTypeKeyValue() {
      String myValue = getValue();return myValue == null || myValue.isEmpty() ? null : typekey.ClaimSegment.getTypeKey(myValue);
    }
    
    public void setTypeKeyValue(typekey.ClaimSegment arg) {
      setValue(arg == null ? null : arg.getCode());
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/claim/summary/ClaimStatus.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class ClaimStatus2 extends SelectElement {
    public ClaimStatus2(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public OptionElement getOptionByTypeKey(ClaimState arg) {
      return getOptionByValue(arg == null ? null : arg.getCode());
    }
    
    public ClaimState getTypeKeyValue() {
      String myValue = getValue();return myValue == null || myValue.isEmpty() ? null : typekey.ClaimState.getTypeKey(myValue);
    }
    
    public void setTypeKeyValue(ClaimState arg) {
      setValue(arg == null ? null : arg.getCode());
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/claim/summary/ClaimStatus.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class ClaimStatus_UpLink extends ClickableActionElement {
    public ClaimStatus_UpLink(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/claim/summary/ClaimStatus.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class ClaimStrategy extends SelectElement {
    public ClaimStrategy(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public OptionElement getOptionByTypeKey(typekey.ClaimStrategy arg) {
      return getOptionByValue(arg == null ? null : arg.getCode());
    }
    
    public typekey.ClaimStrategy getTypeKeyValue() {
      String myValue = getValue();return myValue == null || myValue.isEmpty() ? null : typekey.ClaimStrategy.getTypeKey(myValue);
    }
    
    public void setTypeKeyValue(typekey.ClaimStrategy arg) {
      setValue(arg == null ? null : arg.getCode());
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/claim/summary/ClaimStatus.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class ClaimValidationLevel extends SelectElement {
    public ClaimValidationLevel(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public OptionElement getOptionByTypeKey(ValidationLevel arg) {
      return getOptionByValue(arg == null ? null : arg.getCode());
    }
    
    public ValidationLevel getTypeKeyValue() {
      String myValue = getValue();return myValue == null || myValue.isEmpty() ? null : typekey.ValidationLevel.getTypeKey(myValue);
    }
    
    public void setTypeKeyValue(ValidationLevel arg) {
      setValue(arg == null ? null : arg.getCode());
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/claim/summary/ClaimStatus.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class Edit extends ClickableActionElement {
    public Edit(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/claim/summary/ClaimStatus.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class LineOfBusiness extends SelectElement {
    public LineOfBusiness(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public OptionElement getOptionByTypeKey(LOBCode arg) {
      return getOptionByValue(arg == null ? null : arg.getCode());
    }
    
    public LOBCode getTypeKeyValue() {
      String myValue = getValue();return myValue == null || myValue.isEmpty() ? null : typekey.LOBCode.getTypeKey(myValue);
    }
    
    public void setTypeKeyValue(LOBCode arg) {
      setValue(arg == null ? null : arg.getCode());
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/claim/summary/ClaimStatus.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class LossType extends SelectElement {
    public LossType(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public OptionElement getOptionByTypeKey(typekey.LossType arg) {
      return getOptionByValue(arg == null ? null : arg.getCode());
    }
    
    public typekey.LossType getTypeKeyValue() {
      String myValue = getValue();return myValue == null || myValue.isEmpty() ? null : typekey.LossType.getTypeKey(myValue);
    }
    
    public void setTypeKeyValue(typekey.LossType arg) {
      setValue(arg == null ? null : arg.getCode());
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/claim/summary/ClaimStatus.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class OtherRecoverableStatus extends SelectElement {
    public OtherRecoverableStatus(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public OptionElement getOptionByTypeKey(typekey.OtherRecoverableStatus arg) {
      return getOptionByValue(arg == null ? null : arg.getCode());
    }
    
    public typekey.OtherRecoverableStatus getTypeKeyValue() {
      String myValue = getValue();return myValue == null || myValue.isEmpty() ? null : typekey.OtherRecoverableStatus.getTypeKey(myValue);
    }
    
    public void setTypeKeyValue(typekey.OtherRecoverableStatus arg) {
      setValue(arg == null ? null : arg.getCode());
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/claim/summary/ClaimStatus.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class PrimaryUser extends ValueElement {
    public PrimaryUser(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public UserContactDetailPopup click() {
      return clickThis(pcftest.UserContactDetailPopup.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/claim/summary/ClaimStatus.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class RemoveFlagButton extends ClickableActionElement {
    public RemoveFlagButton(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public TeamClaimRemoveFlagPopup click() {
      return clickThis(pcftest.TeamClaimRemoveFlagPopup.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/claim/summary/ClaimStatus.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class ReopenedReason extends SelectElement {
    public ReopenedReason(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public OptionElement getOptionByTypeKey(ClaimReopenedReason arg) {
      return getOptionByValue(arg == null ? null : arg.getCode());
    }
    
    public ClaimReopenedReason getTypeKeyValue() {
      String myValue = getValue();return myValue == null || myValue.isEmpty() ? null : typekey.ClaimReopenedReason.getTypeKey(myValue);
    }
    
    public void setTypeKeyValue(ClaimReopenedReason arg) {
      setValue(arg == null ? null : arg.getCode());
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/claim/summary/ClaimStatus.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class Resolution extends SelectElement {
    public Resolution(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public OptionElement getOptionByTypeKey(ClaimClosedOutcomeType arg) {
      return getOptionByValue(arg == null ? null : arg.getCode());
    }
    
    public ClaimClosedOutcomeType getTypeKeyValue() {
      String myValue = getValue();return myValue == null || myValue.isEmpty() ? null : typekey.ClaimClosedOutcomeType.getTypeKey(myValue);
    }
    
    public void setTypeKeyValue(ClaimClosedOutcomeType arg) {
      setValue(arg == null ? null : arg.getCode());
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/claim/summary/ClaimStatus.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class SalvageStatus extends SelectElement {
    public SalvageStatus(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public OptionElement getOptionByTypeKey(typekey.SalvageStatus arg) {
      return getOptionByValue(arg == null ? null : arg.getCode());
    }
    
    public typekey.SalvageStatus getTypeKeyValue() {
      String myValue = getValue();return myValue == null || myValue.isEmpty() ? null : typekey.SalvageStatus.getTypeKey(myValue);
    }
    
    public void setTypeKeyValue(typekey.SalvageStatus arg) {
      setValue(arg == null ? null : arg.getCode());
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/claim/summary/ClaimStatus.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class SpecialClaimPermission extends SelectElement {
    public SpecialClaimPermission(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public OptionElement getOptionByTypeKey(ClaimSecurityType arg) {
      return getOptionByValue(arg == null ? null : arg.getCode());
    }
    
    public ClaimSecurityType getTypeKeyValue() {
      String myValue = getValue();return myValue == null || myValue.isEmpty() ? null : typekey.ClaimSecurityType.getTypeKey(myValue);
    }
    
    public void setTypeKeyValue(ClaimSecurityType arg) {
      setValue(arg == null ? null : arg.getCode());
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/claim/summary/ClaimStatus.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class Update extends ClickableActionElement {
    public Update(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/claim/summary/ClaimStatus.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class Workload extends PCFElement {
    public Workload(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public ValueElement getClassification() {
      return getOrCreateProperty("Classification", "Classification", null, gw.smoketest.platform.web.ValueElement.class);
    }
    
    public ValueElement getClassificationWorkload() {
      return getOrCreateProperty("ClassificationWorkload", "ClassificationWorkload", null, gw.smoketest.platform.web.ValueElement.class);
    }
    
    public ValueElement getSupplementalWorkloadWeight() {
      return getOrCreateProperty("SupplementalWorkloadWeight", "SupplementalWorkloadWeight", null, gw.smoketest.platform.web.ValueElement.class);
    }
    
    public ValueElement getTotalWorkloadWeight() {
      return getOrCreateProperty("TotalWorkloadWeight", "TotalWorkloadWeight", null, gw.smoketest.platform.web.ValueElement.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/claim/summary/ClaimStatus.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class _Paging extends ValueElementWithSetAndRefresh {
    public _Paging(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/claim/summary/ClaimStatus.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class __crumb__ extends ClickableActionElement {
    public __crumb__(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/claim/summary/ClaimStatus.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class _msgs extends MessagesElement {
    public _msgs(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/claim/summary/ClaimStatus.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class entry extends PCFElement {
    public entry(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public ClaimIndicatorInputSet_CoverageInQuestionClaimIndicator getClaimIndicatorInputSet_CoverageInQuestionClaimIndicator() {
      return getOrCreateProperty("ClaimIndicatorInputSet_CoverageInQuestionClaimIndicator", "ClaimIndicatorInputSet", null, pcftest.ClaimIndicatorInputSet_CoverageInQuestionClaimIndicator.class);
    }
    
    public ClaimIndicatorInputSet_FatalityClaimIndicator getClaimIndicatorInputSet_FatalityClaimIndicator() {
      return getOrCreateProperty("ClaimIndicatorInputSet_FatalityClaimIndicator", "ClaimIndicatorInputSet", null, pcftest.ClaimIndicatorInputSet_FatalityClaimIndicator.class);
    }
    
    public ClaimIndicatorInputSet_FlagClaimIndicator getClaimIndicatorInputSet_FlagClaimIndicator() {
      return getOrCreateProperty("ClaimIndicatorInputSet_FlagClaimIndicator", "ClaimIndicatorInputSet", null, pcftest.ClaimIndicatorInputSet_FlagClaimIndicator.class);
    }
    
    public ClaimIndicatorInputSet_LargeLossClaimIndicator getClaimIndicatorInputSet_LargeLossClaimIndicator() {
      return getOrCreateProperty("ClaimIndicatorInputSet_LargeLossClaimIndicator", "ClaimIndicatorInputSet", null, pcftest.ClaimIndicatorInputSet_LargeLossClaimIndicator.class);
    }
    
    public ClaimIndicatorInputSet_LitigationClaimIndicator getClaimIndicatorInputSet_LitigationClaimIndicator() {
      return getOrCreateProperty("ClaimIndicatorInputSet_LitigationClaimIndicator", "ClaimIndicatorInputSet", null, pcftest.ClaimIndicatorInputSet_LitigationClaimIndicator.class);
    }
    
    public ClaimIndicatorInputSet_SIUClaimIndicator getClaimIndicatorInputSet_SIUClaimIndicator() {
      return getOrCreateProperty("ClaimIndicatorInputSet_SIUClaimIndicator", "ClaimIndicatorInputSet", null, pcftest.ClaimIndicatorInputSet_SIUClaimIndicator.class);
    }
    
    public ClaimIndicatorInputSet_SubrogationClaimIndicator getClaimIndicatorInputSet_SubrogationClaimIndicator() {
      return getOrCreateProperty("ClaimIndicatorInputSet_SubrogationClaimIndicator", "ClaimIndicatorInputSet", null, pcftest.ClaimIndicatorInputSet_SubrogationClaimIndicator.class);
    }
    
    public IndicatorType getIndicatorType() {
      return getOrCreateProperty("IndicatorType", "IndicatorType", null, pcftest.ClaimStatus.entry.IndicatorType.class);
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/claim/summary/ClaimStatus.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class IndicatorType extends ValueElement {
      public IndicatorType(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      
    }
    
    
  }
  
  
}