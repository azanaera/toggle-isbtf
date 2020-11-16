package pcftest;

import gw.lang.SimplePropertyProcessing;
import gw.smoketest.platform.web.ClickableActionElement;
import gw.smoketest.platform.web.DateElement;
import gw.smoketest.platform.web.PCFElement;
import gw.smoketest.platform.web.PCFElementId;
import gw.smoketest.platform.web.PCFLocation;
import gw.smoketest.platform.web.SelectElement;
import gw.smoketest.platform.web.ValueElement;
import gw.testharness.ISmokeTest;
import javax.annotation.processing.Generated;
import pcftest.StatementDV_quote.ApprovedBy;
import pcftest.StatementDV_quote.ApprovedBy.ApprovedByUserSearchMenuItem;
import pcftest.StatementDV_quote.ApprovedBy.ApprovedByUserSelectMenuItem;
import pcftest.StatementDV_quote.StatementLineItemLV_tb;
import pcftest.StatementDV_quote.StatementLineItemLV_tb.Add;
import pcftest.StatementDV_quote.StatementLineItemLV_tb.Remove;

@SimplePropertyProcessing
@Generated(comments = "config/web/pcf/claim/servicerequests/StatementDV.quote.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
public class StatementDV_quote extends StatementDV {
  public final static String CHECKSUM = "aee8843e6c96276128c6ef9b515e8170";
  
  public StatementDV_quote(ISmokeTest helper, PCFElementId componentId)  {
    super(helper, componentId);
  }
  
  public DateElement getApprovalDate() {
    return getOrCreateProperty("ApprovalDate", "ApprovalDate", null, gw.smoketest.platform.web.DateElement.class);
  }
  
  public ApprovedBy getApprovedBy() {
    return getOrCreateProperty("ApprovedBy", "ApprovedBy", null, pcftest.StatementDV_quote.ApprovedBy.class);
  }
  
  public DateElement getCreationDate() {
    return getOrCreateProperty("CreationDate", "CreationDate", null, gw.smoketest.platform.web.DateElement.class);
  }
  
  public ValueElement getDaysToPerformService() {
    return getOrCreateProperty("DaysToPerformService", "DaysToPerformService", null, gw.smoketest.platform.web.ValueElement.class);
  }
  
  public ValueElement getDescription() {
    return getOrCreateProperty("Description", "Description", null, gw.smoketest.platform.web.ValueElement.class);
  }
  
  public ValueElement getNoQuotesMessage() {
    return getOrCreateProperty("NoQuotesMessage", "NoQuotesMessage", null, gw.smoketest.platform.web.ValueElement.class);
  }
  
  public ValueElement getReferenceNumber() {
    return getOrCreateProperty("ReferenceNumber", "ReferenceNumber", null, gw.smoketest.platform.web.ValueElement.class);
  }
  
  public StatementLineItemLV getStatementLineItemLV() {
    return getOrCreateProperty("StatementLineItemLV", "StatementLineItemLV", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListView, pcftest.StatementLineItemLV.class);
  }
  
  public StatementLineItemLV_tb getStatementLineItemLV_tb() {
    return getOrCreateProperty("StatementLineItemLV_tb", "StatementLineItemLV_tb", null, pcftest.StatementDV_quote.StatementLineItemLV_tb.class);
  }
  
  public ValueElement getquoteTotal() {
    return getOrCreateProperty("quoteTotal", "quoteTotal", null, gw.smoketest.platform.web.ValueElement.class);
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/widgets/UserWidget.xml", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class ApprovedBy extends SelectElement {
    public ApprovedBy(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public ApprovedByUserSearchMenuItem getApprovedByUserSearchMenuItem() {
      return getOrCreateProperty("ApprovedByUserSearchMenuItem", "ApprovedByUserSearchMenuItem", null, pcftest.StatementDV_quote.ApprovedBy.ApprovedByUserSearchMenuItem.class);
    }
    
    public ApprovedByUserSelectMenuItem getApprovedByUserSelectMenuItem() {
      return getOrCreateProperty("ApprovedByUserSelectMenuItem", "ApprovedByUserSelectMenuItem", null, pcftest.StatementDV_quote.ApprovedBy.ApprovedByUserSelectMenuItem.class);
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/widgets/UserWidget.xml", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class ApprovedByUserSearchMenuItem extends ClickableActionElement {
      public ApprovedByUserSearchMenuItem(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public UserSearchPopup click() {
        return clickThis(pcftest.UserSearchPopup.class);
      }
      
      
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/widgets/UserWidget.xml", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class ApprovedByUserSelectMenuItem extends ClickableActionElement {
      public ApprovedByUserSelectMenuItem(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public UserSelectPopup click() {
        return clickThis(pcftest.UserSelectPopup.class);
      }
      
      
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/claim/servicerequests/StatementDV.quote.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class StatementLineItemLV_tb extends PCFElement {
    public StatementLineItemLV_tb(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public Add getAdd() {
      return getOrCreateProperty("Add", "Add", null, pcftest.StatementDV_quote.StatementLineItemLV_tb.Add.class);
    }
    
    public Remove getRemove() {
      return getOrCreateProperty("Remove", "Remove", null, pcftest.StatementDV_quote.StatementLineItemLV_tb.Remove.class);
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/claim/servicerequests/StatementDV.quote.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class Add extends ClickableActionElement {
      public Add(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public PCFLocation click() {
        return clickThis(gw.smoketest.platform.web.PCFLocation.class);
      }
      
      
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/claim/servicerequests/StatementDV.quote.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
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