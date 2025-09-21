package dev.chiksmedina.solar.outline

import androidx.compose.ui.graphics.vector.ImageVector
import dev.chiksmedina.solar.OutlineSolar
import dev.chiksmedina.solar.outline.homefurniture.Armchair
import dev.chiksmedina.solar.outline.homefurniture.Armchair2
import dev.chiksmedina.solar.outline.homefurniture.BarChair
import dev.chiksmedina.solar.outline.homefurniture.Bath
import dev.chiksmedina.solar.outline.homefurniture.Bed
import dev.chiksmedina.solar.outline.homefurniture.BedsideTable
import dev.chiksmedina.solar.outline.homefurniture.BedsideTable2
import dev.chiksmedina.solar.outline.homefurniture.BedsideTable3
import dev.chiksmedina.solar.outline.homefurniture.BedsideTable4
import dev.chiksmedina.solar.outline.homefurniture.Chair
import dev.chiksmedina.solar.outline.homefurniture.Chair2
import dev.chiksmedina.solar.outline.homefurniture.Chandelier
import dev.chiksmedina.solar.outline.homefurniture.Closet
import dev.chiksmedina.solar.outline.homefurniture.Closet2
import dev.chiksmedina.solar.outline.homefurniture.Condicioner
import dev.chiksmedina.solar.outline.homefurniture.Condicioner2
import dev.chiksmedina.solar.outline.homefurniture.FloorLamp
import dev.chiksmedina.solar.outline.homefurniture.FloorLampMinimalistic
import dev.chiksmedina.solar.outline.homefurniture.Fridge
import dev.chiksmedina.solar.outline.homefurniture.Lamp
import dev.chiksmedina.solar.outline.homefurniture.Mirror
import dev.chiksmedina.solar.outline.homefurniture.RemoteController
import dev.chiksmedina.solar.outline.homefurniture.RemoteController2
import dev.chiksmedina.solar.outline.homefurniture.RemoteControllerMinimalistic
import dev.chiksmedina.solar.outline.homefurniture.SmartVacuumCleaner
import dev.chiksmedina.solar.outline.homefurniture.SmartVacuumCleaner2
import dev.chiksmedina.solar.outline.homefurniture.Sofa
import dev.chiksmedina.solar.outline.homefurniture.Sofa2
import dev.chiksmedina.solar.outline.homefurniture.Sofa3
import dev.chiksmedina.solar.outline.homefurniture.Speaker
import dev.chiksmedina.solar.outline.homefurniture.SpeakerMinimalistic
import dev.chiksmedina.solar.outline.homefurniture.Trellis
import dev.chiksmedina.solar.outline.homefurniture.VolumeKnob
import dev.chiksmedina.solar.outline.homefurniture.WashingMachine
import dev.chiksmedina.solar.outline.homefurniture.WashingMachineMinimalistic
import kotlin.collections.List as KtList

object HomeFurnitureGroup

val OutlineSolar.HomeFurniture: HomeFurnitureGroup
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
