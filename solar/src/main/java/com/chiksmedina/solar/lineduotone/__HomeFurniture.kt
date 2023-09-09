package com.chiksmedina.solar.lineduotone

import androidx.compose.ui.graphics.vector.ImageVector
import com.chiksmedina.solar.LineduotoneGroup
import com.chiksmedina.solar.lineduotone.homefurniture.Armchair
import com.chiksmedina.solar.lineduotone.homefurniture.Armchair2
import com.chiksmedina.solar.lineduotone.homefurniture.BarChair
import com.chiksmedina.solar.lineduotone.homefurniture.Bath
import com.chiksmedina.solar.lineduotone.homefurniture.Bed
import com.chiksmedina.solar.lineduotone.homefurniture.BedsideTable
import com.chiksmedina.solar.lineduotone.homefurniture.BedsideTable2
import com.chiksmedina.solar.lineduotone.homefurniture.BedsideTable3
import com.chiksmedina.solar.lineduotone.homefurniture.BedsideTable4
import com.chiksmedina.solar.lineduotone.homefurniture.Chair
import com.chiksmedina.solar.lineduotone.homefurniture.Chair2
import com.chiksmedina.solar.lineduotone.homefurniture.Chandelier
import com.chiksmedina.solar.lineduotone.homefurniture.Closet
import com.chiksmedina.solar.lineduotone.homefurniture.Closet2
import com.chiksmedina.solar.lineduotone.homefurniture.Condicioner
import com.chiksmedina.solar.lineduotone.homefurniture.Condicioner2
import com.chiksmedina.solar.lineduotone.homefurniture.FloorLamp
import com.chiksmedina.solar.lineduotone.homefurniture.FloorLampMinimalistic
import com.chiksmedina.solar.lineduotone.homefurniture.Fridge
import com.chiksmedina.solar.lineduotone.homefurniture.Lamp
import com.chiksmedina.solar.lineduotone.homefurniture.Mirror
import com.chiksmedina.solar.lineduotone.homefurniture.RemoteController
import com.chiksmedina.solar.lineduotone.homefurniture.RemoteController2
import com.chiksmedina.solar.lineduotone.homefurniture.RemoteControllerMinimalistic
import com.chiksmedina.solar.lineduotone.homefurniture.SmartVacuumCleaner
import com.chiksmedina.solar.lineduotone.homefurniture.SmartVacuumCleaner2
import com.chiksmedina.solar.lineduotone.homefurniture.Sofa
import com.chiksmedina.solar.lineduotone.homefurniture.Sofa2
import com.chiksmedina.solar.lineduotone.homefurniture.Sofa3
import com.chiksmedina.solar.lineduotone.homefurniture.Speaker
import com.chiksmedina.solar.lineduotone.homefurniture.SpeakerMinimalistic
import com.chiksmedina.solar.lineduotone.homefurniture.Trellis
import com.chiksmedina.solar.lineduotone.homefurniture.VolumeKnob
import com.chiksmedina.solar.lineduotone.homefurniture.WashingMachine
import com.chiksmedina.solar.lineduotone.homefurniture.WashingMachineMinimalistic
import kotlin.collections.List as ____KtList

public object HomeFurnitureGroup

public val LineduotoneGroup.HomeFurniture: HomeFurnitureGroup
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
