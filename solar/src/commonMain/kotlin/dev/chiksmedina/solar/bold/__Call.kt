package dev.chiksmedina.solar.bold

import androidx.compose.ui.graphics.vector.ImageVector
import dev.chiksmedina.solar.BoldSolar
import dev.chiksmedina.solar.bold.call.CallCancel
import dev.chiksmedina.solar.bold.call.CallCancelRounded
import dev.chiksmedina.solar.bold.call.CallChat
import dev.chiksmedina.solar.bold.call.CallChatRounded
import dev.chiksmedina.solar.bold.call.CallDropped
import dev.chiksmedina.solar.bold.call.CallDroppedRounded
import dev.chiksmedina.solar.bold.call.CallMedicine
import dev.chiksmedina.solar.bold.call.CallMedicineRounded
import dev.chiksmedina.solar.bold.call.EndCall
import dev.chiksmedina.solar.bold.call.EndCallRounded
import dev.chiksmedina.solar.bold.call.IncomingCall
import dev.chiksmedina.solar.bold.call.IncomingCallRounded
import dev.chiksmedina.solar.bold.call.OutgoingCall
import dev.chiksmedina.solar.bold.call.OutgoingCallRounded
import dev.chiksmedina.solar.bold.call.Phone
import dev.chiksmedina.solar.bold.call.PhoneCalling
import dev.chiksmedina.solar.bold.call.PhoneCallingRounded
import dev.chiksmedina.solar.bold.call.PhoneRounded
import dev.chiksmedina.solar.bold.call.RecordCircle
import dev.chiksmedina.solar.bold.call.RecordMinimalistic
import dev.chiksmedina.solar.bold.call.RecordSquare
import kotlin.collections.List as KtList

object CallGroup

val BoldSolar.Call: CallGroup
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
