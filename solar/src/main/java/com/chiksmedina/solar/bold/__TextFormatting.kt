package com.chiksmedina.solar.bold

import androidx.compose.ui.graphics.vector.ImageVector
import com.chiksmedina.solar.BoldSolar
import com.chiksmedina.solar.bold.textformatting.Backspace
import com.chiksmedina.solar.bold.textformatting.Eraser
import com.chiksmedina.solar.bold.textformatting.EraserCircle
import com.chiksmedina.solar.bold.textformatting.EraserSquare
import com.chiksmedina.solar.bold.textformatting.Link
import com.chiksmedina.solar.bold.textformatting.LinkBroken
import com.chiksmedina.solar.bold.textformatting.LinkBrokenMinimalistic
import com.chiksmedina.solar.bold.textformatting.LinkCircle
import com.chiksmedina.solar.bold.textformatting.LinkMinimalistic
import com.chiksmedina.solar.bold.textformatting.LinkMinimalistic2
import com.chiksmedina.solar.bold.textformatting.LinkRound
import com.chiksmedina.solar.bold.textformatting.LinkRoundAngle
import com.chiksmedina.solar.bold.textformatting.LinkSquare
import com.chiksmedina.solar.bold.textformatting.ParagraphSpacing
import com.chiksmedina.solar.bold.textformatting.Text
import com.chiksmedina.solar.bold.textformatting.TextBold
import com.chiksmedina.solar.bold.textformatting.TextBoldCircle
import com.chiksmedina.solar.bold.textformatting.TextBoldSquare
import com.chiksmedina.solar.bold.textformatting.TextCircle
import com.chiksmedina.solar.bold.textformatting.TextCross
import com.chiksmedina.solar.bold.textformatting.TextCrossCircle
import com.chiksmedina.solar.bold.textformatting.TextCrossSquare
import com.chiksmedina.solar.bold.textformatting.TextField
import com.chiksmedina.solar.bold.textformatting.TextFieldFocus
import com.chiksmedina.solar.bold.textformatting.TextItalic
import com.chiksmedina.solar.bold.textformatting.TextItalicCircle
import com.chiksmedina.solar.bold.textformatting.TextItalicSquare
import com.chiksmedina.solar.bold.textformatting.TextSelection
import com.chiksmedina.solar.bold.textformatting.TextSquare
import com.chiksmedina.solar.bold.textformatting.TextSquare2
import com.chiksmedina.solar.bold.textformatting.TextUnderline
import com.chiksmedina.solar.bold.textformatting.TextUnderlineCircle
import com.chiksmedina.solar.bold.textformatting.TextUnderlineCross
import kotlin.collections.List as KtList

object TextFormattingGroup

val BoldSolar.TextFormatting: TextFormattingGroup
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
