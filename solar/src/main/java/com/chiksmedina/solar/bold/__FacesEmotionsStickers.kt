package com.chiksmedina.solar.bold

import androidx.compose.ui.graphics.vector.ImageVector
import com.chiksmedina.solar.BoldSolar
import com.chiksmedina.solar.bold.facesemotionsstickers.ConfoundedCircle
import com.chiksmedina.solar.bold.facesemotionsstickers.ConfoundedSquare
import com.chiksmedina.solar.bold.facesemotionsstickers.EmojiFunnyCircle
import com.chiksmedina.solar.bold.facesemotionsstickers.EmojiFunnySquare
import com.chiksmedina.solar.bold.facesemotionsstickers.ExpressionlessCircle
import com.chiksmedina.solar.bold.facesemotionsstickers.ExpressionlessSquare
import com.chiksmedina.solar.bold.facesemotionsstickers.FaceScanCircle
import com.chiksmedina.solar.bold.facesemotionsstickers.FaceScanSquare
import com.chiksmedina.solar.bold.facesemotionsstickers.FacemaskCircle
import com.chiksmedina.solar.bold.facesemotionsstickers.FacemaskSquare
import com.chiksmedina.solar.bold.facesemotionsstickers.SadCircle
import com.chiksmedina.solar.bold.facesemotionsstickers.SadSquare
import com.chiksmedina.solar.bold.facesemotionsstickers.SleepingCircle
import com.chiksmedina.solar.bold.facesemotionsstickers.SleepingSquare
import com.chiksmedina.solar.bold.facesemotionsstickers.SmileCircle
import com.chiksmedina.solar.bold.facesemotionsstickers.SmileSquare
import com.chiksmedina.solar.bold.facesemotionsstickers.StickerCircle
import com.chiksmedina.solar.bold.facesemotionsstickers.StickerSmileCircle
import com.chiksmedina.solar.bold.facesemotionsstickers.StickerSmileCircle2
import com.chiksmedina.solar.bold.facesemotionsstickers.StickerSmileSquare
import com.chiksmedina.solar.bold.facesemotionsstickers.StickerSquare
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
