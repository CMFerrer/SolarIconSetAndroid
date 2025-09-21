package dev.chiksmedina.solar.bold

import androidx.compose.ui.graphics.vector.ImageVector
import dev.chiksmedina.solar.BoldSolar
import dev.chiksmedina.solar.bold.designtools.AlignBottom
import dev.chiksmedina.solar.bold.designtools.AlignHorizontaSpacing
import dev.chiksmedina.solar.bold.designtools.AlignHorizontalCenter
import dev.chiksmedina.solar.bold.designtools.AlignLeft
import dev.chiksmedina.solar.bold.designtools.AlignRight
import dev.chiksmedina.solar.bold.designtools.AlignTop
import dev.chiksmedina.solar.bold.designtools.AlignVerticalCenter
import dev.chiksmedina.solar.bold.designtools.AlignVerticalSpacing
import dev.chiksmedina.solar.bold.designtools.ColourTuneing
import dev.chiksmedina.solar.bold.designtools.Crop
import dev.chiksmedina.solar.bold.designtools.CropMinimalistic
import dev.chiksmedina.solar.bold.designtools.Filters
import dev.chiksmedina.solar.bold.designtools.FlipHorizontal
import dev.chiksmedina.solar.bold.designtools.FlipVertical
import dev.chiksmedina.solar.bold.designtools.Layers
import dev.chiksmedina.solar.bold.designtools.LayersMinimalistic
import dev.chiksmedina.solar.bold.designtools.MirrorLeft
import dev.chiksmedina.solar.bold.designtools.MirrorRight
import dev.chiksmedina.solar.bold.designtools.PaintRoller
import dev.chiksmedina.solar.bold.designtools.Palette
import dev.chiksmedina.solar.bold.designtools.PaletteRound
import dev.chiksmedina.solar.bold.designtools.Pallete2
import dev.chiksmedina.solar.bold.designtools.Pipette
import dev.chiksmedina.solar.bold.designtools.RadialBlur
import dev.chiksmedina.solar.bold.designtools.Ruler
import dev.chiksmedina.solar.bold.designtools.RulerAngular
import dev.chiksmedina.solar.bold.designtools.RulerCrossPen
import dev.chiksmedina.solar.bold.designtools.RulerPen
import dev.chiksmedina.solar.bold.designtools.ThreeSquares
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
