package pcfc.expressions

uses pcf.*
uses entity.*
uses typekey.*
uses gw.api.locale.DisplayKey
@javax.annotation.processing.Generated("config/web/pcf/claim/snapshot/700/ClaimSnapshotPolicyLocation700Popup.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
class ClaimSnapshotPolicyLocation700PopupExpressions {
  @javax.annotation.processing.Generated("config/web/pcf/claim/snapshot/700/ClaimSnapshotPolicyLocation700Popup.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
  public static class ClaimSnapshotPolicyLocation700PopupExpressionsImpl extends gw.api.web.ScopeBaseClass {
    public construct(widget :  Object) {
      super(widget, 0)
    }
    
    protected construct(widget :  Object, scopeDepth :  int) {
      super(widget, scopeDepth)
    }
    
    static function __constructorIndex (Claim :  Claim, PolicyLocation :  dynamic.Dynamic) : int {
      return 0
    }
    
    // 'def' attribute on PanelRef at ClaimSnapshotPolicyLocation700Popup.pcf: line 93, column 78
    function def_onEnter_26 (def :  pcf.ClaimSnapshotPolicyLocation700PanelSet) : void {
      def.onEnter(Claim, PolicyLocation)
    }
    
    // 'def' attribute on InputSetRef at ClaimSnapshotPolicyLocation700Popup.pcf: line 26, column 31
    function def_onEnter_3 (def :  pcf.AddressSnapshot700InputSet) : void {
      def.onEnter(PolicyLocation.Address,null)
    }
    
    // 'def' attribute on PanelRef at ClaimSnapshotPolicyLocation700Popup.pcf: line 93, column 78
    function def_refreshVariables_27 (def :  pcf.ClaimSnapshotPolicyLocation700PanelSet) : void {
      def.refreshVariables(Claim, PolicyLocation)
    }
    
    // 'def' attribute on InputSetRef at ClaimSnapshotPolicyLocation700Popup.pcf: line 26, column 31
    function def_refreshVariables_4 (def :  pcf.AddressSnapshot700InputSet) : void {
      def.refreshVariables(PolicyLocation.Address,null)
    }
    
    // 'value' attribute on TextCell (id=ItemDescription_Cell) at ClaimSnapshotPolicyLocation700Popup.pcf: line 79, column 50
    function sortValue_16 (PropertyItem :  dynamic.Dynamic) : java.lang.Object {
      return PropertyItem.Description
    }
    
    // 'value' attribute on TextCell (id=ItemValue_Cell) at ClaimSnapshotPolicyLocation700Popup.pcf: line 85, column 50
    function sortValue_17 (PropertyItem :  dynamic.Dynamic) : java.lang.Object {
      return PropertyItem.AppraisedValue
    }
    
    // 'value' attribute on TextCell (id=Lienholder_Cell) at ClaimSnapshotPolicyLocation700Popup.pcf: line 51, column 82
    function sortValue_8 (PropertyOwner :  dynamic.Dynamic) : java.lang.Object {
      return util.Snapshot.renderValue(PropertyOwner.Lienholder)
    }
    
    // 'value' attribute on TextCell (id=OwnerType_Cell) at ClaimSnapshotPolicyLocation700Popup.pcf: line 55, column 81
    function sortValue_9 (PropertyOwner :  dynamic.Dynamic) : java.lang.Object {
      return util.Snapshot.renderValue(PropertyOwner.OwnerType)
    }
    
    // 'value' attribute on TextInput (id=LocationNumber_Input) at ClaimSnapshotPolicyLocation700Popup.pcf: line 23, column 42
    function valueRoot_1 () : java.lang.Object {
      return PolicyLocation
    }
    
    // 'value' attribute on TextInput (id=Description_Input) at ClaimSnapshotPolicyLocation700Popup.pcf: line 31, column 42
    function valueRoot_6 () : java.lang.Object {
      return PolicyLocation.Address
    }
    
    // 'value' attribute on TextInput (id=LocationNumber_Input) at ClaimSnapshotPolicyLocation700Popup.pcf: line 23, column 42
    function value_0 () : dynamic.Dynamic {
      return PolicyLocation.LocationNumber
    }
    
    // 'value' attribute on RowIterator at ClaimSnapshotPolicyLocation700Popup.pcf: line 46, column 67
    function value_14 () : java.util.List<dynamic.Dynamic> {
      return Arrays.asList( PolicyLocation.Lienholders.where(\ po -> po.LocationBasedRU == null) )
    }
    
    // 'value' attribute on RowIterator at ClaimSnapshotPolicyLocation700Popup.pcf: line 73, column 45
    function value_24 () : dynamic.Dynamic {
      return PolicyLocation.HighValueItems
    }
    
    // 'value' attribute on TextInput (id=Description_Input) at ClaimSnapshotPolicyLocation700Popup.pcf: line 31, column 42
    function value_5 () : dynamic.Dynamic {
      return PolicyLocation.Address.Description
    }
    
    // 'visible' attribute on ListViewInput at ClaimSnapshotPolicyLocation700Popup.pcf: line 38, column 84
    function visible_15 () : java.lang.Boolean {
      return PolicyLocation.Lienholders.length as java.lang.Double > 0
    }
    
    // 'visible' attribute on ListViewInput at ClaimSnapshotPolicyLocation700Popup.pcf: line 64, column 87
    function visible_25 () : java.lang.Boolean {
      return PolicyLocation.HighValueItems.length as java.lang.Double > 0
    }
    
    property get Claim () : Claim {
      return getVariableValue("Claim", 0) as Claim
    }
    
    property set Claim ($arg :  Claim) {
      setVariableValue("Claim", 0, $arg)
    }
    
    override property get CurrentLocation () : pcf.ClaimSnapshotPolicyLocation700Popup {
      return super.CurrentLocation as pcf.ClaimSnapshotPolicyLocation700Popup
    }
    
    property get PolicyLocation () : dynamic.Dynamic {
      return getVariableValue("PolicyLocation", 0) as dynamic.Dynamic
    }
    
    property set PolicyLocation ($arg :  dynamic.Dynamic) {
      setVariableValue("PolicyLocation", 0, $arg)
    }
    
    
  }
  
  @javax.annotation.processing.Generated("config/web/pcf/claim/snapshot/700/ClaimSnapshotPolicyLocation700Popup.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
  public static class IteratorEntry2ExpressionsImpl extends ClaimSnapshotPolicyLocation700PopupExpressionsImpl {
    public construct(widget :  Object) {
      super(widget, 1)
    }
    
    protected construct(widget :  Object, scopeDepth :  int) {
      super(widget, scopeDepth)
    }
    
    // 'value' attribute on TextCell (id=ItemDescription_Cell) at ClaimSnapshotPolicyLocation700Popup.pcf: line 79, column 50
    function valueRoot_19 () : java.lang.Object {
      return PropertyItem
    }
    
    // 'value' attribute on TextCell (id=ItemDescription_Cell) at ClaimSnapshotPolicyLocation700Popup.pcf: line 79, column 50
    function value_18 () : dynamic.Dynamic {
      return PropertyItem.Description
    }
    
    // 'value' attribute on TextCell (id=ItemValue_Cell) at ClaimSnapshotPolicyLocation700Popup.pcf: line 85, column 50
    function value_21 () : dynamic.Dynamic {
      return PropertyItem.AppraisedValue
    }
    
    property get PropertyItem () : dynamic.Dynamic {
      return getIteratedValue(1) as dynamic.Dynamic
    }
    
    
  }
  
  @javax.annotation.processing.Generated("config/web/pcf/claim/snapshot/700/ClaimSnapshotPolicyLocation700Popup.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
  public static class IteratorEntryExpressionsImpl extends ClaimSnapshotPolicyLocation700PopupExpressionsImpl {
    public construct(widget :  Object) {
      super(widget, 1)
    }
    
    protected construct(widget :  Object, scopeDepth :  int) {
      super(widget, scopeDepth)
    }
    
    // 'value' attribute on TextCell (id=Lienholder_Cell) at ClaimSnapshotPolicyLocation700Popup.pcf: line 51, column 82
    function value_10 () : java.lang.String {
      return util.Snapshot.renderValue(PropertyOwner.Lienholder)
    }
    
    // 'value' attribute on TextCell (id=OwnerType_Cell) at ClaimSnapshotPolicyLocation700Popup.pcf: line 55, column 81
    function value_12 () : java.lang.String {
      return util.Snapshot.renderValue(PropertyOwner.OwnerType)
    }
    
    property get PropertyOwner () : dynamic.Dynamic {
      return getIteratedValue(1) as dynamic.Dynamic
    }
    
    
  }
  
  
}