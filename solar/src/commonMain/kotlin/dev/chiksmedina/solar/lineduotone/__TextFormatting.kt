package dev.chiksmedina.solar.lineduotone

import androidx.compose.ui.graphics.vector.ImageVector
import dev.chiksmedina.solar.LineDuotoneSolar
import dev.chiksmedina.solar.lineduotone.textformatting.Backspace
import dev.chiksmedina.solar.lineduotone.textformatting.Eraser
import dev.chiksmedina.solar.lineduotone.textformatting.EraserCircle
import dev.chiksmedina.solar.lineduotone.textformatting.EraserSquare
import dev.chiksmedina.solar.lineduotone.textformatting.Link
import dev.chiksmedina.solar.lineduotone.textformatting.LinkBroken
import dev.chiksmedina.solar.lineduotone.textformatting.LinkBrokenMinimalistic
import dev.chiksmedina.solar.lineduotone.textformatting.LinkCircle
import dev.chiksmedina.solar.lineduotone.textformatting.LinkMinimalistic
import dev.chiksmedina.solar.lineduotone.textformatting.LinkMinimalistic2
import dev.chiksmedina.solar.lineduotone.textformatting.LinkRound
import dev.chiksmedina.solar.lineduotone.textformatting.LinkRoundAngle
import dev.chiksmedina.solar.lineduotone.textformatting.LinkSquare
import dev.chiksmedina.solar.lineduotone.textformatting.ParagraphSpacing
import dev.chiksmedina.solar.lineduotone.textformatting.Text
import dev.chiksmedina.solar.lineduotone.textformatting.TextBold
import dev.chiksmedina.solar.lineduotone.textformatting.TextBoldCircle
import dev.chiksmedina.solar.lineduotone.textformatting.TextBoldSquare
import dev.chiksmedina.solar.lineduotone.textformatting.TextCircle
import dev.chiksmedina.solar.lineduotone.textformatting.TextCross
import dev.chiksmedina.solar.lineduotone.textformatting.TextCrossCircle
import dev.chiksmedina.solar.lineduotone.textformatting.TextCrossSquare
import dev.chiksmedina.solar.lineduotone.textformatting.TextField
import dev.chiksmedina.solar.lineduotone.textformatting.TextFieldFocus
import dev.chiksmedina.solar.lineduotone.textformatting.TextItalic
import dev.chiksmedina.solar.lineduotone.textformatting.TextItalicCircle
import dev.chiksmedina.solar.lineduotone.textformatting.TextItalicSquare
import dev.chiksmedina.solar.lineduotone.textformatting.TextSelection
import dev.chiksmedina.solar.lineduotone.textformatting.TextSquare
import dev.chiksmedina.solar.lineduotone.textformatting.TextSquare2
import dev.chiksmedina.solar.lineduotone.textformatting.TextUnderline
import dev.chiksmedina.solar.lineduotone.textformatting.TextUnderlineCircle
import dev.chiksmedina.solar.lineduotone.textformatting.TextUnderlineCross
import kotlin.collections.List as KtList

object TextFormattingGroup

val LineDuotoneSolar.TextFormatting: TextFormattingGroup
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
