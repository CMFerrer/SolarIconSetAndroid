package dev.chiksmedina.solar.boldduotone

import androidx.compose.ui.graphics.vector.ImageVector
import dev.chiksmedina.solar.BoldDuotoneSolar
import dev.chiksmedina.solar.boldduotone.designtools.AlignBottom
import dev.chiksmedina.solar.boldduotone.designtools.AlignHorizontaSpacing
import dev.chiksmedina.solar.boldduotone.designtools.AlignHorizontalCenter
import dev.chiksmedina.solar.boldduotone.designtools.AlignLeft
import dev.chiksmedina.solar.boldduotone.designtools.AlignRight
import dev.chiksmedina.solar.boldduotone.designtools.AlignTop
import dev.chiksmedina.solar.boldduotone.designtools.AlignVerticalCenter
import dev.chiksmedina.solar.boldduotone.designtools.AlignVerticalSpacing
import dev.chiksmedina.solar.boldduotone.designtools.ColourTuneing
import dev.chiksmedina.solar.boldduotone.designtools.Crop
import dev.chiksmedina.solar.boldduotone.designtools.CropMinimalistic
import dev.chiksmedina.solar.boldduotone.designtools.Filters
import dev.chiksmedina.solar.boldduotone.designtools.FlipHorizontal
import dev.chiksmedina.solar.boldduotone.designtools.FlipVertical
import dev.chiksmedina.solar.boldduotone.designtools.Layers
import dev.chiksmedina.solar.boldduotone.designtools.LayersMinimalistic
import dev.chiksmedina.solar.boldduotone.designtools.MirrorLeft
import dev.chiksmedina.solar.boldduotone.designtools.MirrorRight
import dev.chiksmedina.solar.boldduotone.designtools.PaintRoller
import dev.chiksmedina.solar.boldduotone.designtools.Palette
import dev.chiksmedina.solar.boldduotone.designtools.PaletteRound
import dev.chiksmedina.solar.boldduotone.designtools.Pallete2
import dev.chiksmedina.solar.boldduotone.designtools.Pipette
import dev.chiksmedina.solar.boldduotone.designtools.RadialBlur
import dev.chiksmedina.solar.boldduotone.designtools.Ruler
import dev.chiksmedina.solar.boldduotone.designtools.RulerAngular
import dev.chiksmedina.solar.boldduotone.designtools.RulerCrossPen
import dev.chiksmedina.solar.boldduotone.designtools.RulerPen
import dev.chiksmedina.solar.boldduotone.designtools.ThreeSquares
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
