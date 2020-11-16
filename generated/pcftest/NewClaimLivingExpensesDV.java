package pcftest;

import gw.lang.SimplePropertyProcessing;
import gw.smoketest.platform.web.ClickableActionElement;
import gw.smoketest.platform.web.DetailViewElement;
import gw.smoketest.platform.web.PCFElementId;
import gw.smoketest.platform.web.SelectElement;
import gw.testharness.ISmokeTest;
import javax.annotation.processing.Generated;
import pcftest.NewClaimLivingExpensesDV.Living_Expenses_Incident;
import pcftest.NewClaimLivingExpensesDV.Living_Expenses_Incident.LivingExpensesDV_EditIncidentMenuItem;
import pcftest.NewClaimLivingExpensesDV.Living_Expenses_Incident.LivingExpensesDV_NewIncidentMenuItem;
import pcftest.NewClaimLivingExpensesDV.Living_Expenses_Incident.LivingExpensesDV_ViewIncidentMenuItem;

@SimplePropertyProcessing
@Generated(comments = "config/web/pcf/claim/FNOL/NewClaimLivingExpensesDV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
public class NewClaimLivingExpensesDV extends DetailViewElement {
  public final static String CHECKSUM = "ebddc961b3190b60d68f4900b2c7df5e";
  
  public NewClaimLivingExpensesDV(ISmokeTest helper, PCFElementId componentId)  {
    super(helper, componentId);
  }
  
  public ExposureDetailInputSet getExposureDetailInputSet() {
    return getOrCreateProperty("ExposureDetailInputSet", "ExposureDetailInputSet", null, pcftest.ExposureDetailInputSet.class);
  }
  
  public Living_Expenses_Incident getLiving_Expenses_Incident() {
    return getOrCreateProperty("Living_Expenses_Incident", "Living_Expenses_Incident", null, pcftest.NewClaimLivingExpensesDV.Living_Expenses_Incident.class);
  }
  
  public OtherCarrierInvolvementInputSet getOtherCarrierInvolvementInputSet() {
    return getOrCreateProperty("OtherCarrierInvolvementInputSet", "OtherCarrierInvolvementInputSet", null, pcftest.OtherCarrierInvolvementInputSet.class);
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/claim/FNOL/NewClaimLivingExpensesDV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class Living_Expenses_Incident extends SelectElement {
    public Living_Expenses_Incident(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public LivingExpensesDV_EditIncidentMenuItem getLivingExpensesDV_EditIncidentMenuItem() {
      return getOrCreateProperty("LivingExpensesDV_EditIncidentMenuItem", "LivingExpensesDV_EditIncidentMenuItem", null, pcftest.NewClaimLivingExpensesDV.Living_Expenses_Incident.LivingExpensesDV_EditIncidentMenuItem.class);
    }
    
    public LivingExpensesDV_NewIncidentMenuItem getLivingExpensesDV_NewIncidentMenuItem() {
      return getOrCreateProperty("LivingExpensesDV_NewIncidentMenuItem", "LivingExpensesDV_NewIncidentMenuItem", null, pcftest.NewClaimLivingExpensesDV.Living_Expenses_Incident.LivingExpensesDV_NewIncidentMenuItem.class);
    }
    
    public LivingExpensesDV_ViewIncidentMenuItem getLivingExpensesDV_ViewIncidentMenuItem() {
      return getOrCreateProperty("LivingExpensesDV_ViewIncidentMenuItem", "LivingExpensesDV_ViewIncidentMenuItem", null, pcftest.NewClaimLivingExpensesDV.Living_Expenses_Incident.LivingExpensesDV_ViewIncidentMenuItem.class);
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/claim/FNOL/NewClaimLivingExpensesDV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class LivingExpensesDV_EditIncidentMenuItem extends ClickableActionElement {
      public LivingExpensesDV_EditIncidentMenuItem(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public EditLivingExpensesIncidentPopup click() {
        return clickThis(pcftest.EditLivingExpensesIncidentPopup.class);
      }
      
      
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/claim/FNOL/NewClaimLivingExpensesDV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class LivingExpensesDV_NewIncidentMenuItem extends ClickableActionElement {
      public LivingExpensesDV_NewIncidentMenuItem(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public NewLivingExpensesIncidentPopup click() {
        return clickThis(pcftest.NewLivingExpensesIncidentPopup.class);
      }
      
      
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/claim/FNOL/NewClaimLivingExpensesDV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class LivingExpensesDV_ViewIncidentMenuItem extends ClickableActionElement {
      public LivingExpensesDV_ViewIncidentMenuItem(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public EditLivingExpensesIncidentPopup click() {
        return clickThis(pcftest.EditLivingExpensesIncidentPopup.class);
      }
      
      
    }
    
    
  }
  
  
}