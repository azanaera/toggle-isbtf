package pcftest;

import gw.lang.SimplePropertyProcessing;
import gw.smoketest.platform.web.ClickableActionElement;
import gw.smoketest.platform.web.DateElement;
import gw.smoketest.platform.web.DetailViewElement;
import gw.smoketest.platform.web.OptionElement;
import gw.smoketest.platform.web.PCFElement;
import gw.smoketest.platform.web.PCFElementId;
import gw.smoketest.platform.web.SelectElement;
import gw.smoketest.platform.web.ValueElement;
import gw.testharness.ISmokeTest;
import javax.annotation.processing.Generated;
import pcftest.NewLostWagesSummaryDV.AssignedUser_Name;
import pcftest.NewLostWagesSummaryDV.ClosedOutcome;
import pcftest.NewLostWagesSummaryDV.DaysInWeek;
import pcftest.NewLostWagesSummaryDV.EditableClaimantDependentsLV_tb;
import pcftest.NewLostWagesSummaryDV.JurisdictionState;
import pcftest.NewLostWagesSummaryDV.LossParty;
import pcftest.NewLostWagesSummaryDV.PrimaryCoverage;
import pcftest.NewLostWagesSummaryDV.ReopenedReason;
import pcftest.NewLostWagesSummaryDV.Segment;
import pcftest.NewLostWagesSummaryDV.StatLine;
import pcftest.NewLostWagesSummaryDV.StatLine.StatLine_PickerButton;
import pcftest.NewLostWagesSummaryDV.State;
import pcftest.NewLostWagesSummaryDV.Strategy;
import typekey.ClaimSegment;
import typekey.ClaimStrategy;
import typekey.CoverageType;
import typekey.DaysInWeekType;
import typekey.ExposureClosedOutcomeType;
import typekey.ExposureReopenedReason;
import typekey.ExposureState;
import typekey.Jurisdiction;
import typekey.LossPartyType;

@SimplePropertyProcessing
@Generated(comments = "config/web/pcf/claim/newexposure/NewLostWagesSummaryDV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
public class NewLostWagesSummaryDV extends DetailViewElement {
  public final static String CHECKSUM = "d228a45f96055adaeff2d5978b64c10e";
  
  public NewLostWagesSummaryDV(ISmokeTest helper, PCFElementId componentId)  {
    super(helper, componentId);
  }
  
  public ValueElement getAssignedGroup_Name() {
    return getOrCreateProperty("AssignedGroup_Name", "AssignedGroup_Name", null, gw.smoketest.platform.web.ValueElement.class);
  }
  
  public AssignedUser_Name getAssignedUser_Name() {
    return getOrCreateProperty("AssignedUser_Name", "AssignedUser_Name", null, pcftest.NewLostWagesSummaryDV.AssignedUser_Name.class);
  }
  
  public ValueElement getAverageWeeklyWages() {
    return getOrCreateProperty("AverageWeeklyWages", "AverageWeeklyWages", null, gw.smoketest.platform.web.ValueElement.class);
  }
  
  public DateElement getClosedDate() {
    return getOrCreateProperty("ClosedDate", "ClosedDate", null, gw.smoketest.platform.web.DateElement.class);
  }
  
  public ClosedOutcome getClosedOutcome() {
    return getOrCreateProperty("ClosedOutcome", "ClosedOutcome", null, pcftest.NewLostWagesSummaryDV.ClosedOutcome.class);
  }
  
  public DateElement getCreateTime() {
    return getOrCreateProperty("CreateTime", "CreateTime", null, gw.smoketest.platform.web.DateElement.class);
  }
  
  public DaysInWeek getDaysInWeek() {
    return getOrCreateProperty("DaysInWeek", "DaysInWeek", null, pcftest.NewLostWagesSummaryDV.DaysInWeek.class);
  }
  
  public EditableClaimantDependentsLV getEditableClaimantDependentsLV() {
    return getOrCreateProperty("EditableClaimantDependentsLV", "EditableClaimantDependentsLV", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListView, pcftest.EditableClaimantDependentsLV.class);
  }
  
  public EditableClaimantDependentsLV_tb getEditableClaimantDependentsLV_tb() {
    return getOrCreateProperty("EditableClaimantDependentsLV_tb", "EditableClaimantDependentsLV_tb", null, pcftest.NewLostWagesSummaryDV.EditableClaimantDependentsLV_tb.class);
  }
  
  public ValueElement getFuturePayments() {
    return getOrCreateProperty("FuturePayments", "FuturePayments", null, gw.smoketest.platform.web.ValueElement.class);
  }
  
  public JurisdictionState getJurisdictionState() {
    return getOrCreateProperty("JurisdictionState", "JurisdictionState", null, pcftest.NewLostWagesSummaryDV.JurisdictionState.class);
  }
  
  public ValueElement getLWImpairment() {
    return getOrCreateProperty("LWImpairment", "LWImpairment", null, gw.smoketest.platform.web.ValueElement.class);
  }
  
  public DateElement getLastDayWorked() {
    return getOrCreateProperty("LastDayWorked", "LastDayWorked", null, gw.smoketest.platform.web.DateElement.class);
  }
  
  public LossParty getLossParty() {
    return getOrCreateProperty("LossParty", "LossParty", null, pcftest.NewLostWagesSummaryDV.LossParty.class);
  }
  
  public PrimaryCoverage getPrimaryCoverage() {
    return getOrCreateProperty("PrimaryCoverage", "PrimaryCoverage", null, pcftest.NewLostWagesSummaryDV.PrimaryCoverage.class);
  }
  
  public DateElement getReOpenDate() {
    return getOrCreateProperty("ReOpenDate", "ReOpenDate", null, gw.smoketest.platform.web.DateElement.class);
  }
  
  public ValueElement getRemainingReserves() {
    return getOrCreateProperty("RemainingReserves", "RemainingReserves", null, gw.smoketest.platform.web.ValueElement.class);
  }
  
  public ReopenedReason getReopenedReason() {
    return getOrCreateProperty("ReopenedReason", "ReopenedReason", null, pcftest.NewLostWagesSummaryDV.ReopenedReason.class);
  }
  
  public Segment getSegment() {
    return getOrCreateProperty("Segment", "Segment", null, pcftest.NewLostWagesSummaryDV.Segment.class);
  }
  
  public StatLine getStatLine() {
    return getOrCreateProperty("StatLine", "StatLine", null, pcftest.NewLostWagesSummaryDV.StatLine.class);
  }
  
  public ValueElement getStatLine_Warning() {
    return getOrCreateProperty("StatLine_Warning", "StatLine_Warning", null, gw.smoketest.platform.web.ValueElement.class);
  }
  
  public State getState() {
    return getOrCreateProperty("State", "State", null, pcftest.NewLostWagesSummaryDV.State.class);
  }
  
  public Strategy getStrategy() {
    return getOrCreateProperty("Strategy", "Strategy", null, pcftest.NewLostWagesSummaryDV.Strategy.class);
  }
  
  public ValueElement getTotalIncurredNet() {
    return getOrCreateProperty("TotalIncurredNet", "TotalIncurredNet", null, gw.smoketest.platform.web.ValueElement.class);
  }
  
  public ValueElement getTotalPayments() {
    return getOrCreateProperty("TotalPayments", "TotalPayments", null, gw.smoketest.platform.web.ValueElement.class);
  }
  
  public ValueElement getTotalRecoveries() {
    return getOrCreateProperty("TotalRecoveries", "TotalRecoveries", null, gw.smoketest.platform.web.ValueElement.class);
  }
  
  public pcftest.NewLostWagesSummaryDV.ValidationLevel getValidationLevel() {
    return getOrCreateProperty("ValidationLevel", "ValidationLevel", null, pcftest.NewLostWagesSummaryDV.ValidationLevel.class);
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/claim/newexposure/NewLostWagesSummaryDV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class AssignedUser_Name extends ValueElement {
    public AssignedUser_Name(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public UserContactDetailPopup click() {
      return clickThis(pcftest.UserContactDetailPopup.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/claim/newexposure/NewLostWagesSummaryDV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class ClosedOutcome extends SelectElement {
    public ClosedOutcome(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public OptionElement getOptionByTypeKey(ExposureClosedOutcomeType arg) {
      return getOptionByValue(arg == null ? null : arg.getCode());
    }
    
    public ExposureClosedOutcomeType getTypeKeyValue() {
      String myValue = getValue();return myValue == null || myValue.isEmpty() ? null : typekey.ExposureClosedOutcomeType.getTypeKey(myValue);
    }
    
    public void setTypeKeyValue(ExposureClosedOutcomeType arg) {
      setValue(arg == null ? null : arg.getCode());
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/claim/newexposure/NewLostWagesSummaryDV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class DaysInWeek extends SelectElement {
    public DaysInWeek(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public OptionElement getOptionByTypeKey(DaysInWeekType arg) {
      return getOptionByValue(arg == null ? null : arg.getCode());
    }
    
    public DaysInWeekType getTypeKeyValue() {
      String myValue = getValue();return myValue == null || myValue.isEmpty() ? null : typekey.DaysInWeekType.getTypeKey(myValue);
    }
    
    public void setTypeKeyValue(DaysInWeekType arg) {
      setValue(arg == null ? null : arg.getCode());
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/claim/newexposure/NewLostWagesSummaryDV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class EditableClaimantDependentsLV_tb extends PCFElement {
    public EditableClaimantDependentsLV_tb(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/claim/newexposure/NewLostWagesSummaryDV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class JurisdictionState extends SelectElement {
    public JurisdictionState(ISmokeTest helper, PCFElementId componentId)  {
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
  @Generated(comments = "config/web/pcf/claim/newexposure/NewLostWagesSummaryDV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class LossParty extends SelectElement {
    public LossParty(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public OptionElement getOptionByTypeKey(LossPartyType arg) {
      return getOptionByValue(arg == null ? null : arg.getCode());
    }
    
    public LossPartyType getTypeKeyValue() {
      String myValue = getValue();return myValue == null || myValue.isEmpty() ? null : typekey.LossPartyType.getTypeKey(myValue);
    }
    
    public void setTypeKeyValue(LossPartyType arg) {
      setValue(arg == null ? null : arg.getCode());
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/claim/newexposure/NewLostWagesSummaryDV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class PrimaryCoverage extends SelectElement {
    public PrimaryCoverage(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public OptionElement getOptionByTypeKey(CoverageType arg) {
      return getOptionByValue(arg == null ? null : arg.getCode());
    }
    
    public CoverageType getTypeKeyValue() {
      String myValue = getValue();return myValue == null || myValue.isEmpty() ? null : typekey.CoverageType.getTypeKey(myValue);
    }
    
    public void setTypeKeyValue(CoverageType arg) {
      setValue(arg == null ? null : arg.getCode());
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/claim/newexposure/NewLostWagesSummaryDV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class ReopenedReason extends SelectElement {
    public ReopenedReason(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public OptionElement getOptionByTypeKey(ExposureReopenedReason arg) {
      return getOptionByValue(arg == null ? null : arg.getCode());
    }
    
    public ExposureReopenedReason getTypeKeyValue() {
      String myValue = getValue();return myValue == null || myValue.isEmpty() ? null : typekey.ExposureReopenedReason.getTypeKey(myValue);
    }
    
    public void setTypeKeyValue(ExposureReopenedReason arg) {
      setValue(arg == null ? null : arg.getCode());
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/claim/newexposure/NewLostWagesSummaryDV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class Segment extends SelectElement {
    public Segment(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public OptionElement getOptionByTypeKey(ClaimSegment arg) {
      return getOptionByValue(arg == null ? null : arg.getCode());
    }
    
    public ClaimSegment getTypeKeyValue() {
      String myValue = getValue();return myValue == null || myValue.isEmpty() ? null : typekey.ClaimSegment.getTypeKey(myValue);
    }
    
    public void setTypeKeyValue(ClaimSegment arg) {
      setValue(arg == null ? null : arg.getCode());
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/widgets/PolicyStatCodePickerWidget.xml", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class StatLine extends SelectElement {
    public StatLine(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public ClaimPolicyStatCodePickerPopup click() {
      return clickThis(pcftest.ClaimPolicyStatCodePickerPopup.class);
    }
    
    public StatLine_PickerButton getStatLine_PickerButton() {
      return getOrCreateProperty("StatLine_PickerButton", "StatLine_PickerButton", null, pcftest.NewLostWagesSummaryDV.StatLine.StatLine_PickerButton.class);
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/widgets/PolicyStatCodePickerWidget.xml", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class StatLine_PickerButton extends ClickableActionElement {
      public StatLine_PickerButton(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public ClaimPolicyStatCodePickerPopup click() {
        return clickThis(pcftest.ClaimPolicyStatCodePickerPopup.class);
      }
      
      
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/claim/newexposure/NewLostWagesSummaryDV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class State extends SelectElement {
    public State(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public OptionElement getOptionByTypeKey(ExposureState arg) {
      return getOptionByValue(arg == null ? null : arg.getCode());
    }
    
    public ExposureState getTypeKeyValue() {
      String myValue = getValue();return myValue == null || myValue.isEmpty() ? null : typekey.ExposureState.getTypeKey(myValue);
    }
    
    public void setTypeKeyValue(ExposureState arg) {
      setValue(arg == null ? null : arg.getCode());
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/claim/newexposure/NewLostWagesSummaryDV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class Strategy extends SelectElement {
    public Strategy(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public OptionElement getOptionByTypeKey(ClaimStrategy arg) {
      return getOptionByValue(arg == null ? null : arg.getCode());
    }
    
    public ClaimStrategy getTypeKeyValue() {
      String myValue = getValue();return myValue == null || myValue.isEmpty() ? null : typekey.ClaimStrategy.getTypeKey(myValue);
    }
    
    public void setTypeKeyValue(ClaimStrategy arg) {
      setValue(arg == null ? null : arg.getCode());
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/claim/newexposure/NewLostWagesSummaryDV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class ValidationLevel extends SelectElement {
    public ValidationLevel(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public OptionElement getOptionByTypeKey(typekey.ValidationLevel arg) {
      return getOptionByValue(arg == null ? null : arg.getCode());
    }
    
    public typekey.ValidationLevel getTypeKeyValue() {
      String myValue = getValue();return myValue == null || myValue.isEmpty() ? null : typekey.ValidationLevel.getTypeKey(myValue);
    }
    
    public void setTypeKeyValue(typekey.ValidationLevel arg) {
      setValue(arg == null ? null : arg.getCode());
    }
    
    
  }
  
  
}