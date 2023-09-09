package com.chiksmedina.solar.bold

import androidx.compose.ui.graphics.vector.ImageVector
import com.chiksmedina.solar.BoldGroup
import com.chiksmedina.solar.bold.homefurniture.Armchair
import com.chiksmedina.solar.bold.homefurniture.Armchair2
import com.chiksmedina.solar.bold.homefurniture.BarChair
import com.chiksmedina.solar.bold.homefurniture.Bath
import com.chiksmedina.solar.bold.homefurniture.Bed
import com.chiksmedina.solar.bold.homefurniture.BedsideTable
import com.chiksmedina.solar.bold.homefurniture.BedsideTable2
import com.chiksmedina.solar.bold.homefurniture.BedsideTable3
import com.chiksmedina.solar.bold.homefurniture.BedsideTable4
import com.chiksmedina.solar.bold.homefurniture.Chair
import com.chiksmedina.solar.bold.homefurniture.Chair2
import com.chiksmedina.solar.bold.homefurniture.Chandelier
import com.chiksmedina.solar.bold.homefurniture.Closet
import com.chiksmedina.solar.bold.homefurniture.Closet2
import com.chiksmedina.solar.bold.homefurniture.Condicioner
import com.chiksmedina.solar.bold.homefurniture.Condicioner2
import com.chiksmedina.solar.bold.homefurniture.FloorLamp
import com.chiksmedina.solar.bold.homefurniture.FloorLampMinimalistic
import com.chiksmedina.solar.bold.homefurniture.Fridge
import com.chiksmedina.solar.bold.homefurniture.Lamp
import com.chiksmedina.solar.bold.homefurniture.Mirror
import com.chiksmedina.solar.bold.homefurniture.RemoteController
import com.chiksmedina.solar.bold.homefurniture.RemoteController2
import com.chiksmedina.solar.bold.homefurniture.RemoteControllerMinimalistic
import com.chiksmedina.solar.bold.homefurniture.SmartVacuumCleaner
import com.chiksmedina.solar.bold.homefurniture.SmartVacuumCleaner2
import com.chiksmedina.solar.bold.homefurniture.Sofa
import com.chiksmedina.solar.bold.homefurniture.Sofa2
import com.chiksmedina.solar.bold.homefurniture.Sofa3
import com.chiksmedina.solar.bold.homefurniture.Speaker
import com.chiksmedina.solar.bold.homefurniture.SpeakerMinimalistic
import com.chiksmedina.solar.bold.homefurniture.Trellis
import com.chiksmedina.solar.bold.homefurniture.VolumeKnob
import com.chiksmedina.solar.bold.homefurniture.WashingMachine
import com.chiksmedina.solar.bold.homefurniture.WashingMachineMinimalistic
import kotlin.collections.List as ____KtList

public object HomeFurnitureGroup

public val BoldGroup.HomeFurniture: HomeFurnitureGroup
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
