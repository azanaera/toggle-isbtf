package pcftest;

import gw.lang.SimplePropertyProcessing;
import gw.smoketest.platform.web.ClickableActionElement;
import gw.smoketest.platform.web.PCFElement;
import gw.smoketest.platform.web.PCFElementId;
import gw.testharness.ISmokeTest;
import javax.annotation.processing.Generated;
import pcftest.ClaimInfoBar.Adjuster;
import pcftest.ClaimInfoBar.ClaimOpenCloseIcon;
import pcftest.ClaimInfoBar.Claimant;
import pcftest.ClaimInfoBar.CoverageInQuestionClaimIndicator;
import pcftest.ClaimInfoBar.FatalityClaimIndicator;
import pcftest.ClaimInfoBar.FlagClaimIndicator;
import pcftest.ClaimInfoBar.Insured;
import pcftest.ClaimInfoBar.LargeLossClaimIndicator;
import pcftest.ClaimInfoBar.LitigationClaimIndicator;
import pcftest.ClaimInfoBar.LossDate;
import pcftest.ClaimInfoBar.PolicyIcon;
import pcftest.ClaimInfoBar.PolicyNumber;
import pcftest.ClaimInfoBar.SIUClaimIndicator;
import pcftest.ClaimInfoBar.SubrogationClaimIndicator;

@SimplePropertyProcessing
@Generated(comments = "config/web/pcf/claim/ClaimInfoBar.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
public class ClaimInfoBar extends PCFElement {
  public final static String CHECKSUM = "3b6bd9527ab9e8e01ad31c4483d93363";
  
  public ClaimInfoBar(ISmokeTest helper, PCFElementId componentId)  {
    super(helper, componentId);
  }
  
  public Adjuster getAdjuster() {
    return getOrCreateProperty("Adjuster", "Adjuster", null, pcftest.ClaimInfoBar.Adjuster.class);
  }
  
  public ClaimOpenCloseIcon getClaimOpenCloseIcon() {
    return getOrCreateProperty("ClaimOpenCloseIcon", "ClaimOpenCloseIcon", null, pcftest.ClaimInfoBar.ClaimOpenCloseIcon.class);
  }
  
  public Claimant getClaimant() {
    return getOrCreateProperty("Claimant", "Claimant", null, pcftest.ClaimInfoBar.Claimant.class);
  }
  
  public CoverageInQuestionClaimIndicator getCoverageInQuestionClaimIndicator() {
    return getOrCreateProperty("CoverageInQuestionClaimIndicator", "CoverageInQuestionClaimIndicator", null, pcftest.ClaimInfoBar.CoverageInQuestionClaimIndicator.class);
  }
  
  public FatalityClaimIndicator getFatalityClaimIndicator() {
    return getOrCreateProperty("FatalityClaimIndicator", "FatalityClaimIndicator", null, pcftest.ClaimInfoBar.FatalityClaimIndicator.class);
  }
  
  public FlagClaimIndicator getFlagClaimIndicator() {
    return getOrCreateProperty("FlagClaimIndicator", "FlagClaimIndicator", null, pcftest.ClaimInfoBar.FlagClaimIndicator.class);
  }
  
  public Insured getInsured() {
    return getOrCreateProperty("Insured", "Insured", null, pcftest.ClaimInfoBar.Insured.class);
  }
  
  public LargeLossClaimIndicator getLargeLossClaimIndicator() {
    return getOrCreateProperty("LargeLossClaimIndicator", "LargeLossClaimIndicator", null, pcftest.ClaimInfoBar.LargeLossClaimIndicator.class);
  }
  
  public LitigationClaimIndicator getLitigationClaimIndicator() {
    return getOrCreateProperty("LitigationClaimIndicator", "LitigationClaimIndicator", null, pcftest.ClaimInfoBar.LitigationClaimIndicator.class);
  }
  
  public LossDate getLossDate() {
    return getOrCreateProperty("LossDate", "LossDate", null, pcftest.ClaimInfoBar.LossDate.class);
  }
  
  public PolicyIcon getPolicyIcon() {
    return getOrCreateProperty("PolicyIcon", "PolicyIcon", null, pcftest.ClaimInfoBar.PolicyIcon.class);
  }
  
  public PolicyNumber getPolicyNumber() {
    return getOrCreateProperty("PolicyNumber", "PolicyNumber", null, pcftest.ClaimInfoBar.PolicyNumber.class);
  }
  
  public SIUClaimIndicator getSIUClaimIndicator() {
    return getOrCreateProperty("SIUClaimIndicator", "SIUClaimIndicator", null, pcftest.ClaimInfoBar.SIUClaimIndicator.class);
  }
  
  public SubrogationClaimIndicator getSubrogationClaimIndicator() {
    return getOrCreateProperty("SubrogationClaimIndicator", "SubrogationClaimIndicator", null, pcftest.ClaimInfoBar.SubrogationClaimIndicator.class);
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/claim/ClaimInfoBar.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class Adjuster extends ClickableActionElement {
    public Adjuster(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/claim/ClaimInfoBar.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class ClaimOpenCloseIcon extends ClickableActionElement {
    public ClaimOpenCloseIcon(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/claim/ClaimInfoBar.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class Claimant extends ClickableActionElement {
    public Claimant(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/claim/ClaimInfoBar.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class CoverageInQuestionClaimIndicator extends ClickableActionElement {
    public CoverageInQuestionClaimIndicator(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/claim/ClaimInfoBar.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class FatalityClaimIndicator extends ClickableActionElement {
    public FatalityClaimIndicator(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/claim/ClaimInfoBar.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class FlagClaimIndicator extends ClickableActionElement {
    public FlagClaimIndicator(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/claim/ClaimInfoBar.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class Insured extends ClickableActionElement {
    public Insured(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/claim/ClaimInfoBar.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class LargeLossClaimIndicator extends ClickableActionElement {
    public LargeLossClaimIndicator(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/claim/ClaimInfoBar.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class LitigationClaimIndicator extends ClickableActionElement {
    public LitigationClaimIndicator(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/claim/ClaimInfoBar.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class LossDate extends ClickableActionElement {
    public LossDate(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/claim/ClaimInfoBar.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class PolicyIcon extends ClickableActionElement {
    public PolicyIcon(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/claim/ClaimInfoBar.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class PolicyNumber extends ClickableActionElement {
    public PolicyNumber(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/claim/ClaimInfoBar.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class SIUClaimIndicator extends ClickableActionElement {
    public SIUClaimIndicator(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/claim/ClaimInfoBar.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class SubrogationClaimIndicator extends ClickableActionElement {
    public SubrogationClaimIndicator(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    
  }
  
  
}