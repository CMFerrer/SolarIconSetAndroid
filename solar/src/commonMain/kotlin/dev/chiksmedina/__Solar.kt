package dev.chiksmedina

import androidx.compose.ui.graphics.vector.ImageVector
import dev.chiksmedina.solar.AllIcons
import dev.chiksmedina.solar.Bold
import dev.chiksmedina.solar.BoldDuotone
import dev.chiksmedina.solar.Broken
import dev.chiksmedina.solar.Linear
import dev.chiksmedina.solar.LineDuotone
import dev.chiksmedina.solar.Outline
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
