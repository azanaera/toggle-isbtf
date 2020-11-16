package pcftest;

import gw.lang.SimplePropertyProcessing;
import gw.smoketest.platform.web.ClickableActionElement;
import gw.smoketest.platform.web.PCFElement;
import gw.smoketest.platform.web.PCFElementId;
import gw.testharness.ISmokeTest;
import javax.annotation.processing.Generated;
import pcftest.RuleManagementAuditLinkInputSet.Link;
import pcftest.RuleManagementAuditLinkInputSet.Summary;

@SimplePropertyProcessing
@Generated(comments = "config/web/pcf/bizrules/RuleManagementAuditLinkInputSet.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
public class RuleManagementAuditLinkInputSet extends PCFElement {
  public final static String CHECKSUM = "1b9973ced3742c227f7ff316ed56ae8b";
  
  public RuleManagementAuditLinkInputSet(ISmokeTest helper, PCFElementId componentId)  {
    super(helper, componentId);
  }
  
  public Link getLink() {
    return getOrCreateProperty("Link", "Link", null, pcftest.RuleManagementAuditLinkInputSet.Link.class);
  }
  
  public Summary getSummary() {
    return getOrCreateProperty("Summary", "Summary", null, pcftest.RuleManagementAuditLinkInputSet.Summary.class);
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/bizrules/RuleManagementAuditLinkInputSet.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class Link extends ClickableActionElement {
    public Link(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public RuleManagementAuditPopup click() {
      return clickThis(pcftest.RuleManagementAuditPopup.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/bizrules/RuleManagementAuditLinkInputSet.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class Summary extends ClickableActionElement {
    public Summary(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    
  }
  
  
}