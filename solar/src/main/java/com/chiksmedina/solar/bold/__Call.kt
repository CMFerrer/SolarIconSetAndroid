package com.chiksmedina.solar.bold

import androidx.compose.ui.graphics.vector.ImageVector
import com.chiksmedina.solar.BoldSolar
import com.chiksmedina.solar.bold.call.CallCancel
import com.chiksmedina.solar.bold.call.CallCancelRounded
import com.chiksmedina.solar.bold.call.CallChat
import com.chiksmedina.solar.bold.call.CallChatRounded
import com.chiksmedina.solar.bold.call.CallDropped
import com.chiksmedina.solar.bold.call.CallDroppedRounded
import com.chiksmedina.solar.bold.call.CallMedicine
import com.chiksmedina.solar.bold.call.CallMedicineRounded
import com.chiksmedina.solar.bold.call.EndCall
import com.chiksmedina.solar.bold.call.EndCallRounded
import com.chiksmedina.solar.bold.call.IncomingCall
import com.chiksmedina.solar.bold.call.IncomingCallRounded
import com.chiksmedina.solar.bold.call.OutgoingCall
import com.chiksmedina.solar.bold.call.OutgoingCallRounded
import com.chiksmedina.solar.bold.call.Phone
import com.chiksmedina.solar.bold.call.PhoneCalling
import com.chiksmedina.solar.bold.call.PhoneCallingRounded
import com.chiksmedina.solar.bold.call.PhoneRounded
import com.chiksmedina.solar.bold.call.RecordCircle
import com.chiksmedina.solar.bold.call.RecordMinimalistic
import com.chiksmedina.solar.bold.call.RecordSquare
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
