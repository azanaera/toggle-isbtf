package pcftest;

import gw.lang.SimplePropertyProcessing;
import gw.smoketest.platform.web.BasePickerValueElement;
import gw.smoketest.platform.web.BooleanValueElement;
import gw.smoketest.platform.web.ClickableActionElement;
import gw.smoketest.platform.web.DetailViewElement;
import gw.smoketest.platform.web.OptionElement;
import gw.smoketest.platform.web.PCFElementId;
import gw.smoketest.platform.web.SelectElement;
import gw.smoketest.platform.web.ValueElement;
import gw.testharness.ISmokeTest;
import javax.annotation.processing.Generated;
import pcftest.AdminActivityPatternDV.Category;
import pcftest.AdminActivityPatternDV.ClaimLossType;
import pcftest.AdminActivityPatternDV.CreateDocument;
import pcftest.AdminActivityPatternDV.CreateDocument.SelectCreateDocument;
import pcftest.AdminActivityPatternDV.EmailTemplate;
import pcftest.AdminActivityPatternDV.EmailTemplate.SelectEmailTemplate;
import pcftest.AdminActivityPatternDV.EscalationIncludeDays;
import pcftest.AdminActivityPatternDV.EscalationStartPoint;
import pcftest.AdminActivityPatternDV.Importance;
import pcftest.AdminActivityPatternDV.TargetIncludeDays;
import pcftest.AdminActivityPatternDV.TargetStartPoint;
import pcftest.AdminActivityPatternDV.Type;
import typekey.ActivityCategory;
import typekey.ActivityType;
import typekey.ImportanceLevel;
import typekey.IncludeDaysType;
import typekey.LossType;
import typekey.StartPointType;

@SimplePropertyProcessing
@Generated(comments = "config/web/pcf/admin/activitypatterns/AdminActivityPatternDV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
public class AdminActivityPatternDV extends DetailViewElement {
  public final static String CHECKSUM = "8be6bf43eea7c0b289dbc44f97febf24";
  
  public AdminActivityPatternDV(ISmokeTest helper, PCFElementId componentId)  {
    super(helper, componentId);
  }
  
  public pcftest.AdminActivityPatternDV.ActivityClass getActivityClass() {
    return getOrCreateProperty("ActivityClass", "ActivityClass", null, pcftest.AdminActivityPatternDV.ActivityClass.class);
  }
  
  public BooleanValueElement getAutomatedOnly() {
    return getOrCreateProperty("AutomatedOnly", "AutomatedOnly", null, gw.smoketest.platform.web.BooleanValueElement.class);
  }
  
  public BooleanValueElement getAvailableForClosedClaim() {
    return getOrCreateProperty("AvailableForClosedClaim", "AvailableForClosedClaim", null, gw.smoketest.platform.web.BooleanValueElement.class);
  }
  
  public Category getCategory() {
    return getOrCreateProperty("Category", "Category", null, pcftest.AdminActivityPatternDV.Category.class);
  }
  
  public ClaimLossType getClaimLossType() {
    return getOrCreateProperty("ClaimLossType", "ClaimLossType", null, pcftest.AdminActivityPatternDV.ClaimLossType.class);
  }
  
  public ValueElement getCode() {
    return getOrCreateProperty("Code", "Code", null, gw.smoketest.platform.web.ValueElement.class);
  }
  
  public CreateDocument getCreateDocument() {
    return getOrCreateProperty("CreateDocument", "CreateDocument", null, pcftest.AdminActivityPatternDV.CreateDocument.class);
  }
  
  public ValueElement getDescription() {
    return getOrCreateProperty("Description", "Description", null, gw.smoketest.platform.web.ValueElement.class);
  }
  
  public EmailTemplate getEmailTemplate() {
    return getOrCreateProperty("EmailTemplate", "EmailTemplate", null, pcftest.AdminActivityPatternDV.EmailTemplate.class);
  }
  
  public SelectElement getEscalationBusCalType() {
    return getOrCreateProperty("EscalationBusCalType", "EscalationBusCalType", null, gw.smoketest.platform.web.SelectElement.class);
  }
  
  public ValueElement getEscalationDays() {
    return getOrCreateProperty("EscalationDays", "EscalationDays", null, gw.smoketest.platform.web.ValueElement.class);
  }
  
  public ValueElement getEscalationHours() {
    return getOrCreateProperty("EscalationHours", "EscalationHours", null, gw.smoketest.platform.web.ValueElement.class);
  }
  
  public EscalationIncludeDays getEscalationIncludeDays() {
    return getOrCreateProperty("EscalationIncludeDays", "EscalationIncludeDays", null, pcftest.AdminActivityPatternDV.EscalationIncludeDays.class);
  }
  
  public EscalationStartPoint getEscalationStartPoint() {
    return getOrCreateProperty("EscalationStartPoint", "EscalationStartPoint", null, pcftest.AdminActivityPatternDV.EscalationStartPoint.class);
  }
  
  public BooleanValueElement getExternallyOwned() {
    return getOrCreateProperty("ExternallyOwned", "ExternallyOwned", null, gw.smoketest.platform.web.BooleanValueElement.class);
  }
  
  public Importance getImportance() {
    return getOrCreateProperty("Importance", "Importance", null, pcftest.AdminActivityPatternDV.Importance.class);
  }
  
  public BooleanValueElement getMandatory() {
    return getOrCreateProperty("Mandatory", "Mandatory", null, gw.smoketest.platform.web.BooleanValueElement.class);
  }
  
  public pcftest.AdminActivityPatternDV.Priority getPriority() {
    return getOrCreateProperty("Priority", "Priority", null, pcftest.AdminActivityPatternDV.Priority.class);
  }
  
  public BooleanValueElement getRecurring() {
    return getOrCreateProperty("Recurring", "Recurring", null, gw.smoketest.platform.web.BooleanValueElement.class);
  }
  
  public ValueElement getShortSubject() {
    return getOrCreateProperty("ShortSubject", "ShortSubject", null, gw.smoketest.platform.web.ValueElement.class);
  }
  
  public ValueElement getSubject() {
    return getOrCreateProperty("Subject", "Subject", null, gw.smoketest.platform.web.ValueElement.class);
  }
  
  public SelectElement getTargetBusCalType() {
    return getOrCreateProperty("TargetBusCalType", "TargetBusCalType", null, gw.smoketest.platform.web.SelectElement.class);
  }
  
  public ValueElement getTargetDays() {
    return getOrCreateProperty("TargetDays", "TargetDays", null, gw.smoketest.platform.web.ValueElement.class);
  }
  
  public ValueElement getTargetHours() {
    return getOrCreateProperty("TargetHours", "TargetHours", null, gw.smoketest.platform.web.ValueElement.class);
  }
  
  public TargetIncludeDays getTargetIncludeDays() {
    return getOrCreateProperty("TargetIncludeDays", "TargetIncludeDays", null, pcftest.AdminActivityPatternDV.TargetIncludeDays.class);
  }
  
  public TargetStartPoint getTargetStartPoint() {
    return getOrCreateProperty("TargetStartPoint", "TargetStartPoint", null, pcftest.AdminActivityPatternDV.TargetStartPoint.class);
  }
  
  public Type getType() {
    return getOrCreateProperty("Type", "Type", null, pcftest.AdminActivityPatternDV.Type.class);
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/admin/activitypatterns/AdminActivityPatternDV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class ActivityClass extends SelectElement {
    public ActivityClass(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public OptionElement getOptionByTypeKey(typekey.ActivityClass arg) {
      return getOptionByValue(arg == null ? null : arg.getCode());
    }
    
    public typekey.ActivityClass getTypeKeyValue() {
      String myValue = getValue();return myValue == null || myValue.isEmpty() ? null : typekey.ActivityClass.getTypeKey(myValue);
    }
    
    public void setTypeKeyValue(typekey.ActivityClass arg) {
      setValue(arg == null ? null : arg.getCode());
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/admin/activitypatterns/AdminActivityPatternDV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class Category extends SelectElement {
    public Category(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public OptionElement getOptionByTypeKey(ActivityCategory arg) {
      return getOptionByValue(arg == null ? null : arg.getCode());
    }
    
    public ActivityCategory getTypeKeyValue() {
      String myValue = getValue();return myValue == null || myValue.isEmpty() ? null : typekey.ActivityCategory.getTypeKey(myValue);
    }
    
    public void setTypeKeyValue(ActivityCategory arg) {
      setValue(arg == null ? null : arg.getCode());
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/admin/activitypatterns/AdminActivityPatternDV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class ClaimLossType extends SelectElement {
    public ClaimLossType(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public OptionElement getOptionByTypeKey(LossType arg) {
      return getOptionByValue(arg == null ? null : arg.getCode());
    }
    
    public LossType getTypeKeyValue() {
      String myValue = getValue();return myValue == null || myValue.isEmpty() ? null : typekey.LossType.getTypeKey(myValue);
    }
    
    public void setTypeKeyValue(LossType arg) {
      setValue(arg == null ? null : arg.getCode());
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/admin/activitypatterns/AdminActivityPatternDV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class CreateDocument extends BasePickerValueElement {
    public CreateDocument(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public SelectCreateDocument getSelectCreateDocument() {
      return getOrCreateProperty("SelectCreateDocument", "SelectCreateDocument", null, pcftest.AdminActivityPatternDV.CreateDocument.SelectCreateDocument.class);
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/admin/activitypatterns/AdminActivityPatternDV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class SelectCreateDocument extends ClickableActionElement {
      public SelectCreateDocument(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public DocumentTemplateSearchPopup click() {
        return clickThis(pcftest.DocumentTemplateSearchPopup.class);
      }
      
      
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/admin/activitypatterns/AdminActivityPatternDV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class EmailTemplate extends BasePickerValueElement {
    public EmailTemplate(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public SelectEmailTemplate getSelectEmailTemplate() {
      return getOrCreateProperty("SelectEmailTemplate", "SelectEmailTemplate", null, pcftest.AdminActivityPatternDV.EmailTemplate.SelectEmailTemplate.class);
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/admin/activitypatterns/AdminActivityPatternDV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class SelectEmailTemplate extends ClickableActionElement {
      public SelectEmailTemplate(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public PickEmailTemplatePopup click() {
        return clickThis(pcftest.PickEmailTemplatePopup.class);
      }
      
      
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/admin/activitypatterns/AdminActivityPatternDV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class EscalationIncludeDays extends SelectElement {
    public EscalationIncludeDays(ISmokeTest helper, PCFElementId componentId)  {
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
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/admin/activitypatterns/AdminActivityPatternDV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class EscalationStartPoint extends SelectElement {
    public EscalationStartPoint(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public OptionElement getOptionByTypeKey(StartPointType arg) {
      return getOptionByValue(arg == null ? null : arg.getCode());
    }
    
    public StartPointType getTypeKeyValue() {
      String myValue = getValue();return myValue == null || myValue.isEmpty() ? null : typekey.StartPointType.getTypeKey(myValue);
    }
    
    public void setTypeKeyValue(StartPointType arg) {
      setValue(arg == null ? null : arg.getCode());
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/admin/activitypatterns/AdminActivityPatternDV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class Importance extends SelectElement {
    public Importance(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public OptionElement getOptionByTypeKey(ImportanceLevel arg) {
      return getOptionByValue(arg == null ? null : arg.getCode());
    }
    
    public ImportanceLevel getTypeKeyValue() {
      String myValue = getValue();return myValue == null || myValue.isEmpty() ? null : typekey.ImportanceLevel.getTypeKey(myValue);
    }
    
    public void setTypeKeyValue(ImportanceLevel arg) {
      setValue(arg == null ? null : arg.getCode());
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/admin/activitypatterns/AdminActivityPatternDV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class Priority extends SelectElement {
    public Priority(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public OptionElement getOptionByTypeKey(typekey.Priority arg) {
      return getOptionByValue(arg == null ? null : arg.getCode());
    }
    
    public typekey.Priority getTypeKeyValue() {
      String myValue = getValue();return myValue == null || myValue.isEmpty() ? null : typekey.Priority.getTypeKey(myValue);
    }
    
    public void setTypeKeyValue(typekey.Priority arg) {
      setValue(arg == null ? null : arg.getCode());
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/admin/activitypatterns/AdminActivityPatternDV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
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
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/admin/activitypatterns/AdminActivityPatternDV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class TargetStartPoint extends SelectElement {
    public TargetStartPoint(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public OptionElement getOptionByTypeKey(StartPointType arg) {
      return getOptionByValue(arg == null ? null : arg.getCode());
    }
    
    public StartPointType getTypeKeyValue() {
      String myValue = getValue();return myValue == null || myValue.isEmpty() ? null : typekey.StartPointType.getTypeKey(myValue);
    }
    
    public void setTypeKeyValue(StartPointType arg) {
      setValue(arg == null ? null : arg.getCode());
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/admin/activitypatterns/AdminActivityPatternDV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class Type extends SelectElement {
    public Type(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public OptionElement getOptionByTypeKey(ActivityType arg) {
      return getOptionByValue(arg == null ? null : arg.getCode());
    }
    
    public ActivityType getTypeKeyValue() {
      String myValue = getValue();return myValue == null || myValue.isEmpty() ? null : typekey.ActivityType.getTypeKey(myValue);
    }
    
    public void setTypeKeyValue(ActivityType arg) {
      setValue(arg == null ? null : arg.getCode());
    }
    
    
  }
  
  
}