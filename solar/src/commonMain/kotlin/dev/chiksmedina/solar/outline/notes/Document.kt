package dev.chiksmedina.solar.outline.notes

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.EvenOdd
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import dev.chiksmedina.solar.outline.NotesGroup

val NotesGroup.Document: ImageVector
    get() {
        if (_document != null) {
            return _document!!
        }
        _document = Builder(
            name = "Document", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
            viewportWidth = 24.0f, viewportHeight = 24.0f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                pathFillType = EvenOdd
            ) {
                moveTo(10.9436f, 1.25f)
                horizontalLineTo(13.0564f)
                curveTo(14.8942f, 1.25f, 16.3498f, 1.25f, 17.489f, 1.4031f)
                curveTo(18.6614f, 1.5608f, 19.6104f, 1.8929f, 20.3588f, 2.6412f)
                curveTo(21.1071f, 3.3896f, 21.4392f, 4.3386f, 21.5969f, 5.511f)
                curveTo(21.75f, 6.6502f, 21.75f, 8.1058f, 21.75f, 9.9436f)
                verticalLineTo(14.0564f)
                curveTo(21.75f, 15.8942f, 21.75f, 17.3498f, 21.5969f, 18.489f)
                curveTo(21.4392f, 19.6614f, 21.1071f, 20.6104f, 20.3588f, 21.3588f)
                curveTo(19.6104f, 22.1071f, 18.6614f, 22.4392f, 17.489f, 22.5969f)
                curveTo(16.3498f, 22.75f, 14.8942f, 22.75f, 13.0564f, 22.75f)
                horizontalLineTo(10.9436f)
                curveTo(9.1058f, 22.75f, 7.6502f, 22.75f, 6.511f, 22.5969f)
                curveTo(5.3386f, 22.4392f, 4.3896f, 22.1071f, 3.6412f, 21.3588f)
                curveTo(2.8929f, 20.6104f, 2.5608f, 19.6614f, 2.4031f, 18.489f)
                curveTo(2.25f, 17.3498f, 2.25f, 15.8942f, 2.25f, 14.0564f)
                verticalLineTo(9.9436f)
                curveTo(2.25f, 8.1058f, 2.25f, 6.6502f, 2.4031f, 5.511f)
                curveTo(2.5608f, 4.3386f, 2.8929f, 3.3896f, 3.6412f, 2.6412f)
                curveTo(4.3896f, 1.8929f, 5.3386f, 1.5608f, 6.511f, 1.4031f)
                curveTo(7.6502f, 1.25f, 9.1058f, 1.25f, 10.9436f, 1.25f)
                close()
                moveTo(6.7108f, 2.8898f)
                curveTo(5.7048f, 3.025f, 5.1251f, 3.2787f, 4.7019f, 3.7019f)
                curveTo(4.2787f, 4.1251f, 4.025f, 4.7048f, 3.8898f, 5.7108f)
                curveTo(3.7516f, 6.7385f, 3.75f, 8.0932f, 3.75f, 10.0f)
                verticalLineTo(14.0f)
                curveTo(3.75f, 15.9068f, 3.7516f, 17.2615f, 3.8898f, 18.2892f)
                curveTo(4.025f, 19.2952f, 4.2787f, 19.8749f, 4.7019f, 20.2981f)
                curveTo(5.1251f, 20.7213f, 5.7048f, 20.975f, 6.7108f, 21.1102f)
                curveTo(7.7385f, 21.2484f, 9.0932f, 21.25f, 11.0f, 21.25f)
                horizontalLineTo(13.0f)
                curveTo(14.9068f, 21.25f, 16.2615f, 21.2484f, 17.2892f, 21.1102f)
                curveTo(18.2952f, 20.975f, 18.8749f, 20.7213f, 19.2981f, 20.2981f)
                curveTo(19.7213f, 19.8749f, 19.975f, 19.2952f, 20.1102f, 18.2892f)
                curveTo(20.2484f, 17.2615f, 20.25f, 15.9068f, 20.25f, 14.0f)
                verticalLineTo(10.0f)
                curveTo(20.25f, 8.0932f, 20.2484f, 6.7385f, 20.1102f, 5.7108f)
                curveTo(19.975f, 4.7048f, 19.7213f, 4.1251f, 19.2981f, 3.7019f)
                curveTo(18.8749f, 3.2787f, 18.2952f, 3.025f, 17.2892f, 2.8898f)
                curveTo(16.2615f, 2.7516f, 14.9068f, 2.75f, 13.0f, 2.75f)
                horizontalLineTo(11.0f)
                curveTo(9.0932f, 2.75f, 7.7385f, 2.7516f, 6.7108f, 2.8898f)
                close()
                moveTo(7.25f, 10.0f)
                curveTo(7.25f, 9.5858f, 7.5858f, 9.25f, 8.0f, 9.25f)
                horizontalLineTo(16.0f)
                curveTo(16.4142f, 9.25f, 16.75f, 9.5858f, 16.75f, 10.0f)
                curveTo(16.75f, 10.4142f, 16.4142f, 10.75f, 16.0f, 10.75f)
                horizontalLineTo(8.0f)
                curveTo(7.5858f, 10.75f, 7.25f, 10.4142f, 7.25f, 10.0f)
                close()
                moveTo(7.25f, 14.0f)
                curveTo(7.25f, 13.5858f, 7.5858f, 13.25f, 8.0f, 13.25f)
                horizontalLineTo(13.0f)
                curveTo(13.4142f, 13.25f, 13.75f, 13.5858f, 13.75f, 14.0f)
                curveTo(13.75f, 14.4142f, 13.4142f, 14.75f, 13.0f, 14.75f)
                horizontalLineTo(8.0f)
                curveTo(7.5858f, 14.75f, 7.25f, 14.4142f, 7.25f, 14.0f)
                close()
            }
        }
            .build()
        return _document!!
    }

private var _document: ImageVector? = null
