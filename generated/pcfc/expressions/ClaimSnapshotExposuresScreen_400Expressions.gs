package pcfc.expressions

uses pcf.*
uses entity.*
uses typekey.*
uses gw.api.locale.DisplayKey
@javax.annotation.processing.Generated("config/web/pcf/claim/snapshot/400/ClaimSnapshotExposuresScreen.400.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
class ClaimSnapshotExposuresScreen_400Expressions {
  @javax.annotation.processing.Generated("config/web/pcf/claim/snapshot/400/ClaimSnapshotExposuresScreen.400.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
  public static class ClaimSnapshotExposuresScreenExpressionsImpl extends gw.api.web.ScopeBaseClass {
    public construct(widget :  Object) {
      super(widget, 0)
    }
    
    protected construct(widget :  Object, scopeDepth :  int) {
      super(widget, scopeDepth)
    }
    
    property get Claim () : Claim {
      return getRequireValue("Claim", 0) as Claim
    }
    
    property set Claim ($arg :  Claim) {
      setRequireValue("Claim", 0, $arg)
    }
    
    property get SnapshotParam () : dynamic.Dynamic {
      return getRequireValue("SnapshotParam", 0) as dynamic.Dynamic
    }
    
    property set SnapshotParam ($arg :  dynamic.Dynamic) {
      setRequireValue("SnapshotParam", 0, $arg)
    }
    
    
  }
  
  @javax.annotation.processing.Generated("config/web/pcf/claim/snapshot/400/ClaimSnapshotExposuresScreen.400.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
  public static class IteratorEntryExpressionsImpl extends ListDetailPanelExpressionsImpl {
    public construct(widget :  Object) {
      super(widget, 2)
    }
    
    protected construct(widget :  Object, scopeDepth :  int) {
      super(widget, scopeDepth)
    }
    
    // 'value' attribute on TextCell (id=Reserves_Cell) at ClaimSnapshotExposuresScreen.400.pcf: line 50, column 44
    function valueRoot_19 () : java.lang.Object {
      return Exposure.ExposureRpt
    }
    
    // 'value' attribute on TextCell (id=Number_Cell) at ClaimSnapshotExposuresScreen.400.pcf: line 31, column 44
    function valueRoot_8 () : java.lang.Object {
      return Exposure
    }
    
    // 'value' attribute on TextCell (id=Type_Cell) at ClaimSnapshotExposuresScreen.400.pcf: line 36, column 44
    function value_10 () : dynamic.Dynamic {
      return Exposure.ExposureType
    }
    
    // 'value' attribute on TextCell (id=Coverage_Cell) at ClaimSnapshotExposuresScreen.400.pcf: line 41, column 44
    function value_13 () : dynamic.Dynamic {
      return Exposure.PrimaryCoverage
    }
    
    // 'value' attribute on TextCell (id=Claimant_Cell) at ClaimSnapshotExposuresScreen.400.pcf: line 45, column 69
    function value_16 () : java.lang.String {
      return util.Snapshot.renderValue(Exposure.Claimant)
    }
    
    // 'value' attribute on TextCell (id=Reserves_Cell) at ClaimSnapshotExposuresScreen.400.pcf: line 50, column 44
    function value_18 () : dynamic.Dynamic {
      return Exposure.ExposureRpt.RemainingReserves
    }
    
    // 'value' attribute on TextCell (id=FuturePayments_Cell) at ClaimSnapshotExposuresScreen.400.pcf: line 55, column 44
    function value_21 () : dynamic.Dynamic {
      return Exposure.ExposureRpt.FuturePayments
    }
    
    // 'value' attribute on TextCell (id=TotalPayments_Cell) at ClaimSnapshotExposuresScreen.400.pcf: line 60, column 44
    function value_24 () : dynamic.Dynamic {
      return Exposure.ExposureRpt.TotalPayments
    }
    
    // 'value' attribute on TextCell (id=Number_Cell) at ClaimSnapshotExposuresScreen.400.pcf: line 31, column 44
    function value_7 () : dynamic.Dynamic {
      return Exposure.ClaimOrder
    }
    
    property get Exposure () : dynamic.Dynamic {
      return getIteratedValue(2) as dynamic.Dynamic
    }
    
    
  }
  
  @javax.annotation.processing.Generated("config/web/pcf/claim/snapshot/400/ClaimSnapshotExposuresScreen.400.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
  public static class ListDetailPanelExpressionsImpl extends ClaimSnapshotExposuresScreenExpressionsImpl {
    public construct(widget :  Object) {
      super(widget, 1)
    }
    
    protected construct(widget :  Object, scopeDepth :  int) {
      super(widget, scopeDepth)
    }
    
    // 'def' attribute on PanelRef at ClaimSnapshotExposuresScreen.400.pcf: line 70, column 56
    function def_onEnter_28 (def :  pcf.ClaimSnapshotExposure400DV_BodilyInjuryDamage) : void {
      def.onEnter(Claim, SelectedExposure)
    }
    
    // 'def' attribute on PanelRef at ClaimSnapshotExposuresScreen.400.pcf: line 70, column 56
    function def_onEnter_30 (def :  pcf.ClaimSnapshotExposure400DV_GeneralDamage) : void {
      def.onEnter(Claim, SelectedExposure)
    }
    
    // 'def' attribute on PanelRef at ClaimSnapshotExposuresScreen.400.pcf: line 70, column 56
    function def_onEnter_32 (def :  pcf.ClaimSnapshotExposure400DV_LossOfUseDamage) : void {
      def.onEnter(Claim, SelectedExposure)
    }
    
    // 'def' attribute on PanelRef at ClaimSnapshotExposuresScreen.400.pcf: line 70, column 56
    function def_onEnter_34 (def :  pcf.ClaimSnapshotExposure400DV_PIPDamages) : void {
      def.onEnter(Claim, SelectedExposure)
    }
    
    // 'def' attribute on PanelRef at ClaimSnapshotExposuresScreen.400.pcf: line 70, column 56
    function def_onEnter_36 (def :  pcf.ClaimSnapshotExposure400DV_PersonalPropertyDamage) : void {
      def.onEnter(Claim, SelectedExposure)
    }
    
    // 'def' attribute on PanelRef at ClaimSnapshotExposuresScreen.400.pcf: line 70, column 56
    function def_onEnter_38 (def :  pcf.ClaimSnapshotExposure400DV_PropertyDamage) : void {
      def.onEnter(Claim, SelectedExposure)
    }
    
    // 'def' attribute on PanelRef at ClaimSnapshotExposuresScreen.400.pcf: line 70, column 56
    function def_onEnter_40 (def :  pcf.ClaimSnapshotExposure400DV_Theft) : void {
      def.onEnter(Claim, SelectedExposure)
    }
    
    // 'def' attribute on PanelRef at ClaimSnapshotExposuresScreen.400.pcf: line 70, column 56
    function def_onEnter_42 (def :  pcf.ClaimSnapshotExposure400DV_TowOnly) : void {
      def.onEnter(Claim, SelectedExposure)
    }
    
    // 'def' attribute on PanelRef at ClaimSnapshotExposuresScreen.400.pcf: line 70, column 56
    function def_onEnter_44 (def :  pcf.ClaimSnapshotExposure400DV_VehicleDamage) : void {
      def.onEnter(Claim, SelectedExposure)
    }
    
    // 'def' attribute on PanelRef at ClaimSnapshotExposuresScreen.400.pcf: line 70, column 56
    function def_refreshVariables_29 (def :  pcf.ClaimSnapshotExposure400DV_BodilyInjuryDamage) : void {
      def.refreshVariables(Claim, SelectedExposure)
    }
    
    // 'def' attribute on PanelRef at ClaimSnapshotExposuresScreen.400.pcf: line 70, column 56
    function def_refreshVariables_31 (def :  pcf.ClaimSnapshotExposure400DV_GeneralDamage) : void {
      def.refreshVariables(Claim, SelectedExposure)
    }
    
    // 'def' attribute on PanelRef at ClaimSnapshotExposuresScreen.400.pcf: line 70, column 56
    function def_refreshVariables_33 (def :  pcf.ClaimSnapshotExposure400DV_LossOfUseDamage) : void {
      def.refreshVariables(Claim, SelectedExposure)
    }
    
    // 'def' attribute on PanelRef at ClaimSnapshotExposuresScreen.400.pcf: line 70, column 56
    function def_refreshVariables_35 (def :  pcf.ClaimSnapshotExposure400DV_PIPDamages) : void {
      def.refreshVariables(Claim, SelectedExposure)
    }
    
    // 'def' attribute on PanelRef at ClaimSnapshotExposuresScreen.400.pcf: line 70, column 56
    function def_refreshVariables_37 (def :  pcf.ClaimSnapshotExposure400DV_PersonalPropertyDamage) : void {
      def.refreshVariables(Claim, SelectedExposure)
    }
    
    // 'def' attribute on PanelRef at ClaimSnapshotExposuresScreen.400.pcf: line 70, column 56
    function def_refreshVariables_39 (def :  pcf.ClaimSnapshotExposure400DV_PropertyDamage) : void {
      def.refreshVariables(Claim, SelectedExposure)
    }
    
    // 'def' attribute on PanelRef at ClaimSnapshotExposuresScreen.400.pcf: line 70, column 56
    function def_refreshVariables_41 (def :  pcf.ClaimSnapshotExposure400DV_Theft) : void {
      def.refreshVariables(Claim, SelectedExposure)
    }
    
    // 'def' attribute on PanelRef at ClaimSnapshotExposuresScreen.400.pcf: line 70, column 56
    function def_refreshVariables_43 (def :  pcf.ClaimSnapshotExposure400DV_TowOnly) : void {
      def.refreshVariables(Claim, SelectedExposure)
    }
    
    // 'def' attribute on PanelRef at ClaimSnapshotExposuresScreen.400.pcf: line 70, column 56
    function def_refreshVariables_45 (def :  pcf.ClaimSnapshotExposure400DV_VehicleDamage) : void {
      def.refreshVariables(Claim, SelectedExposure)
    }
    
    // 'mode' attribute on PanelRef at ClaimSnapshotExposuresScreen.400.pcf: line 70, column 56
    function mode_46 () : java.lang.Object {
      return SelectedExposure.ExposureType.Code
    }
    
    // 'value' attribute on TextCell (id=Number_Cell) at ClaimSnapshotExposuresScreen.400.pcf: line 31, column 44
    function sortValue_0 (Exposure :  dynamic.Dynamic) : java.lang.Object {
      return Exposure.ClaimOrder
    }
    
    // 'value' attribute on TextCell (id=Type_Cell) at ClaimSnapshotExposuresScreen.400.pcf: line 36, column 44
    function sortValue_1 (Exposure :  dynamic.Dynamic) : java.lang.Object {
      return Exposure.ExposureType
    }
    
    // 'value' attribute on TextCell (id=Coverage_Cell) at ClaimSnapshotExposuresScreen.400.pcf: line 41, column 44
    function sortValue_2 (Exposure :  dynamic.Dynamic) : java.lang.Object {
      return Exposure.PrimaryCoverage
    }
    
    // 'value' attribute on TextCell (id=Claimant_Cell) at ClaimSnapshotExposuresScreen.400.pcf: line 45, column 69
    function sortValue_3 (Exposure :  dynamic.Dynamic) : java.lang.Object {
      return util.Snapshot.renderValue(Exposure.Claimant)
    }
    
    // 'value' attribute on TextCell (id=Reserves_Cell) at ClaimSnapshotExposuresScreen.400.pcf: line 50, column 44
    function sortValue_4 (Exposure :  dynamic.Dynamic) : java.lang.Object {
      return Exposure.ExposureRpt.RemainingReserves
    }
    
    // 'value' attribute on TextCell (id=FuturePayments_Cell) at ClaimSnapshotExposuresScreen.400.pcf: line 55, column 44
    function sortValue_5 (Exposure :  dynamic.Dynamic) : java.lang.Object {
      return Exposure.ExposureRpt.FuturePayments
    }
    
    // 'value' attribute on TextCell (id=TotalPayments_Cell) at ClaimSnapshotExposuresScreen.400.pcf: line 60, column 44
    function sortValue_6 (Exposure :  dynamic.Dynamic) : java.lang.Object {
      return Exposure.ExposureRpt.TotalPayments
    }
    
    // 'title' attribute on Card (id=ClaimSnapshotExposuresCard) at ClaimSnapshotExposuresScreen.400.pcf: line 67, column 63
    function title_47 () : java.lang.String {
      return util.Snapshot.renderValue(SelectedExposure)
    }
    
    // 'value' attribute on RowIterator at ClaimSnapshotExposuresScreen.400.pcf: line 24, column 39
    function value_27 () : dynamic.Dynamic {
      return SnapshotParam.Exposures
    }
    
    property get SelectedExposure () : dynamic.Dynamic {
      return getCurrentSelection(1) as dynamic.Dynamic
    }
    
    property set SelectedExposure ($arg :  dynamic.Dynamic) {
      setCurrentSelection(1, $arg)
    }
    
    
  }
  
  
}