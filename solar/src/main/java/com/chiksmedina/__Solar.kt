package com.chiksmedina

import androidx.compose.ui.graphics.vector.ImageVector
import com.chiksmedina.solar.AllIcons
import com.chiksmedina.solar.Bold
import com.chiksmedina.solar.Boldduotone
import com.chiksmedina.solar.Broken
import com.chiksmedina.solar.Linear
import com.chiksmedina.solar.Lineduotone
import com.chiksmedina.solar.Outline
import com.chiksmedina.solar.outline.ArrowsAction
import com.chiksmedina.solar.outline.arrowsaction.ArrowToDownLeft
import kotlin.collections.List as ____KtList

public object Solar

private var __AllIcons: ____KtList<ImageVector>? = null

public val Solar.AllIcons: ____KtList<ImageVector>
  get() {
    if (__AllIcons != null) {
      return __AllIcons!!
    }
    __AllIcons= Bold.AllIcons + Boldduotone.AllIcons + Broken.AllIcons + Linear.AllIcons +
        Lineduotone.AllIcons + Outline.AllIcons + listOf()
    return __AllIcons!!
  }
