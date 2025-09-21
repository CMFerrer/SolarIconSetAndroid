package dev.chiksmedina.solar.broken

import androidx.compose.ui.graphics.vector.ImageVector
import dev.chiksmedina.solar.BrokenSolar
import dev.chiksmedina.solar.broken.textformatting.Backspace
import dev.chiksmedina.solar.broken.textformatting.Eraser
import dev.chiksmedina.solar.broken.textformatting.EraserCircle
import dev.chiksmedina.solar.broken.textformatting.EraserSquare
import dev.chiksmedina.solar.broken.textformatting.Link
import dev.chiksmedina.solar.broken.textformatting.LinkBroken
import dev.chiksmedina.solar.broken.textformatting.LinkBrokenMinimalistic
import dev.chiksmedina.solar.broken.textformatting.LinkCircle
import dev.chiksmedina.solar.broken.textformatting.LinkMinimalistic
import dev.chiksmedina.solar.broken.textformatting.LinkMinimalistic2
import dev.chiksmedina.solar.broken.textformatting.LinkRound
import dev.chiksmedina.solar.broken.textformatting.LinkRoundAngle
import dev.chiksmedina.solar.broken.textformatting.LinkSquare
import dev.chiksmedina.solar.broken.textformatting.ParagraphSpacing
import dev.chiksmedina.solar.broken.textformatting.Text
import dev.chiksmedina.solar.broken.textformatting.TextBold
import dev.chiksmedina.solar.broken.textformatting.TextBoldCircle
import dev.chiksmedina.solar.broken.textformatting.TextBoldSquare
import dev.chiksmedina.solar.broken.textformatting.TextCircle
import dev.chiksmedina.solar.broken.textformatting.TextCross
import dev.chiksmedina.solar.broken.textformatting.TextCrossCircle
import dev.chiksmedina.solar.broken.textformatting.TextCrossSquare
import dev.chiksmedina.solar.broken.textformatting.TextField
import dev.chiksmedina.solar.broken.textformatting.TextFieldFocus
import dev.chiksmedina.solar.broken.textformatting.TextItalic
import dev.chiksmedina.solar.broken.textformatting.TextItalicCircle
import dev.chiksmedina.solar.broken.textformatting.TextItalicSquare
import dev.chiksmedina.solar.broken.textformatting.TextSelection
import dev.chiksmedina.solar.broken.textformatting.TextSquare
import dev.chiksmedina.solar.broken.textformatting.TextSquare2
import dev.chiksmedina.solar.broken.textformatting.TextUnderline
import dev.chiksmedina.solar.broken.textformatting.TextUnderlineCircle
import dev.chiksmedina.solar.broken.textformatting.TextUnderlineCross
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
