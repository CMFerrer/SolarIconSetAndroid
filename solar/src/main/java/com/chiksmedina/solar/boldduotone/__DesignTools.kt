package com.chiksmedina.solar.boldduotone

import androidx.compose.ui.graphics.vector.ImageVector
import com.chiksmedina.solar.BoldDuotoneSolar
import com.chiksmedina.solar.boldduotone.designtools.AlignBottom
import com.chiksmedina.solar.boldduotone.designtools.AlignHorizontaSpacing
import com.chiksmedina.solar.boldduotone.designtools.AlignHorizontalCenter
import com.chiksmedina.solar.boldduotone.designtools.AlignLeft
import com.chiksmedina.solar.boldduotone.designtools.AlignRight
import com.chiksmedina.solar.boldduotone.designtools.AlignTop
import com.chiksmedina.solar.boldduotone.designtools.AlignVerticalCenter
import com.chiksmedina.solar.boldduotone.designtools.AlignVerticalSpacing
import com.chiksmedina.solar.boldduotone.designtools.ColourTuneing
import com.chiksmedina.solar.boldduotone.designtools.Crop
import com.chiksmedina.solar.boldduotone.designtools.CropMinimalistic
import com.chiksmedina.solar.boldduotone.designtools.Filters
import com.chiksmedina.solar.boldduotone.designtools.FlipHorizontal
import com.chiksmedina.solar.boldduotone.designtools.FlipVertical
import com.chiksmedina.solar.boldduotone.designtools.Layers
import com.chiksmedina.solar.boldduotone.designtools.LayersMinimalistic
import com.chiksmedina.solar.boldduotone.designtools.MirrorLeft
import com.chiksmedina.solar.boldduotone.designtools.MirrorRight
import com.chiksmedina.solar.boldduotone.designtools.PaintRoller
import com.chiksmedina.solar.boldduotone.designtools.Palette
import com.chiksmedina.solar.boldduotone.designtools.PaletteRound
import com.chiksmedina.solar.boldduotone.designtools.Pallete2
import com.chiksmedina.solar.boldduotone.designtools.Pipette
import com.chiksmedina.solar.boldduotone.designtools.RadialBlur
import com.chiksmedina.solar.boldduotone.designtools.Ruler
import com.chiksmedina.solar.boldduotone.designtools.RulerAngular
import com.chiksmedina.solar.boldduotone.designtools.RulerCrossPen
import com.chiksmedina.solar.boldduotone.designtools.RulerPen
import com.chiksmedina.solar.boldduotone.designtools.ThreeSquares
import kotlin.collections.List as KtList

object DesignToolsGroup

val BoldDuotoneSolar.DesignTools: DesignToolsGroup
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
