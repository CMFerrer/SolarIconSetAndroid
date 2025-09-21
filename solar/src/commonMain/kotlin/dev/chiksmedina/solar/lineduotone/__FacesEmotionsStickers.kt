package dev.chiksmedina.solar.lineduotone

import androidx.compose.ui.graphics.vector.ImageVector
import dev.chiksmedina.solar.LineDuotoneSolar
import dev.chiksmedina.solar.lineduotone.facesemotionsstickers.ConfoundedCircle
import dev.chiksmedina.solar.lineduotone.facesemotionsstickers.ConfoundedSquare
import dev.chiksmedina.solar.lineduotone.facesemotionsstickers.EmojiFunnyCircle
import dev.chiksmedina.solar.lineduotone.facesemotionsstickers.EmojiFunnySquare
import dev.chiksmedina.solar.lineduotone.facesemotionsstickers.ExpressionlessCircle
import dev.chiksmedina.solar.lineduotone.facesemotionsstickers.ExpressionlessSquare
import dev.chiksmedina.solar.lineduotone.facesemotionsstickers.FaceScanCircle
import dev.chiksmedina.solar.lineduotone.facesemotionsstickers.FaceScanSquare
import dev.chiksmedina.solar.lineduotone.facesemotionsstickers.FacemaskCircle
import dev.chiksmedina.solar.lineduotone.facesemotionsstickers.FacemaskSquare
import dev.chiksmedina.solar.lineduotone.facesemotionsstickers.SadCircle
import dev.chiksmedina.solar.lineduotone.facesemotionsstickers.SadSquare
import dev.chiksmedina.solar.lineduotone.facesemotionsstickers.SleepingCircle
import dev.chiksmedina.solar.lineduotone.facesemotionsstickers.SleepingSquare
import dev.chiksmedina.solar.lineduotone.facesemotionsstickers.SmileCircle
import dev.chiksmedina.solar.lineduotone.facesemotionsstickers.SmileSquare
import dev.chiksmedina.solar.lineduotone.facesemotionsstickers.StickerCircle
import dev.chiksmedina.solar.lineduotone.facesemotionsstickers.StickerSmileCircle
import dev.chiksmedina.solar.lineduotone.facesemotionsstickers.StickerSmileCircle2
import dev.chiksmedina.solar.lineduotone.facesemotionsstickers.StickerSmileSquare
import dev.chiksmedina.solar.lineduotone.facesemotionsstickers.StickerSquare
import kotlin.collections.List as KtList

object FacesEmotionsStickersGroup

val LineDuotoneSolar.FacesEmotionsStickers: FacesEmotionsStickersGroup
    get() = FacesEmotionsStickersGroup

private var _AllIcons: KtList<ImageVector>? = null

val FacesEmotionsStickersGroup.AllIcons: KtList<ImageVector>
    get() {
        if (_AllIcons != null) {
            return _AllIcons!!
        }
        _AllIcons = listOf(
            ConfoundedCircle,
            ConfoundedSquare,
            EmojiFunnyCircle,
            EmojiFunnySquare,
            ExpressionlessCircle,
            ExpressionlessSquare,
            FacemaskCircle,
            FacemaskSquare,
            FaceScanCircle,
            FaceScanSquare,
            SadCircle,
            SadSquare,
            SleepingCircle,
            SleepingSquare,
            SmileCircle,
            SmileSquare,
            StickerCircle,
            StickerSmileCircle,
            StickerSmileCircle2,
            StickerSmileSquare,
            StickerSquare
        )
        return _AllIcons!!
    }
