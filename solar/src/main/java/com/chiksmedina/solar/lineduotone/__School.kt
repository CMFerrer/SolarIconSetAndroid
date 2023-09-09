package com.chiksmedina.solar.lineduotone

import androidx.compose.ui.graphics.vector.ImageVector
import com.chiksmedina.solar.LineduotoneGroup
import com.chiksmedina.solar.lineduotone.school.Backpack
import com.chiksmedina.solar.lineduotone.school.Book
import com.chiksmedina.solar.lineduotone.school.Book2
import com.chiksmedina.solar.lineduotone.school.BookBookmark
import com.chiksmedina.solar.lineduotone.school.BookBookmarkMinimalistic
import com.chiksmedina.solar.lineduotone.school.BookMinimalistic
import com.chiksmedina.solar.lineduotone.school.Bookmark
import com.chiksmedina.solar.lineduotone.school.BookmarkCircle
import com.chiksmedina.solar.lineduotone.school.BookmarkOpened
import com.chiksmedina.solar.lineduotone.school.BookmarkSquare
import com.chiksmedina.solar.lineduotone.school.BookmarkSquareMinimalistic
import com.chiksmedina.solar.lineduotone.school.Calculator
import com.chiksmedina.solar.lineduotone.school.CalculatorMinimalistic
import com.chiksmedina.solar.lineduotone.school.Case
import com.chiksmedina.solar.lineduotone.school.CaseMinimalistic
import com.chiksmedina.solar.lineduotone.school.CaseRound
import com.chiksmedina.solar.lineduotone.school.CaseRoundMinimalistic
import com.chiksmedina.solar.lineduotone.school.Diploma
import com.chiksmedina.solar.lineduotone.school.DiplomaVerified
import com.chiksmedina.solar.lineduotone.school.Document
import com.chiksmedina.solar.lineduotone.school.Notebook
import com.chiksmedina.solar.lineduotone.school.NotebookBookmark
import com.chiksmedina.solar.lineduotone.school.NotebookMinimalistic
import com.chiksmedina.solar.lineduotone.school.NotebookSquare
import com.chiksmedina.solar.lineduotone.school.Passport
import com.chiksmedina.solar.lineduotone.school.PassportMinimalistic
import com.chiksmedina.solar.lineduotone.school.PlusMinus
import com.chiksmedina.solar.lineduotone.school.SquareAcademicCap
import com.chiksmedina.solar.lineduotone.school.SquareAcademicCap2
import kotlin.collections.List as ____KtList

public object SchoolGroup

public val LineduotoneGroup.School: SchoolGroup
  get() = SchoolGroup

private var __AllIcons: ____KtList<ImageVector>? = null

public val SchoolGroup.AllIcons: ____KtList<ImageVector>
  get() {
    if (__AllIcons != null) {
      return __AllIcons!!
    }
    __AllIcons= listOf(Backpack, Book, Bookmark, BookmarkCircle, BookmarkOpened, BookmarkSquare,
        BookmarkSquareMinimalistic, Book2, BookBookmark, BookBookmarkMinimalistic, BookMinimalistic,
        Calculator, CalculatorMinimalistic, Case, CaseMinimalistic, CaseRound,
        CaseRoundMinimalistic, Diploma, DiplomaVerified, Document, Notebook, NotebookBookmark,
        NotebookMinimalistic, NotebookSquare, Passport, PassportMinimalistic, PlusMinus,
        SquareAcademicCap, SquareAcademicCap2)
    return __AllIcons!!
  }
