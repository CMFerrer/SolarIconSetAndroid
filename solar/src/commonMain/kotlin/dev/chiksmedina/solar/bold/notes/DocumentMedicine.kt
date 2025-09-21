package dev.chiksmedina.solar.bold.notes

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.EvenOdd
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import dev.chiksmedina.solar.bold.NotesGroup

val NotesGroup.DocumentMedicine: ImageVector
    get() {
        if (_documentMedicine != null) {
            return _documentMedicine!!
        }
        _documentMedicine = Builder(
            name = "DocumentMedicine", defaultWidth = 24.0.dp, defaultHeight
            = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                pathFillType = EvenOdd
            ) {
                moveTo(4.1716f, 3.1716f)
                curveTo(3.0f, 4.3432f, 3.0f, 6.2288f, 3.0f, 10.0f)
                verticalLineTo(14.0f)
                curveTo(3.0f, 17.7712f, 3.0f, 19.6569f, 4.1716f, 20.8284f)
                curveTo(5.3432f, 22.0f, 7.2288f, 22.0f, 11.0f, 22.0f)
                horizontalLineTo(13.0f)
                curveTo(16.7712f, 22.0f, 18.6569f, 22.0f, 19.8284f, 20.8284f)
                curveTo(21.0f, 19.6569f, 21.0f, 17.7712f, 21.0f, 14.0f)
                verticalLineTo(10.0f)
                curveTo(21.0f, 6.2288f, 21.0f, 4.3432f, 19.8284f, 3.1716f)
                curveTo(18.6569f, 2.0f, 16.7712f, 2.0f, 13.0f, 2.0f)
                horizontalLineTo(11.0f)
                curveTo(7.2288f, 2.0f, 5.3432f, 2.0f, 4.1716f, 3.1716f)
                close()
                moveTo(12.75f, 6.0f)
                curveTo(12.75f, 5.5858f, 12.4142f, 5.25f, 12.0f, 5.25f)
                curveTo(11.5858f, 5.25f, 11.25f, 5.5858f, 11.25f, 6.0f)
                verticalLineTo(7.25f)
                horizontalLineTo(10.0f)
                curveTo(9.5857f, 7.25f, 9.25f, 7.5858f, 9.25f, 8.0f)
                curveTo(9.25f, 8.4142f, 9.5857f, 8.75f, 10.0f, 8.75f)
                horizontalLineTo(11.25f)
                lineTo(11.25f, 10.0f)
                curveTo(11.25f, 10.4142f, 11.5858f, 10.75f, 12.0f, 10.75f)
                curveTo(12.4142f, 10.75f, 12.75f, 10.4142f, 12.75f, 10.0f)
                lineTo(12.75f, 8.75f)
                lineTo(14.0f, 8.75f)
                curveTo(14.4142f, 8.75f, 14.75f, 8.4142f, 14.75f, 8.0f)
                curveTo(14.75f, 7.5858f, 14.4142f, 7.25f, 14.0f, 7.25f)
                horizontalLineTo(12.75f)
                verticalLineTo(6.0f)
                close()
                moveTo(8.0f, 13.25f)
                curveTo(7.5858f, 13.25f, 7.25f, 13.5858f, 7.25f, 14.0f)
                curveTo(7.25f, 14.4142f, 7.5858f, 14.75f, 8.0f, 14.75f)
                horizontalLineTo(16.0f)
                curveTo(16.4142f, 14.75f, 16.75f, 14.4142f, 16.75f, 14.0f)
                curveTo(16.75f, 13.5858f, 16.4142f, 13.25f, 16.0f, 13.25f)
                horizontalLineTo(8.0f)
                close()
                moveTo(9.0f, 17.25f)
                curveTo(8.5858f, 17.25f, 8.25f, 17.5858f, 8.25f, 18.0f)
                curveTo(8.25f, 18.4142f, 8.5858f, 18.75f, 9.0f, 18.75f)
                horizontalLineTo(15.0f)
                curveTo(15.4142f, 18.75f, 15.75f, 18.4142f, 15.75f, 18.0f)
                curveTo(15.75f, 17.5858f, 15.4142f, 17.25f, 15.0f, 17.25f)
                horizontalLineTo(9.0f)
                close()
            }
        }
            .build()
        return _documentMedicine!!
    }

private var _documentMedicine: ImageVector? = null
