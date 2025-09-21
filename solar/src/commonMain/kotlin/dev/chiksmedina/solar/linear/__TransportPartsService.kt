package dev.chiksmedina.solar.linear

import androidx.compose.ui.graphics.vector.ImageVector
import dev.chiksmedina.solar.LinearSolar
import dev.chiksmedina.solar.linear.transportpartsservice.Accumulator
import dev.chiksmedina.solar.linear.transportpartsservice.Bus
import dev.chiksmedina.solar.linear.transportpartsservice.ElectricRefueling
import dev.chiksmedina.solar.linear.transportpartsservice.GasStation
import dev.chiksmedina.solar.linear.transportpartsservice.KickScooter
import dev.chiksmedina.solar.linear.transportpartsservice.Scooter
import dev.chiksmedina.solar.linear.transportpartsservice.ShockAbsorber
import dev.chiksmedina.solar.linear.transportpartsservice.SpedometerLow
import dev.chiksmedina.solar.linear.transportpartsservice.SpedometerMax
import dev.chiksmedina.solar.linear.transportpartsservice.SpedometerMiddle
import dev.chiksmedina.solar.linear.transportpartsservice.Suspension
import dev.chiksmedina.solar.linear.transportpartsservice.SuspensionBolt
import dev.chiksmedina.solar.linear.transportpartsservice.SuspensionCross
import dev.chiksmedina.solar.linear.transportpartsservice.Tram
import dev.chiksmedina.solar.linear.transportpartsservice.Transmission
import dev.chiksmedina.solar.linear.transportpartsservice.TransmissionCircle
import dev.chiksmedina.solar.linear.transportpartsservice.TransmissionSquare
import dev.chiksmedina.solar.linear.transportpartsservice.Wheel
import dev.chiksmedina.solar.linear.transportpartsservice.WheelAngle
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
