package com.chiksmedina.solar.broken

import androidx.compose.ui.graphics.vector.ImageVector
import com.chiksmedina.solar.BrokenGroup
import com.chiksmedina.solar.broken.designtools.AlignBottom
import com.chiksmedina.solar.broken.designtools.AlignHorizontaSpacing
import com.chiksmedina.solar.broken.designtools.AlignHorizontalCenter
import com.chiksmedina.solar.broken.designtools.AlignLeft
import com.chiksmedina.solar.broken.designtools.AlignRight
import com.chiksmedina.solar.broken.designtools.AlignTop
import com.chiksmedina.solar.broken.designtools.AlignVerticalCenter
import com.chiksmedina.solar.broken.designtools.AlignVerticalSpacing
import com.chiksmedina.solar.broken.designtools.ColourTuneing
import com.chiksmedina.solar.broken.designtools.Crop
import com.chiksmedina.solar.broken.designtools.CropMinimalistic
import com.chiksmedina.solar.broken.designtools.Filters
import com.chiksmedina.solar.broken.designtools.FlipHorizontal
import com.chiksmedina.solar.broken.designtools.FlipVertical
import com.chiksmedina.solar.broken.designtools.Layers
import com.chiksmedina.solar.broken.designtools.LayersMinimalistic
import com.chiksmedina.solar.broken.designtools.MirrorLeft
import com.chiksmedina.solar.broken.designtools.MirrorRight
import com.chiksmedina.solar.broken.designtools.PaintRoller
import com.chiksmedina.solar.broken.designtools.Palette
import com.chiksmedina.solar.broken.designtools.PaletteRound
import com.chiksmedina.solar.broken.designtools.Pallete2
import com.chiksmedina.solar.broken.designtools.Pipette
import com.chiksmedina.solar.broken.designtools.RadialBlur
import com.chiksmedina.solar.broken.designtools.Ruler
import com.chiksmedina.solar.broken.designtools.RulerAngular
import com.chiksmedina.solar.broken.designtools.RulerCrossPen
import com.chiksmedina.solar.broken.designtools.RulerPen
import com.chiksmedina.solar.broken.designtools.ThreeSquares
import kotlin.collections.List as ____KtList

public object DesignToolsGroup

public val BrokenGroup.DesignTools: DesignToolsGroup
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
