package dev.chiksmedina.solar.broken

import androidx.compose.ui.graphics.vector.ImageVector
import dev.chiksmedina.solar.BrokenSolar
import dev.chiksmedina.solar.broken.homefurniture.Armchair
import dev.chiksmedina.solar.broken.homefurniture.Armchair2
import dev.chiksmedina.solar.broken.homefurniture.BarChair
import dev.chiksmedina.solar.broken.homefurniture.Bath
import dev.chiksmedina.solar.broken.homefurniture.Bed
import dev.chiksmedina.solar.broken.homefurniture.BedsideTable
import dev.chiksmedina.solar.broken.homefurniture.BedsideTable2
import dev.chiksmedina.solar.broken.homefurniture.BedsideTable3
import dev.chiksmedina.solar.broken.homefurniture.BedsideTable4
import dev.chiksmedina.solar.broken.homefurniture.Chair
import dev.chiksmedina.solar.broken.homefurniture.Chair2
import dev.chiksmedina.solar.broken.homefurniture.Chandelier
import dev.chiksmedina.solar.broken.homefurniture.Closet
import dev.chiksmedina.solar.broken.homefurniture.Closet2
import dev.chiksmedina.solar.broken.homefurniture.Condicioner
import dev.chiksmedina.solar.broken.homefurniture.Condicioner2
import dev.chiksmedina.solar.broken.homefurniture.FloorLamp
import dev.chiksmedina.solar.broken.homefurniture.FloorLampMinimalistic
import dev.chiksmedina.solar.broken.homefurniture.Fridge
import dev.chiksmedina.solar.broken.homefurniture.Lamp
import dev.chiksmedina.solar.broken.homefurniture.Mirror
import dev.chiksmedina.solar.broken.homefurniture.RemoteController
import dev.chiksmedina.solar.broken.homefurniture.RemoteController2
import dev.chiksmedina.solar.broken.homefurniture.RemoteControllerMinimalistic
import dev.chiksmedina.solar.broken.homefurniture.SmartVacuumCleaner
import dev.chiksmedina.solar.broken.homefurniture.SmartVacuumCleaner2
import dev.chiksmedina.solar.broken.homefurniture.Sofa
import dev.chiksmedina.solar.broken.homefurniture.Sofa2
import dev.chiksmedina.solar.broken.homefurniture.Sofa3
import dev.chiksmedina.solar.broken.homefurniture.Speaker
import dev.chiksmedina.solar.broken.homefurniture.SpeakerMinimalistic
import dev.chiksmedina.solar.broken.homefurniture.Trellis
import dev.chiksmedina.solar.broken.homefurniture.VolumeKnob
import dev.chiksmedina.solar.broken.homefurniture.WashingMachine
import dev.chiksmedina.solar.broken.homefurniture.WashingMachineMinimalistic
import kotlin.collections.List as KtList

object HomeFurnitureGroup

val BrokenSolar.HomeFurniture: HomeFurnitureGroup
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
