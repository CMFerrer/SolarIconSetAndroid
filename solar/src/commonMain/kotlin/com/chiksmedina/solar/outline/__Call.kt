package com.chiksmedina.solar.outline

import androidx.compose.ui.graphics.vector.ImageVector
import com.chiksmedina.solar.OutlineSolar
import com.chiksmedina.solar.outline.call.CallCancel
import com.chiksmedina.solar.outline.call.CallCancelRounded
import com.chiksmedina.solar.outline.call.CallChat
import com.chiksmedina.solar.outline.call.CallChatRounded
import com.chiksmedina.solar.outline.call.CallDropped
import com.chiksmedina.solar.outline.call.CallDroppedRounded
import com.chiksmedina.solar.outline.call.CallMedicine
import com.chiksmedina.solar.outline.call.CallMedicineRounded
import com.chiksmedina.solar.outline.call.EndCall
import com.chiksmedina.solar.outline.call.EndCallRounded
import com.chiksmedina.solar.outline.call.IncomingCall
import com.chiksmedina.solar.outline.call.IncomingCallRounded
import com.chiksmedina.solar.outline.call.OutgoingCall
import com.chiksmedina.solar.outline.call.OutgoingCallRounded
import com.chiksmedina.solar.outline.call.Phone
import com.chiksmedina.solar.outline.call.PhoneCalling
import com.chiksmedina.solar.outline.call.PhoneCallingRounded
import com.chiksmedina.solar.outline.call.PhoneRounded
import com.chiksmedina.solar.outline.call.RecordCircle
import com.chiksmedina.solar.outline.call.RecordMinimalistic
import com.chiksmedina.solar.outline.call.RecordSquare
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
