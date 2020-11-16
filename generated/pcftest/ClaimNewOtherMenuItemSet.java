package pcftest;

import gw.lang.SimplePropertyProcessing;
import gw.smoketest.platform.web.ClickableActionElement;
import gw.smoketest.platform.web.PCFElement;
import gw.smoketest.platform.web.PCFElementId;
import gw.testharness.ISmokeTest;
import javax.annotation.processing.Generated;
import pcftest.ClaimNewOtherMenuItemSet.ClaimMenuActions_NewOther;
import pcftest.ClaimNewOtherMenuItemSet.ClaimMenuActions_NewOther.ClaimMenuActions_Email;
import pcftest.ClaimNewOtherMenuItemSet.ClaimMenuActions_NewOther.ClaimMenuActions_NewEvaluation;
import pcftest.ClaimNewOtherMenuItemSet.ClaimMenuActions_NewOther.ClaimMenuActions_NewMatter;
import pcftest.ClaimNewOtherMenuItemSet.ClaimMenuActions_NewOther.ClaimMenuActions_NewNegotiation;
import pcftest.ClaimNewOtherMenuItemSet.ClaimMenuActions_NewOther.ClaimMenuActions_NewNote;
import pcftest.ClaimNewOtherMenuItemSet.ClaimMenuActions_NewOther.ClaimMenuActions_NewServiceRequest;

@SimplePropertyProcessing
@Generated(comments = "config/web/pcf/claim/newother/ClaimNewOtherMenuItemSet.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
public class ClaimNewOtherMenuItemSet extends PCFElement {
  public final static String CHECKSUM = "5fa7dd9756af3044d84bb58b319abef2";
  
  public ClaimNewOtherMenuItemSet(ISmokeTest helper, PCFElementId componentId)  {
    super(helper, componentId);
  }
  
  public ClaimMenuActions_NewOther getClaimMenuActions_NewOther() {
    return getOrCreateProperty("ClaimMenuActions_NewOther", "ClaimMenuActions_NewOther", null, pcftest.ClaimNewOtherMenuItemSet.ClaimMenuActions_NewOther.class);
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/claim/newother/ClaimNewOtherMenuItemSet.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class ClaimMenuActions_NewOther extends ClickableActionElement {
    public ClaimMenuActions_NewOther(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public ClaimMenuActions_Email getClaimMenuActions_Email() {
      return getOrCreateProperty("ClaimMenuActions_Email", "ClaimMenuActions_Email", null, pcftest.ClaimNewOtherMenuItemSet.ClaimMenuActions_NewOther.ClaimMenuActions_Email.class);
    }
    
    public ClaimMenuActions_NewEvaluation getClaimMenuActions_NewEvaluation() {
      return getOrCreateProperty("ClaimMenuActions_NewEvaluation", "ClaimMenuActions_NewEvaluation", null, pcftest.ClaimNewOtherMenuItemSet.ClaimMenuActions_NewOther.ClaimMenuActions_NewEvaluation.class);
    }
    
    public ClaimMenuActions_NewMatter getClaimMenuActions_NewMatter() {
      return getOrCreateProperty("ClaimMenuActions_NewMatter", "ClaimMenuActions_NewMatter", null, pcftest.ClaimNewOtherMenuItemSet.ClaimMenuActions_NewOther.ClaimMenuActions_NewMatter.class);
    }
    
    public ClaimMenuActions_NewNegotiation getClaimMenuActions_NewNegotiation() {
      return getOrCreateProperty("ClaimMenuActions_NewNegotiation", "ClaimMenuActions_NewNegotiation", null, pcftest.ClaimNewOtherMenuItemSet.ClaimMenuActions_NewOther.ClaimMenuActions_NewNegotiation.class);
    }
    
    public ClaimMenuActions_NewNote getClaimMenuActions_NewNote() {
      return getOrCreateProperty("ClaimMenuActions_NewNote", "ClaimMenuActions_NewNote", null, pcftest.ClaimNewOtherMenuItemSet.ClaimMenuActions_NewOther.ClaimMenuActions_NewNote.class);
    }
    
    public ClaimMenuActions_NewServiceRequest getClaimMenuActions_NewServiceRequest() {
      return getOrCreateProperty("ClaimMenuActions_NewServiceRequest", "ClaimMenuActions_NewServiceRequest", null, pcftest.ClaimNewOtherMenuItemSet.ClaimMenuActions_NewOther.ClaimMenuActions_NewServiceRequest.class);
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/claim/newother/ClaimNewOtherMenuItemSet.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class ClaimMenuActions_Email extends ClickableActionElement {
      public ClaimMenuActions_Email(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public EmailWorksheet click() {
        return clickThis(pcftest.EmailWorksheet.class);
      }
      
      
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/claim/newother/ClaimNewOtherMenuItemSet.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class ClaimMenuActions_NewEvaluation extends ClickableActionElement {
      public ClaimMenuActions_NewEvaluation(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public NewEvaluation click() {
        return clickThis(pcftest.NewEvaluation.class);
      }
      
      
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/claim/newother/ClaimNewOtherMenuItemSet.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class ClaimMenuActions_NewMatter extends ClickableActionElement {
      public ClaimMenuActions_NewMatter(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public NewMatter click() {
        return clickThis(pcftest.NewMatter.class);
      }
      
      
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/claim/newother/ClaimNewOtherMenuItemSet.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class ClaimMenuActions_NewNegotiation extends ClickableActionElement {
      public ClaimMenuActions_NewNegotiation(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public NewNegotiation click() {
        return clickThis(pcftest.NewNegotiation.class);
      }
      
      
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/claim/newother/ClaimNewOtherMenuItemSet.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class ClaimMenuActions_NewNote extends ClickableActionElement {
      public ClaimMenuActions_NewNote(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public NewNoteWorksheet click() {
        return clickThis(pcftest.NewNoteWorksheet.class);
      }
      
      
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/claim/newother/ClaimNewOtherMenuItemSet.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class ClaimMenuActions_NewServiceRequest extends ClickableActionElement {
      public ClaimMenuActions_NewServiceRequest(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public NewServiceRequest click() {
        return clickThis(pcftest.NewServiceRequest.class);
      }
      
      
    }
    
    
  }
  
  
}