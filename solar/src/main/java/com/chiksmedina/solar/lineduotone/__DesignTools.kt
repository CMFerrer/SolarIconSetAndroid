package com.chiksmedina.solar.lineduotone

import androidx.compose.ui.graphics.vector.ImageVector
import com.chiksmedina.solar.LineduotoneGroup
import com.chiksmedina.solar.lineduotone.designtools.AlignBottom
import com.chiksmedina.solar.lineduotone.designtools.AlignHorizontaSpacing
import com.chiksmedina.solar.lineduotone.designtools.AlignHorizontalCenter
import com.chiksmedina.solar.lineduotone.designtools.AlignLeft
import com.chiksmedina.solar.lineduotone.designtools.AlignRight
import com.chiksmedina.solar.lineduotone.designtools.AlignTop
import com.chiksmedina.solar.lineduotone.designtools.AlignVerticalCenter
import com.chiksmedina.solar.lineduotone.designtools.AlignVerticalSpacing
import com.chiksmedina.solar.lineduotone.designtools.ColourTuneing
import com.chiksmedina.solar.lineduotone.designtools.Crop
import com.chiksmedina.solar.lineduotone.designtools.CropMinimalistic
import com.chiksmedina.solar.lineduotone.designtools.Filters
import com.chiksmedina.solar.lineduotone.designtools.FlipHorizontal
import com.chiksmedina.solar.lineduotone.designtools.FlipVertical
import com.chiksmedina.solar.lineduotone.designtools.Layers
import com.chiksmedina.solar.lineduotone.designtools.LayersMinimalistic
import com.chiksmedina.solar.lineduotone.designtools.MirrorLeft
import com.chiksmedina.solar.lineduotone.designtools.MirrorRight
import com.chiksmedina.solar.lineduotone.designtools.PaintRoller
import com.chiksmedina.solar.lineduotone.designtools.Palette
import com.chiksmedina.solar.lineduotone.designtools.PaletteRound
import com.chiksmedina.solar.lineduotone.designtools.Pallete2
import com.chiksmedina.solar.lineduotone.designtools.Pipette
import com.chiksmedina.solar.lineduotone.designtools.RadialBlur
import com.chiksmedina.solar.lineduotone.designtools.Ruler
import com.chiksmedina.solar.lineduotone.designtools.RulerAngular
import com.chiksmedina.solar.lineduotone.designtools.RulerCrossPen
import com.chiksmedina.solar.lineduotone.designtools.RulerPen
import com.chiksmedina.solar.lineduotone.designtools.ThreeSquares
import kotlin.collections.List as ____KtList

public object DesignToolsGroup

public val LineduotoneGroup.DesignTools: DesignToolsGroup
  get() = DesignToolsGroup

private var __AllIcons: ____KtList<ImageVector>? = null

public val DesignToolsGroup.AllIcons: ____KtList<ImageVector>
  get() {
    if (__AllIcons != null) {
      return __AllIcons!!
    }
    __AllIcons= listOf(AlignBottom, AlignHorizontalCenter, AlignHorizontaSpacing, AlignLeft,
        AlignRight, AlignTop, AlignVerticalCenter, AlignVerticalSpacing, ColourTuneing, Crop,
        CropMinimalistic, Filters, FlipHorizontal, FlipVertical, Layers, LayersMinimalistic,
        MirrorLeft, MirrorRight, PaintRoller, Palette, PaletteRound, Pallete2, Pipette, RadialBlur,
        Ruler, RulerAngular, RulerCrossPen, RulerPen, ThreeSquares)
    return __AllIcons!!
  }
