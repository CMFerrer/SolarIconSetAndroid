package com.chiksmedina.solar.lineduotone

import androidx.compose.ui.graphics.vector.ImageVector
import com.chiksmedina.solar.LineduotoneGroup
import com.chiksmedina.solar.lineduotone.call.CallCancel
import com.chiksmedina.solar.lineduotone.call.CallCancelRounded
import com.chiksmedina.solar.lineduotone.call.CallChat
import com.chiksmedina.solar.lineduotone.call.CallChatRounded
import com.chiksmedina.solar.lineduotone.call.CallDropped
import com.chiksmedina.solar.lineduotone.call.CallDroppedRounded
import com.chiksmedina.solar.lineduotone.call.CallMedicine
import com.chiksmedina.solar.lineduotone.call.CallMedicineRounded
import com.chiksmedina.solar.lineduotone.call.EndCall
import com.chiksmedina.solar.lineduotone.call.EndCallRounded
import com.chiksmedina.solar.lineduotone.call.IncomingCall
import com.chiksmedina.solar.lineduotone.call.IncomingCallRounded
import com.chiksmedina.solar.lineduotone.call.OutgoingCall
import com.chiksmedina.solar.lineduotone.call.OutgoingCallRounded
import com.chiksmedina.solar.lineduotone.call.Phone
import com.chiksmedina.solar.lineduotone.call.PhoneCalling
import com.chiksmedina.solar.lineduotone.call.PhoneCallingRounded
import com.chiksmedina.solar.lineduotone.call.PhoneRounded
import com.chiksmedina.solar.lineduotone.call.RecordCircle
import com.chiksmedina.solar.lineduotone.call.RecordMinimalistic
import com.chiksmedina.solar.lineduotone.call.RecordSquare
import kotlin.collections.List as ____KtList

public object CallGroup

public val LineduotoneGroup.Call: CallGroup
  get() = CallGroup

private var __AllIcons: ____KtList<ImageVector>? = null

public val CallGroup.AllIcons: ____KtList<ImageVector>
  get() {
    if (__AllIcons != null) {
      return __AllIcons!!
    }
    __AllIcons= listOf(CallCancel, CallCancelRounded, CallChat, CallChatRounded, CallDropped,
        CallDroppedRounded, CallMedicine, CallMedicineRounded, EndCall, EndCallRounded,
        IncomingCall, IncomingCallRounded, OutgoingCall, OutgoingCallRounded, Phone, PhoneCalling,
        PhoneCallingRounded, PhoneRounded, RecordCircle, RecordMinimalistic, RecordSquare)
    return __AllIcons!!
  }
