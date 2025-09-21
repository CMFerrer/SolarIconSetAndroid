package dev.chiksmedina.solar.boldduotone

import androidx.compose.ui.graphics.vector.ImageVector
import dev.chiksmedina.solar.BoldDuotoneSolar
import dev.chiksmedina.solar.boldduotone.homefurniture.Armchair
import dev.chiksmedina.solar.boldduotone.homefurniture.Armchair2
import dev.chiksmedina.solar.boldduotone.homefurniture.BarChair
import dev.chiksmedina.solar.boldduotone.homefurniture.Bath
import dev.chiksmedina.solar.boldduotone.homefurniture.Bed
import dev.chiksmedina.solar.boldduotone.homefurniture.BedsideTable
import dev.chiksmedina.solar.boldduotone.homefurniture.BedsideTable2
import dev.chiksmedina.solar.boldduotone.homefurniture.BedsideTable3
import dev.chiksmedina.solar.boldduotone.homefurniture.BedsideTable4
import dev.chiksmedina.solar.boldduotone.homefurniture.Chair
import dev.chiksmedina.solar.boldduotone.homefurniture.Chair2
import dev.chiksmedina.solar.boldduotone.homefurniture.Chandelier
import dev.chiksmedina.solar.boldduotone.homefurniture.Closet
import dev.chiksmedina.solar.boldduotone.homefurniture.Closet2
import dev.chiksmedina.solar.boldduotone.homefurniture.Condicioner
import dev.chiksmedina.solar.boldduotone.homefurniture.Condicioner2
import dev.chiksmedina.solar.boldduotone.homefurniture.FloorLamp
import dev.chiksmedina.solar.boldduotone.homefurniture.FloorLampMinimalistic
import dev.chiksmedina.solar.boldduotone.homefurniture.Fridge
import dev.chiksmedina.solar.boldduotone.homefurniture.Lamp
import dev.chiksmedina.solar.boldduotone.homefurniture.Mirror
import dev.chiksmedina.solar.boldduotone.homefurniture.RemoteController
import dev.chiksmedina.solar.boldduotone.homefurniture.RemoteController2
import dev.chiksmedina.solar.boldduotone.homefurniture.RemoteControllerMinimalistic
import dev.chiksmedina.solar.boldduotone.homefurniture.SmartVacuumCleaner
import dev.chiksmedina.solar.boldduotone.homefurniture.SmartVacuumCleaner2
import dev.chiksmedina.solar.boldduotone.homefurniture.Sofa
import dev.chiksmedina.solar.boldduotone.homefurniture.Sofa2
import dev.chiksmedina.solar.boldduotone.homefurniture.Sofa3
import dev.chiksmedina.solar.boldduotone.homefurniture.Speaker
import dev.chiksmedina.solar.boldduotone.homefurniture.SpeakerMinimalistic
import dev.chiksmedina.solar.boldduotone.homefurniture.Trellis
import dev.chiksmedina.solar.boldduotone.homefurniture.VolumeKnob
import dev.chiksmedina.solar.boldduotone.homefurniture.WashingMachine
import dev.chiksmedina.solar.boldduotone.homefurniture.WashingMachineMinimalistic
import kotlin.collections.List as KtList

object HomeFurnitureGroup

val BoldDuotoneSolar.HomeFurniture: HomeFurnitureGroup
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
