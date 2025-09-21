package dev.chiksmedina.solar.linear

import androidx.compose.ui.graphics.vector.ImageVector
import dev.chiksmedina.solar.LinearSolar
import dev.chiksmedina.solar.linear.textformatting.Backspace
import dev.chiksmedina.solar.linear.textformatting.Eraser
import dev.chiksmedina.solar.linear.textformatting.EraserCircle
import dev.chiksmedina.solar.linear.textformatting.EraserSquare
import dev.chiksmedina.solar.linear.textformatting.Link
import dev.chiksmedina.solar.linear.textformatting.LinkBroken
import dev.chiksmedina.solar.linear.textformatting.LinkBrokenMinimalistic
import dev.chiksmedina.solar.linear.textformatting.LinkCircle
import dev.chiksmedina.solar.linear.textformatting.LinkMinimalistic
import dev.chiksmedina.solar.linear.textformatting.LinkMinimalistic2
import dev.chiksmedina.solar.linear.textformatting.LinkRound
import dev.chiksmedina.solar.linear.textformatting.LinkRoundAngle
import dev.chiksmedina.solar.linear.textformatting.LinkSquare
import dev.chiksmedina.solar.linear.textformatting.ParagraphSpacing
import dev.chiksmedina.solar.linear.textformatting.Text
import dev.chiksmedina.solar.linear.textformatting.TextBold
import dev.chiksmedina.solar.linear.textformatting.TextBoldCircle
import dev.chiksmedina.solar.linear.textformatting.TextBoldSquare
import dev.chiksmedina.solar.linear.textformatting.TextCircle
import dev.chiksmedina.solar.linear.textformatting.TextCross
import dev.chiksmedina.solar.linear.textformatting.TextCrossCircle
import dev.chiksmedina.solar.linear.textformatting.TextCrossSquare
import dev.chiksmedina.solar.linear.textformatting.TextField
import dev.chiksmedina.solar.linear.textformatting.TextFieldFocus
import dev.chiksmedina.solar.linear.textformatting.TextItalic
import dev.chiksmedina.solar.linear.textformatting.TextItalicCircle
import dev.chiksmedina.solar.linear.textformatting.TextItalicSquare
import dev.chiksmedina.solar.linear.textformatting.TextSelection
import dev.chiksmedina.solar.linear.textformatting.TextSquare
import dev.chiksmedina.solar.linear.textformatting.TextSquare2
import dev.chiksmedina.solar.linear.textformatting.TextUnderline
import dev.chiksmedina.solar.linear.textformatting.TextUnderlineCircle
import dev.chiksmedina.solar.linear.textformatting.TextUnderlineCross
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
