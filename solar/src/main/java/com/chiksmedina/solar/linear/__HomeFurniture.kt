package com.chiksmedina.solar.linear

import androidx.compose.ui.graphics.vector.ImageVector
import com.chiksmedina.solar.LinearSolar
import com.chiksmedina.solar.linear.homefurniture.Armchair
import com.chiksmedina.solar.linear.homefurniture.Armchair2
import com.chiksmedina.solar.linear.homefurniture.BarChair
import com.chiksmedina.solar.linear.homefurniture.Bath
import com.chiksmedina.solar.linear.homefurniture.Bed
import com.chiksmedina.solar.linear.homefurniture.BedsideTable
import com.chiksmedina.solar.linear.homefurniture.BedsideTable2
import com.chiksmedina.solar.linear.homefurniture.BedsideTable3
import com.chiksmedina.solar.linear.homefurniture.BedsideTable4
import com.chiksmedina.solar.linear.homefurniture.Chair
import com.chiksmedina.solar.linear.homefurniture.Chair2
import com.chiksmedina.solar.linear.homefurniture.Chandelier
import com.chiksmedina.solar.linear.homefurniture.Closet
import com.chiksmedina.solar.linear.homefurniture.Closet2
import com.chiksmedina.solar.linear.homefurniture.Condicioner
import com.chiksmedina.solar.linear.homefurniture.Condicioner2
import com.chiksmedina.solar.linear.homefurniture.FloorLamp
import com.chiksmedina.solar.linear.homefurniture.FloorLampMinimalistic
import com.chiksmedina.solar.linear.homefurniture.Fridge
import com.chiksmedina.solar.linear.homefurniture.Lamp
import com.chiksmedina.solar.linear.homefurniture.Mirror
import com.chiksmedina.solar.linear.homefurniture.RemoteController
import com.chiksmedina.solar.linear.homefurniture.RemoteController2
import com.chiksmedina.solar.linear.homefurniture.RemoteControllerMinimalistic
import com.chiksmedina.solar.linear.homefurniture.SmartVacuumCleaner
import com.chiksmedina.solar.linear.homefurniture.SmartVacuumCleaner2
import com.chiksmedina.solar.linear.homefurniture.Sofa
import com.chiksmedina.solar.linear.homefurniture.Sofa2
import com.chiksmedina.solar.linear.homefurniture.Sofa3
import com.chiksmedina.solar.linear.homefurniture.Speaker
import com.chiksmedina.solar.linear.homefurniture.SpeakerMinimalistic
import com.chiksmedina.solar.linear.homefurniture.Trellis
import com.chiksmedina.solar.linear.homefurniture.VolumeKnob
import com.chiksmedina.solar.linear.homefurniture.WashingMachine
import com.chiksmedina.solar.linear.homefurniture.WashingMachineMinimalistic
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
