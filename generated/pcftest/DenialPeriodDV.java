package pcftest;

import gw.lang.SimplePropertyProcessing;
import gw.smoketest.platform.web.BasePickerValueElement;
import gw.smoketest.platform.web.BooleanValueElement;
import gw.smoketest.platform.web.ClickableActionElement;
import gw.smoketest.platform.web.DateElement;
import gw.smoketest.platform.web.DetailViewElement;
import gw.smoketest.platform.web.OptionElement;
import gw.smoketest.platform.web.PCFElementId;
import gw.smoketest.platform.web.SelectElement;
import gw.smoketest.platform.web.ValueElement;
import gw.testharness.ISmokeTest;
import javax.annotation.processing.Generated;
import pcftest.DenialPeriodDV.AcceptDocumentTemplate;
import pcftest.DenialPeriodDV.AcceptDocumentTemplate.SelectAcceptDocumentTemplate;
import pcftest.DenialPeriodDV.DueDateFormula;
import pcftest.DenialPeriodDV.JurisdictionState;
import pcftest.DenialPeriodDV.RejectDocumentTemplate;
import pcftest.DenialPeriodDV.RejectDocumentTemplate.SelectRejectDocumentTemplate;
import pcftest.DenialPeriodDV.TargetIncludeDays;
import typekey.IncludeDaysType;
import typekey.Jurisdiction;
import typekey.JurisdictionalFormula;

@SimplePropertyProcessing
@Generated(comments = "config/web/pcf/admin/statutes/DenialPeriodDV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
public class DenialPeriodDV extends DetailViewElement {
  public final static String CHECKSUM = "063164044de782ca353c70bd2d6b3faf";
  
  public DenialPeriodDV(ISmokeTest helper, PCFElementId componentId)  {
    super(helper, componentId);
  }
  
  public AcceptDocumentTemplate getAcceptDocumentTemplate() {
    return getOrCreateProperty("AcceptDocumentTemplate", "AcceptDocumentTemplate", null, pcftest.DenialPeriodDV.AcceptDocumentTemplate.class);
  }
  
  public BooleanValueElement getBenefitPaymentAcceptance() {
    return getOrCreateProperty("BenefitPaymentAcceptance", "BenefitPaymentAcceptance", null, gw.smoketest.platform.web.BooleanValueElement.class);
  }
  
  public DueDateFormula getDueDateFormula() {
    return getOrCreateProperty("DueDateFormula", "DueDateFormula", null, pcftest.DenialPeriodDV.DueDateFormula.class);
  }
  
  public DateElement getEffectiveDate() {
    return getOrCreateProperty("EffectiveDate", "EffectiveDate", null, gw.smoketest.platform.web.DateElement.class);
  }
  
  public DateElement getExpiryDate() {
    return getOrCreateProperty("ExpiryDate", "ExpiryDate", null, gw.smoketest.platform.web.DateElement.class);
  }
  
  public JurisdictionState getJurisdictionState() {
    return getOrCreateProperty("JurisdictionState", "JurisdictionState", null, pcftest.DenialPeriodDV.JurisdictionState.class);
  }
  
  public RejectDocumentTemplate getRejectDocumentTemplate() {
    return getOrCreateProperty("RejectDocumentTemplate", "RejectDocumentTemplate", null, pcftest.DenialPeriodDV.RejectDocumentTemplate.class);
  }
  
  public ValueElement getTargetDaysFromLoss() {
    return getOrCreateProperty("TargetDaysFromLoss", "TargetDaysFromLoss", null, gw.smoketest.platform.web.ValueElement.class);
  }
  
  public ValueElement getTargetDaysFromNotice() {
    return getOrCreateProperty("TargetDaysFromNotice", "TargetDaysFromNotice", null, gw.smoketest.platform.web.ValueElement.class);
  }
  
  public TargetIncludeDays getTargetIncludeDays() {
    return getOrCreateProperty("TargetIncludeDays", "TargetIncludeDays", null, pcftest.DenialPeriodDV.TargetIncludeDays.class);
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/admin/statutes/DenialPeriodDV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class AcceptDocumentTemplate extends BasePickerValueElement {
    public AcceptDocumentTemplate(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public SelectAcceptDocumentTemplate getSelectAcceptDocumentTemplate() {
      return getOrCreateProperty("SelectAcceptDocumentTemplate", "SelectAcceptDocumentTemplate", null, pcftest.DenialPeriodDV.AcceptDocumentTemplate.SelectAcceptDocumentTemplate.class);
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/admin/statutes/DenialPeriodDV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class SelectAcceptDocumentTemplate extends ClickableActionElement {
      public SelectAcceptDocumentTemplate(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public DocumentTemplateSearchPopup click() {
        return clickThis(pcftest.DocumentTemplateSearchPopup.class);
      }
      
      
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/admin/statutes/DenialPeriodDV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class DueDateFormula extends SelectElement {
    public DueDateFormula(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public OptionElement getOptionByTypeKey(JurisdictionalFormula arg) {
      return getOptionByValue(arg == null ? null : arg.getCode());
    }
    
    public JurisdictionalFormula getTypeKeyValue() {
      String myValue = getValue();return myValue == null || myValue.isEmpty() ? null : typekey.JurisdictionalFormula.getTypeKey(myValue);
    }
    
    public void setTypeKeyValue(JurisdictionalFormula arg) {
      setValue(arg == null ? null : arg.getCode());
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/admin/statutes/DenialPeriodDV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
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
  @Generated(comments = "config/web/pcf/admin/statutes/DenialPeriodDV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class RejectDocumentTemplate extends BasePickerValueElement {
    public RejectDocumentTemplate(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public SelectRejectDocumentTemplate getSelectRejectDocumentTemplate() {
      return getOrCreateProperty("SelectRejectDocumentTemplate", "SelectRejectDocumentTemplate", null, pcftest.DenialPeriodDV.RejectDocumentTemplate.SelectRejectDocumentTemplate.class);
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/admin/statutes/DenialPeriodDV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class SelectRejectDocumentTemplate extends ClickableActionElement {
      public SelectRejectDocumentTemplate(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public DocumentTemplateSearchPopup click() {
        return clickThis(pcftest.DocumentTemplateSearchPopup.class);
      }
      
      
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/admin/statutes/DenialPeriodDV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class TargetIncludeDays extends SelectElement {
    public TargetIncludeDays(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public OptionElement getOptionByTypeKey(IncludeDaysType arg) {
      return getOptionByValue(arg == null ? null : arg.getCode());
    }
    
    public IncludeDaysType getTypeKeyValue() {
      String myValue = getValue();return myValue == null || myValue.isEmpty() ? null : typekey.IncludeDaysType.getTypeKey(myValue);
    }
    
    public void setTypeKeyValue(IncludeDaysType arg) {
      setValue(arg == null ? null : arg.getCode());
    }
    
    
  }
  
  
}