package com.chiksmedina.solar.bold

import androidx.compose.ui.graphics.vector.ImageVector
import com.chiksmedina.solar.BoldSolar
import com.chiksmedina.solar.bold.designtools.AlignBottom
import com.chiksmedina.solar.bold.designtools.AlignHorizontaSpacing
import com.chiksmedina.solar.bold.designtools.AlignHorizontalCenter
import com.chiksmedina.solar.bold.designtools.AlignLeft
import com.chiksmedina.solar.bold.designtools.AlignRight
import com.chiksmedina.solar.bold.designtools.AlignTop
import com.chiksmedina.solar.bold.designtools.AlignVerticalCenter
import com.chiksmedina.solar.bold.designtools.AlignVerticalSpacing
import com.chiksmedina.solar.bold.designtools.ColourTuneing
import com.chiksmedina.solar.bold.designtools.Crop
import com.chiksmedina.solar.bold.designtools.CropMinimalistic
import com.chiksmedina.solar.bold.designtools.Filters
import com.chiksmedina.solar.bold.designtools.FlipHorizontal
import com.chiksmedina.solar.bold.designtools.FlipVertical
import com.chiksmedina.solar.bold.designtools.Layers
import com.chiksmedina.solar.bold.designtools.LayersMinimalistic
import com.chiksmedina.solar.bold.designtools.MirrorLeft
import com.chiksmedina.solar.bold.designtools.MirrorRight
import com.chiksmedina.solar.bold.designtools.PaintRoller
import com.chiksmedina.solar.bold.designtools.Palette
import com.chiksmedina.solar.bold.designtools.PaletteRound
import com.chiksmedina.solar.bold.designtools.Pallete2
import com.chiksmedina.solar.bold.designtools.Pipette
import com.chiksmedina.solar.bold.designtools.RadialBlur
import com.chiksmedina.solar.bold.designtools.Ruler
import com.chiksmedina.solar.bold.designtools.RulerAngular
import com.chiksmedina.solar.bold.designtools.RulerCrossPen
import com.chiksmedina.solar.bold.designtools.RulerPen
import com.chiksmedina.solar.bold.designtools.ThreeSquares
import kotlin.collections.List as KtList

object DesignToolsGroup

val BoldSolar.DesignTools: DesignToolsGroup
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
