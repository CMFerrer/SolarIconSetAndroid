package dev.chiksmedina.solar.bold

import androidx.compose.ui.graphics.vector.ImageVector
import dev.chiksmedina.solar.BoldSolar
import dev.chiksmedina.solar.bold.textformatting.Backspace
import dev.chiksmedina.solar.bold.textformatting.Eraser
import dev.chiksmedina.solar.bold.textformatting.EraserCircle
import dev.chiksmedina.solar.bold.textformatting.EraserSquare
import dev.chiksmedina.solar.bold.textformatting.Link
import dev.chiksmedina.solar.bold.textformatting.LinkBroken
import dev.chiksmedina.solar.bold.textformatting.LinkBrokenMinimalistic
import dev.chiksmedina.solar.bold.textformatting.LinkCircle
import dev.chiksmedina.solar.bold.textformatting.LinkMinimalistic
import dev.chiksmedina.solar.bold.textformatting.LinkMinimalistic2
import dev.chiksmedina.solar.bold.textformatting.LinkRound
import dev.chiksmedina.solar.bold.textformatting.LinkRoundAngle
import dev.chiksmedina.solar.bold.textformatting.LinkSquare
import dev.chiksmedina.solar.bold.textformatting.ParagraphSpacing
import dev.chiksmedina.solar.bold.textformatting.Text
import dev.chiksmedina.solar.bold.textformatting.TextBold
import dev.chiksmedina.solar.bold.textformatting.TextBoldCircle
import dev.chiksmedina.solar.bold.textformatting.TextBoldSquare
import dev.chiksmedina.solar.bold.textformatting.TextCircle
import dev.chiksmedina.solar.bold.textformatting.TextCross
import dev.chiksmedina.solar.bold.textformatting.TextCrossCircle
import dev.chiksmedina.solar.bold.textformatting.TextCrossSquare
import dev.chiksmedina.solar.bold.textformatting.TextField
import dev.chiksmedina.solar.bold.textformatting.TextFieldFocus
import dev.chiksmedina.solar.bold.textformatting.TextItalic
import dev.chiksmedina.solar.bold.textformatting.TextItalicCircle
import dev.chiksmedina.solar.bold.textformatting.TextItalicSquare
import dev.chiksmedina.solar.bold.textformatting.TextSelection
import dev.chiksmedina.solar.bold.textformatting.TextSquare
import dev.chiksmedina.solar.bold.textformatting.TextSquare2
import dev.chiksmedina.solar.bold.textformatting.TextUnderline
import dev.chiksmedina.solar.bold.textformatting.TextUnderlineCircle
import dev.chiksmedina.solar.bold.textformatting.TextUnderlineCross
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
