package dev.chiksmedina.solar.linear

import androidx.compose.ui.graphics.vector.ImageVector
import dev.chiksmedina.solar.LinearSolar
import dev.chiksmedina.solar.linear.designtools.AlignBottom
import dev.chiksmedina.solar.linear.designtools.AlignHorizontaSpacing
import dev.chiksmedina.solar.linear.designtools.AlignHorizontalCenter
import dev.chiksmedina.solar.linear.designtools.AlignLeft
import dev.chiksmedina.solar.linear.designtools.AlignRight
import dev.chiksmedina.solar.linear.designtools.AlignTop
import dev.chiksmedina.solar.linear.designtools.AlignVerticalCenter
import dev.chiksmedina.solar.linear.designtools.AlignVerticalSpacing
import dev.chiksmedina.solar.linear.designtools.ColourTuneing
import dev.chiksmedina.solar.linear.designtools.Crop
import dev.chiksmedina.solar.linear.designtools.CropMinimalistic
import dev.chiksmedina.solar.linear.designtools.Filters
import dev.chiksmedina.solar.linear.designtools.FlipHorizontal
import dev.chiksmedina.solar.linear.designtools.FlipVertical
import dev.chiksmedina.solar.linear.designtools.Layers
import dev.chiksmedina.solar.linear.designtools.LayersMinimalistic
import dev.chiksmedina.solar.linear.designtools.MirrorLeft
import dev.chiksmedina.solar.linear.designtools.MirrorRight
import dev.chiksmedina.solar.linear.designtools.PaintRoller
import dev.chiksmedina.solar.linear.designtools.Palette
import dev.chiksmedina.solar.linear.designtools.PaletteRound
import dev.chiksmedina.solar.linear.designtools.Pallete2
import dev.chiksmedina.solar.linear.designtools.Pipette
import dev.chiksmedina.solar.linear.designtools.RadialBlur
import dev.chiksmedina.solar.linear.designtools.Ruler
import dev.chiksmedina.solar.linear.designtools.RulerAngular
import dev.chiksmedina.solar.linear.designtools.RulerCrossPen
import dev.chiksmedina.solar.linear.designtools.RulerPen
import dev.chiksmedina.solar.linear.designtools.ThreeSquares
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
