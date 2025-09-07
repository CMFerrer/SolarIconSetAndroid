package com.chiksmedina.solar.linear

import androidx.compose.ui.graphics.vector.ImageVector
import com.chiksmedina.solar.LinearSolar
import com.chiksmedina.solar.linear.designtools.AlignBottom
import com.chiksmedina.solar.linear.designtools.AlignHorizontaSpacing
import com.chiksmedina.solar.linear.designtools.AlignHorizontalCenter
import com.chiksmedina.solar.linear.designtools.AlignLeft
import com.chiksmedina.solar.linear.designtools.AlignRight
import com.chiksmedina.solar.linear.designtools.AlignTop
import com.chiksmedina.solar.linear.designtools.AlignVerticalCenter
import com.chiksmedina.solar.linear.designtools.AlignVerticalSpacing
import com.chiksmedina.solar.linear.designtools.ColourTuneing
import com.chiksmedina.solar.linear.designtools.Crop
import com.chiksmedina.solar.linear.designtools.CropMinimalistic
import com.chiksmedina.solar.linear.designtools.Filters
import com.chiksmedina.solar.linear.designtools.FlipHorizontal
import com.chiksmedina.solar.linear.designtools.FlipVertical
import com.chiksmedina.solar.linear.designtools.Layers
import com.chiksmedina.solar.linear.designtools.LayersMinimalistic
import com.chiksmedina.solar.linear.designtools.MirrorLeft
import com.chiksmedina.solar.linear.designtools.MirrorRight
import com.chiksmedina.solar.linear.designtools.PaintRoller
import com.chiksmedina.solar.linear.designtools.Palette
import com.chiksmedina.solar.linear.designtools.PaletteRound
import com.chiksmedina.solar.linear.designtools.Pallete2
import com.chiksmedina.solar.linear.designtools.Pipette
import com.chiksmedina.solar.linear.designtools.RadialBlur
import com.chiksmedina.solar.linear.designtools.Ruler
import com.chiksmedina.solar.linear.designtools.RulerAngular
import com.chiksmedina.solar.linear.designtools.RulerCrossPen
import com.chiksmedina.solar.linear.designtools.RulerPen
import com.chiksmedina.solar.linear.designtools.ThreeSquares
import kotlin.collections.List as KtList

object DesignToolsGroup

val LinearSolar.DesignTools: DesignToolsGroup
    get() = DesignToolsGroup

private var _AllIcons: KtList<ImageVector>? = null

val DesignToolsGroup.AllIcons: KtList<ImageVector>
    get() {
        if (_AllIcons != null) {
            return _AllIcons!!
        }
        _AllIcons = listOf(
            AlignBottom,
            AlignHorizontalCenter,
            AlignHorizontaSpacing,
            AlignLeft,
            AlignRight,
            AlignTop,
            AlignVerticalCenter,
            AlignVerticalSpacing,
            ColourTuneing,
            Crop,
            CropMinimalistic,
            Filters,
            FlipHorizontal,
            FlipVertical,
            Layers,
            LayersMinimalistic,
            MirrorLeft,
            MirrorRight,
            PaintRoller,
            Palette,
            PaletteRound,
            Pallete2,
            Pipette,
            RadialBlur,
            Ruler,
            RulerAngular,
            RulerCrossPen,
            RulerPen,
            ThreeSquares
        )
        return _AllIcons!!
    }
