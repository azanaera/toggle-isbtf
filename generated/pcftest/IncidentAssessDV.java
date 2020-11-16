package pcftest;

import gw.lang.SimplePropertyProcessing;
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
import pcftest.IncidentAssessDV.IncidentAssessItemLV_tb;
import pcftest.IncidentAssessDV.IncidentAssessItemLV_tb.Approve;
import pcftest.IncidentAssessDV.IncidentAssessItemLV_tb.Associate;
import pcftest.IncidentAssessDV.IncidentAssessItemLV_tb.Deny;
import pcftest.IncidentAssessDV.IncidentAssessSourceLV_tb;
import pcftest.IncidentAssessDV.InternalUser_Name;
import pcftest.IncidentAssessDV.InternalUser_Name.InternalUser_NameUserSearchMenuItem;
import pcftest.IncidentAssessDV.InternalUser_Name.InternalUser_NameUserSelectMenuItem;
import pcftest.IncidentAssessDV.Status;
import typekey.AssessmentStatus;

@SimplePropertyProcessing
@Generated(comments = "config/web/pcf/claim/assessment/IncidentAssessDV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
public class IncidentAssessDV extends DetailViewElement {
  public final static String CHECKSUM = "91eec9848bf9489313b0a3b6a5a1cd42";
  
  public IncidentAssessDV(ISmokeTest helper, PCFElementId componentId)  {
    super(helper, componentId);
  }
  
  public ValueElement getApproveTotal() {
    return getOrCreateProperty("ApproveTotal", "ApproveTotal", null, gw.smoketest.platform.web.ValueElement.class);
  }
  
  public DateElement getCloseDate() {
    return getOrCreateProperty("CloseDate", "CloseDate", null, gw.smoketest.platform.web.DateElement.class);
  }
  
  public ValueElement getDisplay_Name() {
    return getOrCreateProperty("Display_Name", "Display_Name", null, gw.smoketest.platform.web.ValueElement.class);
  }
  
  public ValueElement getGeneral_Comment() {
    return getOrCreateProperty("General_Comment", "General_Comment", null, gw.smoketest.platform.web.ValueElement.class);
  }
  
  public ValueElement getGeneral_Description() {
    return getOrCreateProperty("General_Description", "General_Description", null, gw.smoketest.platform.web.ValueElement.class);
  }
  
  public IncidentAssessItemLV getIncidentAssessItemLV() {
    return getOrCreateProperty("IncidentAssessItemLV", "IncidentAssessItemLV", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListView, pcftest.IncidentAssessItemLV.class);
  }
  
  public IncidentAssessItemLV_tb getIncidentAssessItemLV_tb() {
    return getOrCreateProperty("IncidentAssessItemLV_tb", "IncidentAssessItemLV_tb", null, pcftest.IncidentAssessDV.IncidentAssessItemLV_tb.class);
  }
  
  public IncidentAssessSourceLV getIncidentAssessSourceLV() {
    return getOrCreateProperty("IncidentAssessSourceLV", "IncidentAssessSourceLV", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListView, pcftest.IncidentAssessSourceLV.class);
  }
  
  public IncidentAssessSourceLV_tb getIncidentAssessSourceLV_tb() {
    return getOrCreateProperty("IncidentAssessSourceLV_tb", "IncidentAssessSourceLV_tb", null, pcftest.IncidentAssessDV.IncidentAssessSourceLV_tb.class);
  }
  
  public InternalUser_Name getInternalUser_Name() {
    return getOrCreateProperty("InternalUser_Name", "InternalUser_Name", null, pcftest.IncidentAssessDV.InternalUser_Name.class);
  }
  
  public ValueElement getReviewTotal() {
    return getOrCreateProperty("ReviewTotal", "ReviewTotal", null, gw.smoketest.platform.web.ValueElement.class);
  }
  
  public Status getStatus() {
    return getOrCreateProperty("Status", "Status", null, pcftest.IncidentAssessDV.Status.class);
  }
  
  public DateElement getTargetCloseDate() {
    return getOrCreateProperty("TargetCloseDate", "TargetCloseDate", null, gw.smoketest.platform.web.DateElement.class);
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/claim/assessment/IncidentAssessDV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class IncidentAssessItemLV_tb extends PCFElement {
    public IncidentAssessItemLV_tb(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public pcftest.IncidentAssessDV.IncidentAssessItemLV_tb.Add getAdd() {
      return getOrCreateProperty("Add", "Add", null, pcftest.IncidentAssessDV.IncidentAssessItemLV_tb.Add.class);
    }
    
    public Approve getApprove() {
      return getOrCreateProperty("Approve", "Approve", null, pcftest.IncidentAssessDV.IncidentAssessItemLV_tb.Approve.class);
    }
    
    public Associate getAssociate() {
      return getOrCreateProperty("Associate", "Associate", null, pcftest.IncidentAssessDV.IncidentAssessItemLV_tb.Associate.class);
    }
    
    public Deny getDeny() {
      return getOrCreateProperty("Deny", "Deny", null, pcftest.IncidentAssessDV.IncidentAssessItemLV_tb.Deny.class);
    }
    
    public pcftest.IncidentAssessDV.IncidentAssessItemLV_tb.Remove getRemove() {
      return getOrCreateProperty("Remove", "Remove", null, pcftest.IncidentAssessDV.IncidentAssessItemLV_tb.Remove.class);
    }
    
    public SelectElement getSourceRange() {
      return getOrCreateProperty("SourceRange", "SourceRange", null, gw.smoketest.platform.web.SelectElement.class);
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/claim/assessment/IncidentAssessDV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class Add extends ClickableActionElement {
      public Add(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public PCFLocation click() {
        return clickThis(gw.smoketest.platform.web.PCFLocation.class);
      }
      
      
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/claim/assessment/IncidentAssessDV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class Approve extends ClickableActionElement {
      public Approve(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public PCFLocation click() {
        return clickThis(gw.smoketest.platform.web.PCFLocation.class);
      }
      
      
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/claim/assessment/IncidentAssessDV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class Associate extends ClickableActionElement {
      public Associate(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public PCFLocation click() {
        return clickThis(gw.smoketest.platform.web.PCFLocation.class);
      }
      
      
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/claim/assessment/IncidentAssessDV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class Deny extends ClickableActionElement {
      public Deny(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public PCFLocation click() {
        return clickThis(gw.smoketest.platform.web.PCFLocation.class);
      }
      
      
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/claim/assessment/IncidentAssessDV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
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
  @Generated(comments = "config/web/pcf/claim/assessment/IncidentAssessDV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class IncidentAssessSourceLV_tb extends PCFElement {
    public IncidentAssessSourceLV_tb(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public pcftest.IncidentAssessDV.IncidentAssessSourceLV_tb.Add getAdd() {
      return getOrCreateProperty("Add", "Add", null, pcftest.IncidentAssessDV.IncidentAssessSourceLV_tb.Add.class);
    }
    
    public pcftest.IncidentAssessDV.IncidentAssessSourceLV_tb.Remove getRemove() {
      return getOrCreateProperty("Remove", "Remove", null, pcftest.IncidentAssessDV.IncidentAssessSourceLV_tb.Remove.class);
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/claim/assessment/IncidentAssessDV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class Add extends ClickableActionElement {
      public Add(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public PCFLocation click() {
        return clickThis(gw.smoketest.platform.web.PCFLocation.class);
      }
      
      
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/claim/assessment/IncidentAssessDV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
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
  @Generated(comments = "config/web/widgets/UserWidget.xml", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class InternalUser_Name extends SelectElement {
    public InternalUser_Name(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public UserContactDetailPopup click() {
      return clickThis(pcftest.UserContactDetailPopup.class);
    }
    
    public InternalUser_NameUserSearchMenuItem getInternalUser_NameUserSearchMenuItem() {
      return getOrCreateProperty("InternalUser_NameUserSearchMenuItem", "InternalUser_NameUserSearchMenuItem", null, pcftest.IncidentAssessDV.InternalUser_Name.InternalUser_NameUserSearchMenuItem.class);
    }
    
    public InternalUser_NameUserSelectMenuItem getInternalUser_NameUserSelectMenuItem() {
      return getOrCreateProperty("InternalUser_NameUserSelectMenuItem", "InternalUser_NameUserSelectMenuItem", null, pcftest.IncidentAssessDV.InternalUser_Name.InternalUser_NameUserSelectMenuItem.class);
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/widgets/UserWidget.xml", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class InternalUser_NameUserSearchMenuItem extends ClickableActionElement {
      public InternalUser_NameUserSearchMenuItem(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public UserSearchPopup click() {
        return clickThis(pcftest.UserSearchPopup.class);
      }
      
      
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/widgets/UserWidget.xml", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class InternalUser_NameUserSelectMenuItem extends ClickableActionElement {
      public InternalUser_NameUserSelectMenuItem(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public UserSelectPopup click() {
        return clickThis(pcftest.UserSelectPopup.class);
      }
      
      
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/claim/assessment/IncidentAssessDV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class Status extends SelectElement {
    public Status(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public OptionElement getOptionByTypeKey(AssessmentStatus arg) {
      return getOptionByValue(arg == null ? null : arg.getCode());
    }
    
    public AssessmentStatus getTypeKeyValue() {
      String myValue = getValue();return myValue == null || myValue.isEmpty() ? null : typekey.AssessmentStatus.getTypeKey(myValue);
    }
    
    public void setTypeKeyValue(AssessmentStatus arg) {
      setValue(arg == null ? null : arg.getCode());
    }
    
    
  }
  
  
}