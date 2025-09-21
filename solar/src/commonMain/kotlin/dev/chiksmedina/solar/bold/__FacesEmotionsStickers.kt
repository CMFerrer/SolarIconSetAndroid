package dev.chiksmedina.solar.bold

import androidx.compose.ui.graphics.vector.ImageVector
import dev.chiksmedina.solar.BoldSolar
import dev.chiksmedina.solar.bold.facesemotionsstickers.ConfoundedCircle
import dev.chiksmedina.solar.bold.facesemotionsstickers.ConfoundedSquare
import dev.chiksmedina.solar.bold.facesemotionsstickers.EmojiFunnyCircle
import dev.chiksmedina.solar.bold.facesemotionsstickers.EmojiFunnySquare
import dev.chiksmedina.solar.bold.facesemotionsstickers.ExpressionlessCircle
import dev.chiksmedina.solar.bold.facesemotionsstickers.ExpressionlessSquare
import dev.chiksmedina.solar.bold.facesemotionsstickers.FaceScanCircle
import dev.chiksmedina.solar.bold.facesemotionsstickers.FaceScanSquare
import dev.chiksmedina.solar.bold.facesemotionsstickers.FacemaskCircle
import dev.chiksmedina.solar.bold.facesemotionsstickers.FacemaskSquare
import dev.chiksmedina.solar.bold.facesemotionsstickers.SadCircle
import dev.chiksmedina.solar.bold.facesemotionsstickers.SadSquare
import dev.chiksmedina.solar.bold.facesemotionsstickers.SleepingCircle
import dev.chiksmedina.solar.bold.facesemotionsstickers.SleepingSquare
import dev.chiksmedina.solar.bold.facesemotionsstickers.SmileCircle
import dev.chiksmedina.solar.bold.facesemotionsstickers.SmileSquare
import dev.chiksmedina.solar.bold.facesemotionsstickers.StickerCircle
import dev.chiksmedina.solar.bold.facesemotionsstickers.StickerSmileCircle
import dev.chiksmedina.solar.bold.facesemotionsstickers.StickerSmileCircle2
import dev.chiksmedina.solar.bold.facesemotionsstickers.StickerSmileSquare
import dev.chiksmedina.solar.bold.facesemotionsstickers.StickerSquare
import kotlin.collections.List as KtList

object FacesEmotionsStickersGroup

val BoldSolar.FacesEmotionsStickers: FacesEmotionsStickersGroup
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
