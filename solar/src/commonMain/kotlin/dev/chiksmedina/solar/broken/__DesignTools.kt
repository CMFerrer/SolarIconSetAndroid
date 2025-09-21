package dev.chiksmedina.solar.broken

import androidx.compose.ui.graphics.vector.ImageVector
import dev.chiksmedina.solar.BrokenSolar
import dev.chiksmedina.solar.broken.designtools.AlignBottom
import dev.chiksmedina.solar.broken.designtools.AlignHorizontaSpacing
import dev.chiksmedina.solar.broken.designtools.AlignHorizontalCenter
import dev.chiksmedina.solar.broken.designtools.AlignLeft
import dev.chiksmedina.solar.broken.designtools.AlignRight
import dev.chiksmedina.solar.broken.designtools.AlignTop
import dev.chiksmedina.solar.broken.designtools.AlignVerticalCenter
import dev.chiksmedina.solar.broken.designtools.AlignVerticalSpacing
import dev.chiksmedina.solar.broken.designtools.ColourTuneing
import dev.chiksmedina.solar.broken.designtools.Crop
import dev.chiksmedina.solar.broken.designtools.CropMinimalistic
import dev.chiksmedina.solar.broken.designtools.Filters
import dev.chiksmedina.solar.broken.designtools.FlipHorizontal
import dev.chiksmedina.solar.broken.designtools.FlipVertical
import dev.chiksmedina.solar.broken.designtools.Layers
import dev.chiksmedina.solar.broken.designtools.LayersMinimalistic
import dev.chiksmedina.solar.broken.designtools.MirrorLeft
import dev.chiksmedina.solar.broken.designtools.MirrorRight
import dev.chiksmedina.solar.broken.designtools.PaintRoller
import dev.chiksmedina.solar.broken.designtools.Palette
import dev.chiksmedina.solar.broken.designtools.PaletteRound
import dev.chiksmedina.solar.broken.designtools.Pallete2
import dev.chiksmedina.solar.broken.designtools.Pipette
import dev.chiksmedina.solar.broken.designtools.RadialBlur
import dev.chiksmedina.solar.broken.designtools.Ruler
import dev.chiksmedina.solar.broken.designtools.RulerAngular
import dev.chiksmedina.solar.broken.designtools.RulerCrossPen
import dev.chiksmedina.solar.broken.designtools.RulerPen
import dev.chiksmedina.solar.broken.designtools.ThreeSquares
import kotlin.collections.List as KtList

object DesignToolsGroup

val BrokenSolar.DesignTools: DesignToolsGroup
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
