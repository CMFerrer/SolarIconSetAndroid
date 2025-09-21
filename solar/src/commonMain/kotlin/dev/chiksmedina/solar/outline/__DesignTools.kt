package dev.chiksmedina.solar.outline

import androidx.compose.ui.graphics.vector.ImageVector
import dev.chiksmedina.solar.OutlineSolar
import dev.chiksmedina.solar.outline.designtools.AlignBottom
import dev.chiksmedina.solar.outline.designtools.AlignHorizontaSpacing
import dev.chiksmedina.solar.outline.designtools.AlignHorizontalCenter
import dev.chiksmedina.solar.outline.designtools.AlignLeft
import dev.chiksmedina.solar.outline.designtools.AlignRight
import dev.chiksmedina.solar.outline.designtools.AlignTop
import dev.chiksmedina.solar.outline.designtools.AlignVerticalCenter
import dev.chiksmedina.solar.outline.designtools.AlignVerticalSpacing
import dev.chiksmedina.solar.outline.designtools.ColourTuneing
import dev.chiksmedina.solar.outline.designtools.Crop
import dev.chiksmedina.solar.outline.designtools.CropMinimalistic
import dev.chiksmedina.solar.outline.designtools.Filters
import dev.chiksmedina.solar.outline.designtools.FlipHorizontal
import dev.chiksmedina.solar.outline.designtools.FlipVertical
import dev.chiksmedina.solar.outline.designtools.Layers
import dev.chiksmedina.solar.outline.designtools.LayersMinimalistic
import dev.chiksmedina.solar.outline.designtools.MirrorLeft
import dev.chiksmedina.solar.outline.designtools.MirrorRight
import dev.chiksmedina.solar.outline.designtools.PaintRoller
import dev.chiksmedina.solar.outline.designtools.Palette
import dev.chiksmedina.solar.outline.designtools.PaletteRound
import dev.chiksmedina.solar.outline.designtools.Pallete2
import dev.chiksmedina.solar.outline.designtools.Pipette
import dev.chiksmedina.solar.outline.designtools.RadialBlur
import dev.chiksmedina.solar.outline.designtools.Ruler
import dev.chiksmedina.solar.outline.designtools.RulerAngular
import dev.chiksmedina.solar.outline.designtools.RulerCrossPen
import dev.chiksmedina.solar.outline.designtools.RulerPen
import dev.chiksmedina.solar.outline.designtools.ThreeSquares
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
