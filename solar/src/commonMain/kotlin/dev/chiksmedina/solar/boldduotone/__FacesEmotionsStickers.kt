package dev.chiksmedina.solar.boldduotone

import androidx.compose.ui.graphics.vector.ImageVector
import dev.chiksmedina.solar.BoldDuotoneSolar
import dev.chiksmedina.solar.boldduotone.facesemotionsstickers.ConfoundedCircle
import dev.chiksmedina.solar.boldduotone.facesemotionsstickers.ConfoundedSquare
import dev.chiksmedina.solar.boldduotone.facesemotionsstickers.EmojiFunnyCircle
import dev.chiksmedina.solar.boldduotone.facesemotionsstickers.EmojiFunnySquare
import dev.chiksmedina.solar.boldduotone.facesemotionsstickers.ExpressionlessCircle
import dev.chiksmedina.solar.boldduotone.facesemotionsstickers.ExpressionlessSquare
import dev.chiksmedina.solar.boldduotone.facesemotionsstickers.FaceScanCircle
import dev.chiksmedina.solar.boldduotone.facesemotionsstickers.FaceScanSquare
import dev.chiksmedina.solar.boldduotone.facesemotionsstickers.FacemaskCircle
import dev.chiksmedina.solar.boldduotone.facesemotionsstickers.FacemaskSquare
import dev.chiksmedina.solar.boldduotone.facesemotionsstickers.SadCircle
import dev.chiksmedina.solar.boldduotone.facesemotionsstickers.SadSquare
import dev.chiksmedina.solar.boldduotone.facesemotionsstickers.SleepingCircle
import dev.chiksmedina.solar.boldduotone.facesemotionsstickers.SleepingSquare
import dev.chiksmedina.solar.boldduotone.facesemotionsstickers.SmileCircle
import dev.chiksmedina.solar.boldduotone.facesemotionsstickers.SmileSquare
import dev.chiksmedina.solar.boldduotone.facesemotionsstickers.StickerCircle
import dev.chiksmedina.solar.boldduotone.facesemotionsstickers.StickerSmileCircle
import dev.chiksmedina.solar.boldduotone.facesemotionsstickers.StickerSmileCircle2
import dev.chiksmedina.solar.boldduotone.facesemotionsstickers.StickerSmileSquare
import dev.chiksmedina.solar.boldduotone.facesemotionsstickers.StickerSquare
import kotlin.collections.List as KtList

object FacesEmotionsStickersGroup

val BoldDuotoneSolar.FacesEmotionsStickers: FacesEmotionsStickersGroup
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
