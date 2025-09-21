package dev.chiksmedina.solar.outline

import androidx.compose.ui.graphics.vector.ImageVector
import dev.chiksmedina.solar.OutlineSolar
import dev.chiksmedina.solar.outline.school.Backpack
import dev.chiksmedina.solar.outline.school.Book
import dev.chiksmedina.solar.outline.school.Book2
import dev.chiksmedina.solar.outline.school.BookBookmark
import dev.chiksmedina.solar.outline.school.BookBookmarkMinimalistic
import dev.chiksmedina.solar.outline.school.BookMinimalistic
import dev.chiksmedina.solar.outline.school.Bookmark
import dev.chiksmedina.solar.outline.school.BookmarkCircle
import dev.chiksmedina.solar.outline.school.BookmarkOpened
import dev.chiksmedina.solar.outline.school.BookmarkSquare
import dev.chiksmedina.solar.outline.school.BookmarkSquareMinimalistic
import dev.chiksmedina.solar.outline.school.Calculator
import dev.chiksmedina.solar.outline.school.CalculatorMinimalistic
import dev.chiksmedina.solar.outline.school.Case
import dev.chiksmedina.solar.outline.school.CaseMinimalistic
import dev.chiksmedina.solar.outline.school.CaseRound
import dev.chiksmedina.solar.outline.school.CaseRoundMinimalistic
import dev.chiksmedina.solar.outline.school.Diploma
import dev.chiksmedina.solar.outline.school.DiplomaVerified
import dev.chiksmedina.solar.outline.school.Document
import dev.chiksmedina.solar.outline.school.Notebook
import dev.chiksmedina.solar.outline.school.NotebookBookmark
import dev.chiksmedina.solar.outline.school.NotebookMinimalistic
import dev.chiksmedina.solar.outline.school.NotebookSquare
import dev.chiksmedina.solar.outline.school.Passport
import dev.chiksmedina.solar.outline.school.PassportMinimalistic
import dev.chiksmedina.solar.outline.school.PlusMinus
import dev.chiksmedina.solar.outline.school.SquareAcademicCap
import dev.chiksmedina.solar.outline.school.SquareAcademicCap2
import kotlin.collections.List as KtList

object SchoolGroup

val OutlineSolar.School: SchoolGroup
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
