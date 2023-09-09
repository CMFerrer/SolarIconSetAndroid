package com.chiksmedina.solar.outline

import androidx.compose.ui.graphics.vector.ImageVector
import com.chiksmedina.solar.OutlineGroup
import com.chiksmedina.solar.outline.facesemotionsstickers.ConfoundedCircle
import com.chiksmedina.solar.outline.facesemotionsstickers.ConfoundedSquare
import com.chiksmedina.solar.outline.facesemotionsstickers.EmojiFunnyCircle
import com.chiksmedina.solar.outline.facesemotionsstickers.EmojiFunnySquare
import com.chiksmedina.solar.outline.facesemotionsstickers.ExpressionlessCircle
import com.chiksmedina.solar.outline.facesemotionsstickers.ExpressionlessSquare
import com.chiksmedina.solar.outline.facesemotionsstickers.FaceScanCircle
import com.chiksmedina.solar.outline.facesemotionsstickers.FaceScanSquare
import com.chiksmedina.solar.outline.facesemotionsstickers.FacemaskCircle
import com.chiksmedina.solar.outline.facesemotionsstickers.FacemaskSquare
import com.chiksmedina.solar.outline.facesemotionsstickers.SadCircle
import com.chiksmedina.solar.outline.facesemotionsstickers.SadSquare
import com.chiksmedina.solar.outline.facesemotionsstickers.SleepingCircle
import com.chiksmedina.solar.outline.facesemotionsstickers.SleepingSquare
import com.chiksmedina.solar.outline.facesemotionsstickers.SmileCircle
import com.chiksmedina.solar.outline.facesemotionsstickers.SmileSquare
import com.chiksmedina.solar.outline.facesemotionsstickers.StickerCircle
import com.chiksmedina.solar.outline.facesemotionsstickers.StickerSmileCircle
import com.chiksmedina.solar.outline.facesemotionsstickers.StickerSmileCircle2
import com.chiksmedina.solar.outline.facesemotionsstickers.StickerSmileSquare
import com.chiksmedina.solar.outline.facesemotionsstickers.StickerSquare
import kotlin.collections.List as ____KtList

public object FacesEmotionsStickersGroup

public val OutlineGroup.FacesEmotionsStickers: FacesEmotionsStickersGroup
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
