package com.chiksmedina.solar.outline

import androidx.compose.ui.graphics.vector.ImageVector
import com.chiksmedina.solar.OutlineGroup
import com.chiksmedina.solar.outline.homefurniture.Armchair
import com.chiksmedina.solar.outline.homefurniture.Armchair2
import com.chiksmedina.solar.outline.homefurniture.BarChair
import com.chiksmedina.solar.outline.homefurniture.Bath
import com.chiksmedina.solar.outline.homefurniture.Bed
import com.chiksmedina.solar.outline.homefurniture.BedsideTable
import com.chiksmedina.solar.outline.homefurniture.BedsideTable2
import com.chiksmedina.solar.outline.homefurniture.BedsideTable3
import com.chiksmedina.solar.outline.homefurniture.BedsideTable4
import com.chiksmedina.solar.outline.homefurniture.Chair
import com.chiksmedina.solar.outline.homefurniture.Chair2
import com.chiksmedina.solar.outline.homefurniture.Chandelier
import com.chiksmedina.solar.outline.homefurniture.Closet
import com.chiksmedina.solar.outline.homefurniture.Closet2
import com.chiksmedina.solar.outline.homefurniture.Condicioner
import com.chiksmedina.solar.outline.homefurniture.Condicioner2
import com.chiksmedina.solar.outline.homefurniture.FloorLamp
import com.chiksmedina.solar.outline.homefurniture.FloorLampMinimalistic
import com.chiksmedina.solar.outline.homefurniture.Fridge
import com.chiksmedina.solar.outline.homefurniture.Lamp
import com.chiksmedina.solar.outline.homefurniture.Mirror
import com.chiksmedina.solar.outline.homefurniture.RemoteController
import com.chiksmedina.solar.outline.homefurniture.RemoteController2
import com.chiksmedina.solar.outline.homefurniture.RemoteControllerMinimalistic
import com.chiksmedina.solar.outline.homefurniture.SmartVacuumCleaner
import com.chiksmedina.solar.outline.homefurniture.SmartVacuumCleaner2
import com.chiksmedina.solar.outline.homefurniture.Sofa
import com.chiksmedina.solar.outline.homefurniture.Sofa2
import com.chiksmedina.solar.outline.homefurniture.Sofa3
import com.chiksmedina.solar.outline.homefurniture.Speaker
import com.chiksmedina.solar.outline.homefurniture.SpeakerMinimalistic
import com.chiksmedina.solar.outline.homefurniture.Trellis
import com.chiksmedina.solar.outline.homefurniture.VolumeKnob
import com.chiksmedina.solar.outline.homefurniture.WashingMachine
import com.chiksmedina.solar.outline.homefurniture.WashingMachineMinimalistic
import kotlin.collections.List as ____KtList

public object HomeFurnitureGroup

public val OutlineGroup.HomeFurniture: HomeFurnitureGroup
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
