package pcftest;

import gw.lang.SimplePropertyProcessing;
import gw.smoketest.platform.web.PCFElement;
import gw.smoketest.platform.web.PCFElementId;
import gw.smoketest.platform.web.TreeViewElement;
import gw.testharness.ISmokeTest;
import javax.annotation.processing.Generated;
import pcftest.AdminMenuTree.AdminMenuTree2;

@SimplePropertyProcessing
@Generated(comments = "config/web/pcf/admin/AdminMenuTree.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
public class AdminMenuTree extends PCFElement {
  public final static String CHECKSUM = "9029d37ed0437523c68acadfcaf192cd";
  
  public AdminMenuTree(ISmokeTest helper, PCFElementId componentId)  {
    super(helper, componentId);
  }
  
  public AdminMenuTree2 getAdminMenuTree() {
    return getOrCreateProperty("AdminMenuTree", "AdminMenuTree", null, pcftest.AdminMenuTree.AdminMenuTree2.class);
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/admin/AdminMenuTree.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class AdminMenuTree2 extends TreeViewElement {
    public AdminMenuTree2(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    
  }
  
  
}