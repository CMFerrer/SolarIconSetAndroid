package dev.chiksmedina.solar.linear

import androidx.compose.ui.graphics.vector.ImageVector
import dev.chiksmedina.solar.LinearSolar
import dev.chiksmedina.solar.linear.call.CallCancel
import dev.chiksmedina.solar.linear.call.CallCancelRounded
import dev.chiksmedina.solar.linear.call.CallChat
import dev.chiksmedina.solar.linear.call.CallChatRounded
import dev.chiksmedina.solar.linear.call.CallDropped
import dev.chiksmedina.solar.linear.call.CallDroppedRounded
import dev.chiksmedina.solar.linear.call.CallMedicine
import dev.chiksmedina.solar.linear.call.CallMedicineRounded
import dev.chiksmedina.solar.linear.call.EndCall
import dev.chiksmedina.solar.linear.call.EndCallRounded
import dev.chiksmedina.solar.linear.call.IncomingCall
import dev.chiksmedina.solar.linear.call.IncomingCallRounded
import dev.chiksmedina.solar.linear.call.OutgoingCall
import dev.chiksmedina.solar.linear.call.OutgoingCallRounded
import dev.chiksmedina.solar.linear.call.Phone
import dev.chiksmedina.solar.linear.call.PhoneCalling
import dev.chiksmedina.solar.linear.call.PhoneCallingRounded
import dev.chiksmedina.solar.linear.call.PhoneRounded
import dev.chiksmedina.solar.linear.call.RecordCircle
import dev.chiksmedina.solar.linear.call.RecordMinimalistic
import dev.chiksmedina.solar.linear.call.RecordSquare
import kotlin.collections.List as KtList

object CallGroup

val LinearSolar.Call: CallGroup
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
