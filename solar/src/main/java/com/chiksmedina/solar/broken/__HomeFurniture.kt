package com.chiksmedina.solar.broken

import androidx.compose.ui.graphics.vector.ImageVector
import com.chiksmedina.solar.BrokenGroup
import com.chiksmedina.solar.broken.homefurniture.Armchair
import com.chiksmedina.solar.broken.homefurniture.Armchair2
import com.chiksmedina.solar.broken.homefurniture.BarChair
import com.chiksmedina.solar.broken.homefurniture.Bath
import com.chiksmedina.solar.broken.homefurniture.Bed
import com.chiksmedina.solar.broken.homefurniture.BedsideTable
import com.chiksmedina.solar.broken.homefurniture.BedsideTable2
import com.chiksmedina.solar.broken.homefurniture.BedsideTable3
import com.chiksmedina.solar.broken.homefurniture.BedsideTable4
import com.chiksmedina.solar.broken.homefurniture.Chair
import com.chiksmedina.solar.broken.homefurniture.Chair2
import com.chiksmedina.solar.broken.homefurniture.Chandelier
import com.chiksmedina.solar.broken.homefurniture.Closet
import com.chiksmedina.solar.broken.homefurniture.Closet2
import com.chiksmedina.solar.broken.homefurniture.Condicioner
import com.chiksmedina.solar.broken.homefurniture.Condicioner2
import com.chiksmedina.solar.broken.homefurniture.FloorLamp
import com.chiksmedina.solar.broken.homefurniture.FloorLampMinimalistic
import com.chiksmedina.solar.broken.homefurniture.Fridge
import com.chiksmedina.solar.broken.homefurniture.Lamp
import com.chiksmedina.solar.broken.homefurniture.Mirror
import com.chiksmedina.solar.broken.homefurniture.RemoteController
import com.chiksmedina.solar.broken.homefurniture.RemoteController2
import com.chiksmedina.solar.broken.homefurniture.RemoteControllerMinimalistic
import com.chiksmedina.solar.broken.homefurniture.SmartVacuumCleaner
import com.chiksmedina.solar.broken.homefurniture.SmartVacuumCleaner2
import com.chiksmedina.solar.broken.homefurniture.Sofa
import com.chiksmedina.solar.broken.homefurniture.Sofa2
import com.chiksmedina.solar.broken.homefurniture.Sofa3
import com.chiksmedina.solar.broken.homefurniture.Speaker
import com.chiksmedina.solar.broken.homefurniture.SpeakerMinimalistic
import com.chiksmedina.solar.broken.homefurniture.Trellis
import com.chiksmedina.solar.broken.homefurniture.VolumeKnob
import com.chiksmedina.solar.broken.homefurniture.WashingMachine
import com.chiksmedina.solar.broken.homefurniture.WashingMachineMinimalistic
import kotlin.collections.List as ____KtList

public object HomeFurnitureGroup

public val BrokenGroup.HomeFurniture: HomeFurnitureGroup
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
