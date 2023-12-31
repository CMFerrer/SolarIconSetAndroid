package com.chiksmedina.solar.boldduotone

import androidx.compose.ui.graphics.vector.ImageVector
import com.chiksmedina.solar.BoldDuotoneSolar
import com.chiksmedina.solar.boldduotone.school.Backpack
import com.chiksmedina.solar.boldduotone.school.Book
import com.chiksmedina.solar.boldduotone.school.Book2
import com.chiksmedina.solar.boldduotone.school.BookBookmark
import com.chiksmedina.solar.boldduotone.school.BookBookmarkMinimalistic
import com.chiksmedina.solar.boldduotone.school.BookMinimalistic
import com.chiksmedina.solar.boldduotone.school.Bookmark
import com.chiksmedina.solar.boldduotone.school.BookmarkCircle
import com.chiksmedina.solar.boldduotone.school.BookmarkOpened
import com.chiksmedina.solar.boldduotone.school.BookmarkSquare
import com.chiksmedina.solar.boldduotone.school.BookmarkSquareMinimalistic
import com.chiksmedina.solar.boldduotone.school.Calculator
import com.chiksmedina.solar.boldduotone.school.CalculatorMinimalistic
import com.chiksmedina.solar.boldduotone.school.Case
import com.chiksmedina.solar.boldduotone.school.CaseMinimalistic
import com.chiksmedina.solar.boldduotone.school.CaseRound
import com.chiksmedina.solar.boldduotone.school.CaseRoundMinimalistic
import com.chiksmedina.solar.boldduotone.school.Diploma
import com.chiksmedina.solar.boldduotone.school.DiplomaVerified
import com.chiksmedina.solar.boldduotone.school.Document
import com.chiksmedina.solar.boldduotone.school.Notebook
import com.chiksmedina.solar.boldduotone.school.NotebookBookmark
import com.chiksmedina.solar.boldduotone.school.NotebookMinimalistic
import com.chiksmedina.solar.boldduotone.school.NotebookSquare
import com.chiksmedina.solar.boldduotone.school.Passport
import com.chiksmedina.solar.boldduotone.school.PassportMinimalistic
import com.chiksmedina.solar.boldduotone.school.PlusMinus
import com.chiksmedina.solar.boldduotone.school.SquareAcademicCap
import com.chiksmedina.solar.boldduotone.school.SquareAcademicCap2
import kotlin.collections.List as KtList

object SchoolGroup

val BoldDuotoneSolar.School: SchoolGroup
    get() = SchoolGroup

private var _AllIcons: KtList<ImageVector>? = null

val SchoolGroup.AllIcons: KtList<ImageVector>
    get() {
        if (_AllIcons != null) {
            return _AllIcons!!
        }
        _AllIcons = listOf(
            Backpack,
            Book,
            Bookmark,
            BookmarkCircle,
            BookmarkOpened,
            BookmarkSquare,
            BookmarkSquareMinimalistic,
            Book2,
            BookBookmark,
            BookBookmarkMinimalistic,
            BookMinimalistic,
            Calculator,
            CalculatorMinimalistic,
            Case,
            CaseMinimalistic,
            CaseRound,
            CaseRoundMinimalistic,
            Diploma,
            DiplomaVerified,
            Document,
            Notebook,
            NotebookBookmark,
            NotebookMinimalistic,
            NotebookSquare,
            Passport,
            PassportMinimalistic,
            PlusMinus,
            SquareAcademicCap,
            SquareAcademicCap2
        )
        return _AllIcons!!
    }
