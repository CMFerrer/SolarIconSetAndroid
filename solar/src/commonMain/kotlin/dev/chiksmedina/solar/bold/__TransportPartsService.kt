package dev.chiksmedina.solar.bold

import androidx.compose.ui.graphics.vector.ImageVector
import dev.chiksmedina.solar.BoldSolar
import dev.chiksmedina.solar.bold.transportpartsservice.Accumulator
import dev.chiksmedina.solar.bold.transportpartsservice.Bus
import dev.chiksmedina.solar.bold.transportpartsservice.ElectricRefueling
import dev.chiksmedina.solar.bold.transportpartsservice.GasStation
import dev.chiksmedina.solar.bold.transportpartsservice.KickScooter
import dev.chiksmedina.solar.bold.transportpartsservice.Scooter
import dev.chiksmedina.solar.bold.transportpartsservice.ShockAbsorber
import dev.chiksmedina.solar.bold.transportpartsservice.SpedometerLow
import dev.chiksmedina.solar.bold.transportpartsservice.SpedometerMax
import dev.chiksmedina.solar.bold.transportpartsservice.SpedometerMiddle
import dev.chiksmedina.solar.bold.transportpartsservice.Suspension
import dev.chiksmedina.solar.bold.transportpartsservice.SuspensionBolt
import dev.chiksmedina.solar.bold.transportpartsservice.SuspensionCross
import dev.chiksmedina.solar.bold.transportpartsservice.Tram
import dev.chiksmedina.solar.bold.transportpartsservice.Transmission
import dev.chiksmedina.solar.bold.transportpartsservice.TransmissionCircle
import dev.chiksmedina.solar.bold.transportpartsservice.TransmissionSquare
import dev.chiksmedina.solar.bold.transportpartsservice.Wheel
import dev.chiksmedina.solar.bold.transportpartsservice.WheelAngle
import kotlin.collections.List as KtList

object TransportPartsServiceGroup

val BoldSolar.TransportPartsService: TransportPartsServiceGroup
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
