package pcftest;

import gw.lang.SimplePropertyProcessing;
import gw.smoketest.platform.web.QuickJumpElement;
import gw.smoketest.platform.web.TabBarElement;
import gw.testharness.ISmokeTest;
import javax.annotation.processing.Generated;
import pcftest.BlankTabBar.QuickJump;

@SimplePropertyProcessing
@Generated(comments = "config/web/pcf/util/BlankTabBar.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
public class BlankTabBar extends TabBarElement {
  public final static String CHECKSUM = "3f2ef6dfdfe54d065fa96def8003a4a9";
  
  public BlankTabBar(ISmokeTest helper)  {
    super(helper, new gw.smoketest.platform.web.PCFElementId("BlankTabBar"));
  }
  
  public QuickJump getQuickJump() {
    return getOrCreateProperty("QuickJump", pcftest.BlankTabBar.QuickJump.class);
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class QuickJump extends QuickJumpElement {
    public QuickJump(ISmokeTest helper)  {
      super(helper, new gw.smoketest.platform.web.PCFElementId("QuickJump"));
    }
    
    
  }
  
  
}