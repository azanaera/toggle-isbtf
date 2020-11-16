package pcftest;

import gw.lang.SimplePropertyProcessing;
import gw.smoketest.platform.web.ClickableActionElement;
import gw.smoketest.platform.web.DateElement;
import gw.smoketest.platform.web.IteratorEntries;
import gw.smoketest.platform.web.IteratorEntryCheckboxElement;
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
import pcftest.SIDetails.SIDetailsScreen;
import pcftest.SIDetails.SIDetailsScreen.Cancel;
import pcftest.SIDetails.SIDetailsScreen.Edit;
import pcftest.SIDetails.SIDetailsScreen.SIUTotalScore;
import pcftest.SIDetails.SIDetailsScreen.SIUTotalScore.SIInfo_SupervisorSection;
import pcftest.SIDetails.SIDetailsScreen.SIUTotalScore.SIinfo_SIescalateSIU;
import pcftest.SIDetails.SIDetailsScreen.SectionOne;
import pcftest.SIDetails.SIDetailsScreen.SectionTwo;
import pcftest.SIDetails.SIDetailsScreen.SectionTwo.entry;
import pcftest.SIDetails.SIDetailsScreen.Update;
import pcftest.SIDetails.SIDetailsScreen._msgs;
import pcftest.SIDetails.SIDetails_UpLink;
import pcftest.SIDetails._Paging;
import pcftest.SIDetails.__crumb__;
import typekey.YesNo;

@SimplePropertyProcessing
@Generated(comments = "config/web/pcf/claim/lossdetails/sidetails/SIDetails.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
public class SIDetails extends PCFLocation {
  public final static String CHECKSUM = "35bb6e87e01ea25c3a0e7fb1ae32b5eb";
  
  public SIDetails(ISmokeTest helper)  {
    super(helper, new gw.smoketest.platform.web.PCFElementId("SIDetails"));
  }
  
  public SIDetailsScreen getSIDetailsScreen() {
    return getOrCreateProperty("SIDetailsScreen", "SIDetailsScreen", null, pcftest.SIDetails.SIDetailsScreen.class);
  }
  
  public SIDetails_UpLink getSIDetails_UpLink() {
    return getOrCreateProperty("SIDetails_UpLink", "SIDetails_UpLink", null, pcftest.SIDetails.SIDetails_UpLink.class);
  }
  
  public _Paging get_Paging() {
    return getOrCreateProperty("_Paging", "_Paging", null, pcftest.SIDetails._Paging.class);
  }
  
  public __crumb__ get__crumb__() {
    return getOrCreateProperty("__crumb__", "__crumb__", null, pcftest.SIDetails.__crumb__.class);
  }
  
  public ClaimLossDetailsGroup get_parent() {
    return getOrCreateProperty("_parent", pcftest.ClaimLossDetailsGroup.class);
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/claim/lossdetails/sidetails/SIDetails.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class SIDetailsScreen extends PCFElement {
    public SIDetailsScreen(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public Cancel getCancel() {
      return getOrCreateProperty("Cancel", "Cancel", null, pcftest.SIDetails.SIDetailsScreen.Cancel.class);
    }
    
    public Edit getEdit() {
      return getOrCreateProperty("Edit", "Edit", null, pcftest.SIDetails.SIDetailsScreen.Edit.class);
    }
    
    public SIUTotalScore getSIUTotalScore() {
      return getOrCreateProperty("SIUTotalScore", "SIUTotalScore", null, pcftest.SIDetails.SIDetailsScreen.SIUTotalScore.class);
    }
    
    public SectionOne getSectionOne() {
      return getOrCreateProperty("SectionOne", "SectionOne", null, pcftest.SIDetails.SIDetailsScreen.SectionOne.class);
    }
    
    public SectionTwo getSectionTwo() {
      return getOrCreateProperty("SectionTwo", "SectionTwo", null, pcftest.SIDetails.SIDetailsScreen.SectionTwo.class);
    }
    
    public Update getUpdate() {
      return getOrCreateProperty("Update", "Update", null, pcftest.SIDetails.SIDetailsScreen.Update.class);
    }
    
    public _msgs get_msgs() {
      return getOrCreateProperty("_msgs", "_msgs", null, pcftest.SIDetails.SIDetailsScreen._msgs.class);
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/claim/lossdetails/sidetails/SIDetails.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class Cancel extends ClickableActionElement {
      public Cancel(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public PCFLocation click() {
        return clickThis(gw.smoketest.platform.web.PCFLocation.class);
      }
      
      
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/claim/lossdetails/sidetails/SIDetails.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class Edit extends ClickableActionElement {
      public Edit(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public PCFLocation click() {
        return clickThis(gw.smoketest.platform.web.PCFLocation.class);
      }
      
      
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/claim/lossdetails/sidetails/SIDetails.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class SIUTotalScore extends PCFElement {
      public SIUTotalScore(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public SIInfo_SupervisorSection getSIInfo_SupervisorSection() {
        return getOrCreateProperty("SIInfo_SupervisorSection", "SIInfo_SupervisorSection", null, pcftest.SIDetails.SIDetailsScreen.SIUTotalScore.SIInfo_SupervisorSection.class);
      }
      
      public ValueElement getSIinfo_SIEscalateSIUNote() {
        return getOrCreateProperty("SIinfo_SIEscalateSIUNote", "SIinfo_SIEscalateSIUNote", null, gw.smoketest.platform.web.ValueElement.class);
      }
      
      public ValueElement getSIinfo_SITotalScore() {
        return getOrCreateProperty("SIinfo_SITotalScore", "SIinfo_SITotalScore", null, gw.smoketest.platform.web.ValueElement.class);
      }
      
      public SIinfo_SIescalateSIU getSIinfo_SIescalateSIU() {
        return getOrCreateProperty("SIinfo_SIescalateSIU", "SIinfo_SIescalateSIU", null, pcftest.SIDetails.SIDetailsScreen.SIUTotalScore.SIinfo_SIescalateSIU.class);
      }
      
      public DateElement getSIinfo_SIescalateSIUdate() {
        return getOrCreateProperty("SIinfo_SIescalateSIUdate", "SIinfo_SIescalateSIUdate", null, gw.smoketest.platform.web.DateElement.class);
      }
      
      @SimplePropertyProcessing
      @Generated(comments = "config/web/pcf/claim/lossdetails/sidetails/SIDetails.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
      public static class SIInfo_SupervisorSection extends ValueElement {
        public SIInfo_SupervisorSection(ISmokeTest helper, PCFElementId componentId)  {
          super(helper, componentId);
        }
        
        
      }
      
      @SimplePropertyProcessing
      @Generated(comments = "config/web/pcf/claim/lossdetails/sidetails/SIDetails.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
      public static class SIinfo_SIescalateSIU extends SelectElement {
        public SIinfo_SIescalateSIU(ISmokeTest helper, PCFElementId componentId)  {
          super(helper, componentId);
        }
        
        public OptionElement getOptionByTypeKey(YesNo arg) {
          return getOptionByValue(arg == null ? null : arg.getCode());
        }
        
        public YesNo getTypeKeyValue() {
          String myValue = getValue();return myValue == null || myValue.isEmpty() ? null : typekey.YesNo.getTypeKey(myValue);
        }
        
        public void setTypeKeyValue(YesNo arg) {
          setValue(arg == null ? null : arg.getCode());
        }
        
        
      }
      
      
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/claim/lossdetails/sidetails/SIDetails.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class SectionOne extends PCFElement {
      public SectionOne(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public ValueElement getSIinfo_SIscore() {
        return getOrCreateProperty("SIinfo_SIscore", "SIinfo_SIscore", null, gw.smoketest.platform.web.ValueElement.class);
      }
      
      public SItriggersLV getSItriggersLV() {
        return getOrCreateProperty("SItriggersLV", "SItriggersLV", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListView, pcftest.SItriggersLV.class);
      }
      
      
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/claim/lossdetails/sidetails/SIDetails.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class SectionTwo extends PCFElement {
      public SectionTwo(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public ValueElement getSIUQuestionSetTotalScore() {
        return getOrCreateProperty("SIUQuestionSetTotalScore", "SIUQuestionSetTotalScore", null, gw.smoketest.platform.web.ValueElement.class);
      }
      
      @SuppressWarnings(value = "unchecked")
      public IteratorEntries<entry> get_Entries() {
        return getOrCreateEntries(null, pcftest.SIDetails.SIDetailsScreen.SectionTwo.entry.class, gw.smoketest.platform.web.IteratorEntries.class);
      }
      
      @SimplePropertyProcessing
      @Generated(comments = "config/web/pcf/claim/lossdetails/sidetails/SIDetails.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
      public static class entry extends PCFElement {
        public entry(ISmokeTest helper, PCFElementId componentId)  {
          super(helper, componentId);
        }
        
        public QuestionSetLV getQuestionSetLV() {
          return getOrCreateProperty("QuestionSetLV", "QuestionSetLV", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListView, pcftest.QuestionSetLV.class);
        }
        
        public IteratorEntryCheckboxElement get_Checkbox() {
          return getOrCreateProperty("_Checkbox", "_Checkbox", null, gw.smoketest.platform.web.IteratorEntryCheckboxElement.class);
        }
        
        
      }
      
      
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/claim/lossdetails/sidetails/SIDetails.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class Update extends ClickableActionElement {
      public Update(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public PCFLocation click() {
        return clickThis(gw.smoketest.platform.web.PCFLocation.class);
      }
      
      
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/claim/lossdetails/sidetails/SIDetails.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class _msgs extends MessagesElement {
      public _msgs(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public PCFLocation click() {
        return clickThis(gw.smoketest.platform.web.PCFLocation.class);
      }
      
      
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/claim/lossdetails/sidetails/SIDetails.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class SIDetails_UpLink extends ClickableActionElement {
    public SIDetails_UpLink(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/claim/lossdetails/sidetails/SIDetails.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class _Paging extends ValueElementWithSetAndRefresh {
    public _Paging(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/claim/lossdetails/sidetails/SIDetails.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class __crumb__ extends ClickableActionElement {
    public __crumb__(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  
}