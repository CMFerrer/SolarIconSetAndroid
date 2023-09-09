package com.chiksmedina.solar.broken

import androidx.compose.ui.graphics.vector.ImageVector
import com.chiksmedina.solar.BrokenGroup
import com.chiksmedina.solar.broken.school.Backpack
import com.chiksmedina.solar.broken.school.Book
import com.chiksmedina.solar.broken.school.Book2
import com.chiksmedina.solar.broken.school.BookBookmark
import com.chiksmedina.solar.broken.school.BookBookmarkMinimalistic
import com.chiksmedina.solar.broken.school.BookMinimalistic
import com.chiksmedina.solar.broken.school.Bookmark
import com.chiksmedina.solar.broken.school.BookmarkCircle
import com.chiksmedina.solar.broken.school.BookmarkOpened
import com.chiksmedina.solar.broken.school.BookmarkSquare
import com.chiksmedina.solar.broken.school.BookmarkSquareMinimalistic
import com.chiksmedina.solar.broken.school.Calculator
import com.chiksmedina.solar.broken.school.CalculatorMinimalistic
import com.chiksmedina.solar.broken.school.Case
import com.chiksmedina.solar.broken.school.CaseMinimalistic
import com.chiksmedina.solar.broken.school.CaseRound
import com.chiksmedina.solar.broken.school.CaseRoundMinimalistic
import com.chiksmedina.solar.broken.school.Diploma
import com.chiksmedina.solar.broken.school.DiplomaVerified
import com.chiksmedina.solar.broken.school.Document
import com.chiksmedina.solar.broken.school.Notebook
import com.chiksmedina.solar.broken.school.NotebookBookmark
import com.chiksmedina.solar.broken.school.NotebookMinimalistic
import com.chiksmedina.solar.broken.school.NotebookSquare
import com.chiksmedina.solar.broken.school.Passport
import com.chiksmedina.solar.broken.school.PassportMinimalistic
import com.chiksmedina.solar.broken.school.PlusMinus
import com.chiksmedina.solar.broken.school.SquareAcademicCap
import com.chiksmedina.solar.broken.school.SquareAcademicCap2
import kotlin.collections.List as ____KtList

public object SchoolGroup

public val BrokenGroup.School: SchoolGroup
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
