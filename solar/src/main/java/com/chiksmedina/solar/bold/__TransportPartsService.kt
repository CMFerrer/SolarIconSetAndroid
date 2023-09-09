package com.chiksmedina.solar.bold

import androidx.compose.ui.graphics.vector.ImageVector
import com.chiksmedina.solar.BoldGroup
import com.chiksmedina.solar.bold.transportpartsservice.Accumulator
import com.chiksmedina.solar.bold.transportpartsservice.Bus
import com.chiksmedina.solar.bold.transportpartsservice.ElectricRefueling
import com.chiksmedina.solar.bold.transportpartsservice.GasStation
import com.chiksmedina.solar.bold.transportpartsservice.KickScooter
import com.chiksmedina.solar.bold.transportpartsservice.Scooter
import com.chiksmedina.solar.bold.transportpartsservice.ShockAbsorber
import com.chiksmedina.solar.bold.transportpartsservice.SpedometerLow
import com.chiksmedina.solar.bold.transportpartsservice.SpedometerMax
import com.chiksmedina.solar.bold.transportpartsservice.SpedometerMiddle
import com.chiksmedina.solar.bold.transportpartsservice.Suspension
import com.chiksmedina.solar.bold.transportpartsservice.SuspensionBolt
import com.chiksmedina.solar.bold.transportpartsservice.SuspensionCross
import com.chiksmedina.solar.bold.transportpartsservice.Tram
import com.chiksmedina.solar.bold.transportpartsservice.Transmission
import com.chiksmedina.solar.bold.transportpartsservice.TransmissionCircle
import com.chiksmedina.solar.bold.transportpartsservice.TransmissionSquare
import com.chiksmedina.solar.bold.transportpartsservice.Wheel
import com.chiksmedina.solar.bold.transportpartsservice.WheelAngle
import kotlin.collections.List as ____KtList

public object TransportPartsServiceGroup

public val BoldGroup.TransportPartsService: TransportPartsServiceGroup
  get() = TransportPartsServiceGroup

private var __AllIcons: ____KtList<ImageVector>? = null

public val TransportPartsServiceGroup.AllIcons: ____KtList<ImageVector>
  get() {
    if (__AllIcons != null) {
      return __AllIcons!!
    }
    __AllIcons= listOf(Accumulator, Bus, ElectricRefueling, GasStation, KickScooter, Scooter,
        ShockAbsorber, SpedometerLow, SpedometerMax, SpedometerMiddle, Suspension, SuspensionBolt,
        SuspensionCross, Tram, Transmission, TransmissionCircle, TransmissionSquare, Wheel,
        WheelAngle)
    return __AllIcons!!
  }
