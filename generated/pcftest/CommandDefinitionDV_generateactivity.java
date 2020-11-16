package pcftest;

import gw.lang.SimplePropertyProcessing;
import gw.smoketest.platform.web.PCFElement;
import gw.smoketest.platform.web.PCFElementId;
import gw.smoketest.platform.web.SelectElement;
import gw.testharness.ISmokeTest;
import javax.annotation.processing.Generated;
import pcftest.CommandDefinitionDV_generateactivity.CalendarImportance;
import pcftest.CommandDefinitionDV_generateactivity.Descriptions;
import pcftest.CommandDefinitionDV_generateactivity.EscalationDays;
import pcftest.CommandDefinitionDV_generateactivity.EscalationHours;
import pcftest.CommandDefinitionDV_generateactivity.EscalationIncludeDays;
import pcftest.CommandDefinitionDV_generateactivity.EscalationStartPoint;
import pcftest.CommandDefinitionDV_generateactivity.Priority;
import pcftest.CommandDefinitionDV_generateactivity.RelatedToRef;
import pcftest.CommandDefinitionDV_generateactivity.Subjects;
import pcftest.CommandDefinitionDV_generateactivity.TargetDays;
import pcftest.CommandDefinitionDV_generateactivity.TargetHours;
import pcftest.CommandDefinitionDV_generateactivity.TargetIncludeDays;
import pcftest.CommandDefinitionDV_generateactivity.TargetStartPoint;
import pcftest.CommandDefinitionDV_generateactivity.ValidationErrorsAdditionalRestrictions;
import pcftest.CommandDefinitionDV_generateactivity.ValidationErrorsAssignedTo;
import pcftest.CommandDefinitionDV_generateactivity.ValidationErrorsPattern;

@SimplePropertyProcessing
@Generated(comments = "config/web/pcf/bizrules/CommandDefinitionDV.generateactivity.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
public class CommandDefinitionDV_generateactivity extends CommandDefinitionDV {
  public final static String CHECKSUM = "a3eef4388c802b1efb66613b7516a6e8";
  
  public CommandDefinitionDV_generateactivity(ISmokeTest helper, PCFElementId componentId)  {
    super(helper, componentId);
  }
  
  public SelectElement getAdditionalRestrictionsInput() {
    return getOrCreateProperty("AdditionalRestrictionsInput", "AdditionalRestrictionsInput", null, gw.smoketest.platform.web.SelectElement.class);
  }
  
  public AssigneeAdditionalInfoInputSet_default getAssigneeAdditionalInfoInputSet_default() {
    return getOrCreateProperty("AssigneeAdditionalInfoInputSet_default", "AssigneeAdditionalInfoInputSet", null, pcftest.AssigneeAdditionalInfoInputSet_default.class);
  }
  
  public AssigneeAdditionalInfoInputSet_group getAssigneeAdditionalInfoInputSet_group() {
    return getOrCreateProperty("AssigneeAdditionalInfoInputSet_group", "AssigneeAdditionalInfoInputSet", null, pcftest.AssigneeAdditionalInfoInputSet_group.class);
  }
  
  public AssigneeAdditionalInfoInputSet_queue getAssigneeAdditionalInfoInputSet_queue() {
    return getOrCreateProperty("AssigneeAdditionalInfoInputSet_queue", "AssigneeAdditionalInfoInputSet", null, pcftest.AssigneeAdditionalInfoInputSet_queue.class);
  }
  
  public AssigneeAdditionalInfoInputSet_role getAssigneeAdditionalInfoInputSet_role() {
    return getOrCreateProperty("AssigneeAdditionalInfoInputSet_role", "AssigneeAdditionalInfoInputSet", null, pcftest.AssigneeAdditionalInfoInputSet_role.class);
  }
  
  public CalendarImportance getCalendarImportance() {
    return getOrCreateProperty("CalendarImportance", "CalendarImportance", null, pcftest.CommandDefinitionDV_generateactivity.CalendarImportance.class);
  }
  
  public Descriptions getDescriptions() {
    return getOrCreateProperty("Descriptions", "Descriptions", null, pcftest.CommandDefinitionDV_generateactivity.Descriptions.class);
  }
  
  public EscalationDays getEscalationDays() {
    return getOrCreateProperty("EscalationDays", "EscalationDays", null, pcftest.CommandDefinitionDV_generateactivity.EscalationDays.class);
  }
  
  public EscalationHours getEscalationHours() {
    return getOrCreateProperty("EscalationHours", "EscalationHours", null, pcftest.CommandDefinitionDV_generateactivity.EscalationHours.class);
  }
  
  public EscalationIncludeDays getEscalationIncludeDays() {
    return getOrCreateProperty("EscalationIncludeDays", "EscalationIncludeDays", null, pcftest.CommandDefinitionDV_generateactivity.EscalationIncludeDays.class);
  }
  
  public EscalationStartPoint getEscalationStartPoint() {
    return getOrCreateProperty("EscalationStartPoint", "EscalationStartPoint", null, pcftest.CommandDefinitionDV_generateactivity.EscalationStartPoint.class);
  }
  
  public Priority getPriority() {
    return getOrCreateProperty("Priority", "Priority", null, pcftest.CommandDefinitionDV_generateactivity.Priority.class);
  }
  
  public RelatedToRef getRelatedToRef() {
    return getOrCreateProperty("RelatedToRef", "RelatedToRef", null, pcftest.CommandDefinitionDV_generateactivity.RelatedToRef.class);
  }
  
  public Subjects getSubjects() {
    return getOrCreateProperty("Subjects", "Subjects", null, pcftest.CommandDefinitionDV_generateactivity.Subjects.class);
  }
  
  public TargetDays getTargetDays() {
    return getOrCreateProperty("TargetDays", "TargetDays", null, pcftest.CommandDefinitionDV_generateactivity.TargetDays.class);
  }
  
  public TargetHours getTargetHours() {
    return getOrCreateProperty("TargetHours", "TargetHours", null, pcftest.CommandDefinitionDV_generateactivity.TargetHours.class);
  }
  
  public TargetIncludeDays getTargetIncludeDays() {
    return getOrCreateProperty("TargetIncludeDays", "TargetIncludeDays", null, pcftest.CommandDefinitionDV_generateactivity.TargetIncludeDays.class);
  }
  
  public TargetStartPoint getTargetStartPoint() {
    return getOrCreateProperty("TargetStartPoint", "TargetStartPoint", null, pcftest.CommandDefinitionDV_generateactivity.TargetStartPoint.class);
  }
  
  public ValidationErrorsAdditionalRestrictions getValidationErrorsAdditionalRestrictions() {
    return getOrCreateProperty("ValidationErrorsAdditionalRestrictions", "ValidationErrorsAdditionalRestrictions", null, pcftest.CommandDefinitionDV_generateactivity.ValidationErrorsAdditionalRestrictions.class);
  }
  
  public ValidationErrorsAssignedTo getValidationErrorsAssignedTo() {
    return getOrCreateProperty("ValidationErrorsAssignedTo", "ValidationErrorsAssignedTo", null, pcftest.CommandDefinitionDV_generateactivity.ValidationErrorsAssignedTo.class);
  }
  
  public ValidationErrorsPattern getValidationErrorsPattern() {
    return getOrCreateProperty("ValidationErrorsPattern", "ValidationErrorsPattern", null, pcftest.CommandDefinitionDV_generateactivity.ValidationErrorsPattern.class);
  }
  
  public SelectElement getactivity_pattern() {
    return getOrCreateProperty("activity_pattern", "activity_pattern", null, gw.smoketest.platform.web.SelectElement.class);
  }
  
  public SelectElement getassigneePicker3() {
    return getOrCreateProperty("assigneePicker3", "assigneePicker3", null, gw.smoketest.platform.web.SelectElement.class);
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/bizrules/CommandDefinitionDV.generateactivity.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class CalendarImportance extends PCFElement {
    public CalendarImportance(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public ValidatingCommandParameterInputSet getValidatingCommandParameterInputSet() {
      return getOrCreateProperty("ValidatingCommandParameterInputSet", "ValidatingCommandParameterInputSet", null, pcftest.ValidatingCommandParameterInputSet.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/bizrules/CommandDefinitionDV.generateactivity.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class Descriptions extends PCFElement {
    public Descriptions(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public LocalizedCommandDefinitionParameterInputSet getLocalizedCommandDefinitionParameterInputSet() {
      return getOrCreateProperty("LocalizedCommandDefinitionParameterInputSet", "LocalizedCommandDefinitionParameterInputSet", null, pcftest.LocalizedCommandDefinitionParameterInputSet.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/bizrules/CommandDefinitionDV.generateactivity.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class EscalationDays extends PCFElement {
    public EscalationDays(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public ValidatingCommandParameterInputSet getValidatingCommandParameterInputSet() {
      return getOrCreateProperty("ValidatingCommandParameterInputSet", "ValidatingCommandParameterInputSet", null, pcftest.ValidatingCommandParameterInputSet.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/bizrules/CommandDefinitionDV.generateactivity.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class EscalationHours extends PCFElement {
    public EscalationHours(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public ValidatingCommandParameterInputSet getValidatingCommandParameterInputSet() {
      return getOrCreateProperty("ValidatingCommandParameterInputSet", "ValidatingCommandParameterInputSet", null, pcftest.ValidatingCommandParameterInputSet.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/bizrules/CommandDefinitionDV.generateactivity.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class EscalationIncludeDays extends PCFElement {
    public EscalationIncludeDays(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public ValidatingCommandParameterInputSet getValidatingCommandParameterInputSet() {
      return getOrCreateProperty("ValidatingCommandParameterInputSet", "ValidatingCommandParameterInputSet", null, pcftest.ValidatingCommandParameterInputSet.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/bizrules/CommandDefinitionDV.generateactivity.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class EscalationStartPoint extends PCFElement {
    public EscalationStartPoint(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public ValidatingCommandParameterInputSet getValidatingCommandParameterInputSet() {
      return getOrCreateProperty("ValidatingCommandParameterInputSet", "ValidatingCommandParameterInputSet", null, pcftest.ValidatingCommandParameterInputSet.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/bizrules/CommandDefinitionDV.generateactivity.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class Priority extends PCFElement {
    public Priority(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public ValidatingCommandParameterInputSet getValidatingCommandParameterInputSet() {
      return getOrCreateProperty("ValidatingCommandParameterInputSet", "ValidatingCommandParameterInputSet", null, pcftest.ValidatingCommandParameterInputSet.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/bizrules/CommandDefinitionDV.generateactivity.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class RelatedToRef extends PCFElement {
    public RelatedToRef(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public RelatedToInputSet getRelatedToInputSet() {
      return getOrCreateProperty("RelatedToInputSet", "RelatedToInputSet", null, pcftest.RelatedToInputSet.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/bizrules/CommandDefinitionDV.generateactivity.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class Subjects extends PCFElement {
    public Subjects(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public LocalizedCommandDefinitionParameterInputSet getLocalizedCommandDefinitionParameterInputSet() {
      return getOrCreateProperty("LocalizedCommandDefinitionParameterInputSet", "LocalizedCommandDefinitionParameterInputSet", null, pcftest.LocalizedCommandDefinitionParameterInputSet.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/bizrules/CommandDefinitionDV.generateactivity.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class TargetDays extends PCFElement {
    public TargetDays(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public ValidatingCommandParameterInputSet getValidatingCommandParameterInputSet() {
      return getOrCreateProperty("ValidatingCommandParameterInputSet", "ValidatingCommandParameterInputSet", null, pcftest.ValidatingCommandParameterInputSet.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/bizrules/CommandDefinitionDV.generateactivity.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class TargetHours extends PCFElement {
    public TargetHours(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public ValidatingCommandParameterInputSet getValidatingCommandParameterInputSet() {
      return getOrCreateProperty("ValidatingCommandParameterInputSet", "ValidatingCommandParameterInputSet", null, pcftest.ValidatingCommandParameterInputSet.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/bizrules/CommandDefinitionDV.generateactivity.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class TargetIncludeDays extends PCFElement {
    public TargetIncludeDays(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public ValidatingCommandParameterInputSet getValidatingCommandParameterInputSet() {
      return getOrCreateProperty("ValidatingCommandParameterInputSet", "ValidatingCommandParameterInputSet", null, pcftest.ValidatingCommandParameterInputSet.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/bizrules/CommandDefinitionDV.generateactivity.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class TargetStartPoint extends PCFElement {
    public TargetStartPoint(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public ValidatingCommandParameterInputSet getValidatingCommandParameterInputSet() {
      return getOrCreateProperty("ValidatingCommandParameterInputSet", "ValidatingCommandParameterInputSet", null, pcftest.ValidatingCommandParameterInputSet.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/bizrules/CommandDefinitionDV.generateactivity.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class ValidationErrorsAdditionalRestrictions extends PCFElement {
    public ValidationErrorsAdditionalRestrictions(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public ValidationErrorsInputSet getValidationErrorsInputSet() {
      return getOrCreateProperty("ValidationErrorsInputSet", "ValidationErrorsInputSet", null, pcftest.ValidationErrorsInputSet.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/bizrules/CommandDefinitionDV.generateactivity.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class ValidationErrorsAssignedTo extends PCFElement {
    public ValidationErrorsAssignedTo(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public ValidationErrorsInputSet getValidationErrorsInputSet() {
      return getOrCreateProperty("ValidationErrorsInputSet", "ValidationErrorsInputSet", null, pcftest.ValidationErrorsInputSet.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/bizrules/CommandDefinitionDV.generateactivity.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class ValidationErrorsPattern extends PCFElement {
    public ValidationErrorsPattern(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public ValidationErrorsInputSet getValidationErrorsInputSet() {
      return getOrCreateProperty("ValidationErrorsInputSet", "ValidationErrorsInputSet", null, pcftest.ValidationErrorsInputSet.class);
    }
    
    
  }
  
  
}