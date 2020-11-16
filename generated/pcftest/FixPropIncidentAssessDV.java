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
import pcftest.FixPropIncidentAssessDV.FixPropAssessItemLV_tb;
import pcftest.FixPropIncidentAssessDV.FixPropAssessItemLV_tb.Approve;
import pcftest.FixPropIncidentAssessDV.FixPropAssessItemLV_tb.Associate;
import pcftest.FixPropIncidentAssessDV.FixPropAssessSourceLV_tb;
import pcftest.FixPropIncidentAssessDV.FixPropContentItemLV_tb;
import pcftest.FixPropIncidentAssessDV.FixPropContentItemLV_tb.ApproveContent;
import pcftest.FixPropIncidentAssessDV.FixPropContentItemLV_tb.AssociateContent;
import pcftest.FixPropIncidentAssessDV.InternalUser_Name;
import pcftest.FixPropIncidentAssessDV.InternalUser_Name.InternalUser_NameUserSearchMenuItem;
import pcftest.FixPropIncidentAssessDV.InternalUser_Name.InternalUser_NameUserSelectMenuItem;
import pcftest.FixPropIncidentAssessDV.Status;
import typekey.AssessmentStatus;

@SimplePropertyProcessing
@Generated(comments = "config/web/pcf/claim/assessment/FixPropIncidentAssessDV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
public class FixPropIncidentAssessDV extends DetailViewElement {
  public final static String CHECKSUM = "1cef86437029bf03e6102c1bdabeb022";
  
  public FixPropIncidentAssessDV(ISmokeTest helper, PCFElementId componentId)  {
    super(helper, componentId);
  }
  
  public ValueElement getApproveContentTotal() {
    return getOrCreateProperty("ApproveContentTotal", "ApproveContentTotal", null, gw.smoketest.platform.web.ValueElement.class);
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
  
  public FixPropAssessItemLV getFixPropAssessItemLV() {
    return getOrCreateProperty("FixPropAssessItemLV", "FixPropAssessItemLV", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListView, pcftest.FixPropAssessItemLV.class);
  }
  
  public FixPropAssessItemLV_tb getFixPropAssessItemLV_tb() {
    return getOrCreateProperty("FixPropAssessItemLV_tb", "FixPropAssessItemLV_tb", null, pcftest.FixPropIncidentAssessDV.FixPropAssessItemLV_tb.class);
  }
  
  public FixPropAssessSourceLV getFixPropAssessSourceLV() {
    return getOrCreateProperty("FixPropAssessSourceLV", "FixPropAssessSourceLV", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListView, pcftest.FixPropAssessSourceLV.class);
  }
  
  public FixPropAssessSourceLV_tb getFixPropAssessSourceLV_tb() {
    return getOrCreateProperty("FixPropAssessSourceLV_tb", "FixPropAssessSourceLV_tb", null, pcftest.FixPropIncidentAssessDV.FixPropAssessSourceLV_tb.class);
  }
  
  public FixPropContentItemLV getFixPropContentItemLV() {
    return getOrCreateProperty("FixPropContentItemLV", "FixPropContentItemLV", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListView, pcftest.FixPropContentItemLV.class);
  }
  
  public FixPropContentItemLV_tb getFixPropContentItemLV_tb() {
    return getOrCreateProperty("FixPropContentItemLV_tb", "FixPropContentItemLV_tb", null, pcftest.FixPropIncidentAssessDV.FixPropContentItemLV_tb.class);
  }
  
  public ValueElement getGeneral_Comment() {
    return getOrCreateProperty("General_Comment", "General_Comment", null, gw.smoketest.platform.web.ValueElement.class);
  }
  
  public ValueElement getGeneral_Description() {
    return getOrCreateProperty("General_Description", "General_Description", null, gw.smoketest.platform.web.ValueElement.class);
  }
  
  public BooleanValueElement getIncludeContentsLineItems() {
    return getOrCreateProperty("IncludeContentsLineItems", "IncludeContentsLineItems", null, gw.smoketest.platform.web.BooleanValueElement.class);
  }
  
  public BooleanValueElement getIncludeLineItems() {
    return getOrCreateProperty("IncludeLineItems", "IncludeLineItems", null, gw.smoketest.platform.web.BooleanValueElement.class);
  }
  
  public InternalUser_Name getInternalUser_Name() {
    return getOrCreateProperty("InternalUser_Name", "InternalUser_Name", null, pcftest.FixPropIncidentAssessDV.InternalUser_Name.class);
  }
  
  public ValueElement getReviewContentTotal() {
    return getOrCreateProperty("ReviewContentTotal", "ReviewContentTotal", null, gw.smoketest.platform.web.ValueElement.class);
  }
  
  public ValueElement getReviewTotal() {
    return getOrCreateProperty("ReviewTotal", "ReviewTotal", null, gw.smoketest.platform.web.ValueElement.class);
  }
  
  public Status getStatus() {
    return getOrCreateProperty("Status", "Status", null, pcftest.FixPropIncidentAssessDV.Status.class);
  }
  
  public DateElement getTargetCloseDate() {
    return getOrCreateProperty("TargetCloseDate", "TargetCloseDate", null, gw.smoketest.platform.web.DateElement.class);
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/claim/assessment/FixPropIncidentAssessDV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class FixPropAssessItemLV_tb extends PCFElement {
    public FixPropAssessItemLV_tb(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public pcftest.FixPropIncidentAssessDV.FixPropAssessItemLV_tb.Add getAdd() {
      return getOrCreateProperty("Add", "Add", null, pcftest.FixPropIncidentAssessDV.FixPropAssessItemLV_tb.Add.class);
    }
    
    public Approve getApprove() {
      return getOrCreateProperty("Approve", "Approve", null, pcftest.FixPropIncidentAssessDV.FixPropAssessItemLV_tb.Approve.class);
    }
    
    public Associate getAssociate() {
      return getOrCreateProperty("Associate", "Associate", null, pcftest.FixPropIncidentAssessDV.FixPropAssessItemLV_tb.Associate.class);
    }
    
    public pcftest.FixPropIncidentAssessDV.FixPropAssessItemLV_tb.Deny getDeny() {
      return getOrCreateProperty("Deny", "Deny", null, pcftest.FixPropIncidentAssessDV.FixPropAssessItemLV_tb.Deny.class);
    }
    
    public pcftest.FixPropIncidentAssessDV.FixPropAssessItemLV_tb.Remove getRemove() {
      return getOrCreateProperty("Remove", "Remove", null, pcftest.FixPropIncidentAssessDV.FixPropAssessItemLV_tb.Remove.class);
    }
    
    public SelectElement getSourceRange() {
      return getOrCreateProperty("SourceRange", "SourceRange", null, gw.smoketest.platform.web.SelectElement.class);
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/claim/assessment/FixPropIncidentAssessDV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class Add extends ClickableActionElement {
      public Add(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public PCFLocation click() {
        return clickThis(gw.smoketest.platform.web.PCFLocation.class);
      }
      
      
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/claim/assessment/FixPropIncidentAssessDV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class Approve extends ClickableActionElement {
      public Approve(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public PCFLocation click() {
        return clickThis(gw.smoketest.platform.web.PCFLocation.class);
      }
      
      
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/claim/assessment/FixPropIncidentAssessDV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class Associate extends ClickableActionElement {
      public Associate(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public PCFLocation click() {
        return clickThis(gw.smoketest.platform.web.PCFLocation.class);
      }
      
      
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/claim/assessment/FixPropIncidentAssessDV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class Deny extends ClickableActionElement {
      public Deny(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public PCFLocation click() {
        return clickThis(gw.smoketest.platform.web.PCFLocation.class);
      }
      
      
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/claim/assessment/FixPropIncidentAssessDV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
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
  @Generated(comments = "config/web/pcf/claim/assessment/FixPropIncidentAssessDV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class FixPropAssessSourceLV_tb extends PCFElement {
    public FixPropAssessSourceLV_tb(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public pcftest.FixPropIncidentAssessDV.FixPropAssessSourceLV_tb.Add getAdd() {
      return getOrCreateProperty("Add", "Add", null, pcftest.FixPropIncidentAssessDV.FixPropAssessSourceLV_tb.Add.class);
    }
    
    public pcftest.FixPropIncidentAssessDV.FixPropAssessSourceLV_tb.Remove getRemove() {
      return getOrCreateProperty("Remove", "Remove", null, pcftest.FixPropIncidentAssessDV.FixPropAssessSourceLV_tb.Remove.class);
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/claim/assessment/FixPropIncidentAssessDV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class Add extends ClickableActionElement {
      public Add(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public PCFLocation click() {
        return clickThis(gw.smoketest.platform.web.PCFLocation.class);
      }
      
      
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/claim/assessment/FixPropIncidentAssessDV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
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
  @Generated(comments = "config/web/pcf/claim/assessment/FixPropIncidentAssessDV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class FixPropContentItemLV_tb extends PCFElement {
    public FixPropContentItemLV_tb(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public pcftest.FixPropIncidentAssessDV.FixPropContentItemLV_tb.Add getAdd() {
      return getOrCreateProperty("Add", "Add", null, pcftest.FixPropIncidentAssessDV.FixPropContentItemLV_tb.Add.class);
    }
    
    public ApproveContent getApproveContent() {
      return getOrCreateProperty("ApproveContent", "ApproveContent", null, pcftest.FixPropIncidentAssessDV.FixPropContentItemLV_tb.ApproveContent.class);
    }
    
    public AssociateContent getAssociateContent() {
      return getOrCreateProperty("AssociateContent", "AssociateContent", null, pcftest.FixPropIncidentAssessDV.FixPropContentItemLV_tb.AssociateContent.class);
    }
    
    public SelectElement getContentSourceRange() {
      return getOrCreateProperty("ContentSourceRange", "ContentSourceRange", null, gw.smoketest.platform.web.SelectElement.class);
    }
    
    public pcftest.FixPropIncidentAssessDV.FixPropContentItemLV_tb.Deny getDeny() {
      return getOrCreateProperty("Deny", "Deny", null, pcftest.FixPropIncidentAssessDV.FixPropContentItemLV_tb.Deny.class);
    }
    
    public pcftest.FixPropIncidentAssessDV.FixPropContentItemLV_tb.Remove getRemove() {
      return getOrCreateProperty("Remove", "Remove", null, pcftest.FixPropIncidentAssessDV.FixPropContentItemLV_tb.Remove.class);
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/claim/assessment/FixPropIncidentAssessDV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class Add extends ClickableActionElement {
      public Add(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public PCFLocation click() {
        return clickThis(gw.smoketest.platform.web.PCFLocation.class);
      }
      
      
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/claim/assessment/FixPropIncidentAssessDV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class ApproveContent extends ClickableActionElement {
      public ApproveContent(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public PCFLocation click() {
        return clickThis(gw.smoketest.platform.web.PCFLocation.class);
      }
      
      
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/claim/assessment/FixPropIncidentAssessDV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class AssociateContent extends ClickableActionElement {
      public AssociateContent(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public PCFLocation click() {
        return clickThis(gw.smoketest.platform.web.PCFLocation.class);
      }
      
      
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/claim/assessment/FixPropIncidentAssessDV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class Deny extends ClickableActionElement {
      public Deny(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public PCFLocation click() {
        return clickThis(gw.smoketest.platform.web.PCFLocation.class);
      }
      
      
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/claim/assessment/FixPropIncidentAssessDV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
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
      return getOrCreateProperty("InternalUser_NameUserSearchMenuItem", "InternalUser_NameUserSearchMenuItem", null, pcftest.FixPropIncidentAssessDV.InternalUser_Name.InternalUser_NameUserSearchMenuItem.class);
    }
    
    public InternalUser_NameUserSelectMenuItem getInternalUser_NameUserSelectMenuItem() {
      return getOrCreateProperty("InternalUser_NameUserSelectMenuItem", "InternalUser_NameUserSelectMenuItem", null, pcftest.FixPropIncidentAssessDV.InternalUser_Name.InternalUser_NameUserSelectMenuItem.class);
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
  @Generated(comments = "config/web/pcf/claim/assessment/FixPropIncidentAssessDV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
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