package com.chiksmedina.solar.broken

import androidx.compose.ui.graphics.vector.ImageVector
import com.chiksmedina.solar.BrokenSolar
import com.chiksmedina.solar.broken.textformatting.Backspace
import com.chiksmedina.solar.broken.textformatting.Eraser
import com.chiksmedina.solar.broken.textformatting.EraserCircle
import com.chiksmedina.solar.broken.textformatting.EraserSquare
import com.chiksmedina.solar.broken.textformatting.Link
import com.chiksmedina.solar.broken.textformatting.LinkBroken
import com.chiksmedina.solar.broken.textformatting.LinkBrokenMinimalistic
import com.chiksmedina.solar.broken.textformatting.LinkCircle
import com.chiksmedina.solar.broken.textformatting.LinkMinimalistic
import com.chiksmedina.solar.broken.textformatting.LinkMinimalistic2
import com.chiksmedina.solar.broken.textformatting.LinkRound
import com.chiksmedina.solar.broken.textformatting.LinkRoundAngle
import com.chiksmedina.solar.broken.textformatting.LinkSquare
import com.chiksmedina.solar.broken.textformatting.ParagraphSpacing
import com.chiksmedina.solar.broken.textformatting.Text
import com.chiksmedina.solar.broken.textformatting.TextBold
import com.chiksmedina.solar.broken.textformatting.TextBoldCircle
import com.chiksmedina.solar.broken.textformatting.TextBoldSquare
import com.chiksmedina.solar.broken.textformatting.TextCircle
import com.chiksmedina.solar.broken.textformatting.TextCross
import com.chiksmedina.solar.broken.textformatting.TextCrossCircle
import com.chiksmedina.solar.broken.textformatting.TextCrossSquare
import com.chiksmedina.solar.broken.textformatting.TextField
import com.chiksmedina.solar.broken.textformatting.TextFieldFocus
import com.chiksmedina.solar.broken.textformatting.TextItalic
import com.chiksmedina.solar.broken.textformatting.TextItalicCircle
import com.chiksmedina.solar.broken.textformatting.TextItalicSquare
import com.chiksmedina.solar.broken.textformatting.TextSelection
import com.chiksmedina.solar.broken.textformatting.TextSquare
import com.chiksmedina.solar.broken.textformatting.TextSquare2
import com.chiksmedina.solar.broken.textformatting.TextUnderline
import com.chiksmedina.solar.broken.textformatting.TextUnderlineCircle
import com.chiksmedina.solar.broken.textformatting.TextUnderlineCross
import kotlin.collections.List as KtList

object TextFormattingGroup

val BrokenSolar.TextFormatting: TextFormattingGroup
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
