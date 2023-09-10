package com.chiksmedina.solar.boldduotone

import androidx.compose.ui.graphics.vector.ImageVector
import com.chiksmedina.solar.BoldDuotoneSolar
import com.chiksmedina.solar.boldduotone.call.CallCancel
import com.chiksmedina.solar.boldduotone.call.CallCancelRounded
import com.chiksmedina.solar.boldduotone.call.CallChat
import com.chiksmedina.solar.boldduotone.call.CallChatRounded
import com.chiksmedina.solar.boldduotone.call.CallDropped
import com.chiksmedina.solar.boldduotone.call.CallDroppedRounded
import com.chiksmedina.solar.boldduotone.call.CallMedicine
import com.chiksmedina.solar.boldduotone.call.CallMedicineRounded
import com.chiksmedina.solar.boldduotone.call.EndCall
import com.chiksmedina.solar.boldduotone.call.EndCallRounded
import com.chiksmedina.solar.boldduotone.call.IncomingCall
import com.chiksmedina.solar.boldduotone.call.IncomingCallRounded
import com.chiksmedina.solar.boldduotone.call.OutgoingCall
import com.chiksmedina.solar.boldduotone.call.OutgoingCallRounded
import com.chiksmedina.solar.boldduotone.call.Phone
import com.chiksmedina.solar.boldduotone.call.PhoneCalling
import com.chiksmedina.solar.boldduotone.call.PhoneCallingRounded
import com.chiksmedina.solar.boldduotone.call.PhoneRounded
import com.chiksmedina.solar.boldduotone.call.RecordCircle
import com.chiksmedina.solar.boldduotone.call.RecordMinimalistic
import com.chiksmedina.solar.boldduotone.call.RecordSquare
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
