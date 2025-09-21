package dev.chiksmedina.solar.lineduotone

import androidx.compose.ui.graphics.vector.ImageVector
import dev.chiksmedina.solar.LineDuotoneSolar
import dev.chiksmedina.solar.lineduotone.homefurniture.Armchair
import dev.chiksmedina.solar.lineduotone.homefurniture.Armchair2
import dev.chiksmedina.solar.lineduotone.homefurniture.BarChair
import dev.chiksmedina.solar.lineduotone.homefurniture.Bath
import dev.chiksmedina.solar.lineduotone.homefurniture.Bed
import dev.chiksmedina.solar.lineduotone.homefurniture.BedsideTable
import dev.chiksmedina.solar.lineduotone.homefurniture.BedsideTable2
import dev.chiksmedina.solar.lineduotone.homefurniture.BedsideTable3
import dev.chiksmedina.solar.lineduotone.homefurniture.BedsideTable4
import dev.chiksmedina.solar.lineduotone.homefurniture.Chair
import dev.chiksmedina.solar.lineduotone.homefurniture.Chair2
import dev.chiksmedina.solar.lineduotone.homefurniture.Chandelier
import dev.chiksmedina.solar.lineduotone.homefurniture.Closet
import dev.chiksmedina.solar.lineduotone.homefurniture.Closet2
import dev.chiksmedina.solar.lineduotone.homefurniture.Condicioner
import dev.chiksmedina.solar.lineduotone.homefurniture.Condicioner2
import dev.chiksmedina.solar.lineduotone.homefurniture.FloorLamp
import dev.chiksmedina.solar.lineduotone.homefurniture.FloorLampMinimalistic
import dev.chiksmedina.solar.lineduotone.homefurniture.Fridge
import dev.chiksmedina.solar.lineduotone.homefurniture.Lamp
import dev.chiksmedina.solar.lineduotone.homefurniture.Mirror
import dev.chiksmedina.solar.lineduotone.homefurniture.RemoteController
import dev.chiksmedina.solar.lineduotone.homefurniture.RemoteController2
import dev.chiksmedina.solar.lineduotone.homefurniture.RemoteControllerMinimalistic
import dev.chiksmedina.solar.lineduotone.homefurniture.SmartVacuumCleaner
import dev.chiksmedina.solar.lineduotone.homefurniture.SmartVacuumCleaner2
import dev.chiksmedina.solar.lineduotone.homefurniture.Sofa
import dev.chiksmedina.solar.lineduotone.homefurniture.Sofa2
import dev.chiksmedina.solar.lineduotone.homefurniture.Sofa3
import dev.chiksmedina.solar.lineduotone.homefurniture.Speaker
import dev.chiksmedina.solar.lineduotone.homefurniture.SpeakerMinimalistic
import dev.chiksmedina.solar.lineduotone.homefurniture.Trellis
import dev.chiksmedina.solar.lineduotone.homefurniture.VolumeKnob
import dev.chiksmedina.solar.lineduotone.homefurniture.WashingMachine
import dev.chiksmedina.solar.lineduotone.homefurniture.WashingMachineMinimalistic
import kotlin.collections.List as KtList

object HomeFurnitureGroup

val LineDuotoneSolar.HomeFurniture: HomeFurnitureGroup
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
