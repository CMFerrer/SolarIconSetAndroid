package dev.chiksmedina.solar.outline

import androidx.compose.ui.graphics.vector.ImageVector
import dev.chiksmedina.solar.OutlineSolar
import dev.chiksmedina.solar.outline.facesemotionsstickers.ConfoundedCircle
import dev.chiksmedina.solar.outline.facesemotionsstickers.ConfoundedSquare
import dev.chiksmedina.solar.outline.facesemotionsstickers.EmojiFunnyCircle
import dev.chiksmedina.solar.outline.facesemotionsstickers.EmojiFunnySquare
import dev.chiksmedina.solar.outline.facesemotionsstickers.ExpressionlessCircle
import dev.chiksmedina.solar.outline.facesemotionsstickers.ExpressionlessSquare
import dev.chiksmedina.solar.outline.facesemotionsstickers.FaceScanCircle
import dev.chiksmedina.solar.outline.facesemotionsstickers.FaceScanSquare
import dev.chiksmedina.solar.outline.facesemotionsstickers.FacemaskCircle
import dev.chiksmedina.solar.outline.facesemotionsstickers.FacemaskSquare
import dev.chiksmedina.solar.outline.facesemotionsstickers.SadCircle
import dev.chiksmedina.solar.outline.facesemotionsstickers.SadSquare
import dev.chiksmedina.solar.outline.facesemotionsstickers.SleepingCircle
import dev.chiksmedina.solar.outline.facesemotionsstickers.SleepingSquare
import dev.chiksmedina.solar.outline.facesemotionsstickers.SmileCircle
import dev.chiksmedina.solar.outline.facesemotionsstickers.SmileSquare
import dev.chiksmedina.solar.outline.facesemotionsstickers.StickerCircle
import dev.chiksmedina.solar.outline.facesemotionsstickers.StickerSmileCircle
import dev.chiksmedina.solar.outline.facesemotionsstickers.StickerSmileCircle2
import dev.chiksmedina.solar.outline.facesemotionsstickers.StickerSmileSquare
import dev.chiksmedina.solar.outline.facesemotionsstickers.StickerSquare
import kotlin.collections.List as KtList

object FacesEmotionsStickersGroup

val OutlineSolar.FacesEmotionsStickers: FacesEmotionsStickersGroup
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
