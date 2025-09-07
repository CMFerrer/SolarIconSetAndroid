package com.chiksmedina.solar.outline

import androidx.compose.ui.graphics.vector.ImageVector
import com.chiksmedina.solar.OutlineSolar
import com.chiksmedina.solar.outline.textformatting.Backspace
import com.chiksmedina.solar.outline.textformatting.Eraser
import com.chiksmedina.solar.outline.textformatting.EraserCircle
import com.chiksmedina.solar.outline.textformatting.EraserSquare
import com.chiksmedina.solar.outline.textformatting.Link
import com.chiksmedina.solar.outline.textformatting.LinkBroken
import com.chiksmedina.solar.outline.textformatting.LinkBrokenMinimalistic
import com.chiksmedina.solar.outline.textformatting.LinkCircle
import com.chiksmedina.solar.outline.textformatting.LinkMinimalistic
import com.chiksmedina.solar.outline.textformatting.LinkMinimalistic2
import com.chiksmedina.solar.outline.textformatting.LinkRound
import com.chiksmedina.solar.outline.textformatting.LinkRoundAngle
import com.chiksmedina.solar.outline.textformatting.LinkSquare
import com.chiksmedina.solar.outline.textformatting.ParagraphSpacing
import com.chiksmedina.solar.outline.textformatting.Text
import com.chiksmedina.solar.outline.textformatting.TextBold
import com.chiksmedina.solar.outline.textformatting.TextBoldCircle
import com.chiksmedina.solar.outline.textformatting.TextBoldSquare
import com.chiksmedina.solar.outline.textformatting.TextCircle
import com.chiksmedina.solar.outline.textformatting.TextCross
import com.chiksmedina.solar.outline.textformatting.TextCrossCircle
import com.chiksmedina.solar.outline.textformatting.TextCrossSquare
import com.chiksmedina.solar.outline.textformatting.TextField
import com.chiksmedina.solar.outline.textformatting.TextFieldFocus
import com.chiksmedina.solar.outline.textformatting.TextItalic
import com.chiksmedina.solar.outline.textformatting.TextItalicCircle
import com.chiksmedina.solar.outline.textformatting.TextItalicSquare
import com.chiksmedina.solar.outline.textformatting.TextSelection
import com.chiksmedina.solar.outline.textformatting.TextSquare
import com.chiksmedina.solar.outline.textformatting.TextSquare2
import com.chiksmedina.solar.outline.textformatting.TextUnderline
import com.chiksmedina.solar.outline.textformatting.TextUnderlineCircle
import com.chiksmedina.solar.outline.textformatting.TextUnderlineCross
import kotlin.collections.List as KtList

object TextFormattingGroup

val OutlineSolar.TextFormatting: TextFormattingGroup
    get() = TextFormattingGroup

private var _AllIcons: KtList<ImageVector>? = null

val TextFormattingGroup.AllIcons: KtList<ImageVector>
    get() {
        if (_AllIcons != null) {
            return _AllIcons!!
        }
        _AllIcons = listOf(
            Backspace,
            Eraser,
            EraserCircle,
            EraserSquare,
            Link,
            LinkBroken,
            LinkBrokenMinimalistic,
            LinkCircle,
            LinkMinimalistic,
            LinkMinimalistic2,
            LinkRound,
            LinkRoundAngle,
            LinkSquare,
            ParagraphSpacing,
            Text,
            TextBold,
            TextBoldCircle,
            TextBoldSquare,
            TextCircle,
            TextCross,
            TextCrossCircle,
            TextCrossSquare,
            TextField,
            TextFieldFocus,
            TextItalic,
            TextItalicCircle,
            TextItalicSquare,
            TextSelection,
            TextSquare,
            TextSquare2,
            TextUnderline,
            TextUnderlineCircle,
            TextUnderlineCross
        )
        return _AllIcons!!
    }
