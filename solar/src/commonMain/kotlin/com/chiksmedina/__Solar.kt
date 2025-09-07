package com.chiksmedina

import androidx.compose.ui.graphics.vector.ImageVector
import com.chiksmedina.solar.AllIcons
import com.chiksmedina.solar.Bold
import com.chiksmedina.solar.BoldDuotone
import com.chiksmedina.solar.Broken
import com.chiksmedina.solar.Linear
import com.chiksmedina.solar.LineDuotone
import com.chiksmedina.solar.Outline
import kotlin.collections.List as KtList

object Solar

private var _AllIcons: KtList<ImageVector>? = null

val Solar.AllIcons: KtList<ImageVector>
    get() {
        if (_AllIcons != null) {
            return _AllIcons!!
        }
        _AllIcons = Bold.AllIcons + BoldDuotone.AllIcons + Broken.AllIcons + Linear.AllIcons +
                LineDuotone.AllIcons + Outline.AllIcons + listOf()
        return _AllIcons!!
    }
