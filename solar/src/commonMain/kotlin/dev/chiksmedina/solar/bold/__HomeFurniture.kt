package dev.chiksmedina.solar.bold

import androidx.compose.ui.graphics.vector.ImageVector
import dev.chiksmedina.solar.BoldSolar
import dev.chiksmedina.solar.bold.homefurniture.Armchair
import dev.chiksmedina.solar.bold.homefurniture.Armchair2
import dev.chiksmedina.solar.bold.homefurniture.BarChair
import dev.chiksmedina.solar.bold.homefurniture.Bath
import dev.chiksmedina.solar.bold.homefurniture.Bed
import dev.chiksmedina.solar.bold.homefurniture.BedsideTable
import dev.chiksmedina.solar.bold.homefurniture.BedsideTable2
import dev.chiksmedina.solar.bold.homefurniture.BedsideTable3
import dev.chiksmedina.solar.bold.homefurniture.BedsideTable4
import dev.chiksmedina.solar.bold.homefurniture.Chair
import dev.chiksmedina.solar.bold.homefurniture.Chair2
import dev.chiksmedina.solar.bold.homefurniture.Chandelier
import dev.chiksmedina.solar.bold.homefurniture.Closet
import dev.chiksmedina.solar.bold.homefurniture.Closet2
import dev.chiksmedina.solar.bold.homefurniture.Condicioner
import dev.chiksmedina.solar.bold.homefurniture.Condicioner2
import dev.chiksmedina.solar.bold.homefurniture.FloorLamp
import dev.chiksmedina.solar.bold.homefurniture.FloorLampMinimalistic
import dev.chiksmedina.solar.bold.homefurniture.Fridge
import dev.chiksmedina.solar.bold.homefurniture.Lamp
import dev.chiksmedina.solar.bold.homefurniture.Mirror
import dev.chiksmedina.solar.bold.homefurniture.RemoteController
import dev.chiksmedina.solar.bold.homefurniture.RemoteController2
import dev.chiksmedina.solar.bold.homefurniture.RemoteControllerMinimalistic
import dev.chiksmedina.solar.bold.homefurniture.SmartVacuumCleaner
import dev.chiksmedina.solar.bold.homefurniture.SmartVacuumCleaner2
import dev.chiksmedina.solar.bold.homefurniture.Sofa
import dev.chiksmedina.solar.bold.homefurniture.Sofa2
import dev.chiksmedina.solar.bold.homefurniture.Sofa3
import dev.chiksmedina.solar.bold.homefurniture.Speaker
import dev.chiksmedina.solar.bold.homefurniture.SpeakerMinimalistic
import dev.chiksmedina.solar.bold.homefurniture.Trellis
import dev.chiksmedina.solar.bold.homefurniture.VolumeKnob
import dev.chiksmedina.solar.bold.homefurniture.WashingMachine
import dev.chiksmedina.solar.bold.homefurniture.WashingMachineMinimalistic
import kotlin.collections.List as KtList

object HomeFurnitureGroup

val BoldSolar.HomeFurniture: HomeFurnitureGroup
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
