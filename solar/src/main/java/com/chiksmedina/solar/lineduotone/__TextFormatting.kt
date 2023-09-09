package com.chiksmedina.solar.lineduotone

import androidx.compose.ui.graphics.vector.ImageVector
import com.chiksmedina.solar.LineduotoneGroup
import com.chiksmedina.solar.lineduotone.textformatting.Backspace
import com.chiksmedina.solar.lineduotone.textformatting.Eraser
import com.chiksmedina.solar.lineduotone.textformatting.EraserCircle
import com.chiksmedina.solar.lineduotone.textformatting.EraserSquare
import com.chiksmedina.solar.lineduotone.textformatting.Link
import com.chiksmedina.solar.lineduotone.textformatting.LinkBroken
import com.chiksmedina.solar.lineduotone.textformatting.LinkBrokenMinimalistic
import com.chiksmedina.solar.lineduotone.textformatting.LinkCircle
import com.chiksmedina.solar.lineduotone.textformatting.LinkMinimalistic
import com.chiksmedina.solar.lineduotone.textformatting.LinkMinimalistic2
import com.chiksmedina.solar.lineduotone.textformatting.LinkRound
import com.chiksmedina.solar.lineduotone.textformatting.LinkRoundAngle
import com.chiksmedina.solar.lineduotone.textformatting.LinkSquare
import com.chiksmedina.solar.lineduotone.textformatting.ParagraphSpacing
import com.chiksmedina.solar.lineduotone.textformatting.Text
import com.chiksmedina.solar.lineduotone.textformatting.TextBold
import com.chiksmedina.solar.lineduotone.textformatting.TextBoldCircle
import com.chiksmedina.solar.lineduotone.textformatting.TextBoldSquare
import com.chiksmedina.solar.lineduotone.textformatting.TextCircle
import com.chiksmedina.solar.lineduotone.textformatting.TextCross
import com.chiksmedina.solar.lineduotone.textformatting.TextCrossCircle
import com.chiksmedina.solar.lineduotone.textformatting.TextCrossSquare
import com.chiksmedina.solar.lineduotone.textformatting.TextField
import com.chiksmedina.solar.lineduotone.textformatting.TextFieldFocus
import com.chiksmedina.solar.lineduotone.textformatting.TextItalic
import com.chiksmedina.solar.lineduotone.textformatting.TextItalicCircle
import com.chiksmedina.solar.lineduotone.textformatting.TextItalicSquare
import com.chiksmedina.solar.lineduotone.textformatting.TextSelection
import com.chiksmedina.solar.lineduotone.textformatting.TextSquare
import com.chiksmedina.solar.lineduotone.textformatting.TextSquare2
import com.chiksmedina.solar.lineduotone.textformatting.TextUnderline
import com.chiksmedina.solar.lineduotone.textformatting.TextUnderlineCircle
import com.chiksmedina.solar.lineduotone.textformatting.TextUnderlineCross
import kotlin.collections.List as ____KtList

public object TextFormattingGroup

public val LineduotoneGroup.TextFormatting: TextFormattingGroup
  get() = TextFormattingGroup

private var __AllIcons: ____KtList<ImageVector>? = null

public val TextFormattingGroup.AllIcons: ____KtList<ImageVector>
  get() {
    if (__AllIcons != null) {
      return __AllIcons!!
    }
    __AllIcons= listOf(Backspace, Eraser, EraserCircle, EraserSquare, Link, LinkBroken,
        LinkBrokenMinimalistic, LinkCircle, LinkMinimalistic, LinkMinimalistic2, LinkRound,
        LinkRoundAngle, LinkSquare, ParagraphSpacing, Text, TextBold, TextBoldCircle,
        TextBoldSquare, TextCircle, TextCross, TextCrossCircle, TextCrossSquare, TextField,
        TextFieldFocus, TextItalic, TextItalicCircle, TextItalicSquare, TextSelection, TextSquare,
        TextSquare2, TextUnderline, TextUnderlineCircle, TextUnderlineCross)
    return __AllIcons!!
  }
