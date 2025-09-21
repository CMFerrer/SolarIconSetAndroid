package dev.chiksmedina.solar.lineduotone

import androidx.compose.ui.graphics.vector.ImageVector
import dev.chiksmedina.solar.LineDuotoneSolar
import dev.chiksmedina.solar.lineduotone.designtools.AlignBottom
import dev.chiksmedina.solar.lineduotone.designtools.AlignHorizontaSpacing
import dev.chiksmedina.solar.lineduotone.designtools.AlignHorizontalCenter
import dev.chiksmedina.solar.lineduotone.designtools.AlignLeft
import dev.chiksmedina.solar.lineduotone.designtools.AlignRight
import dev.chiksmedina.solar.lineduotone.designtools.AlignTop
import dev.chiksmedina.solar.lineduotone.designtools.AlignVerticalCenter
import dev.chiksmedina.solar.lineduotone.designtools.AlignVerticalSpacing
import dev.chiksmedina.solar.lineduotone.designtools.ColourTuneing
import dev.chiksmedina.solar.lineduotone.designtools.Crop
import dev.chiksmedina.solar.lineduotone.designtools.CropMinimalistic
import dev.chiksmedina.solar.lineduotone.designtools.Filters
import dev.chiksmedina.solar.lineduotone.designtools.FlipHorizontal
import dev.chiksmedina.solar.lineduotone.designtools.FlipVertical
import dev.chiksmedina.solar.lineduotone.designtools.Layers
import dev.chiksmedina.solar.lineduotone.designtools.LayersMinimalistic
import dev.chiksmedina.solar.lineduotone.designtools.MirrorLeft
import dev.chiksmedina.solar.lineduotone.designtools.MirrorRight
import dev.chiksmedina.solar.lineduotone.designtools.PaintRoller
import dev.chiksmedina.solar.lineduotone.designtools.Palette
import dev.chiksmedina.solar.lineduotone.designtools.PaletteRound
import dev.chiksmedina.solar.lineduotone.designtools.Pallete2
import dev.chiksmedina.solar.lineduotone.designtools.Pipette
import dev.chiksmedina.solar.lineduotone.designtools.RadialBlur
import dev.chiksmedina.solar.lineduotone.designtools.Ruler
import dev.chiksmedina.solar.lineduotone.designtools.RulerAngular
import dev.chiksmedina.solar.lineduotone.designtools.RulerCrossPen
import dev.chiksmedina.solar.lineduotone.designtools.RulerPen
import dev.chiksmedina.solar.lineduotone.designtools.ThreeSquares
import kotlin.collections.List as KtList

object DesignToolsGroup

val LineDuotoneSolar.DesignTools: DesignToolsGroup
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
