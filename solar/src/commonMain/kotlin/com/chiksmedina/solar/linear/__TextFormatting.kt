package com.chiksmedina.solar.linear

import androidx.compose.ui.graphics.vector.ImageVector
import com.chiksmedina.solar.LinearSolar
import com.chiksmedina.solar.linear.textformatting.Backspace
import com.chiksmedina.solar.linear.textformatting.Eraser
import com.chiksmedina.solar.linear.textformatting.EraserCircle
import com.chiksmedina.solar.linear.textformatting.EraserSquare
import com.chiksmedina.solar.linear.textformatting.Link
import com.chiksmedina.solar.linear.textformatting.LinkBroken
import com.chiksmedina.solar.linear.textformatting.LinkBrokenMinimalistic
import com.chiksmedina.solar.linear.textformatting.LinkCircle
import com.chiksmedina.solar.linear.textformatting.LinkMinimalistic
import com.chiksmedina.solar.linear.textformatting.LinkMinimalistic2
import com.chiksmedina.solar.linear.textformatting.LinkRound
import com.chiksmedina.solar.linear.textformatting.LinkRoundAngle
import com.chiksmedina.solar.linear.textformatting.LinkSquare
import com.chiksmedina.solar.linear.textformatting.ParagraphSpacing
import com.chiksmedina.solar.linear.textformatting.Text
import com.chiksmedina.solar.linear.textformatting.TextBold
import com.chiksmedina.solar.linear.textformatting.TextBoldCircle
import com.chiksmedina.solar.linear.textformatting.TextBoldSquare
import com.chiksmedina.solar.linear.textformatting.TextCircle
import com.chiksmedina.solar.linear.textformatting.TextCross
import com.chiksmedina.solar.linear.textformatting.TextCrossCircle
import com.chiksmedina.solar.linear.textformatting.TextCrossSquare
import com.chiksmedina.solar.linear.textformatting.TextField
import com.chiksmedina.solar.linear.textformatting.TextFieldFocus
import com.chiksmedina.solar.linear.textformatting.TextItalic
import com.chiksmedina.solar.linear.textformatting.TextItalicCircle
import com.chiksmedina.solar.linear.textformatting.TextItalicSquare
import com.chiksmedina.solar.linear.textformatting.TextSelection
import com.chiksmedina.solar.linear.textformatting.TextSquare
import com.chiksmedina.solar.linear.textformatting.TextSquare2
import com.chiksmedina.solar.linear.textformatting.TextUnderline
import com.chiksmedina.solar.linear.textformatting.TextUnderlineCircle
import com.chiksmedina.solar.linear.textformatting.TextUnderlineCross
import kotlin.collections.List as KtList

object TextFormattingGroup

val LinearSolar.TextFormatting: TextFormattingGroup
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
