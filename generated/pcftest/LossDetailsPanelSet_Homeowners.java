package pcftest;

import gw.lang.SimplePropertyProcessing;
import gw.smoketest.platform.web.BooleanValueElement;
import gw.smoketest.platform.web.CheckboxGroupElement;
import gw.smoketest.platform.web.ClickableActionElement;
import gw.smoketest.platform.web.DateElement;
import gw.smoketest.platform.web.DetailViewElement;
import gw.smoketest.platform.web.IteratorEntries;
import gw.smoketest.platform.web.IteratorEntryCheckboxElement;
import gw.smoketest.platform.web.OptionElement;
import gw.smoketest.platform.web.PCFElement;
import gw.smoketest.platform.web.PCFElementId;
import gw.smoketest.platform.web.PCFLocation;
import gw.smoketest.platform.web.RadioButtonValueElement;
import gw.smoketest.platform.web.SelectElement;
import gw.smoketest.platform.web.ValueElement;
import gw.testharness.ISmokeTest;
import javax.annotation.processing.Generated;
import pcftest.LossDetailsPanelSet_Homeowners.Claim_DetailsCardTab;
import pcftest.LossDetailsPanelSet_Homeowners.Claim_ISOCardTab;
import pcftest.LossDetailsPanelSet_Homeowners.EditableOfficialsLV_tb;
import pcftest.LossDetailsPanelSet_Homeowners.IncidentPanelSet;
import pcftest.LossDetailsPanelSet_Homeowners.IncidentPanelSet.IncidentIterator1;
import pcftest.LossDetailsPanelSet_Homeowners.IncidentPanelSet.IncidentIterator2;
import pcftest.LossDetailsPanelSet_Homeowners.IncidentPanelSet.IncidentIterator3;
import pcftest.LossDetailsPanelSet_Homeowners.IncidentPanelSet.IncidentIterator4;
import pcftest.LossDetailsPanelSet_Homeowners.IncidentPanelSet.IncidentIterator5;
import pcftest.LossDetailsPanelSet_Homeowners.IncidentPanelSet.IncidentIterator6;
import pcftest.LossDetailsPanelSet_Homeowners.IncidentPanelSet_tb;
import pcftest.LossDetailsPanelSet_Homeowners.IncidentPanelSet_tb.AddIncidentButton;
import pcftest.LossDetailsPanelSet_Homeowners.IncidentPanelSet_tb.AddIncidentButton.entry.CreateIncident;
import pcftest.LossDetailsPanelSet_Homeowners.LossDetailsDV;
import pcftest.LossDetailsPanelSet_Homeowners.LossDetailsDV.AddressDetailInputSetRef;
import pcftest.LossDetailsPanelSet_Homeowners.LossDetailsDV.Claim_LossCause;
import pcftest.LossDetailsPanelSet_Homeowners.LossDetailsDV.Notification_Fault;
import pcftest.LossDetailsPanelSet_Homeowners.LossDetailsDV.OtherLocationChoice_Choice;
import pcftest.LossDetailsPanelSet_Homeowners.LossDetailsDV.PrimaryLocationChoice_Choice;
import pcftest.LossDetailsPanelSet_Homeowners.MainContact_Picker;
import pcftest.LossDetailsPanelSet_Homeowners.Notification_HowReported;
import pcftest.LossDetailsPanelSet_Homeowners.Notification_MainContactType;
import pcftest.LossDetailsPanelSet_Homeowners.Notification_ReportedByType;
import pcftest.LossDetailsPanelSet_Homeowners.PoliceReportLV;
import pcftest.LossDetailsPanelSet_Homeowners.PoliceReportLV.MetroReportsLV_tb;
import pcftest.LossDetailsPanelSet_Homeowners.PriorClaimsLV_tb;
import pcftest.LossDetailsPanelSet_Homeowners.ReportedBy_Picker;
import pcftest.LossDetailsPanelSet_Homeowners.WitnessLV;
import pcftest.LossDetailsPanelSet_Homeowners.WitnessLV.EditableWitnessesLV_tb;
import typekey.FaultRating;
import typekey.HowReportedType;
import typekey.LossCause;
import typekey.PersonRelationType;

@SimplePropertyProcessing
@Generated(comments = "config/web/pcf/claim/lossdetails/LossDetailsPanelSet.Homeowners.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
public class LossDetailsPanelSet_Homeowners extends LossDetailsPanelSet {
  public final static String CHECKSUM = "fb481b769a29ebbd4e4d3e388784d501";
  
  public LossDetailsPanelSet_Homeowners(ISmokeTest helper, PCFElementId componentId)  {
    super(helper, componentId);
  }
  
  public Claim_DetailsCardTab getClaim_DetailsCardTab() {
    return getOrCreateProperty("Claim_DetailsCardTab", "Claim_DetailsCardTab", null, pcftest.LossDetailsPanelSet_Homeowners.Claim_DetailsCardTab.class);
  }
  
  public Claim_ISOCardTab getClaim_ISOCardTab() {
    return getOrCreateProperty("Claim_ISOCardTab", "Claim_ISOCardTab", null, pcftest.LossDetailsPanelSet_Homeowners.Claim_ISOCardTab.class);
  }
  
  public EditableOfficialsLV getEditableOfficialsLV() {
    return getOrCreateProperty("EditableOfficialsLV", "EditableOfficialsLV", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListView, pcftest.EditableOfficialsLV.class);
  }
  
  public EditableOfficialsLV_tb getEditableOfficialsLV_tb() {
    return getOrCreateProperty("EditableOfficialsLV_tb", "EditableOfficialsLV_tb", null, pcftest.LossDetailsPanelSet_Homeowners.EditableOfficialsLV_tb.class);
  }
  
  public pcftest.LossDetailsPanelSet_Homeowners.FireDamageQuestionsPanelSet getFireDamageQuestionsPanelSet() {
    return getOrCreateProperty("FireDamageQuestionsPanelSet", "FireDamageQuestionsPanelSet", null, pcftest.LossDetailsPanelSet_Homeowners.FireDamageQuestionsPanelSet.class);
  }
  
  public ISODetailsDV getISODetailsDV() {
    return getOrCreateProperty("ISODetailsDV", "ISODetailsDV", null, pcftest.ISODetailsDV.class);
  }
  
  public IncidentPanelSet getIncidentPanelSet() {
    return getOrCreateProperty("IncidentPanelSet", "IncidentPanelSet", gw.smoketest.platform.web.PCFElementId.PCFElementScope.PanelSet, pcftest.LossDetailsPanelSet_Homeowners.IncidentPanelSet.class);
  }
  
  public IncidentPanelSet_tb getIncidentPanelSet_tb() {
    return getOrCreateProperty("IncidentPanelSet_tb", "IncidentPanelSet_tb", null, pcftest.LossDetailsPanelSet_Homeowners.IncidentPanelSet_tb.class);
  }
  
  public LossDetailsDV getLossDetailsDV() {
    return getOrCreateProperty("LossDetailsDV", "LossDetailsDV", null, pcftest.LossDetailsPanelSet_Homeowners.LossDetailsDV.class);
  }
  
  public MainContact_Picker getMainContact_Picker() {
    return getOrCreateProperty("MainContact_Picker", "MainContact_Picker", null, pcftest.LossDetailsPanelSet_Homeowners.MainContact_Picker.class);
  }
  
  public DateElement getNotification_DateReportedToAgent() {
    return getOrCreateProperty("Notification_DateReportedToAgent", "Notification_DateReportedToAgent", null, gw.smoketest.platform.web.DateElement.class);
  }
  
  public BooleanValueElement getNotification_FirstNoticeSuit() {
    return getOrCreateProperty("Notification_FirstNoticeSuit", "Notification_FirstNoticeSuit", null, gw.smoketest.platform.web.BooleanValueElement.class);
  }
  
  public Notification_HowReported getNotification_HowReported() {
    return getOrCreateProperty("Notification_HowReported", "Notification_HowReported", null, pcftest.LossDetailsPanelSet_Homeowners.Notification_HowReported.class);
  }
  
  public Notification_MainContactType getNotification_MainContactType() {
    return getOrCreateProperty("Notification_MainContactType", "Notification_MainContactType", null, pcftest.LossDetailsPanelSet_Homeowners.Notification_MainContactType.class);
  }
  
  public Notification_ReportedByType getNotification_ReportedByType() {
    return getOrCreateProperty("Notification_ReportedByType", "Notification_ReportedByType", null, pcftest.LossDetailsPanelSet_Homeowners.Notification_ReportedByType.class);
  }
  
  public PoliceReportLV getPoliceReportLV() {
    return getOrCreateProperty("PoliceReportLV", "PoliceReportLV", null, pcftest.LossDetailsPanelSet_Homeowners.PoliceReportLV.class);
  }
  
  public PriorClaimsLV getPriorClaimsLV() {
    return getOrCreateProperty("PriorClaimsLV", "PriorClaimsLV", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListView, pcftest.PriorClaimsLV.class);
  }
  
  public PriorClaimsLV_tb getPriorClaimsLV_tb() {
    return getOrCreateProperty("PriorClaimsLV_tb", "PriorClaimsLV_tb", null, pcftest.LossDetailsPanelSet_Homeowners.PriorClaimsLV_tb.class);
  }
  
  public ReportedBy_Picker getReportedBy_Picker() {
    return getOrCreateProperty("ReportedBy_Picker", "ReportedBy_Picker", null, pcftest.LossDetailsPanelSet_Homeowners.ReportedBy_Picker.class);
  }
  
  public pcftest.LossDetailsPanelSet_Homeowners.WaterDamageQuestionsPanelSet getWaterDamageQuestionsPanelSet() {
    return getOrCreateProperty("WaterDamageQuestionsPanelSet", "WaterDamageQuestionsPanelSet", null, pcftest.LossDetailsPanelSet_Homeowners.WaterDamageQuestionsPanelSet.class);
  }
  
  public WitnessLV getWitnessLV() {
    return getOrCreateProperty("WitnessLV", "WitnessLV", null, pcftest.LossDetailsPanelSet_Homeowners.WitnessLV.class);
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/claim/lossdetails/LossDetailsPanelSet.Homeowners.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class Claim_DetailsCardTab extends ClickableActionElement {
    public Claim_DetailsCardTab(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/claim/lossdetails/LossDetailsPanelSet.Homeowners.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class Claim_ISOCardTab extends ClickableActionElement {
    public Claim_ISOCardTab(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/claim/lossdetails/LossDetailsPanelSet.Homeowners.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class EditableOfficialsLV_tb extends PCFElement {
    public EditableOfficialsLV_tb(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public pcftest.LossDetailsPanelSet_Homeowners.EditableOfficialsLV_tb.Add getAdd() {
      return getOrCreateProperty("Add", "Add", null, pcftest.LossDetailsPanelSet_Homeowners.EditableOfficialsLV_tb.Add.class);
    }
    
    public pcftest.LossDetailsPanelSet_Homeowners.EditableOfficialsLV_tb.Remove getRemove() {
      return getOrCreateProperty("Remove", "Remove", null, pcftest.LossDetailsPanelSet_Homeowners.EditableOfficialsLV_tb.Remove.class);
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/claim/lossdetails/LossDetailsPanelSet.Homeowners.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class Add extends ClickableActionElement {
      public Add(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public PCFLocation click() {
        return clickThis(gw.smoketest.platform.web.PCFLocation.class);
      }
      
      
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/claim/lossdetails/LossDetailsPanelSet.Homeowners.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
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
  @Generated(comments = "config/web/pcf/claim/lossdetails/LossDetailsPanelSet.Homeowners.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class FireDamageQuestionsPanelSet extends PCFElement {
    public FireDamageQuestionsPanelSet(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public pcftest.FireDamageQuestionsPanelSet getFireDamageQuestionsPanelSet() {
      return getOrCreateProperty("FireDamageQuestionsPanelSet", "FireDamageQuestionsPanelSet", gw.smoketest.platform.web.PCFElementId.PCFElementScope.PanelSet, pcftest.FireDamageQuestionsPanelSet.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/claim/lossdetails/LossDetailsPanelSet.Homeowners.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class IncidentPanelSet extends PCFElement {
    public IncidentPanelSet(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public IncidentIterator1 getIncidentIterator1() {
      return getOrCreateProperty("IncidentIterator1", "IncidentIterator1", null, pcftest.LossDetailsPanelSet_Homeowners.IncidentPanelSet.IncidentIterator1.class);
    }
    
    public IncidentIterator2 getIncidentIterator2() {
      return getOrCreateProperty("IncidentIterator2", "IncidentIterator2", null, pcftest.LossDetailsPanelSet_Homeowners.IncidentPanelSet.IncidentIterator2.class);
    }
    
    public IncidentIterator3 getIncidentIterator3() {
      return getOrCreateProperty("IncidentIterator3", "IncidentIterator3", null, pcftest.LossDetailsPanelSet_Homeowners.IncidentPanelSet.IncidentIterator3.class);
    }
    
    public IncidentIterator4 getIncidentIterator4() {
      return getOrCreateProperty("IncidentIterator4", "IncidentIterator4", null, pcftest.LossDetailsPanelSet_Homeowners.IncidentPanelSet.IncidentIterator4.class);
    }
    
    public IncidentIterator5 getIncidentIterator5() {
      return getOrCreateProperty("IncidentIterator5", "IncidentIterator5", null, pcftest.LossDetailsPanelSet_Homeowners.IncidentPanelSet.IncidentIterator5.class);
    }
    
    public IncidentIterator6 getIncidentIterator6() {
      return getOrCreateProperty("IncidentIterator6", "IncidentIterator6", null, pcftest.LossDetailsPanelSet_Homeowners.IncidentPanelSet.IncidentIterator6.class);
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/claim/lossdetails/LossDetailsPanelSet.Homeowners.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class IncidentIterator1 extends PCFElement {
      public IncidentIterator1(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      @SuppressWarnings(value = "unchecked")
      public IteratorEntries<pcftest.LossDetailsPanelSet_Homeowners.IncidentPanelSet.IncidentIterator1.entry> get_Entries() {
        return getOrCreateEntries(null, pcftest.LossDetailsPanelSet_Homeowners.IncidentPanelSet.IncidentIterator1.entry.class, gw.smoketest.platform.web.IteratorEntries.class);
      }
      
      @SimplePropertyProcessing
      @Generated(comments = "config/web/pcf/claim/lossdetails/LossDetailsPanelSet.Homeowners.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
      public static class entry extends PCFElement {
        public entry(ISmokeTest helper, PCFElementId componentId)  {
          super(helper, componentId);
        }
        
        public ValueElement getDescription() {
          return getOrCreateProperty("Description", "Description", null, gw.smoketest.platform.web.ValueElement.class);
        }
        
        public pcftest.LossDetailsPanelSet_Homeowners.IncidentPanelSet.IncidentIterator1.entry.IncidentIcon getIncidentIcon() {
          return getOrCreateProperty("IncidentIcon", "IncidentIcon", null, pcftest.LossDetailsPanelSet_Homeowners.IncidentPanelSet.IncidentIterator1.entry.IncidentIcon.class);
        }
        
        public pcftest.LossDetailsPanelSet_Homeowners.IncidentPanelSet.IncidentIterator1.entry.Name getName() {
          return getOrCreateProperty("Name", "Name", null, pcftest.LossDetailsPanelSet_Homeowners.IncidentPanelSet.IncidentIterator1.entry.Name.class);
        }
        
        public IteratorEntryCheckboxElement get_Checkbox() {
          return getOrCreateProperty("_Checkbox", "_Checkbox", null, gw.smoketest.platform.web.IteratorEntryCheckboxElement.class);
        }
        
        @SimplePropertyProcessing
        @Generated(comments = "config/web/pcf/claim/lossdetails/LossDetailsPanelSet.Homeowners.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
        public static class IncidentIcon extends ValueElement {
          public IncidentIcon(ISmokeTest helper, PCFElementId componentId)  {
            super(helper, componentId);
          }
          
          
        }
        
        @SimplePropertyProcessing
        @Generated(comments = "config/web/pcf/claim/lossdetails/LossDetailsPanelSet.Homeowners.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
        public static class Name extends ValueElement {
          public Name(ISmokeTest helper, PCFElementId componentId)  {
            super(helper, componentId);
          }
          
          public PCFLocation click() {
            return clickThis(gw.smoketest.platform.web.PCFLocation.class);
          }
          
          public pcftest.LossDetailsPanelSet_Homeowners.IncidentPanelSet.IncidentIterator1.entry.Name.EditIncident getEditIncident() {
            return getOrCreateProperty("EditIncident", "EditIncident", null, pcftest.LossDetailsPanelSet_Homeowners.IncidentPanelSet.IncidentIterator1.entry.Name.EditIncident.class);
          }
          
          public pcftest.LossDetailsPanelSet_Homeowners.IncidentPanelSet.IncidentIterator1.entry.Name.RemoveIncident getRemoveIncident() {
            return getOrCreateProperty("RemoveIncident", "RemoveIncident", null, pcftest.LossDetailsPanelSet_Homeowners.IncidentPanelSet.IncidentIterator1.entry.Name.RemoveIncident.class);
          }
          
          @SimplePropertyProcessing
          @Generated(comments = "config/web/pcf/claim/lossdetails/LossDetailsPanelSet.Homeowners.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
          public static class EditIncident extends ClickableActionElement {
            public EditIncident(ISmokeTest helper, PCFElementId componentId)  {
              super(helper, componentId);
            }
            
            public PCFLocation click() {
              return clickThis(gw.smoketest.platform.web.PCFLocation.class);
            }
            
            
          }
          
          @SimplePropertyProcessing
          @Generated(comments = "config/web/pcf/claim/lossdetails/LossDetailsPanelSet.Homeowners.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
          public static class RemoveIncident extends ClickableActionElement {
            public RemoveIncident(ISmokeTest helper, PCFElementId componentId)  {
              super(helper, componentId);
            }
            
            public PCFLocation click() {
              return clickThis(gw.smoketest.platform.web.PCFLocation.class);
            }
            
            
          }
          
          
        }
        
        
      }
      
      
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/claim/lossdetails/LossDetailsPanelSet.Homeowners.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class IncidentIterator2 extends PCFElement {
      public IncidentIterator2(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      @SuppressWarnings(value = "unchecked")
      public IteratorEntries<pcftest.LossDetailsPanelSet_Homeowners.IncidentPanelSet.IncidentIterator2.entry> get_Entries() {
        return getOrCreateEntries(null, pcftest.LossDetailsPanelSet_Homeowners.IncidentPanelSet.IncidentIterator2.entry.class, gw.smoketest.platform.web.IteratorEntries.class);
      }
      
      @SimplePropertyProcessing
      @Generated(comments = "config/web/pcf/claim/lossdetails/LossDetailsPanelSet.Homeowners.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
      public static class entry extends PCFElement {
        public entry(ISmokeTest helper, PCFElementId componentId)  {
          super(helper, componentId);
        }
        
        public ValueElement getDescription() {
          return getOrCreateProperty("Description", "Description", null, gw.smoketest.platform.web.ValueElement.class);
        }
        
        public pcftest.LossDetailsPanelSet_Homeowners.IncidentPanelSet.IncidentIterator2.entry.IncidentIcon getIncidentIcon() {
          return getOrCreateProperty("IncidentIcon", "IncidentIcon", null, pcftest.LossDetailsPanelSet_Homeowners.IncidentPanelSet.IncidentIterator2.entry.IncidentIcon.class);
        }
        
        public pcftest.LossDetailsPanelSet_Homeowners.IncidentPanelSet.IncidentIterator2.entry.Name getName() {
          return getOrCreateProperty("Name", "Name", null, pcftest.LossDetailsPanelSet_Homeowners.IncidentPanelSet.IncidentIterator2.entry.Name.class);
        }
        
        public IteratorEntryCheckboxElement get_Checkbox() {
          return getOrCreateProperty("_Checkbox", "_Checkbox", null, gw.smoketest.platform.web.IteratorEntryCheckboxElement.class);
        }
        
        @SimplePropertyProcessing
        @Generated(comments = "config/web/pcf/claim/lossdetails/LossDetailsPanelSet.Homeowners.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
        public static class IncidentIcon extends ValueElement {
          public IncidentIcon(ISmokeTest helper, PCFElementId componentId)  {
            super(helper, componentId);
          }
          
          
        }
        
        @SimplePropertyProcessing
        @Generated(comments = "config/web/pcf/claim/lossdetails/LossDetailsPanelSet.Homeowners.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
        public static class Name extends ValueElement {
          public Name(ISmokeTest helper, PCFElementId componentId)  {
            super(helper, componentId);
          }
          
          public PCFLocation click() {
            return clickThis(gw.smoketest.platform.web.PCFLocation.class);
          }
          
          public pcftest.LossDetailsPanelSet_Homeowners.IncidentPanelSet.IncidentIterator2.entry.Name.EditIncident getEditIncident() {
            return getOrCreateProperty("EditIncident", "EditIncident", null, pcftest.LossDetailsPanelSet_Homeowners.IncidentPanelSet.IncidentIterator2.entry.Name.EditIncident.class);
          }
          
          public pcftest.LossDetailsPanelSet_Homeowners.IncidentPanelSet.IncidentIterator2.entry.Name.RemoveIncident getRemoveIncident() {
            return getOrCreateProperty("RemoveIncident", "RemoveIncident", null, pcftest.LossDetailsPanelSet_Homeowners.IncidentPanelSet.IncidentIterator2.entry.Name.RemoveIncident.class);
          }
          
          @SimplePropertyProcessing
          @Generated(comments = "config/web/pcf/claim/lossdetails/LossDetailsPanelSet.Homeowners.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
          public static class EditIncident extends ClickableActionElement {
            public EditIncident(ISmokeTest helper, PCFElementId componentId)  {
              super(helper, componentId);
            }
            
            public PCFLocation click() {
              return clickThis(gw.smoketest.platform.web.PCFLocation.class);
            }
            
            
          }
          
          @SimplePropertyProcessing
          @Generated(comments = "config/web/pcf/claim/lossdetails/LossDetailsPanelSet.Homeowners.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
          public static class RemoveIncident extends ClickableActionElement {
            public RemoveIncident(ISmokeTest helper, PCFElementId componentId)  {
              super(helper, componentId);
            }
            
            public PCFLocation click() {
              return clickThis(gw.smoketest.platform.web.PCFLocation.class);
            }
            
            
          }
          
          
        }
        
        
      }
      
      
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/claim/lossdetails/LossDetailsPanelSet.Homeowners.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class IncidentIterator3 extends PCFElement {
      public IncidentIterator3(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      @SuppressWarnings(value = "unchecked")
      public IteratorEntries<pcftest.LossDetailsPanelSet_Homeowners.IncidentPanelSet.IncidentIterator3.entry> get_Entries() {
        return getOrCreateEntries(null, pcftest.LossDetailsPanelSet_Homeowners.IncidentPanelSet.IncidentIterator3.entry.class, gw.smoketest.platform.web.IteratorEntries.class);
      }
      
      @SimplePropertyProcessing
      @Generated(comments = "config/web/pcf/claim/lossdetails/LossDetailsPanelSet.Homeowners.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
      public static class entry extends PCFElement {
        public entry(ISmokeTest helper, PCFElementId componentId)  {
          super(helper, componentId);
        }
        
        public ValueElement getDescription() {
          return getOrCreateProperty("Description", "Description", null, gw.smoketest.platform.web.ValueElement.class);
        }
        
        public pcftest.LossDetailsPanelSet_Homeowners.IncidentPanelSet.IncidentIterator3.entry.IncidentIcon getIncidentIcon() {
          return getOrCreateProperty("IncidentIcon", "IncidentIcon", null, pcftest.LossDetailsPanelSet_Homeowners.IncidentPanelSet.IncidentIterator3.entry.IncidentIcon.class);
        }
        
        public pcftest.LossDetailsPanelSet_Homeowners.IncidentPanelSet.IncidentIterator3.entry.Name getName() {
          return getOrCreateProperty("Name", "Name", null, pcftest.LossDetailsPanelSet_Homeowners.IncidentPanelSet.IncidentIterator3.entry.Name.class);
        }
        
        public IteratorEntryCheckboxElement get_Checkbox() {
          return getOrCreateProperty("_Checkbox", "_Checkbox", null, gw.smoketest.platform.web.IteratorEntryCheckboxElement.class);
        }
        
        @SimplePropertyProcessing
        @Generated(comments = "config/web/pcf/claim/lossdetails/LossDetailsPanelSet.Homeowners.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
        public static class IncidentIcon extends ValueElement {
          public IncidentIcon(ISmokeTest helper, PCFElementId componentId)  {
            super(helper, componentId);
          }
          
          
        }
        
        @SimplePropertyProcessing
        @Generated(comments = "config/web/pcf/claim/lossdetails/LossDetailsPanelSet.Homeowners.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
        public static class Name extends ValueElement {
          public Name(ISmokeTest helper, PCFElementId componentId)  {
            super(helper, componentId);
          }
          
          public PCFLocation click() {
            return clickThis(gw.smoketest.platform.web.PCFLocation.class);
          }
          
          public pcftest.LossDetailsPanelSet_Homeowners.IncidentPanelSet.IncidentIterator3.entry.Name.EditIncident getEditIncident() {
            return getOrCreateProperty("EditIncident", "EditIncident", null, pcftest.LossDetailsPanelSet_Homeowners.IncidentPanelSet.IncidentIterator3.entry.Name.EditIncident.class);
          }
          
          public pcftest.LossDetailsPanelSet_Homeowners.IncidentPanelSet.IncidentIterator3.entry.Name.RemoveIncident getRemoveIncident() {
            return getOrCreateProperty("RemoveIncident", "RemoveIncident", null, pcftest.LossDetailsPanelSet_Homeowners.IncidentPanelSet.IncidentIterator3.entry.Name.RemoveIncident.class);
          }
          
          @SimplePropertyProcessing
          @Generated(comments = "config/web/pcf/claim/lossdetails/LossDetailsPanelSet.Homeowners.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
          public static class EditIncident extends ClickableActionElement {
            public EditIncident(ISmokeTest helper, PCFElementId componentId)  {
              super(helper, componentId);
            }
            
            public PCFLocation click() {
              return clickThis(gw.smoketest.platform.web.PCFLocation.class);
            }
            
            
          }
          
          @SimplePropertyProcessing
          @Generated(comments = "config/web/pcf/claim/lossdetails/LossDetailsPanelSet.Homeowners.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
          public static class RemoveIncident extends ClickableActionElement {
            public RemoveIncident(ISmokeTest helper, PCFElementId componentId)  {
              super(helper, componentId);
            }
            
            public PCFLocation click() {
              return clickThis(gw.smoketest.platform.web.PCFLocation.class);
            }
            
            
          }
          
          
        }
        
        
      }
      
      
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/claim/lossdetails/LossDetailsPanelSet.Homeowners.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class IncidentIterator4 extends PCFElement {
      public IncidentIterator4(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      @SuppressWarnings(value = "unchecked")
      public IteratorEntries<pcftest.LossDetailsPanelSet_Homeowners.IncidentPanelSet.IncidentIterator4.entry> get_Entries() {
        return getOrCreateEntries(null, pcftest.LossDetailsPanelSet_Homeowners.IncidentPanelSet.IncidentIterator4.entry.class, gw.smoketest.platform.web.IteratorEntries.class);
      }
      
      @SimplePropertyProcessing
      @Generated(comments = "config/web/pcf/claim/lossdetails/LossDetailsPanelSet.Homeowners.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
      public static class entry extends PCFElement {
        public entry(ISmokeTest helper, PCFElementId componentId)  {
          super(helper, componentId);
        }
        
        public ValueElement getDescription() {
          return getOrCreateProperty("Description", "Description", null, gw.smoketest.platform.web.ValueElement.class);
        }
        
        public pcftest.LossDetailsPanelSet_Homeowners.IncidentPanelSet.IncidentIterator4.entry.IncidentIcon getIncidentIcon() {
          return getOrCreateProperty("IncidentIcon", "IncidentIcon", null, pcftest.LossDetailsPanelSet_Homeowners.IncidentPanelSet.IncidentIterator4.entry.IncidentIcon.class);
        }
        
        public pcftest.LossDetailsPanelSet_Homeowners.IncidentPanelSet.IncidentIterator4.entry.Name getName() {
          return getOrCreateProperty("Name", "Name", null, pcftest.LossDetailsPanelSet_Homeowners.IncidentPanelSet.IncidentIterator4.entry.Name.class);
        }
        
        public IteratorEntryCheckboxElement get_Checkbox() {
          return getOrCreateProperty("_Checkbox", "_Checkbox", null, gw.smoketest.platform.web.IteratorEntryCheckboxElement.class);
        }
        
        @SimplePropertyProcessing
        @Generated(comments = "config/web/pcf/claim/lossdetails/LossDetailsPanelSet.Homeowners.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
        public static class IncidentIcon extends ValueElement {
          public IncidentIcon(ISmokeTest helper, PCFElementId componentId)  {
            super(helper, componentId);
          }
          
          
        }
        
        @SimplePropertyProcessing
        @Generated(comments = "config/web/pcf/claim/lossdetails/LossDetailsPanelSet.Homeowners.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
        public static class Name extends ValueElement {
          public Name(ISmokeTest helper, PCFElementId componentId)  {
            super(helper, componentId);
          }
          
          public PCFLocation click() {
            return clickThis(gw.smoketest.platform.web.PCFLocation.class);
          }
          
          public pcftest.LossDetailsPanelSet_Homeowners.IncidentPanelSet.IncidentIterator4.entry.Name.EditIncident getEditIncident() {
            return getOrCreateProperty("EditIncident", "EditIncident", null, pcftest.LossDetailsPanelSet_Homeowners.IncidentPanelSet.IncidentIterator4.entry.Name.EditIncident.class);
          }
          
          public pcftest.LossDetailsPanelSet_Homeowners.IncidentPanelSet.IncidentIterator4.entry.Name.RemoveIncident getRemoveIncident() {
            return getOrCreateProperty("RemoveIncident", "RemoveIncident", null, pcftest.LossDetailsPanelSet_Homeowners.IncidentPanelSet.IncidentIterator4.entry.Name.RemoveIncident.class);
          }
          
          @SimplePropertyProcessing
          @Generated(comments = "config/web/pcf/claim/lossdetails/LossDetailsPanelSet.Homeowners.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
          public static class EditIncident extends ClickableActionElement {
            public EditIncident(ISmokeTest helper, PCFElementId componentId)  {
              super(helper, componentId);
            }
            
            public PCFLocation click() {
              return clickThis(gw.smoketest.platform.web.PCFLocation.class);
            }
            
            
          }
          
          @SimplePropertyProcessing
          @Generated(comments = "config/web/pcf/claim/lossdetails/LossDetailsPanelSet.Homeowners.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
          public static class RemoveIncident extends ClickableActionElement {
            public RemoveIncident(ISmokeTest helper, PCFElementId componentId)  {
              super(helper, componentId);
            }
            
            public PCFLocation click() {
              return clickThis(gw.smoketest.platform.web.PCFLocation.class);
            }
            
            
          }
          
          
        }
        
        
      }
      
      
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/claim/lossdetails/LossDetailsPanelSet.Homeowners.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class IncidentIterator5 extends PCFElement {
      public IncidentIterator5(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      @SuppressWarnings(value = "unchecked")
      public IteratorEntries<pcftest.LossDetailsPanelSet_Homeowners.IncidentPanelSet.IncidentIterator5.entry> get_Entries() {
        return getOrCreateEntries(null, pcftest.LossDetailsPanelSet_Homeowners.IncidentPanelSet.IncidentIterator5.entry.class, gw.smoketest.platform.web.IteratorEntries.class);
      }
      
      @SimplePropertyProcessing
      @Generated(comments = "config/web/pcf/claim/lossdetails/LossDetailsPanelSet.Homeowners.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
      public static class entry extends PCFElement {
        public entry(ISmokeTest helper, PCFElementId componentId)  {
          super(helper, componentId);
        }
        
        public ValueElement getDescription() {
          return getOrCreateProperty("Description", "Description", null, gw.smoketest.platform.web.ValueElement.class);
        }
        
        public pcftest.LossDetailsPanelSet_Homeowners.IncidentPanelSet.IncidentIterator5.entry.IncidentIcon getIncidentIcon() {
          return getOrCreateProperty("IncidentIcon", "IncidentIcon", null, pcftest.LossDetailsPanelSet_Homeowners.IncidentPanelSet.IncidentIterator5.entry.IncidentIcon.class);
        }
        
        public pcftest.LossDetailsPanelSet_Homeowners.IncidentPanelSet.IncidentIterator5.entry.Name getName() {
          return getOrCreateProperty("Name", "Name", null, pcftest.LossDetailsPanelSet_Homeowners.IncidentPanelSet.IncidentIterator5.entry.Name.class);
        }
        
        public IteratorEntryCheckboxElement get_Checkbox() {
          return getOrCreateProperty("_Checkbox", "_Checkbox", null, gw.smoketest.platform.web.IteratorEntryCheckboxElement.class);
        }
        
        @SimplePropertyProcessing
        @Generated(comments = "config/web/pcf/claim/lossdetails/LossDetailsPanelSet.Homeowners.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
        public static class IncidentIcon extends ValueElement {
          public IncidentIcon(ISmokeTest helper, PCFElementId componentId)  {
            super(helper, componentId);
          }
          
          
        }
        
        @SimplePropertyProcessing
        @Generated(comments = "config/web/pcf/claim/lossdetails/LossDetailsPanelSet.Homeowners.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
        public static class Name extends ValueElement {
          public Name(ISmokeTest helper, PCFElementId componentId)  {
            super(helper, componentId);
          }
          
          public PCFLocation click() {
            return clickThis(gw.smoketest.platform.web.PCFLocation.class);
          }
          
          public pcftest.LossDetailsPanelSet_Homeowners.IncidentPanelSet.IncidentIterator5.entry.Name.EditIncident getEditIncident() {
            return getOrCreateProperty("EditIncident", "EditIncident", null, pcftest.LossDetailsPanelSet_Homeowners.IncidentPanelSet.IncidentIterator5.entry.Name.EditIncident.class);
          }
          
          public pcftest.LossDetailsPanelSet_Homeowners.IncidentPanelSet.IncidentIterator5.entry.Name.RemoveIncident getRemoveIncident() {
            return getOrCreateProperty("RemoveIncident", "RemoveIncident", null, pcftest.LossDetailsPanelSet_Homeowners.IncidentPanelSet.IncidentIterator5.entry.Name.RemoveIncident.class);
          }
          
          @SimplePropertyProcessing
          @Generated(comments = "config/web/pcf/claim/lossdetails/LossDetailsPanelSet.Homeowners.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
          public static class EditIncident extends ClickableActionElement {
            public EditIncident(ISmokeTest helper, PCFElementId componentId)  {
              super(helper, componentId);
            }
            
            public PCFLocation click() {
              return clickThis(gw.smoketest.platform.web.PCFLocation.class);
            }
            
            
          }
          
          @SimplePropertyProcessing
          @Generated(comments = "config/web/pcf/claim/lossdetails/LossDetailsPanelSet.Homeowners.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
          public static class RemoveIncident extends ClickableActionElement {
            public RemoveIncident(ISmokeTest helper, PCFElementId componentId)  {
              super(helper, componentId);
            }
            
            public PCFLocation click() {
              return clickThis(gw.smoketest.platform.web.PCFLocation.class);
            }
            
            
          }
          
          
        }
        
        
      }
      
      
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/claim/lossdetails/LossDetailsPanelSet.Homeowners.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class IncidentIterator6 extends PCFElement {
      public IncidentIterator6(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      @SuppressWarnings(value = "unchecked")
      public IteratorEntries<pcftest.LossDetailsPanelSet_Homeowners.IncidentPanelSet.IncidentIterator6.entry> get_Entries() {
        return getOrCreateEntries(null, pcftest.LossDetailsPanelSet_Homeowners.IncidentPanelSet.IncidentIterator6.entry.class, gw.smoketest.platform.web.IteratorEntries.class);
      }
      
      @SimplePropertyProcessing
      @Generated(comments = "config/web/pcf/claim/lossdetails/LossDetailsPanelSet.Homeowners.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
      public static class entry extends PCFElement {
        public entry(ISmokeTest helper, PCFElementId componentId)  {
          super(helper, componentId);
        }
        
        public ValueElement getDescription() {
          return getOrCreateProperty("Description", "Description", null, gw.smoketest.platform.web.ValueElement.class);
        }
        
        public pcftest.LossDetailsPanelSet_Homeowners.IncidentPanelSet.IncidentIterator6.entry.IncidentIcon getIncidentIcon() {
          return getOrCreateProperty("IncidentIcon", "IncidentIcon", null, pcftest.LossDetailsPanelSet_Homeowners.IncidentPanelSet.IncidentIterator6.entry.IncidentIcon.class);
        }
        
        public pcftest.LossDetailsPanelSet_Homeowners.IncidentPanelSet.IncidentIterator6.entry.Name getName() {
          return getOrCreateProperty("Name", "Name", null, pcftest.LossDetailsPanelSet_Homeowners.IncidentPanelSet.IncidentIterator6.entry.Name.class);
        }
        
        public IteratorEntryCheckboxElement get_Checkbox() {
          return getOrCreateProperty("_Checkbox", "_Checkbox", null, gw.smoketest.platform.web.IteratorEntryCheckboxElement.class);
        }
        
        @SimplePropertyProcessing
        @Generated(comments = "config/web/pcf/claim/lossdetails/LossDetailsPanelSet.Homeowners.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
        public static class IncidentIcon extends ValueElement {
          public IncidentIcon(ISmokeTest helper, PCFElementId componentId)  {
            super(helper, componentId);
          }
          
          
        }
        
        @SimplePropertyProcessing
        @Generated(comments = "config/web/pcf/claim/lossdetails/LossDetailsPanelSet.Homeowners.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
        public static class Name extends ValueElement {
          public Name(ISmokeTest helper, PCFElementId componentId)  {
            super(helper, componentId);
          }
          
          public PCFLocation click() {
            return clickThis(gw.smoketest.platform.web.PCFLocation.class);
          }
          
          public pcftest.LossDetailsPanelSet_Homeowners.IncidentPanelSet.IncidentIterator6.entry.Name.EditIncident getEditIncident() {
            return getOrCreateProperty("EditIncident", "EditIncident", null, pcftest.LossDetailsPanelSet_Homeowners.IncidentPanelSet.IncidentIterator6.entry.Name.EditIncident.class);
          }
          
          public pcftest.LossDetailsPanelSet_Homeowners.IncidentPanelSet.IncidentIterator6.entry.Name.RemoveIncident getRemoveIncident() {
            return getOrCreateProperty("RemoveIncident", "RemoveIncident", null, pcftest.LossDetailsPanelSet_Homeowners.IncidentPanelSet.IncidentIterator6.entry.Name.RemoveIncident.class);
          }
          
          @SimplePropertyProcessing
          @Generated(comments = "config/web/pcf/claim/lossdetails/LossDetailsPanelSet.Homeowners.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
          public static class EditIncident extends ClickableActionElement {
            public EditIncident(ISmokeTest helper, PCFElementId componentId)  {
              super(helper, componentId);
            }
            
            public PCFLocation click() {
              return clickThis(gw.smoketest.platform.web.PCFLocation.class);
            }
            
            
          }
          
          @SimplePropertyProcessing
          @Generated(comments = "config/web/pcf/claim/lossdetails/LossDetailsPanelSet.Homeowners.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
          public static class RemoveIncident extends ClickableActionElement {
            public RemoveIncident(ISmokeTest helper, PCFElementId componentId)  {
              super(helper, componentId);
            }
            
            public PCFLocation click() {
              return clickThis(gw.smoketest.platform.web.PCFLocation.class);
            }
            
            
          }
          
          
        }
        
        
      }
      
      
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/claim/lossdetails/LossDetailsPanelSet.Homeowners.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class IncidentPanelSet_tb extends PCFElement {
    public IncidentPanelSet_tb(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public AddIncidentButton getAddIncidentButton() {
      return getOrCreateProperty("AddIncidentButton", "AddIncidentButton", null, pcftest.LossDetailsPanelSet_Homeowners.IncidentPanelSet_tb.AddIncidentButton.class);
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/claim/lossdetails/LossDetailsPanelSet.Homeowners.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class AddIncidentButton extends ClickableActionElement {
      public AddIncidentButton(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      @SuppressWarnings(value = "unchecked")
      public IteratorEntries<pcftest.LossDetailsPanelSet_Homeowners.IncidentPanelSet_tb.AddIncidentButton.entry> get_Entries() {
        return getOrCreateEntries(null, pcftest.LossDetailsPanelSet_Homeowners.IncidentPanelSet_tb.AddIncidentButton.entry.class, gw.smoketest.platform.web.IteratorEntries.class);
      }
      
      @SimplePropertyProcessing
      @Generated(comments = "config/web/pcf/claim/lossdetails/LossDetailsPanelSet.Homeowners.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
      public static class entry extends PCFElement {
        public entry(ISmokeTest helper, PCFElementId componentId)  {
          super(helper, componentId);
        }
        
        public CreateIncident getCreateIncident() {
          return getOrCreateProperty("CreateIncident", "CreateIncident", null, pcftest.LossDetailsPanelSet_Homeowners.IncidentPanelSet_tb.AddIncidentButton.entry.CreateIncident.class);
        }
        
        @SimplePropertyProcessing
        @Generated(comments = "config/web/pcf/claim/lossdetails/LossDetailsPanelSet.Homeowners.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
        public static class CreateIncident extends ClickableActionElement {
          public CreateIncident(ISmokeTest helper, PCFElementId componentId)  {
            super(helper, componentId);
          }
          
          public PCFLocation click() {
            return clickThis(gw.smoketest.platform.web.PCFLocation.class);
          }
          
          
        }
        
        
      }
      
      
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/claim/lossdetails/LossDetailsPanelSet.Homeowners.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class LossDetailsDV extends DetailViewElement {
    public LossDetailsDV(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public AddressDetailInputSetRef getAddressDetailInputSetRef() {
      return getOrCreateProperty("AddressDetailInputSetRef", "AddressDetailInputSetRef", null, pcftest.LossDetailsPanelSet_Homeowners.LossDetailsDV.AddressDetailInputSetRef.class);
    }
    
    public SelectElement getCatastrophe_CatastropheNumber() {
      return getOrCreateProperty("Catastrophe_CatastropheNumber", "Catastrophe_CatastropheNumber", null, gw.smoketest.platform.web.SelectElement.class);
    }
    
    public Claim_LossCause getClaim_LossCause() {
      return getOrCreateProperty("Claim_LossCause", "Claim_LossCause", null, pcftest.LossDetailsPanelSet_Homeowners.LossDetailsDV.Claim_LossCause.class);
    }
    
    public DateElement getClaim_LossDate() {
      return getOrCreateProperty("Claim_LossDate", "Claim_LossDate", null, gw.smoketest.platform.web.DateElement.class);
    }
    
    public CheckboxGroupElement getDamageTypeChooser() {
      return getOrCreateProperty("DamageTypeChooser", "DamageTypeChooser", null, gw.smoketest.platform.web.CheckboxGroupElement.class);
    }
    
    public ValueElement getDescription() {
      return getOrCreateProperty("Description", "Description", null, gw.smoketest.platform.web.ValueElement.class);
    }
    
    public pcftest.LossDetailsPanelSet_Homeowners.LossDetailsDV.LocationOfTheft getLocationOfTheft() {
      return getOrCreateProperty("LocationOfTheft", "LocationOfTheft", null, pcftest.LossDetailsPanelSet_Homeowners.LossDetailsDV.LocationOfTheft.class);
    }
    
    public ValueElement getLossLocation() {
      return getOrCreateProperty("LossLocation", "LossLocation", null, gw.smoketest.platform.web.ValueElement.class);
    }
    
    public Notification_Fault getNotification_Fault() {
      return getOrCreateProperty("Notification_Fault", "Notification_Fault", null, pcftest.LossDetailsPanelSet_Homeowners.LossDetailsDV.Notification_Fault.class);
    }
    
    public OtherLocationChoice_Choice getOtherLocationChoice_Choice() {
      return getOrCreateProperty("OtherLocationChoice_Choice", "OtherLocationChoice_Choice", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListViewRadioButton, pcftest.LossDetailsPanelSet_Homeowners.LossDetailsDV.OtherLocationChoice_Choice.class);
    }
    
    public ValueElement getOtherLocationLabel() {
      return getOrCreateProperty("OtherLocationLabel", "OtherLocationLabel", null, gw.smoketest.platform.web.ValueElement.class);
    }
    
    public ValueElement getPrimaryLocationChoiceLabel() {
      return getOrCreateProperty("PrimaryLocationChoiceLabel", "PrimaryLocationChoiceLabel", null, gw.smoketest.platform.web.ValueElement.class);
    }
    
    public PrimaryLocationChoice_Choice getPrimaryLocationChoice_Choice() {
      return getOrCreateProperty("PrimaryLocationChoice_Choice", "PrimaryLocationChoice_Choice", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListViewRadioButton, pcftest.LossDetailsPanelSet_Homeowners.LossDetailsDV.PrimaryLocationChoice_Choice.class);
    }
    
    public ValueElement getPropertyAddress() {
      return getOrCreateProperty("PropertyAddress", "PropertyAddress", null, gw.smoketest.platform.web.ValueElement.class);
    }
    
    public BooleanValueElement getWeatherRelated() {
      return getOrCreateProperty("WeatherRelated", "WeatherRelated", null, gw.smoketest.platform.web.BooleanValueElement.class);
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/claim/lossdetails/LossDetailsPanelSet.Homeowners.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class AddressDetailInputSetRef extends PCFElement {
      public AddressDetailInputSetRef(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public CCAddressInputSet getCCAddressInputSet() {
        return getOrCreateProperty("CCAddressInputSet", "CCAddressInputSet", null, pcftest.CCAddressInputSet.class);
      }
      
      
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/claim/lossdetails/LossDetailsPanelSet.Homeowners.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class Claim_LossCause extends SelectElement {
      public Claim_LossCause(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public OptionElement getOptionByTypeKey(LossCause arg) {
        return getOptionByValue(arg == null ? null : arg.getCode());
      }
      
      public LossCause getTypeKeyValue() {
        String myValue = getValue();return myValue == null || myValue.isEmpty() ? null : typekey.LossCause.getTypeKey(myValue);
      }
      
      public void setTypeKeyValue(LossCause arg) {
        setValue(arg == null ? null : arg.getCode());
      }
      
      
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/claim/lossdetails/LossDetailsPanelSet.Homeowners.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class LocationOfTheft extends SelectElement {
      public LocationOfTheft(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public OptionElement getOptionByTypeKey(typekey.LocationOfTheft arg) {
        return getOptionByValue(arg == null ? null : arg.getCode());
      }
      
      public typekey.LocationOfTheft getTypeKeyValue() {
        String myValue = getValue();return myValue == null || myValue.isEmpty() ? null : typekey.LocationOfTheft.getTypeKey(myValue);
      }
      
      public void setTypeKeyValue(typekey.LocationOfTheft arg) {
        setValue(arg == null ? null : arg.getCode());
      }
      
      
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/claim/lossdetails/LossDetailsPanelSet.Homeowners.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class Notification_Fault extends SelectElement {
      public Notification_Fault(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public OptionElement getOptionByTypeKey(FaultRating arg) {
        return getOptionByValue(arg == null ? null : arg.getCode());
      }
      
      public FaultRating getTypeKeyValue() {
        String myValue = getValue();return myValue == null || myValue.isEmpty() ? null : typekey.FaultRating.getTypeKey(myValue);
      }
      
      public void setTypeKeyValue(FaultRating arg) {
        setValue(arg == null ? null : arg.getCode());
      }
      
      
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/claim/lossdetails/LossDetailsPanelSet.Homeowners.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class OtherLocationChoice_Choice extends RadioButtonValueElement {
      public OtherLocationChoice_Choice(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public PCFLocation click() {
        return clickThis(gw.smoketest.platform.web.PCFLocation.class);
      }
      
      
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/claim/lossdetails/LossDetailsPanelSet.Homeowners.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class PrimaryLocationChoice_Choice extends RadioButtonValueElement {
      public PrimaryLocationChoice_Choice(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public PCFLocation click() {
        return clickThis(gw.smoketest.platform.web.PCFLocation.class);
      }
      
      
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/widgets/ClaimContactWidget.xml", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class MainContact_Picker extends SelectElement {
    public MainContact_Picker(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public ClaimContactDetailPopup click() {
      return clickThis(pcftest.ClaimContactDetailPopup.class);
    }
    
    public ClaimNewPersonOnlyPickerMenuItemSet getClaimNewPersonOnlyPickerMenuItemSet() {
      return getOrCreateProperty("ClaimNewPersonOnlyPickerMenuItemSet", "ClaimNewPersonOnlyPickerMenuItemSet", null, pcftest.ClaimNewPersonOnlyPickerMenuItemSet.class);
    }
    
    public pcftest.LossDetailsPanelSet_Homeowners.MainContact_Picker.MenuItem_Search getMenuItem_Search() {
      return getOrCreateProperty("MenuItem_Search", "MenuItem_Search", null, pcftest.LossDetailsPanelSet_Homeowners.MainContact_Picker.MenuItem_Search.class);
    }
    
    public pcftest.LossDetailsPanelSet_Homeowners.MainContact_Picker.MenuItem_ViewDetails getMenuItem_ViewDetails() {
      return getOrCreateProperty("MenuItem_ViewDetails", "MenuItem_ViewDetails", null, pcftest.LossDetailsPanelSet_Homeowners.MainContact_Picker.MenuItem_ViewDetails.class);
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/widgets/ClaimContactWidget.xml", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class MenuItem_Search extends ClickableActionElement {
      public MenuItem_Search(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public AddressBookPickerPopup click() {
        return clickThis(pcftest.AddressBookPickerPopup.class);
      }
      
      
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/widgets/ClaimContactWidget.xml", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class MenuItem_ViewDetails extends ClickableActionElement {
      public MenuItem_ViewDetails(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public PCFLocation click() {
        return clickThis(gw.smoketest.platform.web.PCFLocation.class);
      }
      
      
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/claim/lossdetails/LossDetailsPanelSet.Homeowners.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class Notification_HowReported extends SelectElement {
    public Notification_HowReported(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public OptionElement getOptionByTypeKey(HowReportedType arg) {
      return getOptionByValue(arg == null ? null : arg.getCode());
    }
    
    public HowReportedType getTypeKeyValue() {
      String myValue = getValue();return myValue == null || myValue.isEmpty() ? null : typekey.HowReportedType.getTypeKey(myValue);
    }
    
    public void setTypeKeyValue(HowReportedType arg) {
      setValue(arg == null ? null : arg.getCode());
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/claim/lossdetails/LossDetailsPanelSet.Homeowners.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class Notification_MainContactType extends SelectElement {
    public Notification_MainContactType(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public OptionElement getOptionByTypeKey(PersonRelationType arg) {
      return getOptionByValue(arg == null ? null : arg.getCode());
    }
    
    public PersonRelationType getTypeKeyValue() {
      String myValue = getValue();return myValue == null || myValue.isEmpty() ? null : typekey.PersonRelationType.getTypeKey(myValue);
    }
    
    public void setTypeKeyValue(PersonRelationType arg) {
      setValue(arg == null ? null : arg.getCode());
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/claim/lossdetails/LossDetailsPanelSet.Homeowners.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class Notification_ReportedByType extends SelectElement {
    public Notification_ReportedByType(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public OptionElement getOptionByTypeKey(PersonRelationType arg) {
      return getOptionByValue(arg == null ? null : arg.getCode());
    }
    
    public PersonRelationType getTypeKeyValue() {
      String myValue = getValue();return myValue == null || myValue.isEmpty() ? null : typekey.PersonRelationType.getTypeKey(myValue);
    }
    
    public void setTypeKeyValue(PersonRelationType arg) {
      setValue(arg == null ? null : arg.getCode());
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/claim/lossdetails/LossDetailsPanelSet.Homeowners.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class PoliceReportLV extends PCFElement {
    public PoliceReportLV(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public MetroReportsLV getMetroReportsLV() {
      return getOrCreateProperty("MetroReportsLV", "MetroReportsLV", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListView, pcftest.MetroReportsLV.class);
    }
    
    public MetroReportsLV_tb getMetroReportsLV_tb() {
      return getOrCreateProperty("MetroReportsLV_tb", "MetroReportsLV_tb", null, pcftest.LossDetailsPanelSet_Homeowners.PoliceReportLV.MetroReportsLV_tb.class);
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/claim/lossdetails/LossDetailsPanelSet.Homeowners.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class MetroReportsLV_tb extends PCFElement {
      public MetroReportsLV_tb(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public pcftest.LossDetailsPanelSet_Homeowners.PoliceReportLV.MetroReportsLV_tb.Add getAdd() {
        return getOrCreateProperty("Add", "Add", null, pcftest.LossDetailsPanelSet_Homeowners.PoliceReportLV.MetroReportsLV_tb.Add.class);
      }
      
      public pcftest.LossDetailsPanelSet_Homeowners.PoliceReportLV.MetroReportsLV_tb.Remove getRemove() {
        return getOrCreateProperty("Remove", "Remove", null, pcftest.LossDetailsPanelSet_Homeowners.PoliceReportLV.MetroReportsLV_tb.Remove.class);
      }
      
      @SimplePropertyProcessing
      @Generated(comments = "config/web/pcf/claim/lossdetails/LossDetailsPanelSet.Homeowners.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
      public static class Add extends ClickableActionElement {
        public Add(ISmokeTest helper, PCFElementId componentId)  {
          super(helper, componentId);
        }
        
        public PCFLocation click() {
          return clickThis(gw.smoketest.platform.web.PCFLocation.class);
        }
        
        
      }
      
      @SimplePropertyProcessing
      @Generated(comments = "config/web/pcf/claim/lossdetails/LossDetailsPanelSet.Homeowners.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
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
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/claim/lossdetails/LossDetailsPanelSet.Homeowners.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class PriorClaimsLV_tb extends PCFElement {
    public PriorClaimsLV_tb(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/widgets/ClaimContactWidget.xml", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class ReportedBy_Picker extends SelectElement {
    public ReportedBy_Picker(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public ClaimContactDetailPopup click() {
      return clickThis(pcftest.ClaimContactDetailPopup.class);
    }
    
    public ClaimNewPersonOnlyPickerMenuItemSet getClaimNewPersonOnlyPickerMenuItemSet() {
      return getOrCreateProperty("ClaimNewPersonOnlyPickerMenuItemSet", "ClaimNewPersonOnlyPickerMenuItemSet", null, pcftest.ClaimNewPersonOnlyPickerMenuItemSet.class);
    }
    
    public pcftest.LossDetailsPanelSet_Homeowners.ReportedBy_Picker.MenuItem_Search getMenuItem_Search() {
      return getOrCreateProperty("MenuItem_Search", "MenuItem_Search", null, pcftest.LossDetailsPanelSet_Homeowners.ReportedBy_Picker.MenuItem_Search.class);
    }
    
    public pcftest.LossDetailsPanelSet_Homeowners.ReportedBy_Picker.MenuItem_ViewDetails getMenuItem_ViewDetails() {
      return getOrCreateProperty("MenuItem_ViewDetails", "MenuItem_ViewDetails", null, pcftest.LossDetailsPanelSet_Homeowners.ReportedBy_Picker.MenuItem_ViewDetails.class);
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/widgets/ClaimContactWidget.xml", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class MenuItem_Search extends ClickableActionElement {
      public MenuItem_Search(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public AddressBookPickerPopup click() {
        return clickThis(pcftest.AddressBookPickerPopup.class);
      }
      
      
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/widgets/ClaimContactWidget.xml", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class MenuItem_ViewDetails extends ClickableActionElement {
      public MenuItem_ViewDetails(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public PCFLocation click() {
        return clickThis(gw.smoketest.platform.web.PCFLocation.class);
      }
      
      
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/claim/lossdetails/LossDetailsPanelSet.Homeowners.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class WaterDamageQuestionsPanelSet extends PCFElement {
    public WaterDamageQuestionsPanelSet(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public pcftest.WaterDamageQuestionsPanelSet getWaterDamageQuestionsPanelSet() {
      return getOrCreateProperty("WaterDamageQuestionsPanelSet", "WaterDamageQuestionsPanelSet", gw.smoketest.platform.web.PCFElementId.PCFElementScope.PanelSet, pcftest.WaterDamageQuestionsPanelSet.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/claim/lossdetails/LossDetailsPanelSet.Homeowners.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class WitnessLV extends PCFElement {
    public WitnessLV(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public EditableWitnessesLV getEditableWitnessesLV() {
      return getOrCreateProperty("EditableWitnessesLV", "EditableWitnessesLV", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListView, pcftest.EditableWitnessesLV.class);
    }
    
    public EditableWitnessesLV_tb getEditableWitnessesLV_tb() {
      return getOrCreateProperty("EditableWitnessesLV_tb", "EditableWitnessesLV_tb", null, pcftest.LossDetailsPanelSet_Homeowners.WitnessLV.EditableWitnessesLV_tb.class);
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/claim/lossdetails/LossDetailsPanelSet.Homeowners.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class EditableWitnessesLV_tb extends PCFElement {
      public EditableWitnessesLV_tb(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public pcftest.LossDetailsPanelSet_Homeowners.WitnessLV.EditableWitnessesLV_tb.Add getAdd() {
        return getOrCreateProperty("Add", "Add", null, pcftest.LossDetailsPanelSet_Homeowners.WitnessLV.EditableWitnessesLV_tb.Add.class);
      }
      
      public pcftest.LossDetailsPanelSet_Homeowners.WitnessLV.EditableWitnessesLV_tb.Remove getRemove() {
        return getOrCreateProperty("Remove", "Remove", null, pcftest.LossDetailsPanelSet_Homeowners.WitnessLV.EditableWitnessesLV_tb.Remove.class);
      }
      
      @SimplePropertyProcessing
      @Generated(comments = "config/web/pcf/claim/lossdetails/LossDetailsPanelSet.Homeowners.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
      public static class Add extends ClickableActionElement {
        public Add(ISmokeTest helper, PCFElementId componentId)  {
          super(helper, componentId);
        }
        
        public PCFLocation click() {
          return clickThis(gw.smoketest.platform.web.PCFLocation.class);
        }
        
        
      }
      
      @SimplePropertyProcessing
      @Generated(comments = "config/web/pcf/claim/lossdetails/LossDetailsPanelSet.Homeowners.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
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
  
  
}