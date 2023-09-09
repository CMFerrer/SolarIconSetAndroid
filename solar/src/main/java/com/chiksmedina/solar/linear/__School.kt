package com.chiksmedina.solar.linear

import androidx.compose.ui.graphics.vector.ImageVector
import com.chiksmedina.solar.LinearGroup
import com.chiksmedina.solar.linear.school.Backpack
import com.chiksmedina.solar.linear.school.Book
import com.chiksmedina.solar.linear.school.Book2
import com.chiksmedina.solar.linear.school.BookBookmark
import com.chiksmedina.solar.linear.school.BookBookmarkMinimalistic
import com.chiksmedina.solar.linear.school.BookMinimalistic
import com.chiksmedina.solar.linear.school.Bookmark
import com.chiksmedina.solar.linear.school.BookmarkCircle
import com.chiksmedina.solar.linear.school.BookmarkOpened
import com.chiksmedina.solar.linear.school.BookmarkSquare
import com.chiksmedina.solar.linear.school.BookmarkSquareMinimalistic
import com.chiksmedina.solar.linear.school.Calculator
import com.chiksmedina.solar.linear.school.CalculatorMinimalistic
import com.chiksmedina.solar.linear.school.Case
import com.chiksmedina.solar.linear.school.CaseMinimalistic
import com.chiksmedina.solar.linear.school.CaseRound
import com.chiksmedina.solar.linear.school.CaseRoundMinimalistic
import com.chiksmedina.solar.linear.school.Diploma
import com.chiksmedina.solar.linear.school.DiplomaVerified
import com.chiksmedina.solar.linear.school.Document
import com.chiksmedina.solar.linear.school.Notebook
import com.chiksmedina.solar.linear.school.NotebookBookmark
import com.chiksmedina.solar.linear.school.NotebookMinimalistic
import com.chiksmedina.solar.linear.school.NotebookSquare
import com.chiksmedina.solar.linear.school.Passport
import com.chiksmedina.solar.linear.school.PassportMinimalistic
import com.chiksmedina.solar.linear.school.PlusMinus
import com.chiksmedina.solar.linear.school.SquareAcademicCap
import com.chiksmedina.solar.linear.school.SquareAcademicCap2
import kotlin.collections.List as ____KtList

public object SchoolGroup

public val LinearGroup.School: SchoolGroup
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
