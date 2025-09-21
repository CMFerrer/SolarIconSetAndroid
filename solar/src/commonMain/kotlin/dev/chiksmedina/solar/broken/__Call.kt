package dev.chiksmedina.solar.broken

import androidx.compose.ui.graphics.vector.ImageVector
import dev.chiksmedina.solar.BrokenSolar
import dev.chiksmedina.solar.broken.call.CallCancel
import dev.chiksmedina.solar.broken.call.CallCancelRounded
import dev.chiksmedina.solar.broken.call.CallChat
import dev.chiksmedina.solar.broken.call.CallChatRounded
import dev.chiksmedina.solar.broken.call.CallDropped
import dev.chiksmedina.solar.broken.call.CallDroppedRounded
import dev.chiksmedina.solar.broken.call.CallMedicine
import dev.chiksmedina.solar.broken.call.CallMedicineRounded
import dev.chiksmedina.solar.broken.call.EndCall
import dev.chiksmedina.solar.broken.call.EndCallRounded
import dev.chiksmedina.solar.broken.call.IncomingCall
import dev.chiksmedina.solar.broken.call.IncomingCallRounded
import dev.chiksmedina.solar.broken.call.OutgoingCall
import dev.chiksmedina.solar.broken.call.OutgoingCallRounded
import dev.chiksmedina.solar.broken.call.Phone
import dev.chiksmedina.solar.broken.call.PhoneCalling
import dev.chiksmedina.solar.broken.call.PhoneCallingRounded
import dev.chiksmedina.solar.broken.call.PhoneRounded
import dev.chiksmedina.solar.broken.call.RecordCircle
import dev.chiksmedina.solar.broken.call.RecordMinimalistic
import dev.chiksmedina.solar.broken.call.RecordSquare
import kotlin.collections.List as KtList

object CallGroup

val BrokenSolar.Call: CallGroup
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
