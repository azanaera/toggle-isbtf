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
import pcftest.VehIncidentAssessDV.InternalUser_Name;
import pcftest.VehIncidentAssessDV.InternalUser_Name.InternalUser_NameUserSearchMenuItem;
import pcftest.VehIncidentAssessDV.InternalUser_Name.InternalUser_NameUserSelectMenuItem;
import pcftest.VehIncidentAssessDV.Status;
import pcftest.VehIncidentAssessDV.VehAssessItemLV_tb;
import pcftest.VehIncidentAssessDV.VehAssessItemLV_tb.Approve;
import pcftest.VehIncidentAssessDV.VehAssessItemLV_tb.Associate;
import pcftest.VehIncidentAssessDV.VehAssessItemLV_tb.Deny;
import pcftest.VehIncidentAssessDV.VehAssessSourceLV_tb;
import typekey.AssessmentStatus;

@SimplePropertyProcessing
@Generated(comments = "config/web/pcf/claim/assessment/VehIncidentAssessDV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
public class VehIncidentAssessDV extends DetailViewElement {
  public final static String CHECKSUM = "14bf921884417a3850b43eef898e4a40";
  
  public VehIncidentAssessDV(ISmokeTest helper, PCFElementId componentId)  {
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
  
  public InternalUser_Name getInternalUser_Name() {
    return getOrCreateProperty("InternalUser_Name", "InternalUser_Name", null, pcftest.VehIncidentAssessDV.InternalUser_Name.class);
  }
  
  public ValueElement getReviewTotal() {
    return getOrCreateProperty("ReviewTotal", "ReviewTotal", null, gw.smoketest.platform.web.ValueElement.class);
  }
  
  public Status getStatus() {
    return getOrCreateProperty("Status", "Status", null, pcftest.VehIncidentAssessDV.Status.class);
  }
  
  public DateElement getTargetCloseDate() {
    return getOrCreateProperty("TargetCloseDate", "TargetCloseDate", null, gw.smoketest.platform.web.DateElement.class);
  }
  
  public VehAssessItemLV getVehAssessItemLV() {
    return getOrCreateProperty("VehAssessItemLV", "VehAssessItemLV", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListView, pcftest.VehAssessItemLV.class);
  }
  
  public VehAssessItemLV_tb getVehAssessItemLV_tb() {
    return getOrCreateProperty("VehAssessItemLV_tb", "VehAssessItemLV_tb", null, pcftest.VehIncidentAssessDV.VehAssessItemLV_tb.class);
  }
  
  public VehAssessSourceLV getVehAssessSourceLV() {
    return getOrCreateProperty("VehAssessSourceLV", "VehAssessSourceLV", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListView, pcftest.VehAssessSourceLV.class);
  }
  
  public VehAssessSourceLV_tb getVehAssessSourceLV_tb() {
    return getOrCreateProperty("VehAssessSourceLV_tb", "VehAssessSourceLV_tb", null, pcftest.VehIncidentAssessDV.VehAssessSourceLV_tb.class);
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
      return getOrCreateProperty("InternalUser_NameUserSearchMenuItem", "InternalUser_NameUserSearchMenuItem", null, pcftest.VehIncidentAssessDV.InternalUser_Name.InternalUser_NameUserSearchMenuItem.class);
    }
    
    public InternalUser_NameUserSelectMenuItem getInternalUser_NameUserSelectMenuItem() {
      return getOrCreateProperty("InternalUser_NameUserSelectMenuItem", "InternalUser_NameUserSelectMenuItem", null, pcftest.VehIncidentAssessDV.InternalUser_Name.InternalUser_NameUserSelectMenuItem.class);
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
  @Generated(comments = "config/web/pcf/claim/assessment/VehIncidentAssessDV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
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
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/claim/assessment/VehIncidentAssessDV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class VehAssessItemLV_tb extends PCFElement {
    public VehAssessItemLV_tb(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public pcftest.VehIncidentAssessDV.VehAssessItemLV_tb.Add getAdd() {
      return getOrCreateProperty("Add", "Add", null, pcftest.VehIncidentAssessDV.VehAssessItemLV_tb.Add.class);
    }
    
    public Approve getApprove() {
      return getOrCreateProperty("Approve", "Approve", null, pcftest.VehIncidentAssessDV.VehAssessItemLV_tb.Approve.class);
    }
    
    public Associate getAssociate() {
      return getOrCreateProperty("Associate", "Associate", null, pcftest.VehIncidentAssessDV.VehAssessItemLV_tb.Associate.class);
    }
    
    public Deny getDeny() {
      return getOrCreateProperty("Deny", "Deny", null, pcftest.VehIncidentAssessDV.VehAssessItemLV_tb.Deny.class);
    }
    
    public pcftest.VehIncidentAssessDV.VehAssessItemLV_tb.Remove getRemove() {
      return getOrCreateProperty("Remove", "Remove", null, pcftest.VehIncidentAssessDV.VehAssessItemLV_tb.Remove.class);
    }
    
    public SelectElement getSourceRange() {
      return getOrCreateProperty("SourceRange", "SourceRange", null, gw.smoketest.platform.web.SelectElement.class);
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/claim/assessment/VehIncidentAssessDV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class Add extends ClickableActionElement {
      public Add(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public PCFLocation click() {
        return clickThis(gw.smoketest.platform.web.PCFLocation.class);
      }
      
      
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/claim/assessment/VehIncidentAssessDV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class Approve extends ClickableActionElement {
      public Approve(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public PCFLocation click() {
        return clickThis(gw.smoketest.platform.web.PCFLocation.class);
      }
      
      
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/claim/assessment/VehIncidentAssessDV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class Associate extends ClickableActionElement {
      public Associate(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public PCFLocation click() {
        return clickThis(gw.smoketest.platform.web.PCFLocation.class);
      }
      
      
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/claim/assessment/VehIncidentAssessDV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class Deny extends ClickableActionElement {
      public Deny(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public PCFLocation click() {
        return clickThis(gw.smoketest.platform.web.PCFLocation.class);
      }
      
      
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/claim/assessment/VehIncidentAssessDV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
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
  @Generated(comments = "config/web/pcf/claim/assessment/VehIncidentAssessDV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class VehAssessSourceLV_tb extends PCFElement {
    public VehAssessSourceLV_tb(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public pcftest.VehIncidentAssessDV.VehAssessSourceLV_tb.Add getAdd() {
      return getOrCreateProperty("Add", "Add", null, pcftest.VehIncidentAssessDV.VehAssessSourceLV_tb.Add.class);
    }
    
    public pcftest.VehIncidentAssessDV.VehAssessSourceLV_tb.Remove getRemove() {
      return getOrCreateProperty("Remove", "Remove", null, pcftest.VehIncidentAssessDV.VehAssessSourceLV_tb.Remove.class);
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/claim/assessment/VehIncidentAssessDV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class Add extends ClickableActionElement {
      public Add(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public PCFLocation click() {
        return clickThis(gw.smoketest.platform.web.PCFLocation.class);
      }
      
      
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/claim/assessment/VehIncidentAssessDV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class Remove extends ClickableActionElement {
      public Remove(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public PCFLocation click() {
        return clickThis(gw.smoketest.platform.web.PCFLocation.class);
      }
      
      
    }
    
    
  }
  
  
}