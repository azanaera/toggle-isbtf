package pcftest;

import gw.lang.SimplePropertyProcessing;
import gw.smoketest.platform.web.DetailViewElement;
import gw.smoketest.platform.web.PCFElementId;
import gw.smoketest.platform.web.SelectElement;
import gw.smoketest.platform.web.ValueElement;
import gw.testharness.ISmokeTest;
import javax.annotation.processing.Generated;

@SimplePropertyProcessing
@Generated(comments = "config/web/pcf/shared/usersearch/UserSearchDV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
public class UserSearchDV extends DetailViewElement {
  public final static String CHECKSUM = "e16474e86076c48cae4ffa8fce472a15";
  
  public UserSearchDV(ISmokeTest helper, PCFElementId componentId)  {
    super(helper, componentId);
  }
  
  public CCAddressBookSearchLocationInputSet getCCAddressBookSearchLocationInputSet() {
    return getOrCreateProperty("CCAddressBookSearchLocationInputSet", "CCAddressBookSearchLocationInputSet", null, pcftest.CCAddressBookSearchLocationInputSet.class);
  }
  
  public CCAddressBookSearchProximityAddressInputSet getCCAddressBookSearchProximityAddressInputSet() {
    return getOrCreateProperty("CCAddressBookSearchProximityAddressInputSet", "CCAddressBookSearchProximityAddressInputSet", null, pcftest.CCAddressBookSearchProximityAddressInputSet.class);
  }
  
  public GlobalPersonNameInputSet_Japan getGlobalPersonNameInputSet_Japan() {
    return getOrCreateProperty("GlobalPersonNameInputSet_Japan", "GlobalPersonNameInputSet", null, pcftest.GlobalPersonNameInputSet_Japan.class);
  }
  
  public GlobalPersonNameInputSet_default getGlobalPersonNameInputSet_default() {
    return getOrCreateProperty("GlobalPersonNameInputSet_default", "GlobalPersonNameInputSet", null, pcftest.GlobalPersonNameInputSet_default.class);
  }
  
  public SelectElement getRole() {
    return getOrCreateProperty("Role", "Role", null, gw.smoketest.platform.web.SelectElement.class);
  }
  
  public SearchAndResetInputSet getSearchAndResetInputSet() {
    return getOrCreateProperty("SearchAndResetInputSet", "SearchAndResetInputSet", null, pcftest.SearchAndResetInputSet.class);
  }
  
  public ValueElement getUsername() {
    return getOrCreateProperty("Username", "Username", null, gw.smoketest.platform.web.ValueElement.class);
  }
  
  
}