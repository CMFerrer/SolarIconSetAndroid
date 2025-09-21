package dev.chiksmedina.solar.outline

import androidx.compose.ui.graphics.vector.ImageVector
import dev.chiksmedina.solar.OutlineSolar
import dev.chiksmedina.solar.outline.textformatting.Backspace
import dev.chiksmedina.solar.outline.textformatting.Eraser
import dev.chiksmedina.solar.outline.textformatting.EraserCircle
import dev.chiksmedina.solar.outline.textformatting.EraserSquare
import dev.chiksmedina.solar.outline.textformatting.Link
import dev.chiksmedina.solar.outline.textformatting.LinkBroken
import dev.chiksmedina.solar.outline.textformatting.LinkBrokenMinimalistic
import dev.chiksmedina.solar.outline.textformatting.LinkCircle
import dev.chiksmedina.solar.outline.textformatting.LinkMinimalistic
import dev.chiksmedina.solar.outline.textformatting.LinkMinimalistic2
import dev.chiksmedina.solar.outline.textformatting.LinkRound
import dev.chiksmedina.solar.outline.textformatting.LinkRoundAngle
import dev.chiksmedina.solar.outline.textformatting.LinkSquare
import dev.chiksmedina.solar.outline.textformatting.ParagraphSpacing
import dev.chiksmedina.solar.outline.textformatting.Text
import dev.chiksmedina.solar.outline.textformatting.TextBold
import dev.chiksmedina.solar.outline.textformatting.TextBoldCircle
import dev.chiksmedina.solar.outline.textformatting.TextBoldSquare
import dev.chiksmedina.solar.outline.textformatting.TextCircle
import dev.chiksmedina.solar.outline.textformatting.TextCross
import dev.chiksmedina.solar.outline.textformatting.TextCrossCircle
import dev.chiksmedina.solar.outline.textformatting.TextCrossSquare
import dev.chiksmedina.solar.outline.textformatting.TextField
import dev.chiksmedina.solar.outline.textformatting.TextFieldFocus
import dev.chiksmedina.solar.outline.textformatting.TextItalic
import dev.chiksmedina.solar.outline.textformatting.TextItalicCircle
import dev.chiksmedina.solar.outline.textformatting.TextItalicSquare
import dev.chiksmedina.solar.outline.textformatting.TextSelection
import dev.chiksmedina.solar.outline.textformatting.TextSquare
import dev.chiksmedina.solar.outline.textformatting.TextSquare2
import dev.chiksmedina.solar.outline.textformatting.TextUnderline
import dev.chiksmedina.solar.outline.textformatting.TextUnderlineCircle
import dev.chiksmedina.solar.outline.textformatting.TextUnderlineCross
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
