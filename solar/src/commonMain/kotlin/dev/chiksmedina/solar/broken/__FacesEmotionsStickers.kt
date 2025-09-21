package dev.chiksmedina.solar.broken

import androidx.compose.ui.graphics.vector.ImageVector
import dev.chiksmedina.solar.BrokenSolar
import dev.chiksmedina.solar.broken.facesemotionsstickers.ConfoundedCircle
import dev.chiksmedina.solar.broken.facesemotionsstickers.ConfoundedSquare
import dev.chiksmedina.solar.broken.facesemotionsstickers.EmojiFunnyCircle
import dev.chiksmedina.solar.broken.facesemotionsstickers.EmojiFunnySquare
import dev.chiksmedina.solar.broken.facesemotionsstickers.ExpressionlessCircle
import dev.chiksmedina.solar.broken.facesemotionsstickers.ExpressionlessSquare
import dev.chiksmedina.solar.broken.facesemotionsstickers.FaceScanCircle
import dev.chiksmedina.solar.broken.facesemotionsstickers.FaceScanSquare
import dev.chiksmedina.solar.broken.facesemotionsstickers.FacemaskCircle
import dev.chiksmedina.solar.broken.facesemotionsstickers.FacemaskSquare
import dev.chiksmedina.solar.broken.facesemotionsstickers.SadCircle
import dev.chiksmedina.solar.broken.facesemotionsstickers.SadSquare
import dev.chiksmedina.solar.broken.facesemotionsstickers.SleepingCircle
import dev.chiksmedina.solar.broken.facesemotionsstickers.SleepingSquare
import dev.chiksmedina.solar.broken.facesemotionsstickers.SmileCircle
import dev.chiksmedina.solar.broken.facesemotionsstickers.SmileSquare
import dev.chiksmedina.solar.broken.facesemotionsstickers.StickerCircle
import dev.chiksmedina.solar.broken.facesemotionsstickers.StickerSmileCircle
import dev.chiksmedina.solar.broken.facesemotionsstickers.StickerSmileCircle2
import dev.chiksmedina.solar.broken.facesemotionsstickers.StickerSmileSquare
import dev.chiksmedina.solar.broken.facesemotionsstickers.StickerSquare
import kotlin.collections.List as KtList

object FacesEmotionsStickersGroup

val BrokenSolar.FacesEmotionsStickers: FacesEmotionsStickersGroup
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
