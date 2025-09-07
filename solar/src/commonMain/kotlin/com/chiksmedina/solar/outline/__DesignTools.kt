package com.chiksmedina.solar.outline

import androidx.compose.ui.graphics.vector.ImageVector
import com.chiksmedina.solar.OutlineSolar
import com.chiksmedina.solar.outline.designtools.AlignBottom
import com.chiksmedina.solar.outline.designtools.AlignHorizontaSpacing
import com.chiksmedina.solar.outline.designtools.AlignHorizontalCenter
import com.chiksmedina.solar.outline.designtools.AlignLeft
import com.chiksmedina.solar.outline.designtools.AlignRight
import com.chiksmedina.solar.outline.designtools.AlignTop
import com.chiksmedina.solar.outline.designtools.AlignVerticalCenter
import com.chiksmedina.solar.outline.designtools.AlignVerticalSpacing
import com.chiksmedina.solar.outline.designtools.ColourTuneing
import com.chiksmedina.solar.outline.designtools.Crop
import com.chiksmedina.solar.outline.designtools.CropMinimalistic
import com.chiksmedina.solar.outline.designtools.Filters
import com.chiksmedina.solar.outline.designtools.FlipHorizontal
import com.chiksmedina.solar.outline.designtools.FlipVertical
import com.chiksmedina.solar.outline.designtools.Layers
import com.chiksmedina.solar.outline.designtools.LayersMinimalistic
import com.chiksmedina.solar.outline.designtools.MirrorLeft
import com.chiksmedina.solar.outline.designtools.MirrorRight
import com.chiksmedina.solar.outline.designtools.PaintRoller
import com.chiksmedina.solar.outline.designtools.Palette
import com.chiksmedina.solar.outline.designtools.PaletteRound
import com.chiksmedina.solar.outline.designtools.Pallete2
import com.chiksmedina.solar.outline.designtools.Pipette
import com.chiksmedina.solar.outline.designtools.RadialBlur
import com.chiksmedina.solar.outline.designtools.Ruler
import com.chiksmedina.solar.outline.designtools.RulerAngular
import com.chiksmedina.solar.outline.designtools.RulerCrossPen
import com.chiksmedina.solar.outline.designtools.RulerPen
import com.chiksmedina.solar.outline.designtools.ThreeSquares
import kotlin.collections.List as KtList

object DesignToolsGroup

val OutlineSolar.DesignTools: DesignToolsGroup
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
