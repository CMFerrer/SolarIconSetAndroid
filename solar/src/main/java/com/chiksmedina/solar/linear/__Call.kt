package com.chiksmedina.solar.linear

import androidx.compose.ui.graphics.vector.ImageVector
import com.chiksmedina.solar.LinearSolar
import com.chiksmedina.solar.linear.call.CallCancel
import com.chiksmedina.solar.linear.call.CallCancelRounded
import com.chiksmedina.solar.linear.call.CallChat
import com.chiksmedina.solar.linear.call.CallChatRounded
import com.chiksmedina.solar.linear.call.CallDropped
import com.chiksmedina.solar.linear.call.CallDroppedRounded
import com.chiksmedina.solar.linear.call.CallMedicine
import com.chiksmedina.solar.linear.call.CallMedicineRounded
import com.chiksmedina.solar.linear.call.EndCall
import com.chiksmedina.solar.linear.call.EndCallRounded
import com.chiksmedina.solar.linear.call.IncomingCall
import com.chiksmedina.solar.linear.call.IncomingCallRounded
import com.chiksmedina.solar.linear.call.OutgoingCall
import com.chiksmedina.solar.linear.call.OutgoingCallRounded
import com.chiksmedina.solar.linear.call.Phone
import com.chiksmedina.solar.linear.call.PhoneCalling
import com.chiksmedina.solar.linear.call.PhoneCallingRounded
import com.chiksmedina.solar.linear.call.PhoneRounded
import com.chiksmedina.solar.linear.call.RecordCircle
import com.chiksmedina.solar.linear.call.RecordMinimalistic
import com.chiksmedina.solar.linear.call.RecordSquare
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
