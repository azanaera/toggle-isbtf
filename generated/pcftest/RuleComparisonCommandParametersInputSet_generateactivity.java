package pcftest;

import gw.lang.SimplePropertyProcessing;
import gw.smoketest.platform.web.PCFElement;
import gw.smoketest.platform.web.PCFElementId;
import gw.testharness.ISmokeTest;
import javax.annotation.processing.Generated;
import pcftest.RuleComparisonCommandParametersInputSet_generateactivity.additional_restrictions;
import pcftest.RuleComparisonCommandParametersInputSet_generateactivity.assigned_to;
import pcftest.RuleComparisonCommandParametersInputSet_generateactivity.calendar_importance;
import pcftest.RuleComparisonCommandParametersInputSet_generateactivity.description;
import pcftest.RuleComparisonCommandParametersInputSet_generateactivity.escalation_days;
import pcftest.RuleComparisonCommandParametersInputSet_generateactivity.escalation_hours;
import pcftest.RuleComparisonCommandParametersInputSet_generateactivity.escalation_include_days;
import pcftest.RuleComparisonCommandParametersInputSet_generateactivity.escalation_start_point;
import pcftest.RuleComparisonCommandParametersInputSet_generateactivity.group_id;
import pcftest.RuleComparisonCommandParametersInputSet_generateactivity.pattern;
import pcftest.RuleComparisonCommandParametersInputSet_generateactivity.priority;
import pcftest.RuleComparisonCommandParametersInputSet_generateactivity.queue_id;
import pcftest.RuleComparisonCommandParametersInputSet_generateactivity.related_to;
import pcftest.RuleComparisonCommandParametersInputSet_generateactivity.role;
import pcftest.RuleComparisonCommandParametersInputSet_generateactivity.subject;
import pcftest.RuleComparisonCommandParametersInputSet_generateactivity.target_days;
import pcftest.RuleComparisonCommandParametersInputSet_generateactivity.target_hours;
import pcftest.RuleComparisonCommandParametersInputSet_generateactivity.target_included_days;
import pcftest.RuleComparisonCommandParametersInputSet_generateactivity.target_start_point;

@SimplePropertyProcessing
@Generated(comments = "config/web/pcf/bizrules/RuleComparisonCommandParametersInputSet.generateactivity.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
public class RuleComparisonCommandParametersInputSet_generateactivity extends RuleComparisonCommandParametersInputSet {
  public final static String CHECKSUM = "975e83806ef64ecf991440b4c963ad2e";
  
  public RuleComparisonCommandParametersInputSet_generateactivity(ISmokeTest helper, PCFElementId componentId)  {
    super(helper, componentId);
  }
  
  public additional_restrictions getadditional_restrictions() {
    return getOrCreateProperty("additional_restrictions", "additional_restrictions", null, pcftest.RuleComparisonCommandParametersInputSet_generateactivity.additional_restrictions.class);
  }
  
  public assigned_to getassigned_to() {
    return getOrCreateProperty("assigned_to", "assigned_to", null, pcftest.RuleComparisonCommandParametersInputSet_generateactivity.assigned_to.class);
  }
  
  public calendar_importance getcalendar_importance() {
    return getOrCreateProperty("calendar_importance", "calendar_importance", null, pcftest.RuleComparisonCommandParametersInputSet_generateactivity.calendar_importance.class);
  }
  
  public description getdescription() {
    return getOrCreateProperty("description", "description", null, pcftest.RuleComparisonCommandParametersInputSet_generateactivity.description.class);
  }
  
  public escalation_days getescalation_days() {
    return getOrCreateProperty("escalation_days", "escalation_days", null, pcftest.RuleComparisonCommandParametersInputSet_generateactivity.escalation_days.class);
  }
  
  public escalation_hours getescalation_hours() {
    return getOrCreateProperty("escalation_hours", "escalation_hours", null, pcftest.RuleComparisonCommandParametersInputSet_generateactivity.escalation_hours.class);
  }
  
  public escalation_include_days getescalation_include_days() {
    return getOrCreateProperty("escalation_include_days", "escalation_include_days", null, pcftest.RuleComparisonCommandParametersInputSet_generateactivity.escalation_include_days.class);
  }
  
  public escalation_start_point getescalation_start_point() {
    return getOrCreateProperty("escalation_start_point", "escalation_start_point", null, pcftest.RuleComparisonCommandParametersInputSet_generateactivity.escalation_start_point.class);
  }
  
  public group_id getgroup_id() {
    return getOrCreateProperty("group_id", "group_id", null, pcftest.RuleComparisonCommandParametersInputSet_generateactivity.group_id.class);
  }
  
  public pattern getpattern() {
    return getOrCreateProperty("pattern", "pattern", null, pcftest.RuleComparisonCommandParametersInputSet_generateactivity.pattern.class);
  }
  
  public priority getpriority() {
    return getOrCreateProperty("priority", "priority", null, pcftest.RuleComparisonCommandParametersInputSet_generateactivity.priority.class);
  }
  
  public queue_id getqueue_id() {
    return getOrCreateProperty("queue_id", "queue_id", null, pcftest.RuleComparisonCommandParametersInputSet_generateactivity.queue_id.class);
  }
  
  public related_to getrelated_to() {
    return getOrCreateProperty("related_to", "related_to", null, pcftest.RuleComparisonCommandParametersInputSet_generateactivity.related_to.class);
  }
  
  public role getrole() {
    return getOrCreateProperty("role", "role", null, pcftest.RuleComparisonCommandParametersInputSet_generateactivity.role.class);
  }
  
  public subject getsubject() {
    return getOrCreateProperty("subject", "subject", null, pcftest.RuleComparisonCommandParametersInputSet_generateactivity.subject.class);
  }
  
  public target_days gettarget_days() {
    return getOrCreateProperty("target_days", "target_days", null, pcftest.RuleComparisonCommandParametersInputSet_generateactivity.target_days.class);
  }
  
  public target_hours gettarget_hours() {
    return getOrCreateProperty("target_hours", "target_hours", null, pcftest.RuleComparisonCommandParametersInputSet_generateactivity.target_hours.class);
  }
  
  public target_included_days gettarget_included_days() {
    return getOrCreateProperty("target_included_days", "target_included_days", null, pcftest.RuleComparisonCommandParametersInputSet_generateactivity.target_included_days.class);
  }
  
  public target_start_point gettarget_start_point() {
    return getOrCreateProperty("target_start_point", "target_start_point", null, pcftest.RuleComparisonCommandParametersInputSet_generateactivity.target_start_point.class);
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/bizrules/RuleComparisonCommandParametersInputSet.generateactivity.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class additional_restrictions extends PCFElement {
    public additional_restrictions(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public RuleComparisonRowStringInputSet getRuleComparisonRowStringInputSet() {
      return getOrCreateProperty("RuleComparisonRowStringInputSet", "RuleComparisonRowStringInputSet", null, pcftest.RuleComparisonRowStringInputSet.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/bizrules/RuleComparisonCommandParametersInputSet.generateactivity.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class assigned_to extends PCFElement {
    public assigned_to(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public RuleComparisonRowStringInputSet getRuleComparisonRowStringInputSet() {
      return getOrCreateProperty("RuleComparisonRowStringInputSet", "RuleComparisonRowStringInputSet", null, pcftest.RuleComparisonRowStringInputSet.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/bizrules/RuleComparisonCommandParametersInputSet.generateactivity.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class calendar_importance extends PCFElement {
    public calendar_importance(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public RuleComparisonRowTypeKeyInputSet getRuleComparisonRowTypeKeyInputSet() {
      return getOrCreateProperty("RuleComparisonRowTypeKeyInputSet", "RuleComparisonRowTypeKeyInputSet", null, pcftest.RuleComparisonRowTypeKeyInputSet.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/bizrules/RuleComparisonCommandParametersInputSet.generateactivity.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class description extends PCFElement {
    public description(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public RuleComparisonRowLocalizedStringInputSet getRuleComparisonRowLocalizedStringInputSet() {
      return getOrCreateProperty("RuleComparisonRowLocalizedStringInputSet", "RuleComparisonRowLocalizedStringInputSet", null, pcftest.RuleComparisonRowLocalizedStringInputSet.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/bizrules/RuleComparisonCommandParametersInputSet.generateactivity.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class escalation_days extends PCFElement {
    public escalation_days(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public RuleComparisonRowIntegerInputSet getRuleComparisonRowIntegerInputSet() {
      return getOrCreateProperty("RuleComparisonRowIntegerInputSet", "RuleComparisonRowIntegerInputSet", null, pcftest.RuleComparisonRowIntegerInputSet.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/bizrules/RuleComparisonCommandParametersInputSet.generateactivity.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class escalation_hours extends PCFElement {
    public escalation_hours(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public RuleComparisonRowIntegerInputSet getRuleComparisonRowIntegerInputSet() {
      return getOrCreateProperty("RuleComparisonRowIntegerInputSet", "RuleComparisonRowIntegerInputSet", null, pcftest.RuleComparisonRowIntegerInputSet.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/bizrules/RuleComparisonCommandParametersInputSet.generateactivity.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class escalation_include_days extends PCFElement {
    public escalation_include_days(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public RuleComparisonRowTypeKeyInputSet getRuleComparisonRowTypeKeyInputSet() {
      return getOrCreateProperty("RuleComparisonRowTypeKeyInputSet", "RuleComparisonRowTypeKeyInputSet", null, pcftest.RuleComparisonRowTypeKeyInputSet.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/bizrules/RuleComparisonCommandParametersInputSet.generateactivity.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class escalation_start_point extends PCFElement {
    public escalation_start_point(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public RuleComparisonRowTypeKeyInputSet getRuleComparisonRowTypeKeyInputSet() {
      return getOrCreateProperty("RuleComparisonRowTypeKeyInputSet", "RuleComparisonRowTypeKeyInputSet", null, pcftest.RuleComparisonRowTypeKeyInputSet.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/bizrules/RuleComparisonCommandParametersInputSet.generateactivity.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class group_id extends PCFElement {
    public group_id(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public RuleComparisonRowStringInputSet getRuleComparisonRowStringInputSet() {
      return getOrCreateProperty("RuleComparisonRowStringInputSet", "RuleComparisonRowStringInputSet", null, pcftest.RuleComparisonRowStringInputSet.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/bizrules/RuleComparisonCommandParametersInputSet.generateactivity.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class pattern extends PCFElement {
    public pattern(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public RuleComparisonRowStringInputSet getRuleComparisonRowStringInputSet() {
      return getOrCreateProperty("RuleComparisonRowStringInputSet", "RuleComparisonRowStringInputSet", null, pcftest.RuleComparisonRowStringInputSet.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/bizrules/RuleComparisonCommandParametersInputSet.generateactivity.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class priority extends PCFElement {
    public priority(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public RuleComparisonRowTypeKeyInputSet getRuleComparisonRowTypeKeyInputSet() {
      return getOrCreateProperty("RuleComparisonRowTypeKeyInputSet", "RuleComparisonRowTypeKeyInputSet", null, pcftest.RuleComparisonRowTypeKeyInputSet.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/bizrules/RuleComparisonCommandParametersInputSet.generateactivity.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class queue_id extends PCFElement {
    public queue_id(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public RuleComparisonRowStringInputSet getRuleComparisonRowStringInputSet() {
      return getOrCreateProperty("RuleComparisonRowStringInputSet", "RuleComparisonRowStringInputSet", null, pcftest.RuleComparisonRowStringInputSet.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/bizrules/RuleComparisonCommandParametersInputSet.generateactivity.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class related_to extends PCFElement {
    public related_to(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public RuleComparisonRowStringInputSet getRuleComparisonRowStringInputSet() {
      return getOrCreateProperty("RuleComparisonRowStringInputSet", "RuleComparisonRowStringInputSet", null, pcftest.RuleComparisonRowStringInputSet.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/bizrules/RuleComparisonCommandParametersInputSet.generateactivity.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class role extends PCFElement {
    public role(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public RuleComparisonRowTypeKeyInputSet getRuleComparisonRowTypeKeyInputSet() {
      return getOrCreateProperty("RuleComparisonRowTypeKeyInputSet", "RuleComparisonRowTypeKeyInputSet", null, pcftest.RuleComparisonRowTypeKeyInputSet.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/bizrules/RuleComparisonCommandParametersInputSet.generateactivity.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class subject extends PCFElement {
    public subject(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public RuleComparisonRowLocalizedStringInputSet getRuleComparisonRowLocalizedStringInputSet() {
      return getOrCreateProperty("RuleComparisonRowLocalizedStringInputSet", "RuleComparisonRowLocalizedStringInputSet", null, pcftest.RuleComparisonRowLocalizedStringInputSet.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/bizrules/RuleComparisonCommandParametersInputSet.generateactivity.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class target_days extends PCFElement {
    public target_days(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public RuleComparisonRowIntegerInputSet getRuleComparisonRowIntegerInputSet() {
      return getOrCreateProperty("RuleComparisonRowIntegerInputSet", "RuleComparisonRowIntegerInputSet", null, pcftest.RuleComparisonRowIntegerInputSet.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/bizrules/RuleComparisonCommandParametersInputSet.generateactivity.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class target_hours extends PCFElement {
    public target_hours(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public RuleComparisonRowIntegerInputSet getRuleComparisonRowIntegerInputSet() {
      return getOrCreateProperty("RuleComparisonRowIntegerInputSet", "RuleComparisonRowIntegerInputSet", null, pcftest.RuleComparisonRowIntegerInputSet.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/bizrules/RuleComparisonCommandParametersInputSet.generateactivity.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class target_included_days extends PCFElement {
    public target_included_days(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public RuleComparisonRowTypeKeyInputSet getRuleComparisonRowTypeKeyInputSet() {
      return getOrCreateProperty("RuleComparisonRowTypeKeyInputSet", "RuleComparisonRowTypeKeyInputSet", null, pcftest.RuleComparisonRowTypeKeyInputSet.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/bizrules/RuleComparisonCommandParametersInputSet.generateactivity.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class target_start_point extends PCFElement {
    public target_start_point(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public RuleComparisonRowTypeKeyInputSet getRuleComparisonRowTypeKeyInputSet() {
      return getOrCreateProperty("RuleComparisonRowTypeKeyInputSet", "RuleComparisonRowTypeKeyInputSet", null, pcftest.RuleComparisonRowTypeKeyInputSet.class);
    }
    
    
  }
  
  
}