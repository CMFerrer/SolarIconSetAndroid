package dev.chiksmedina.solar.boldduotone

import androidx.compose.ui.graphics.vector.ImageVector
import dev.chiksmedina.solar.BoldDuotoneSolar
import dev.chiksmedina.solar.boldduotone.call.CallCancel
import dev.chiksmedina.solar.boldduotone.call.CallCancelRounded
import dev.chiksmedina.solar.boldduotone.call.CallChat
import dev.chiksmedina.solar.boldduotone.call.CallChatRounded
import dev.chiksmedina.solar.boldduotone.call.CallDropped
import dev.chiksmedina.solar.boldduotone.call.CallDroppedRounded
import dev.chiksmedina.solar.boldduotone.call.CallMedicine
import dev.chiksmedina.solar.boldduotone.call.CallMedicineRounded
import dev.chiksmedina.solar.boldduotone.call.EndCall
import dev.chiksmedina.solar.boldduotone.call.EndCallRounded
import dev.chiksmedina.solar.boldduotone.call.IncomingCall
import dev.chiksmedina.solar.boldduotone.call.IncomingCallRounded
import dev.chiksmedina.solar.boldduotone.call.OutgoingCall
import dev.chiksmedina.solar.boldduotone.call.OutgoingCallRounded
import dev.chiksmedina.solar.boldduotone.call.Phone
import dev.chiksmedina.solar.boldduotone.call.PhoneCalling
import dev.chiksmedina.solar.boldduotone.call.PhoneCallingRounded
import dev.chiksmedina.solar.boldduotone.call.PhoneRounded
import dev.chiksmedina.solar.boldduotone.call.RecordCircle
import dev.chiksmedina.solar.boldduotone.call.RecordMinimalistic
import dev.chiksmedina.solar.boldduotone.call.RecordSquare
import kotlin.collections.List as KtList

object CallGroup

val BoldDuotoneSolar.Call: CallGroup
    get() = CallGroup

private var _AllIcons: KtList<ImageVector>? = null

val CallGroup.AllIcons: KtList<ImageVector>
    get() {
        if (_AllIcons != null) {
            return _AllIcons!!
        }
        _AllIcons = listOf(
            CallCancel,
            CallCancelRounded,
            CallChat,
            CallChatRounded,
            CallDropped,
            CallDroppedRounded,
            CallMedicine,
            CallMedicineRounded,
            EndCall,
            EndCallRounded,
            IncomingCall,
            IncomingCallRounded,
            OutgoingCall,
            OutgoingCallRounded,
            Phone,
            PhoneCalling,
            PhoneCallingRounded,
            PhoneRounded,
            RecordCircle,
            RecordMinimalistic,
            RecordSquare
        )
        return _AllIcons!!
    }
