package com.chiksmedina.solar.linear

import androidx.compose.ui.graphics.vector.ImageVector
import com.chiksmedina.solar.LinearGroup
import com.chiksmedina.solar.linear.facesemotionsstickers.ConfoundedCircle
import com.chiksmedina.solar.linear.facesemotionsstickers.ConfoundedSquare
import com.chiksmedina.solar.linear.facesemotionsstickers.EmojiFunnyCircle
import com.chiksmedina.solar.linear.facesemotionsstickers.EmojiFunnySquare
import com.chiksmedina.solar.linear.facesemotionsstickers.ExpressionlessCircle
import com.chiksmedina.solar.linear.facesemotionsstickers.ExpressionlessSquare
import com.chiksmedina.solar.linear.facesemotionsstickers.FaceScanCircle
import com.chiksmedina.solar.linear.facesemotionsstickers.FaceScanSquare
import com.chiksmedina.solar.linear.facesemotionsstickers.FacemaskCircle
import com.chiksmedina.solar.linear.facesemotionsstickers.FacemaskSquare
import com.chiksmedina.solar.linear.facesemotionsstickers.SadCircle
import com.chiksmedina.solar.linear.facesemotionsstickers.SadSquare
import com.chiksmedina.solar.linear.facesemotionsstickers.SleepingCircle
import com.chiksmedina.solar.linear.facesemotionsstickers.SleepingSquare
import com.chiksmedina.solar.linear.facesemotionsstickers.SmileCircle
import com.chiksmedina.solar.linear.facesemotionsstickers.SmileSquare
import com.chiksmedina.solar.linear.facesemotionsstickers.StickerCircle
import com.chiksmedina.solar.linear.facesemotionsstickers.StickerSmileCircle
import com.chiksmedina.solar.linear.facesemotionsstickers.StickerSmileCircle2
import com.chiksmedina.solar.linear.facesemotionsstickers.StickerSmileSquare
import com.chiksmedina.solar.linear.facesemotionsstickers.StickerSquare
import kotlin.collections.List as ____KtList

public object FacesEmotionsStickersGroup

public val LinearGroup.FacesEmotionsStickers: FacesEmotionsStickersGroup
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
