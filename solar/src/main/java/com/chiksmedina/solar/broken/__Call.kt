package com.chiksmedina.solar.broken

import androidx.compose.ui.graphics.vector.ImageVector
import com.chiksmedina.solar.BrokenSolar
import com.chiksmedina.solar.broken.call.CallCancel
import com.chiksmedina.solar.broken.call.CallCancelRounded
import com.chiksmedina.solar.broken.call.CallChat
import com.chiksmedina.solar.broken.call.CallChatRounded
import com.chiksmedina.solar.broken.call.CallDropped
import com.chiksmedina.solar.broken.call.CallDroppedRounded
import com.chiksmedina.solar.broken.call.CallMedicine
import com.chiksmedina.solar.broken.call.CallMedicineRounded
import com.chiksmedina.solar.broken.call.EndCall
import com.chiksmedina.solar.broken.call.EndCallRounded
import com.chiksmedina.solar.broken.call.IncomingCall
import com.chiksmedina.solar.broken.call.IncomingCallRounded
import com.chiksmedina.solar.broken.call.OutgoingCall
import com.chiksmedina.solar.broken.call.OutgoingCallRounded
import com.chiksmedina.solar.broken.call.Phone
import com.chiksmedina.solar.broken.call.PhoneCalling
import com.chiksmedina.solar.broken.call.PhoneCallingRounded
import com.chiksmedina.solar.broken.call.PhoneRounded
import com.chiksmedina.solar.broken.call.RecordCircle
import com.chiksmedina.solar.broken.call.RecordMinimalistic
import com.chiksmedina.solar.broken.call.RecordSquare
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
