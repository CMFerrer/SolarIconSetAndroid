package dev.chiksmedina.solar.outline

import androidx.compose.ui.graphics.vector.ImageVector
import dev.chiksmedina.solar.OutlineSolar
import dev.chiksmedina.solar.outline.call.CallCancel
import dev.chiksmedina.solar.outline.call.CallCancelRounded
import dev.chiksmedina.solar.outline.call.CallChat
import dev.chiksmedina.solar.outline.call.CallChatRounded
import dev.chiksmedina.solar.outline.call.CallDropped
import dev.chiksmedina.solar.outline.call.CallDroppedRounded
import dev.chiksmedina.solar.outline.call.CallMedicine
import dev.chiksmedina.solar.outline.call.CallMedicineRounded
import dev.chiksmedina.solar.outline.call.EndCall
import dev.chiksmedina.solar.outline.call.EndCallRounded
import dev.chiksmedina.solar.outline.call.IncomingCall
import dev.chiksmedina.solar.outline.call.IncomingCallRounded
import dev.chiksmedina.solar.outline.call.OutgoingCall
import dev.chiksmedina.solar.outline.call.OutgoingCallRounded
import dev.chiksmedina.solar.outline.call.Phone
import dev.chiksmedina.solar.outline.call.PhoneCalling
import dev.chiksmedina.solar.outline.call.PhoneCallingRounded
import dev.chiksmedina.solar.outline.call.PhoneRounded
import dev.chiksmedina.solar.outline.call.RecordCircle
import dev.chiksmedina.solar.outline.call.RecordMinimalistic
import dev.chiksmedina.solar.outline.call.RecordSquare
import kotlin.collections.List as KtList

object CallGroup

val OutlineSolar.Call: CallGroup
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
