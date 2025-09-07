package com.chiksmedina.solar.boldduotone

import androidx.compose.ui.graphics.vector.ImageVector
import com.chiksmedina.solar.BoldDuotoneSolar
import com.chiksmedina.solar.boldduotone.textformatting.Backspace
import com.chiksmedina.solar.boldduotone.textformatting.Eraser
import com.chiksmedina.solar.boldduotone.textformatting.EraserCircle
import com.chiksmedina.solar.boldduotone.textformatting.EraserSquare
import com.chiksmedina.solar.boldduotone.textformatting.Link
import com.chiksmedina.solar.boldduotone.textformatting.LinkBroken
import com.chiksmedina.solar.boldduotone.textformatting.LinkBrokenMinimalistic
import com.chiksmedina.solar.boldduotone.textformatting.LinkCircle
import com.chiksmedina.solar.boldduotone.textformatting.LinkMinimalistic
import com.chiksmedina.solar.boldduotone.textformatting.LinkMinimalistic2
import com.chiksmedina.solar.boldduotone.textformatting.LinkRound
import com.chiksmedina.solar.boldduotone.textformatting.LinkRoundAngle
import com.chiksmedina.solar.boldduotone.textformatting.LinkSquare
import com.chiksmedina.solar.boldduotone.textformatting.ParagraphSpacing
import com.chiksmedina.solar.boldduotone.textformatting.Text
import com.chiksmedina.solar.boldduotone.textformatting.TextBold
import com.chiksmedina.solar.boldduotone.textformatting.TextBoldCircle
import com.chiksmedina.solar.boldduotone.textformatting.TextBoldSquare
import com.chiksmedina.solar.boldduotone.textformatting.TextCircle
import com.chiksmedina.solar.boldduotone.textformatting.TextCross
import com.chiksmedina.solar.boldduotone.textformatting.TextCrossCircle
import com.chiksmedina.solar.boldduotone.textformatting.TextCrossSquare
import com.chiksmedina.solar.boldduotone.textformatting.TextField
import com.chiksmedina.solar.boldduotone.textformatting.TextFieldFocus
import com.chiksmedina.solar.boldduotone.textformatting.TextItalic
import com.chiksmedina.solar.boldduotone.textformatting.TextItalicCircle
import com.chiksmedina.solar.boldduotone.textformatting.TextItalicSquare
import com.chiksmedina.solar.boldduotone.textformatting.TextSelection
import com.chiksmedina.solar.boldduotone.textformatting.TextSquare
import com.chiksmedina.solar.boldduotone.textformatting.TextSquare2
import com.chiksmedina.solar.boldduotone.textformatting.TextUnderline
import com.chiksmedina.solar.boldduotone.textformatting.TextUnderlineCircle
import com.chiksmedina.solar.boldduotone.textformatting.TextUnderlineCross
import kotlin.collections.List as KtList

object TextFormattingGroup

val BoldDuotoneSolar.TextFormatting: TextFormattingGroup
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
