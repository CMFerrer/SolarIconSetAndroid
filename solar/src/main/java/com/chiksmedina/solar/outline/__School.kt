package com.chiksmedina.solar.outline

import androidx.compose.ui.graphics.vector.ImageVector
import com.chiksmedina.solar.OutlineGroup
import com.chiksmedina.solar.outline.school.Backpack
import com.chiksmedina.solar.outline.school.Book
import com.chiksmedina.solar.outline.school.Book2
import com.chiksmedina.solar.outline.school.BookBookmark
import com.chiksmedina.solar.outline.school.BookBookmarkMinimalistic
import com.chiksmedina.solar.outline.school.BookMinimalistic
import com.chiksmedina.solar.outline.school.Bookmark
import com.chiksmedina.solar.outline.school.BookmarkCircle
import com.chiksmedina.solar.outline.school.BookmarkOpened
import com.chiksmedina.solar.outline.school.BookmarkSquare
import com.chiksmedina.solar.outline.school.BookmarkSquareMinimalistic
import com.chiksmedina.solar.outline.school.Calculator
import com.chiksmedina.solar.outline.school.CalculatorMinimalistic
import com.chiksmedina.solar.outline.school.Case
import com.chiksmedina.solar.outline.school.CaseMinimalistic
import com.chiksmedina.solar.outline.school.CaseRound
import com.chiksmedina.solar.outline.school.CaseRoundMinimalistic
import com.chiksmedina.solar.outline.school.Diploma
import com.chiksmedina.solar.outline.school.DiplomaVerified
import com.chiksmedina.solar.outline.school.Document
import com.chiksmedina.solar.outline.school.Notebook
import com.chiksmedina.solar.outline.school.NotebookBookmark
import com.chiksmedina.solar.outline.school.NotebookMinimalistic
import com.chiksmedina.solar.outline.school.NotebookSquare
import com.chiksmedina.solar.outline.school.Passport
import com.chiksmedina.solar.outline.school.PassportMinimalistic
import com.chiksmedina.solar.outline.school.PlusMinus
import com.chiksmedina.solar.outline.school.SquareAcademicCap
import com.chiksmedina.solar.outline.school.SquareAcademicCap2
import kotlin.collections.List as ____KtList

public object SchoolGroup

public val OutlineGroup.School: SchoolGroup
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
