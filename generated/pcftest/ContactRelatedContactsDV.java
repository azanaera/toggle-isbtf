package pcftest;

import gw.lang.SimplePropertyProcessing;
import gw.smoketest.platform.web.ClickableActionElement;
import gw.smoketest.platform.web.DetailViewElement;
import gw.smoketest.platform.web.PCFElement;
import gw.smoketest.platform.web.PCFElementId;
import gw.smoketest.platform.web.PCFLocation;
import gw.testharness.ISmokeTest;
import javax.annotation.processing.Generated;
import pcftest.ContactRelatedContactsDV.ClaimContactRelatedContactsLV_tb;
import pcftest.ContactRelatedContactsDV.ClaimContactRelatedContactsLV_tb.Add;
import pcftest.ContactRelatedContactsDV.ClaimContactRelatedContactsLV_tb.Remove;

@SimplePropertyProcessing
@Generated(comments = "config/web/pcf/shared/contacts/ContactRelatedContactsDV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
public class ContactRelatedContactsDV extends DetailViewElement {
  public final static String CHECKSUM = "14323f33bee506060578e70c289617d2";
  
  public ContactRelatedContactsDV(ISmokeTest helper, PCFElementId componentId)  {
    super(helper, componentId);
  }
  
  public ClaimContactRelatedContactsLV getClaimContactRelatedContactsLV() {
    return getOrCreateProperty("ClaimContactRelatedContactsLV", "ClaimContactRelatedContactsLV", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListView, pcftest.ClaimContactRelatedContactsLV.class);
  }
  
  public ClaimContactRelatedContactsLV_tb getClaimContactRelatedContactsLV_tb() {
    return getOrCreateProperty("ClaimContactRelatedContactsLV_tb", "ClaimContactRelatedContactsLV_tb", null, pcftest.ContactRelatedContactsDV.ClaimContactRelatedContactsLV_tb.class);
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/shared/contacts/ContactRelatedContactsDV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class ClaimContactRelatedContactsLV_tb extends PCFElement {
    public ClaimContactRelatedContactsLV_tb(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public Add getAdd() {
      return getOrCreateProperty("Add", "Add", null, pcftest.ContactRelatedContactsDV.ClaimContactRelatedContactsLV_tb.Add.class);
    }
    
    public Remove getRemove() {
      return getOrCreateProperty("Remove", "Remove", null, pcftest.ContactRelatedContactsDV.ClaimContactRelatedContactsLV_tb.Remove.class);
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/shared/contacts/ContactRelatedContactsDV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class Add extends ClickableActionElement {
      public Add(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public PCFLocation click() {
        return clickThis(gw.smoketest.platform.web.PCFLocation.class);
      }
      
      
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/shared/contacts/ContactRelatedContactsDV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
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