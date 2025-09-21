package dev.chiksmedina.solar.lineduotone

import androidx.compose.ui.graphics.vector.ImageVector
import dev.chiksmedina.solar.LineDuotoneSolar
import dev.chiksmedina.solar.lineduotone.call.CallCancel
import dev.chiksmedina.solar.lineduotone.call.CallCancelRounded
import dev.chiksmedina.solar.lineduotone.call.CallChat
import dev.chiksmedina.solar.lineduotone.call.CallChatRounded
import dev.chiksmedina.solar.lineduotone.call.CallDropped
import dev.chiksmedina.solar.lineduotone.call.CallDroppedRounded
import dev.chiksmedina.solar.lineduotone.call.CallMedicine
import dev.chiksmedina.solar.lineduotone.call.CallMedicineRounded
import dev.chiksmedina.solar.lineduotone.call.EndCall
import dev.chiksmedina.solar.lineduotone.call.EndCallRounded
import dev.chiksmedina.solar.lineduotone.call.IncomingCall
import dev.chiksmedina.solar.lineduotone.call.IncomingCallRounded
import dev.chiksmedina.solar.lineduotone.call.OutgoingCall
import dev.chiksmedina.solar.lineduotone.call.OutgoingCallRounded
import dev.chiksmedina.solar.lineduotone.call.Phone
import dev.chiksmedina.solar.lineduotone.call.PhoneCalling
import dev.chiksmedina.solar.lineduotone.call.PhoneCallingRounded
import dev.chiksmedina.solar.lineduotone.call.PhoneRounded
import dev.chiksmedina.solar.lineduotone.call.RecordCircle
import dev.chiksmedina.solar.lineduotone.call.RecordMinimalistic
import dev.chiksmedina.solar.lineduotone.call.RecordSquare
import kotlin.collections.List as KtList

object CallGroup

val LineDuotoneSolar.Call: CallGroup
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
