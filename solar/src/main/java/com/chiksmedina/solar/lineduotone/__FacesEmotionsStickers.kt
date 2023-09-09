package com.chiksmedina.solar.lineduotone

import androidx.compose.ui.graphics.vector.ImageVector
import com.chiksmedina.solar.LineduotoneGroup
import com.chiksmedina.solar.lineduotone.facesemotionsstickers.ConfoundedCircle
import com.chiksmedina.solar.lineduotone.facesemotionsstickers.ConfoundedSquare
import com.chiksmedina.solar.lineduotone.facesemotionsstickers.EmojiFunnyCircle
import com.chiksmedina.solar.lineduotone.facesemotionsstickers.EmojiFunnySquare
import com.chiksmedina.solar.lineduotone.facesemotionsstickers.ExpressionlessCircle
import com.chiksmedina.solar.lineduotone.facesemotionsstickers.ExpressionlessSquare
import com.chiksmedina.solar.lineduotone.facesemotionsstickers.FaceScanCircle
import com.chiksmedina.solar.lineduotone.facesemotionsstickers.FaceScanSquare
import com.chiksmedina.solar.lineduotone.facesemotionsstickers.FacemaskCircle
import com.chiksmedina.solar.lineduotone.facesemotionsstickers.FacemaskSquare
import com.chiksmedina.solar.lineduotone.facesemotionsstickers.SadCircle
import com.chiksmedina.solar.lineduotone.facesemotionsstickers.SadSquare
import com.chiksmedina.solar.lineduotone.facesemotionsstickers.SleepingCircle
import com.chiksmedina.solar.lineduotone.facesemotionsstickers.SleepingSquare
import com.chiksmedina.solar.lineduotone.facesemotionsstickers.SmileCircle
import com.chiksmedina.solar.lineduotone.facesemotionsstickers.SmileSquare
import com.chiksmedina.solar.lineduotone.facesemotionsstickers.StickerCircle
import com.chiksmedina.solar.lineduotone.facesemotionsstickers.StickerSmileCircle
import com.chiksmedina.solar.lineduotone.facesemotionsstickers.StickerSmileCircle2
import com.chiksmedina.solar.lineduotone.facesemotionsstickers.StickerSmileSquare
import com.chiksmedina.solar.lineduotone.facesemotionsstickers.StickerSquare
import kotlin.collections.List as ____KtList

public object FacesEmotionsStickersGroup

public val LineduotoneGroup.FacesEmotionsStickers: FacesEmotionsStickersGroup
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
