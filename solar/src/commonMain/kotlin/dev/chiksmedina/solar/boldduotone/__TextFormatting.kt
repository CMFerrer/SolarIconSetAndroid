package dev.chiksmedina.solar.boldduotone

import androidx.compose.ui.graphics.vector.ImageVector
import dev.chiksmedina.solar.BoldDuotoneSolar
import dev.chiksmedina.solar.boldduotone.textformatting.Backspace
import dev.chiksmedina.solar.boldduotone.textformatting.Eraser
import dev.chiksmedina.solar.boldduotone.textformatting.EraserCircle
import dev.chiksmedina.solar.boldduotone.textformatting.EraserSquare
import dev.chiksmedina.solar.boldduotone.textformatting.Link
import dev.chiksmedina.solar.boldduotone.textformatting.LinkBroken
import dev.chiksmedina.solar.boldduotone.textformatting.LinkBrokenMinimalistic
import dev.chiksmedina.solar.boldduotone.textformatting.LinkCircle
import dev.chiksmedina.solar.boldduotone.textformatting.LinkMinimalistic
import dev.chiksmedina.solar.boldduotone.textformatting.LinkMinimalistic2
import dev.chiksmedina.solar.boldduotone.textformatting.LinkRound
import dev.chiksmedina.solar.boldduotone.textformatting.LinkRoundAngle
import dev.chiksmedina.solar.boldduotone.textformatting.LinkSquare
import dev.chiksmedina.solar.boldduotone.textformatting.ParagraphSpacing
import dev.chiksmedina.solar.boldduotone.textformatting.Text
import dev.chiksmedina.solar.boldduotone.textformatting.TextBold
import dev.chiksmedina.solar.boldduotone.textformatting.TextBoldCircle
import dev.chiksmedina.solar.boldduotone.textformatting.TextBoldSquare
import dev.chiksmedina.solar.boldduotone.textformatting.TextCircle
import dev.chiksmedina.solar.boldduotone.textformatting.TextCross
import dev.chiksmedina.solar.boldduotone.textformatting.TextCrossCircle
import dev.chiksmedina.solar.boldduotone.textformatting.TextCrossSquare
import dev.chiksmedina.solar.boldduotone.textformatting.TextField
import dev.chiksmedina.solar.boldduotone.textformatting.TextFieldFocus
import dev.chiksmedina.solar.boldduotone.textformatting.TextItalic
import dev.chiksmedina.solar.boldduotone.textformatting.TextItalicCircle
import dev.chiksmedina.solar.boldduotone.textformatting.TextItalicSquare
import dev.chiksmedina.solar.boldduotone.textformatting.TextSelection
import dev.chiksmedina.solar.boldduotone.textformatting.TextSquare
import dev.chiksmedina.solar.boldduotone.textformatting.TextSquare2
import dev.chiksmedina.solar.boldduotone.textformatting.TextUnderline
import dev.chiksmedina.solar.boldduotone.textformatting.TextUnderlineCircle
import dev.chiksmedina.solar.boldduotone.textformatting.TextUnderlineCross
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
