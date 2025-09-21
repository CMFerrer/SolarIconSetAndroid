package dev.chiksmedina.solar.linear

import androidx.compose.ui.graphics.vector.ImageVector
import dev.chiksmedina.solar.LinearSolar
import dev.chiksmedina.solar.linear.homefurniture.Armchair
import dev.chiksmedina.solar.linear.homefurniture.Armchair2
import dev.chiksmedina.solar.linear.homefurniture.BarChair
import dev.chiksmedina.solar.linear.homefurniture.Bath
import dev.chiksmedina.solar.linear.homefurniture.Bed
import dev.chiksmedina.solar.linear.homefurniture.BedsideTable
import dev.chiksmedina.solar.linear.homefurniture.BedsideTable2
import dev.chiksmedina.solar.linear.homefurniture.BedsideTable3
import dev.chiksmedina.solar.linear.homefurniture.BedsideTable4
import dev.chiksmedina.solar.linear.homefurniture.Chair
import dev.chiksmedina.solar.linear.homefurniture.Chair2
import dev.chiksmedina.solar.linear.homefurniture.Chandelier
import dev.chiksmedina.solar.linear.homefurniture.Closet
import dev.chiksmedina.solar.linear.homefurniture.Closet2
import dev.chiksmedina.solar.linear.homefurniture.Condicioner
import dev.chiksmedina.solar.linear.homefurniture.Condicioner2
import dev.chiksmedina.solar.linear.homefurniture.FloorLamp
import dev.chiksmedina.solar.linear.homefurniture.FloorLampMinimalistic
import dev.chiksmedina.solar.linear.homefurniture.Fridge
import dev.chiksmedina.solar.linear.homefurniture.Lamp
import dev.chiksmedina.solar.linear.homefurniture.Mirror
import dev.chiksmedina.solar.linear.homefurniture.RemoteController
import dev.chiksmedina.solar.linear.homefurniture.RemoteController2
import dev.chiksmedina.solar.linear.homefurniture.RemoteControllerMinimalistic
import dev.chiksmedina.solar.linear.homefurniture.SmartVacuumCleaner
import dev.chiksmedina.solar.linear.homefurniture.SmartVacuumCleaner2
import dev.chiksmedina.solar.linear.homefurniture.Sofa
import dev.chiksmedina.solar.linear.homefurniture.Sofa2
import dev.chiksmedina.solar.linear.homefurniture.Sofa3
import dev.chiksmedina.solar.linear.homefurniture.Speaker
import dev.chiksmedina.solar.linear.homefurniture.SpeakerMinimalistic
import dev.chiksmedina.solar.linear.homefurniture.Trellis
import dev.chiksmedina.solar.linear.homefurniture.VolumeKnob
import dev.chiksmedina.solar.linear.homefurniture.WashingMachine
import dev.chiksmedina.solar.linear.homefurniture.WashingMachineMinimalistic
import kotlin.collections.List as KtList

object HomeFurnitureGroup

val LinearSolar.HomeFurniture: HomeFurnitureGroup
    get() = HomeFurnitureGroup

private var _AllIcons: KtList<ImageVector>? = null

val HomeFurnitureGroup.AllIcons: KtList<ImageVector>
    get() {
        if (_AllIcons != null) {
            return _AllIcons!!
        }
        _AllIcons = listOf(
            Armchair,
            Armchair2,
            BarChair,
            Bath,
            Bed,
            BedsideTable,
            BedsideTable2,
            BedsideTable3,
            BedsideTable4,
            Chair,
            Chair2,
            Chandelier,
            Closet,
            Closet2,
            Condicioner,
            Condicioner2,
            FloorLamp,
            FloorLampMinimalistic,
            Fridge,
            Lamp,
            Mirror,
            RemoteController,
            RemoteController2,
            RemoteControllerMinimalistic,
            SmartVacuumCleaner,
            SmartVacuumCleaner2,
            Sofa,
            Sofa2,
            Sofa3,
            Speaker,
            SpeakerMinimalistic,
            Trellis,
            VolumeKnob,
            WashingMachine,
            WashingMachineMinimalistic
        )
        return _AllIcons!!
    }
