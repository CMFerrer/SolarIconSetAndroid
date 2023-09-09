package com.chiksmedina.solar.bold

import androidx.compose.ui.graphics.vector.ImageVector
import com.chiksmedina.solar.BoldGroup
import com.chiksmedina.solar.bold.school.Backpack
import com.chiksmedina.solar.bold.school.Book
import com.chiksmedina.solar.bold.school.Book2
import com.chiksmedina.solar.bold.school.BookBookmark
import com.chiksmedina.solar.bold.school.BookBookmarkMinimalistic
import com.chiksmedina.solar.bold.school.BookMinimalistic
import com.chiksmedina.solar.bold.school.Bookmark
import com.chiksmedina.solar.bold.school.BookmarkCircle
import com.chiksmedina.solar.bold.school.BookmarkOpened
import com.chiksmedina.solar.bold.school.BookmarkSquare
import com.chiksmedina.solar.bold.school.BookmarkSquareMinimalistic
import com.chiksmedina.solar.bold.school.Calculator
import com.chiksmedina.solar.bold.school.CalculatorMinimalistic
import com.chiksmedina.solar.bold.school.Case
import com.chiksmedina.solar.bold.school.CaseMinimalistic
import com.chiksmedina.solar.bold.school.CaseRound
import com.chiksmedina.solar.bold.school.CaseRoundMinimalistic
import com.chiksmedina.solar.bold.school.Diploma
import com.chiksmedina.solar.bold.school.DiplomaVerified
import com.chiksmedina.solar.bold.school.Document
import com.chiksmedina.solar.bold.school.Notebook
import com.chiksmedina.solar.bold.school.NotebookBookmark
import com.chiksmedina.solar.bold.school.NotebookMinimalistic
import com.chiksmedina.solar.bold.school.NotebookSquare
import com.chiksmedina.solar.bold.school.Passport
import com.chiksmedina.solar.bold.school.PassportMinimalistic
import com.chiksmedina.solar.bold.school.PlusMinus
import com.chiksmedina.solar.bold.school.SquareAcademicCap
import com.chiksmedina.solar.bold.school.SquareAcademicCap2
import kotlin.collections.List as ____KtList

public object SchoolGroup

public val BoldGroup.School: SchoolGroup
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
