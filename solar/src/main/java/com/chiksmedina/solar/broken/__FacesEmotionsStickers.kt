package com.chiksmedina.solar.broken

import androidx.compose.ui.graphics.vector.ImageVector
import com.chiksmedina.solar.BrokenSolar
import com.chiksmedina.solar.broken.facesemotionsstickers.ConfoundedCircle
import com.chiksmedina.solar.broken.facesemotionsstickers.ConfoundedSquare
import com.chiksmedina.solar.broken.facesemotionsstickers.EmojiFunnyCircle
import com.chiksmedina.solar.broken.facesemotionsstickers.EmojiFunnySquare
import com.chiksmedina.solar.broken.facesemotionsstickers.ExpressionlessCircle
import com.chiksmedina.solar.broken.facesemotionsstickers.ExpressionlessSquare
import com.chiksmedina.solar.broken.facesemotionsstickers.FaceScanCircle
import com.chiksmedina.solar.broken.facesemotionsstickers.FaceScanSquare
import com.chiksmedina.solar.broken.facesemotionsstickers.FacemaskCircle
import com.chiksmedina.solar.broken.facesemotionsstickers.FacemaskSquare
import com.chiksmedina.solar.broken.facesemotionsstickers.SadCircle
import com.chiksmedina.solar.broken.facesemotionsstickers.SadSquare
import com.chiksmedina.solar.broken.facesemotionsstickers.SleepingCircle
import com.chiksmedina.solar.broken.facesemotionsstickers.SleepingSquare
import com.chiksmedina.solar.broken.facesemotionsstickers.SmileCircle
import com.chiksmedina.solar.broken.facesemotionsstickers.SmileSquare
import com.chiksmedina.solar.broken.facesemotionsstickers.StickerCircle
import com.chiksmedina.solar.broken.facesemotionsstickers.StickerSmileCircle
import com.chiksmedina.solar.broken.facesemotionsstickers.StickerSmileCircle2
import com.chiksmedina.solar.broken.facesemotionsstickers.StickerSmileSquare
import com.chiksmedina.solar.broken.facesemotionsstickers.StickerSquare
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
