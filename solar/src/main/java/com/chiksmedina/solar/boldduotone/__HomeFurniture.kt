package com.chiksmedina.solar.boldduotone

import androidx.compose.ui.graphics.vector.ImageVector
import com.chiksmedina.solar.BoldduotoneGroup
import com.chiksmedina.solar.boldduotone.homefurniture.Armchair
import com.chiksmedina.solar.boldduotone.homefurniture.Armchair2
import com.chiksmedina.solar.boldduotone.homefurniture.BarChair
import com.chiksmedina.solar.boldduotone.homefurniture.Bath
import com.chiksmedina.solar.boldduotone.homefurniture.Bed
import com.chiksmedina.solar.boldduotone.homefurniture.BedsideTable
import com.chiksmedina.solar.boldduotone.homefurniture.BedsideTable2
import com.chiksmedina.solar.boldduotone.homefurniture.BedsideTable3
import com.chiksmedina.solar.boldduotone.homefurniture.BedsideTable4
import com.chiksmedina.solar.boldduotone.homefurniture.Chair
import com.chiksmedina.solar.boldduotone.homefurniture.Chair2
import com.chiksmedina.solar.boldduotone.homefurniture.Chandelier
import com.chiksmedina.solar.boldduotone.homefurniture.Closet
import com.chiksmedina.solar.boldduotone.homefurniture.Closet2
import com.chiksmedina.solar.boldduotone.homefurniture.Condicioner
import com.chiksmedina.solar.boldduotone.homefurniture.Condicioner2
import com.chiksmedina.solar.boldduotone.homefurniture.FloorLamp
import com.chiksmedina.solar.boldduotone.homefurniture.FloorLampMinimalistic
import com.chiksmedina.solar.boldduotone.homefurniture.Fridge
import com.chiksmedina.solar.boldduotone.homefurniture.Lamp
import com.chiksmedina.solar.boldduotone.homefurniture.Mirror
import com.chiksmedina.solar.boldduotone.homefurniture.RemoteController
import com.chiksmedina.solar.boldduotone.homefurniture.RemoteController2
import com.chiksmedina.solar.boldduotone.homefurniture.RemoteControllerMinimalistic
import com.chiksmedina.solar.boldduotone.homefurniture.SmartVacuumCleaner
import com.chiksmedina.solar.boldduotone.homefurniture.SmartVacuumCleaner2
import com.chiksmedina.solar.boldduotone.homefurniture.Sofa
import com.chiksmedina.solar.boldduotone.homefurniture.Sofa2
import com.chiksmedina.solar.boldduotone.homefurniture.Sofa3
import com.chiksmedina.solar.boldduotone.homefurniture.Speaker
import com.chiksmedina.solar.boldduotone.homefurniture.SpeakerMinimalistic
import com.chiksmedina.solar.boldduotone.homefurniture.Trellis
import com.chiksmedina.solar.boldduotone.homefurniture.VolumeKnob
import com.chiksmedina.solar.boldduotone.homefurniture.WashingMachine
import com.chiksmedina.solar.boldduotone.homefurniture.WashingMachineMinimalistic
import kotlin.collections.List as ____KtList

public object HomeFurnitureGroup

public val BoldduotoneGroup.HomeFurniture: HomeFurnitureGroup
  get() = HomeFurnitureGroup

private var __AllIcons: ____KtList<ImageVector>? = null

public val HomeFurnitureGroup.AllIcons: ____KtList<ImageVector>
  get() {
    if (__AllIcons != null) {
      return __AllIcons!!
    }
    __AllIcons= listOf(Armchair, Armchair2, BarChair, Bath, Bed, BedsideTable, BedsideTable2,
        BedsideTable3, BedsideTable4, Chair, Chair2, Chandelier, Closet, Closet2, Condicioner,
        Condicioner2, FloorLamp, FloorLampMinimalistic, Fridge, Lamp, Mirror, RemoteController,
        RemoteController2, RemoteControllerMinimalistic, SmartVacuumCleaner, SmartVacuumCleaner2,
        Sofa, Sofa2, Sofa3, Speaker, SpeakerMinimalistic, Trellis, VolumeKnob, WashingMachine,
        WashingMachineMinimalistic)
    return __AllIcons!!
  }
