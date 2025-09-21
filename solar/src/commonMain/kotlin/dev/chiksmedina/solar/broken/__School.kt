package dev.chiksmedina.solar.broken

import androidx.compose.ui.graphics.vector.ImageVector
import dev.chiksmedina.solar.BrokenSolar
import dev.chiksmedina.solar.broken.school.Backpack
import dev.chiksmedina.solar.broken.school.Book
import dev.chiksmedina.solar.broken.school.Book2
import dev.chiksmedina.solar.broken.school.BookBookmark
import dev.chiksmedina.solar.broken.school.BookBookmarkMinimalistic
import dev.chiksmedina.solar.broken.school.BookMinimalistic
import dev.chiksmedina.solar.broken.school.Bookmark
import dev.chiksmedina.solar.broken.school.BookmarkCircle
import dev.chiksmedina.solar.broken.school.BookmarkOpened
import dev.chiksmedina.solar.broken.school.BookmarkSquare
import dev.chiksmedina.solar.broken.school.BookmarkSquareMinimalistic
import dev.chiksmedina.solar.broken.school.Calculator
import dev.chiksmedina.solar.broken.school.CalculatorMinimalistic
import dev.chiksmedina.solar.broken.school.Case
import dev.chiksmedina.solar.broken.school.CaseMinimalistic
import dev.chiksmedina.solar.broken.school.CaseRound
import dev.chiksmedina.solar.broken.school.CaseRoundMinimalistic
import dev.chiksmedina.solar.broken.school.Diploma
import dev.chiksmedina.solar.broken.school.DiplomaVerified
import dev.chiksmedina.solar.broken.school.Document
import dev.chiksmedina.solar.broken.school.Notebook
import dev.chiksmedina.solar.broken.school.NotebookBookmark
import dev.chiksmedina.solar.broken.school.NotebookMinimalistic
import dev.chiksmedina.solar.broken.school.NotebookSquare
import dev.chiksmedina.solar.broken.school.Passport
import dev.chiksmedina.solar.broken.school.PassportMinimalistic
import dev.chiksmedina.solar.broken.school.PlusMinus
import dev.chiksmedina.solar.broken.school.SquareAcademicCap
import dev.chiksmedina.solar.broken.school.SquareAcademicCap2
import kotlin.collections.List as KtList

object SchoolGroup

val BrokenSolar.School: SchoolGroup
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
