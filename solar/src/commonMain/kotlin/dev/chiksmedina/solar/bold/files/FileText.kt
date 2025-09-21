package dev.chiksmedina.solar.bold.files

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.EvenOdd
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import dev.chiksmedina.solar.bold.FilesGroup

val FilesGroup.FileText: ImageVector
    get() {
        if (_fileText != null) {
            return _fileText!!
        }
        _fileText = Builder(
            name = "FileText", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
            viewportWidth = 24.0f, viewportHeight = 24.0f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                pathFillType = EvenOdd
            ) {
                moveTo(14.0f, 22.0f)
                horizontalLineTo(10.0f)
                curveTo(6.2288f, 22.0f, 4.3432f, 22.0f, 3.1716f, 20.8284f)
                curveTo(2.0f, 19.6569f, 2.0f, 17.7712f, 2.0f, 14.0f)
                verticalLineTo(10.0f)
                curveTo(2.0f, 6.2288f, 2.0f, 4.3432f, 3.1716f, 3.1716f)
                curveTo(4.3432f, 2.0f, 6.2387f, 2.0f, 10.0298f, 2.0f)
                curveTo(10.6358f, 2.0f, 11.1214f, 2.0f, 11.53f, 2.0167f)
                curveTo(11.5166f, 2.0966f, 11.5095f, 2.1781f, 11.5092f, 2.2606f)
                lineTo(11.5f, 5.095f)
                curveTo(11.4999f, 6.1921f, 11.4998f, 7.1616f, 11.6049f, 7.9432f)
                curveTo(11.7188f, 8.7903f, 11.9803f, 9.6373f, 12.6716f, 10.3285f)
                curveTo(13.3628f, 11.0198f, 14.2098f, 11.2813f, 15.0569f, 11.3952f)
                curveTo(15.8385f, 11.5003f, 16.808f, 11.5002f, 17.9051f, 11.5001f)
                lineTo(18.0f, 11.5001f)
                horizontalLineTo(21.9574f)
                curveTo(22.0f, 12.0344f, 22.0f, 12.6901f, 22.0f, 13.5629f)
                verticalLineTo(14.0f)
                curveTo(22.0f, 17.7712f, 22.0f, 19.6569f, 20.8284f, 20.8284f)
                curveTo(19.6569f, 22.0f, 17.7712f, 22.0f, 14.0f, 22.0f)
                close()
                moveTo(5.25f, 14.5f)
                curveTo(5.25f, 14.0858f, 5.5858f, 13.75f, 6.0f, 13.75f)
                horizontalLineTo(14.0f)
                curveTo(14.4142f, 13.75f, 14.75f, 14.0858f, 14.75f, 14.5f)
                curveTo(14.75f, 14.9142f, 14.4142f, 15.25f, 14.0f, 15.25f)
                horizontalLineTo(6.0f)
                curveTo(5.5858f, 15.25f, 5.25f, 14.9142f, 5.25f, 14.5f)
                close()
                moveTo(5.25f, 18.0f)
                curveTo(5.25f, 17.5858f, 5.5858f, 17.25f, 6.0f, 17.25f)
                horizontalLineTo(11.5f)
                curveTo(11.9142f, 17.25f, 12.25f, 17.5858f, 12.25f, 18.0f)
                curveTo(12.25f, 18.4142f, 11.9142f, 18.75f, 11.5f, 18.75f)
                horizontalLineTo(6.0f)
                curveTo(5.5858f, 18.75f, 5.25f, 18.4142f, 5.25f, 18.0f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                pathFillType = NonZero
            ) {
                moveTo(19.3517f, 7.6167f)
                lineTo(15.3929f, 4.0538f)
                curveTo(14.2651f, 3.0387f, 13.7012f, 2.5311f, 13.0092f, 2.2656f)
                lineTo(13.0f, 5.0001f)
                curveTo(13.0f, 7.3571f, 13.0f, 8.5356f, 13.7322f, 9.2679f)
                curveTo(14.4645f, 10.0001f, 15.643f, 10.0001f, 18.0f, 10.0001f)
                horizontalLineTo(21.5801f)
                curveTo(21.2175f, 9.2959f, 20.5684f, 8.7116f, 19.3517f, 7.6167f)
                close()
            }
        }
            .build()
        return _fileText!!
    }

private var _fileText: ImageVector? = null
