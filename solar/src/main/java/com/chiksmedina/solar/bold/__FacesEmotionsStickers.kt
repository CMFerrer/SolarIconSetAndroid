package com.chiksmedina.solar.bold

import androidx.compose.ui.graphics.vector.ImageVector
import com.chiksmedina.solar.BoldGroup
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
import kotlin.collections.List as ____KtList

public object FacesEmotionsStickersGroup

public val BoldGroup.FacesEmotionsStickers: FacesEmotionsStickersGroup
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
