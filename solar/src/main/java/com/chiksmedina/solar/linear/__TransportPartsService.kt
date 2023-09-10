package com.chiksmedina.solar.linear

import androidx.compose.ui.graphics.vector.ImageVector
import com.chiksmedina.solar.LinearSolar
import com.chiksmedina.solar.linear.transportpartsservice.Accumulator
import com.chiksmedina.solar.linear.transportpartsservice.Bus
import com.chiksmedina.solar.linear.transportpartsservice.ElectricRefueling
import com.chiksmedina.solar.linear.transportpartsservice.GasStation
import com.chiksmedina.solar.linear.transportpartsservice.KickScooter
import com.chiksmedina.solar.linear.transportpartsservice.Scooter
import com.chiksmedina.solar.linear.transportpartsservice.ShockAbsorber
import com.chiksmedina.solar.linear.transportpartsservice.SpedometerLow
import com.chiksmedina.solar.linear.transportpartsservice.SpedometerMax
import com.chiksmedina.solar.linear.transportpartsservice.SpedometerMiddle
import com.chiksmedina.solar.linear.transportpartsservice.Suspension
import com.chiksmedina.solar.linear.transportpartsservice.SuspensionBolt
import com.chiksmedina.solar.linear.transportpartsservice.SuspensionCross
import com.chiksmedina.solar.linear.transportpartsservice.Tram
import com.chiksmedina.solar.linear.transportpartsservice.Transmission
import com.chiksmedina.solar.linear.transportpartsservice.TransmissionCircle
import com.chiksmedina.solar.linear.transportpartsservice.TransmissionSquare
import com.chiksmedina.solar.linear.transportpartsservice.Wheel
import com.chiksmedina.solar.linear.transportpartsservice.WheelAngle
import kotlin.collections.List as KtList

object TransportPartsServiceGroup

val LinearSolar.TransportPartsService: TransportPartsServiceGroup
    get() = TransportPartsServiceGroup

private var _AllIcons: KtList<ImageVector>? = null

val TransportPartsServiceGroup.AllIcons: KtList<ImageVector>
    get() {
        if (_AllIcons != null) {
            return _AllIcons!!
        }
        _AllIcons = listOf(
            Accumulator,
            Bus,
            ElectricRefueling,
            GasStation,
            KickScooter,
            Scooter,
            ShockAbsorber,
            SpedometerLow,
            SpedometerMax,
            SpedometerMiddle,
            Suspension,
            SuspensionBolt,
            SuspensionCross,
            Tram,
            Transmission,
            TransmissionCircle,
            TransmissionSquare,
            Wheel,
            WheelAngle
        )
        return _AllIcons!!
    }
