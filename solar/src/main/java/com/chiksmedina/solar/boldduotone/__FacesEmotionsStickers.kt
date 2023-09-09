package com.chiksmedina.solar.boldduotone

import androidx.compose.ui.graphics.vector.ImageVector
import com.chiksmedina.solar.BoldduotoneGroup
import com.chiksmedina.solar.boldduotone.facesemotionsstickers.ConfoundedCircle
import com.chiksmedina.solar.boldduotone.facesemotionsstickers.ConfoundedSquare
import com.chiksmedina.solar.boldduotone.facesemotionsstickers.EmojiFunnyCircle
import com.chiksmedina.solar.boldduotone.facesemotionsstickers.EmojiFunnySquare
import com.chiksmedina.solar.boldduotone.facesemotionsstickers.ExpressionlessCircle
import com.chiksmedina.solar.boldduotone.facesemotionsstickers.ExpressionlessSquare
import com.chiksmedina.solar.boldduotone.facesemotionsstickers.FaceScanCircle
import com.chiksmedina.solar.boldduotone.facesemotionsstickers.FaceScanSquare
import com.chiksmedina.solar.boldduotone.facesemotionsstickers.FacemaskCircle
import com.chiksmedina.solar.boldduotone.facesemotionsstickers.FacemaskSquare
import com.chiksmedina.solar.boldduotone.facesemotionsstickers.SadCircle
import com.chiksmedina.solar.boldduotone.facesemotionsstickers.SadSquare
import com.chiksmedina.solar.boldduotone.facesemotionsstickers.SleepingCircle
import com.chiksmedina.solar.boldduotone.facesemotionsstickers.SleepingSquare
import com.chiksmedina.solar.boldduotone.facesemotionsstickers.SmileCircle
import com.chiksmedina.solar.boldduotone.facesemotionsstickers.SmileSquare
import com.chiksmedina.solar.boldduotone.facesemotionsstickers.StickerCircle
import com.chiksmedina.solar.boldduotone.facesemotionsstickers.StickerSmileCircle
import com.chiksmedina.solar.boldduotone.facesemotionsstickers.StickerSmileCircle2
import com.chiksmedina.solar.boldduotone.facesemotionsstickers.StickerSmileSquare
import com.chiksmedina.solar.boldduotone.facesemotionsstickers.StickerSquare
import kotlin.collections.List as ____KtList

public object FacesEmotionsStickersGroup

public val BoldduotoneGroup.FacesEmotionsStickers: FacesEmotionsStickersGroup
  get() = FacesEmotionsStickersGroup

private var __AllIcons: ____KtList<ImageVector>? = null

public val FacesEmotionsStickersGroup.AllIcons: ____KtList<ImageVector>
  get() {
    if (__AllIcons != null) {
      return __AllIcons!!
    }
    __AllIcons= listOf(ConfoundedCircle, ConfoundedSquare, EmojiFunnyCircle, EmojiFunnySquare,
        ExpressionlessCircle, ExpressionlessSquare, FacemaskCircle, FacemaskSquare, FaceScanCircle,
        FaceScanSquare, SadCircle, SadSquare, SleepingCircle, SleepingSquare, SmileCircle,
        SmileSquare, StickerCircle, StickerSmileCircle, StickerSmileCircle2, StickerSmileSquare,
        StickerSquare)
    return __AllIcons!!
  }
