package dev.chiksmedina.solar.linear

import androidx.compose.ui.graphics.vector.ImageVector
import dev.chiksmedina.solar.LinearSolar
import dev.chiksmedina.solar.linear.facesemotionsstickers.ConfoundedCircle
import dev.chiksmedina.solar.linear.facesemotionsstickers.ConfoundedSquare
import dev.chiksmedina.solar.linear.facesemotionsstickers.EmojiFunnyCircle
import dev.chiksmedina.solar.linear.facesemotionsstickers.EmojiFunnySquare
import dev.chiksmedina.solar.linear.facesemotionsstickers.ExpressionlessCircle
import dev.chiksmedina.solar.linear.facesemotionsstickers.ExpressionlessSquare
import dev.chiksmedina.solar.linear.facesemotionsstickers.FaceScanCircle
import dev.chiksmedina.solar.linear.facesemotionsstickers.FaceScanSquare
import dev.chiksmedina.solar.linear.facesemotionsstickers.FacemaskCircle
import dev.chiksmedina.solar.linear.facesemotionsstickers.FacemaskSquare
import dev.chiksmedina.solar.linear.facesemotionsstickers.SadCircle
import dev.chiksmedina.solar.linear.facesemotionsstickers.SadSquare
import dev.chiksmedina.solar.linear.facesemotionsstickers.SleepingCircle
import dev.chiksmedina.solar.linear.facesemotionsstickers.SleepingSquare
import dev.chiksmedina.solar.linear.facesemotionsstickers.SmileCircle
import dev.chiksmedina.solar.linear.facesemotionsstickers.SmileSquare
import dev.chiksmedina.solar.linear.facesemotionsstickers.StickerCircle
import dev.chiksmedina.solar.linear.facesemotionsstickers.StickerSmileCircle
import dev.chiksmedina.solar.linear.facesemotionsstickers.StickerSmileCircle2
import dev.chiksmedina.solar.linear.facesemotionsstickers.StickerSmileSquare
import dev.chiksmedina.solar.linear.facesemotionsstickers.StickerSquare
import kotlin.collections.List as KtList

object FacesEmotionsStickersGroup

val LinearSolar.FacesEmotionsStickers: FacesEmotionsStickersGroup
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
