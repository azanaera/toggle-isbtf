package pcftest;

import gw.lang.SimplePropertyProcessing;
import gw.smoketest.platform.web.ClickableActionElement;
import gw.smoketest.platform.web.MessagesElement;
import gw.smoketest.platform.web.PCFElementId;
import gw.smoketest.platform.web.PCFLocation;
import gw.smoketest.platform.web.ValueElementWithSetAndRefresh;
import gw.testharness.ISmokeTest;
import javax.annotation.processing.Generated;
import pcftest.SubroAdversePartyDetail.Cancel;
import pcftest.SubroAdversePartyDetail.Edit;
import pcftest.SubroAdversePartyDetail.SubroAdversePartyDetail_UpLink;
import pcftest.SubroAdversePartyDetail.Update;
import pcftest.SubroAdversePartyDetail._Paging;
import pcftest.SubroAdversePartyDetail.__crumb__;
import pcftest.SubroAdversePartyDetail._msgs;

@SimplePropertyProcessing
@Generated(comments = "config/web/pcf/claim/subrogation/AdverseParty/SubroAdversePartyDetail.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
public class SubroAdversePartyDetail extends PCFLocation {
  public final static String CHECKSUM = "be4f6e185ff292bdc377fed6aab9d55e";
  
  public SubroAdversePartyDetail(ISmokeTest helper)  {
    super(helper, new gw.smoketest.platform.web.PCFElementId("SubroAdversePartyDetail"));
  }
  
  public Cancel getCancel() {
    return getOrCreateProperty("Cancel", "Cancel", null, pcftest.SubroAdversePartyDetail.Cancel.class);
  }
  
  public Edit getEdit() {
    return getOrCreateProperty("Edit", "Edit", null, pcftest.SubroAdversePartyDetail.Edit.class);
  }
  
  public SubroAdversePartyDetail_UpLink getSubroAdversePartyDetail_UpLink() {
    return getOrCreateProperty("SubroAdversePartyDetail_UpLink", "SubroAdversePartyDetail_UpLink", null, pcftest.SubroAdversePartyDetail.SubroAdversePartyDetail_UpLink.class);
  }
  
  public SubrogationPartyDetailDV getSubrogationPartyDetailDV() {
    return getOrCreateProperty("SubrogationPartyDetailDV", "SubrogationPartyDetailDV", null, pcftest.SubrogationPartyDetailDV.class);
  }
  
  public Update getUpdate() {
    return getOrCreateProperty("Update", "Update", null, pcftest.SubroAdversePartyDetail.Update.class);
  }
  
  public _Paging get_Paging() {
    return getOrCreateProperty("_Paging", "_Paging", null, pcftest.SubroAdversePartyDetail._Paging.class);
  }
  
  public __crumb__ get__crumb__() {
    return getOrCreateProperty("__crumb__", "__crumb__", null, pcftest.SubroAdversePartyDetail.__crumb__.class);
  }
  
  public _msgs get_msgs() {
    return getOrCreateProperty("_msgs", "_msgs", null, pcftest.SubroAdversePartyDetail._msgs.class);
  }
  
  public SubrogationGeneral get_parent() {
    return getOrCreateProperty("_parent", pcftest.SubrogationGeneral.class);
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/claim/subrogation/AdverseParty/SubroAdversePartyDetail.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class Cancel extends ClickableActionElement {
    public Cancel(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/claim/subrogation/AdverseParty/SubroAdversePartyDetail.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class Edit extends ClickableActionElement {
    public Edit(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/claim/subrogation/AdverseParty/SubroAdversePartyDetail.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class SubroAdversePartyDetail_UpLink extends ClickableActionElement {
    public SubroAdversePartyDetail_UpLink(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/claim/subrogation/AdverseParty/SubroAdversePartyDetail.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class Update extends ClickableActionElement {
    public Update(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/claim/subrogation/AdverseParty/SubroAdversePartyDetail.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class _Paging extends ValueElementWithSetAndRefresh {
    public _Paging(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/claim/subrogation/AdverseParty/SubroAdversePartyDetail.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class __crumb__ extends ClickableActionElement {
    public __crumb__(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/claim/subrogation/AdverseParty/SubroAdversePartyDetail.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class _msgs extends MessagesElement {
    public _msgs(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  
}