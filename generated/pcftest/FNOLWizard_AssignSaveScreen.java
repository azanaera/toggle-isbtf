package pcftest;

import gw.lang.SimplePropertyProcessing;
import gw.smoketest.platform.web.BooleanValueElement;
import gw.smoketest.platform.web.ClickableActionElement;
import gw.smoketest.platform.web.IteratorEntries;
import gw.smoketest.platform.web.IteratorEntriesWithPaging;
import gw.smoketest.platform.web.IteratorEntryCheckboxElement;
import gw.smoketest.platform.web.MessagesElement;
import gw.smoketest.platform.web.OptionElement;
import gw.smoketest.platform.web.PCFElement;
import gw.smoketest.platform.web.PCFElementId;
import gw.smoketest.platform.web.PCFLocation;
import gw.smoketest.platform.web.PagingElement;
import gw.smoketest.platform.web.RadioButtonValueElement;
import gw.smoketest.platform.web.RowElement;
import gw.smoketest.platform.web.SelectElement;
import gw.smoketest.platform.web.SelectorCellElement;
import gw.smoketest.platform.web.ValueElement;
import gw.testharness.ISmokeTest;
import javax.annotation.processing.Generated;
import pcftest.FNOLWizard_AssignSaveScreen.ClaimAssign;
import pcftest.FNOLWizard_AssignSaveScreen.ClaimAssign.ClaimAssign_PickerButton;
import pcftest.FNOLWizard_AssignSaveScreen.CommonAssign;
import pcftest.FNOLWizard_AssignSaveScreen.CommonAssign.CommonAssign_PickerButton;
import pcftest.FNOLWizard_AssignSaveScreen.CommonAssignChoice_Choice;
import pcftest.FNOLWizard_AssignSaveScreen.IndividualAssignChoice_Choice;
import pcftest.FNOLWizard_AssignSaveScreen.NewExposureLV;
import pcftest.FNOLWizard_AssignSaveScreen.NewExposureLV.CreatedViaHeader;
import pcftest.FNOLWizard_AssignSaveScreen.NewExposureLV.Exposures_AssigneeHeader;
import pcftest.FNOLWizard_AssignSaveScreen.NewExposureLV.Exposures_ClaimantHeader;
import pcftest.FNOLWizard_AssignSaveScreen.NewExposureLV.Exposures_CoverageHeader;
import pcftest.FNOLWizard_AssignSaveScreen.NewExposureLV.Exposures_OrderHeader;
import pcftest.FNOLWizard_AssignSaveScreen.NewExposureLV.Exposures_StatusHeader;
import pcftest.FNOLWizard_AssignSaveScreen.NewExposureLV.Exposures_TypeHeader;
import pcftest.FNOLWizard_AssignSaveScreen.NewExposureLV.IncidentHeader;
import pcftest.FNOLWizard_AssignSaveScreen.NewExposureLV._ListPaging;
import pcftest.FNOLWizard_AssignSaveScreen.NewExposureLV.entry.Exposures_Assignee;
import pcftest.FNOLWizard_AssignSaveScreen.NewExposureLV.entry.Exposures_Assignee.Exposures_Assignee_PickerButton;
import pcftest.FNOLWizard_AssignSaveScreen.NewExposureLV.entry.Exposures_Coverage;
import pcftest.FNOLWizard_AssignSaveScreen.NewExposureLV.entry.Exposures_Order;
import pcftest.FNOLWizard_AssignSaveScreen.NewExposureLV.entry.Exposures_Status;
import pcftest.FNOLWizard_AssignSaveScreen.NewExposureLV.entry.Exposures_Type;
import pcftest.FNOLWizard_AssignSaveScreen.NewExposureLV.entry._Select;
import pcftest.FNOLWizard_AssignSaveScreen.NewExposureLV.entry._ViewDetail;
import pcftest.FNOLWizard_AssignSaveScreen.NewExposureLV_tb;
import pcftest.FNOLWizard_AssignSaveScreen.NewExposureLV_tb.Add;
import pcftest.FNOLWizard_AssignSaveScreen.NewExposureLV_tb.AddExposure;
import pcftest.FNOLWizard_AssignSaveScreen.NewExposureLV_tb.AddExposure.NewExposureMenuItemSet_ByCoverageType;
import pcftest.FNOLWizard_AssignSaveScreen.NewExposureLV_tb.Remove;
import pcftest.FNOLWizard_AssignSaveScreen._msgs;
import typekey.CoverageType;
import typekey.ExposureState;
import typekey.ExposureType;

@SimplePropertyProcessing
@Generated(comments = "config/web/pcf/claim/FNOL/FNOLWizard_AssignSaveScreen.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
public class FNOLWizard_AssignSaveScreen extends PCFElement {
  public final static String CHECKSUM = "f8a4d8d077ea9586c74ecd728b0af842";
  
  public FNOLWizard_AssignSaveScreen(ISmokeTest helper, PCFElementId componentId)  {
    super(helper, componentId);
  }
  
  public ClaimAssign getClaimAssign() {
    return getOrCreateProperty("ClaimAssign", "ClaimAssign", null, pcftest.FNOLWizard_AssignSaveScreen.ClaimAssign.class);
  }
  
  public CommonAssign getCommonAssign() {
    return getOrCreateProperty("CommonAssign", "CommonAssign", null, pcftest.FNOLWizard_AssignSaveScreen.CommonAssign.class);
  }
  
  public CommonAssignChoice_Choice getCommonAssignChoice_Choice() {
    return getOrCreateProperty("CommonAssignChoice_Choice", "CommonAssignChoice_Choice", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListViewRadioButton, pcftest.FNOLWizard_AssignSaveScreen.CommonAssignChoice_Choice.class);
  }
  
  public IndividualAssignChoice_Choice getIndividualAssignChoice_Choice() {
    return getOrCreateProperty("IndividualAssignChoice_Choice", "IndividualAssignChoice_Choice", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListViewRadioButton, pcftest.FNOLWizard_AssignSaveScreen.IndividualAssignChoice_Choice.class);
  }
  
  public NewExposureLV getNewExposureLV() {
    return getOrCreateProperty("NewExposureLV", "NewExposureLV", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListView, pcftest.FNOLWizard_AssignSaveScreen.NewExposureLV.class);
  }
  
  public NewExposureLV_tb getNewExposureLV_tb() {
    return getOrCreateProperty("NewExposureLV_tb", "NewExposureLV_tb", null, pcftest.FNOLWizard_AssignSaveScreen.NewExposureLV_tb.class);
  }
  
  public ValueElement getNote() {
    return getOrCreateProperty("Note", "Note", null, gw.smoketest.platform.web.ValueElement.class);
  }
  
  public _msgs get_msgs() {
    return getOrCreateProperty("_msgs", "_msgs", null, pcftest.FNOLWizard_AssignSaveScreen._msgs.class);
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/widgets/CCAssigneeWidget.xml", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class ClaimAssign extends SelectElement {
    public ClaimAssign(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public ClaimAssign_PickerButton getClaimAssign_PickerButton() {
      return getOrCreateProperty("ClaimAssign_PickerButton", "ClaimAssign_PickerButton", null, pcftest.FNOLWizard_AssignSaveScreen.ClaimAssign.ClaimAssign_PickerButton.class);
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/widgets/CCAssigneeWidget.xml", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class ClaimAssign_PickerButton extends ClickableActionElement {
      public ClaimAssign_PickerButton(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public AssigneePickerPopup click() {
        return clickThis(pcftest.AssigneePickerPopup.class);
      }
      
      
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/widgets/CCAssigneeWidget.xml", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class CommonAssign extends SelectElement {
    public CommonAssign(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public CommonAssign_PickerButton getCommonAssign_PickerButton() {
      return getOrCreateProperty("CommonAssign_PickerButton", "CommonAssign_PickerButton", null, pcftest.FNOLWizard_AssignSaveScreen.CommonAssign.CommonAssign_PickerButton.class);
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/widgets/CCAssigneeWidget.xml", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class CommonAssign_PickerButton extends ClickableActionElement {
      public CommonAssign_PickerButton(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public AssigneePickerPopup click() {
        return clickThis(pcftest.AssigneePickerPopup.class);
      }
      
      
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/claim/FNOL/FNOLWizard_AssignSaveScreen.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class CommonAssignChoice_Choice extends RadioButtonValueElement {
    public CommonAssignChoice_Choice(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/claim/FNOL/FNOLWizard_AssignSaveScreen.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class IndividualAssignChoice_Choice extends RadioButtonValueElement {
    public IndividualAssignChoice_Choice(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/claim/FNOL/FNOLWizard_AssignSaveScreen.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class NewExposureLV extends PCFElement {
    public NewExposureLV(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public CreatedViaHeader getCreatedViaHeader() {
      return getOrCreateProperty("CreatedViaHeader", "CreatedViaHeader", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListViewHeader, pcftest.FNOLWizard_AssignSaveScreen.NewExposureLV.CreatedViaHeader.class);
    }
    
    public Exposures_AssigneeHeader getExposures_AssigneeHeader() {
      return getOrCreateProperty("Exposures_AssigneeHeader", "Exposures_AssigneeHeader", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListViewHeader, pcftest.FNOLWizard_AssignSaveScreen.NewExposureLV.Exposures_AssigneeHeader.class);
    }
    
    public Exposures_ClaimantHeader getExposures_ClaimantHeader() {
      return getOrCreateProperty("Exposures_ClaimantHeader", "Exposures_ClaimantHeader", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListViewHeader, pcftest.FNOLWizard_AssignSaveScreen.NewExposureLV.Exposures_ClaimantHeader.class);
    }
    
    public Exposures_CoverageHeader getExposures_CoverageHeader() {
      return getOrCreateProperty("Exposures_CoverageHeader", "Exposures_CoverageHeader", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListViewHeader, pcftest.FNOLWizard_AssignSaveScreen.NewExposureLV.Exposures_CoverageHeader.class);
    }
    
    public Exposures_OrderHeader getExposures_OrderHeader() {
      return getOrCreateProperty("Exposures_OrderHeader", "Exposures_OrderHeader", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListViewHeader, pcftest.FNOLWizard_AssignSaveScreen.NewExposureLV.Exposures_OrderHeader.class);
    }
    
    public Exposures_StatusHeader getExposures_StatusHeader() {
      return getOrCreateProperty("Exposures_StatusHeader", "Exposures_StatusHeader", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListViewHeader, pcftest.FNOLWizard_AssignSaveScreen.NewExposureLV.Exposures_StatusHeader.class);
    }
    
    public Exposures_TypeHeader getExposures_TypeHeader() {
      return getOrCreateProperty("Exposures_TypeHeader", "Exposures_TypeHeader", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListViewHeader, pcftest.FNOLWizard_AssignSaveScreen.NewExposureLV.Exposures_TypeHeader.class);
    }
    
    public IncidentHeader getIncidentHeader() {
      return getOrCreateProperty("IncidentHeader", "IncidentHeader", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListViewHeader, pcftest.FNOLWizard_AssignSaveScreen.NewExposureLV.IncidentHeader.class);
    }
    
    public IteratorEntryCheckboxElement get_Checkbox() {
      return getOrCreateProperty("_Checkbox", "_Checkbox", null, gw.smoketest.platform.web.IteratorEntryCheckboxElement.class);
    }
    
    @SuppressWarnings(value = "unchecked")
    public IteratorEntriesWithPaging<pcftest.FNOLWizard_AssignSaveScreen.NewExposureLV.entry> get_Entries() {
      return getOrCreateEntries(gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListViewRowIteratorEntry, pcftest.FNOLWizard_AssignSaveScreen.NewExposureLV.entry.class, gw.smoketest.platform.web.IteratorEntriesWithPaging.class);
    }
    
    public _ListPaging get_ListPaging() {
      return getOrCreateProperty("_ListPaging", "_ListPaging", null, pcftest.FNOLWizard_AssignSaveScreen.NewExposureLV._ListPaging.class);
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/claim/FNOL/FNOLWizard_AssignSaveScreen.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class CreatedViaHeader extends ValueElement {
      public CreatedViaHeader(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public PCFLocation click() {
        return clickThis(gw.smoketest.platform.web.PCFLocation.class);
      }
      
      
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/claim/FNOL/FNOLWizard_AssignSaveScreen.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class Exposures_AssigneeHeader extends ValueElement {
      public Exposures_AssigneeHeader(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public PCFLocation click() {
        return clickThis(gw.smoketest.platform.web.PCFLocation.class);
      }
      
      
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/claim/FNOL/FNOLWizard_AssignSaveScreen.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class Exposures_ClaimantHeader extends ValueElement {
      public Exposures_ClaimantHeader(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public PCFLocation click() {
        return clickThis(gw.smoketest.platform.web.PCFLocation.class);
      }
      
      
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/claim/FNOL/FNOLWizard_AssignSaveScreen.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class Exposures_CoverageHeader extends ValueElement {
      public Exposures_CoverageHeader(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public PCFLocation click() {
        return clickThis(gw.smoketest.platform.web.PCFLocation.class);
      }
      
      
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/claim/FNOL/FNOLWizard_AssignSaveScreen.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class Exposures_OrderHeader extends ValueElement {
      public Exposures_OrderHeader(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public PCFLocation click() {
        return clickThis(gw.smoketest.platform.web.PCFLocation.class);
      }
      
      
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/claim/FNOL/FNOLWizard_AssignSaveScreen.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class Exposures_StatusHeader extends ValueElement {
      public Exposures_StatusHeader(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public PCFLocation click() {
        return clickThis(gw.smoketest.platform.web.PCFLocation.class);
      }
      
      
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/claim/FNOL/FNOLWizard_AssignSaveScreen.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class Exposures_TypeHeader extends ValueElement {
      public Exposures_TypeHeader(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public PCFLocation click() {
        return clickThis(gw.smoketest.platform.web.PCFLocation.class);
      }
      
      
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/claim/FNOL/FNOLWizard_AssignSaveScreen.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class IncidentHeader extends ValueElement {
      public IncidentHeader(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public PCFLocation click() {
        return clickThis(gw.smoketest.platform.web.PCFLocation.class);
      }
      
      
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/claim/FNOL/FNOLWizard_AssignSaveScreen.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class _ListPaging extends PagingElement {
      public _ListPaging(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public PCFLocation click() {
        return clickThis(gw.smoketest.platform.web.PCFLocation.class);
      }
      
      
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/claim/FNOL/FNOLWizard_AssignSaveScreen.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class entry extends RowElement {
      public entry(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public pcftest.FNOLWizard_AssignSaveScreen.NewExposureLV.entry.CreatedVia getCreatedVia() {
        return getOrCreateProperty("CreatedVia", "CreatedVia", null, pcftest.FNOLWizard_AssignSaveScreen.NewExposureLV.entry.CreatedVia.class);
      }
      
      public Exposures_Assignee getExposures_Assignee() {
        return getOrCreateProperty("Exposures_Assignee", "Exposures_Assignee", null, pcftest.FNOLWizard_AssignSaveScreen.NewExposureLV.entry.Exposures_Assignee.class);
      }
      
      public ValueElement getExposures_Claimant() {
        return getOrCreateProperty("Exposures_Claimant", "Exposures_Claimant", null, gw.smoketest.platform.web.ValueElement.class);
      }
      
      public Exposures_Coverage getExposures_Coverage() {
        return getOrCreateProperty("Exposures_Coverage", "Exposures_Coverage", null, pcftest.FNOLWizard_AssignSaveScreen.NewExposureLV.entry.Exposures_Coverage.class);
      }
      
      public Exposures_Order getExposures_Order() {
        return getOrCreateProperty("Exposures_Order", "Exposures_Order", null, pcftest.FNOLWizard_AssignSaveScreen.NewExposureLV.entry.Exposures_Order.class);
      }
      
      public Exposures_Status getExposures_Status() {
        return getOrCreateProperty("Exposures_Status", "Exposures_Status", null, pcftest.FNOLWizard_AssignSaveScreen.NewExposureLV.entry.Exposures_Status.class);
      }
      
      public Exposures_Type getExposures_Type() {
        return getOrCreateProperty("Exposures_Type", "Exposures_Type", null, pcftest.FNOLWizard_AssignSaveScreen.NewExposureLV.entry.Exposures_Type.class);
      }
      
      public ValueElement getIncident() {
        return getOrCreateProperty("Incident", "Incident", null, gw.smoketest.platform.web.ValueElement.class);
      }
      
      public IteratorEntryCheckboxElement get_Checkbox() {
        return getOrCreateProperty("_Checkbox", "_Checkbox", null, gw.smoketest.platform.web.IteratorEntryCheckboxElement.class);
      }
      
      public _Select get_Select() {
        return getOrCreateProperty("_Select", "_Select", null, pcftest.FNOLWizard_AssignSaveScreen.NewExposureLV.entry._Select.class);
      }
      
      public _ViewDetail get_ViewDetail() {
        return getOrCreateProperty("_ViewDetail", "_ViewDetail", null, pcftest.FNOLWizard_AssignSaveScreen.NewExposureLV.entry._ViewDetail.class);
      }
      
      @SimplePropertyProcessing
      @Generated(comments = "config/web/pcf/claim/FNOL/FNOLWizard_AssignSaveScreen.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
      public static class CreatedVia extends SelectElement {
        public CreatedVia(ISmokeTest helper, PCFElementId componentId)  {
          super(helper, componentId);
        }
        
        public OptionElement getOptionByTypeKey(typekey.CreatedVia arg) {
          return getOptionByValue(arg == null ? null : arg.getCode());
        }
        
        public typekey.CreatedVia getTypeKeyValue() {
          String myValue = getValue();return myValue == null || myValue.isEmpty() ? null : typekey.CreatedVia.getTypeKey(myValue);
        }
        
        public void setTypeKeyValue(typekey.CreatedVia arg) {
          setValue(arg == null ? null : arg.getCode());
        }
        
        
      }
      
      @SimplePropertyProcessing
      @Generated(comments = "config/web/widgets/AssigneeCell.xml", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
      public static class Exposures_Assignee extends SelectElement {
        public Exposures_Assignee(ISmokeTest helper, PCFElementId componentId)  {
          super(helper, componentId);
        }
        
        public Exposures_Assignee_PickerButton getExposures_Assignee_PickerButton() {
          return getOrCreateProperty("Exposures_Assignee_PickerButton", "Exposures_Assignee_PickerButton", null, pcftest.FNOLWizard_AssignSaveScreen.NewExposureLV.entry.Exposures_Assignee.Exposures_Assignee_PickerButton.class);
        }
        
        @SimplePropertyProcessing
        @Generated(comments = "config/web/widgets/AssigneeCell.xml", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
        public static class Exposures_Assignee_PickerButton extends ClickableActionElement {
          public Exposures_Assignee_PickerButton(ISmokeTest helper, PCFElementId componentId)  {
            super(helper, componentId);
          }
          
          public AssigneePickerPopup click() {
            return clickThis(pcftest.AssigneePickerPopup.class);
          }
          
          
        }
        
        
      }
      
      @SimplePropertyProcessing
      @Generated(comments = "config/web/pcf/claim/FNOL/FNOLWizard_AssignSaveScreen.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
      public static class Exposures_Coverage extends SelectElement {
        public Exposures_Coverage(ISmokeTest helper, PCFElementId componentId)  {
          super(helper, componentId);
        }
        
        public NewClaimWizard_ExposurePagePopup click() {
          return clickThis(pcftest.NewClaimWizard_ExposurePagePopup.class);
        }
        
        public OptionElement getOptionByTypeKey(CoverageType arg) {
          return getOptionByValue(arg == null ? null : arg.getCode());
        }
        
        public CoverageType getTypeKeyValue() {
          String myValue = getValue();return myValue == null || myValue.isEmpty() ? null : typekey.CoverageType.getTypeKey(myValue);
        }
        
        public void setTypeKeyValue(CoverageType arg) {
          setValue(arg == null ? null : arg.getCode());
        }
        
        
      }
      
      @SimplePropertyProcessing
      @Generated(comments = "config/web/pcf/claim/FNOL/FNOLWizard_AssignSaveScreen.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
      public static class Exposures_Order extends ValueElement {
        public Exposures_Order(ISmokeTest helper, PCFElementId componentId)  {
          super(helper, componentId);
        }
        
        public NewClaimWizard_ExposurePagePopup click() {
          return clickThis(pcftest.NewClaimWizard_ExposurePagePopup.class);
        }
        
        
      }
      
      @SimplePropertyProcessing
      @Generated(comments = "config/web/pcf/claim/FNOL/FNOLWizard_AssignSaveScreen.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
      public static class Exposures_Status extends SelectElement {
        public Exposures_Status(ISmokeTest helper, PCFElementId componentId)  {
          super(helper, componentId);
        }
        
        public OptionElement getOptionByTypeKey(ExposureState arg) {
          return getOptionByValue(arg == null ? null : arg.getCode());
        }
        
        public ExposureState getTypeKeyValue() {
          String myValue = getValue();return myValue == null || myValue.isEmpty() ? null : typekey.ExposureState.getTypeKey(myValue);
        }
        
        public void setTypeKeyValue(ExposureState arg) {
          setValue(arg == null ? null : arg.getCode());
        }
        
        
      }
      
      @SimplePropertyProcessing
      @Generated(comments = "config/web/pcf/claim/FNOL/FNOLWizard_AssignSaveScreen.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
      public static class Exposures_Type extends SelectElement {
        public Exposures_Type(ISmokeTest helper, PCFElementId componentId)  {
          super(helper, componentId);
        }
        
        public NewClaimWizard_ExposurePagePopup click() {
          return clickThis(pcftest.NewClaimWizard_ExposurePagePopup.class);
        }
        
        public OptionElement getOptionByTypeKey(ExposureType arg) {
          return getOptionByValue(arg == null ? null : arg.getCode());
        }
        
        public ExposureType getTypeKeyValue() {
          String myValue = getValue();return myValue == null || myValue.isEmpty() ? null : typekey.ExposureType.getTypeKey(myValue);
        }
        
        public void setTypeKeyValue(ExposureType arg) {
          setValue(arg == null ? null : arg.getCode());
        }
        
        
      }
      
      @SimplePropertyProcessing
      @Generated(comments = "config/web/pcf/claim/FNOL/FNOLWizard_AssignSaveScreen.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
      public static class _Select extends SelectorCellElement {
        public _Select(ISmokeTest helper, PCFElementId componentId)  {
          super(helper, componentId);
        }
        
        public PCFLocation click() {
          return clickThis(gw.smoketest.platform.web.PCFLocation.class);
        }
        
        
      }
      
      @SimplePropertyProcessing
      @Generated(comments = "config/web/pcf/claim/FNOL/FNOLWizard_AssignSaveScreen.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
      public static class _ViewDetail extends BooleanValueElement {
        public _ViewDetail(ISmokeTest helper, PCFElementId componentId)  {
          super(helper, componentId);
        }
        
        public PCFLocation click() {
          return clickThis(gw.smoketest.platform.web.PCFLocation.class);
        }
        
        
      }
      
      
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/claim/FNOL/FNOLWizard_AssignSaveScreen.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class NewExposureLV_tb extends PCFElement {
    public NewExposureLV_tb(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public Add getAdd() {
      return getOrCreateProperty("Add", "Add", null, pcftest.FNOLWizard_AssignSaveScreen.NewExposureLV_tb.Add.class);
    }
    
    public AddExposure getAddExposure() {
      return getOrCreateProperty("AddExposure", "AddExposure", null, pcftest.FNOLWizard_AssignSaveScreen.NewExposureLV_tb.AddExposure.class);
    }
    
    public Remove getRemove() {
      return getOrCreateProperty("Remove", "Remove", null, pcftest.FNOLWizard_AssignSaveScreen.NewExposureLV_tb.Remove.class);
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/claim/FNOL/FNOLWizard_AssignSaveScreen.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class Add extends ClickableActionElement {
      public Add(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public PCFLocation click() {
        return clickThis(gw.smoketest.platform.web.PCFLocation.class);
      }
      
      
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/claim/FNOL/FNOLWizard_AssignSaveScreen.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class AddExposure extends ClickableActionElement {
      public AddExposure(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public NewExposureMenuItemSet_ByCoverageType getNewExposureMenuItemSet_ByCoverageType() {
        return getOrCreateProperty("NewExposureMenuItemSet_ByCoverageType", "NewExposureMenuItemSet_ByCoverageType", null, pcftest.FNOLWizard_AssignSaveScreen.NewExposureLV_tb.AddExposure.NewExposureMenuItemSet_ByCoverageType.class);
      }
      
      @SuppressWarnings(value = "unchecked")
      public IteratorEntries<pcftest.FNOLWizard_AssignSaveScreen.NewExposureLV_tb.AddExposure.entry> get_Entries() {
        return getOrCreateEntries(null, pcftest.FNOLWizard_AssignSaveScreen.NewExposureLV_tb.AddExposure.entry.class, gw.smoketest.platform.web.IteratorEntries.class);
      }
      
      @SimplePropertyProcessing
      @Generated(comments = "config/web/pcf/claim/FNOL/FNOLWizard_AssignSaveScreen.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
      public static class NewExposureMenuItemSet_ByCoverageType extends ClickableActionElement {
        public NewExposureMenuItemSet_ByCoverageType(ISmokeTest helper, PCFElementId componentId)  {
          super(helper, componentId);
        }
        
        @SuppressWarnings(value = "unchecked")
        public IteratorEntries<pcftest.FNOLWizard_AssignSaveScreen.NewExposureLV_tb.AddExposure.NewExposureMenuItemSet_ByCoverageType.entry> get_Entries() {
          return getOrCreateEntries(null, pcftest.FNOLWizard_AssignSaveScreen.NewExposureLV_tb.AddExposure.NewExposureMenuItemSet_ByCoverageType.entry.class, gw.smoketest.platform.web.IteratorEntries.class);
        }
        
        @SimplePropertyProcessing
        @Generated(comments = "config/web/pcf/claim/FNOL/FNOLWizard_AssignSaveScreen.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
        public static class entry extends PCFElement {
          public entry(ISmokeTest helper, PCFElementId componentId)  {
            super(helper, componentId);
          }
          
          public pcftest.FNOLWizard_AssignSaveScreen.NewExposureLV_tb.AddExposure.NewExposureMenuItemSet_ByCoverageType.entry.item getitem() {
            return getOrCreateProperty("item", "item", null, pcftest.FNOLWizard_AssignSaveScreen.NewExposureLV_tb.AddExposure.NewExposureMenuItemSet_ByCoverageType.entry.item.class);
          }
          
          @SimplePropertyProcessing
          @Generated(comments = "config/web/pcf/claim/FNOL/FNOLWizard_AssignSaveScreen.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
          public static class item extends ClickableActionElement {
            public item(ISmokeTest helper, PCFElementId componentId)  {
              super(helper, componentId);
            }
            
            public NewClaimWizard_NewExposurePopup click() {
              return clickThis(pcftest.NewClaimWizard_NewExposurePopup.class);
            }
            
            @SuppressWarnings(value = "unchecked")
            public IteratorEntries<pcftest.FNOLWizard_AssignSaveScreen.NewExposureLV_tb.AddExposure.NewExposureMenuItemSet_ByCoverageType.entry> get_Entries() {
              return getOrCreateEntries(null, pcftest.FNOLWizard_AssignSaveScreen.NewExposureLV_tb.AddExposure.NewExposureMenuItemSet_ByCoverageType.entry.class, gw.smoketest.platform.web.IteratorEntries.class);
            }
            
            
          }
          
          
        }
        
        
      }
      
      @SimplePropertyProcessing
      @Generated(comments = "config/web/pcf/claim/FNOL/FNOLWizard_AssignSaveScreen.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
      public static class entry extends PCFElement {
        public entry(ISmokeTest helper, PCFElementId componentId)  {
          super(helper, componentId);
        }
        
        public pcftest.FNOLWizard_AssignSaveScreen.NewExposureLV_tb.AddExposure.entry.item getitem() {
          return getOrCreateProperty("item", "item", null, pcftest.FNOLWizard_AssignSaveScreen.NewExposureLV_tb.AddExposure.entry.item.class);
        }
        
        @SimplePropertyProcessing
        @Generated(comments = "config/web/pcf/claim/FNOL/FNOLWizard_AssignSaveScreen.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
        public static class item extends ClickableActionElement {
          public item(ISmokeTest helper, PCFElementId componentId)  {
            super(helper, componentId);
          }
          
          public NewClaimWizard_NewExposurePopup click() {
            return clickThis(pcftest.NewClaimWizard_NewExposurePopup.class);
          }
          
          @SuppressWarnings(value = "unchecked")
          public IteratorEntries<pcftest.FNOLWizard_AssignSaveScreen.NewExposureLV_tb.AddExposure.entry> get_Entries() {
            return getOrCreateEntries(null, pcftest.FNOLWizard_AssignSaveScreen.NewExposureLV_tb.AddExposure.entry.class, gw.smoketest.platform.web.IteratorEntries.class);
          }
          
          
        }
        
        
      }
      
      
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/claim/FNOL/FNOLWizard_AssignSaveScreen.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
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
  @Generated(comments = "config/web/pcf/claim/FNOL/FNOLWizard_AssignSaveScreen.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class _msgs extends MessagesElement {
    public _msgs(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  
}