package com.chiksmedina.solar.bold.essentionalui

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.EvenOdd
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.chiksmedina.solar.bold.EssentionalUiGroup

val EssentionalUiGroup.Subtitles: ImageVector
    get() {
        if (_subtitles != null) {
            return _subtitles!!
        }
        _subtitles = Builder(
            name = "Subtitles", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
            viewportWidth = 24.0f, viewportHeight = 24.0f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                pathFillType = EvenOdd
            ) {
                moveTo(2.0f, 12.0f)
                curveTo(2.0f, 8.2288f, 2.0f, 6.3432f, 3.1716f, 5.1716f)
                curveTo(4.3432f, 4.0f, 6.2288f, 4.0f, 10.0f, 4.0f)
                horizontalLineTo(14.0f)
                curveTo(17.7712f, 4.0f, 19.6569f, 4.0f, 20.8284f, 5.1716f)
                curveTo(22.0f, 6.3432f, 22.0f, 8.2288f, 22.0f, 12.0f)
                curveTo(22.0f, 15.7712f, 22.0f, 17.6569f, 20.8284f, 18.8284f)
                curveTo(19.6569f, 20.0f, 17.7712f, 20.0f, 14.0f, 20.0f)
                horizontalLineTo(10.0f)
                curveTo(6.2288f, 20.0f, 4.3432f, 20.0f, 3.1716f, 18.8284f)
                curveTo(2.0f, 17.6569f, 2.0f, 15.7712f, 2.0f, 12.0f)
                close()
                moveTo(6.0f, 15.25f)
                curveTo(5.5858f, 15.25f, 5.25f, 15.5858f, 5.25f, 16.0f)
                curveTo(5.25f, 16.4142f, 5.5858f, 16.75f, 6.0f, 16.75f)
                horizontalLineTo(10.0f)
                curveTo(10.4142f, 16.75f, 10.75f, 16.4142f, 10.75f, 16.0f)
                curveTo(10.75f, 15.5858f, 10.4142f, 15.25f, 10.0f, 15.25f)
                horizontalLineTo(6.0f)
                close()
                moveTo(7.75f, 13.0f)
                curveTo(7.75f, 12.5858f, 7.4142f, 12.25f, 7.0f, 12.25f)
                horizontalLineTo(6.0f)
                curveTo(5.5858f, 12.25f, 5.25f, 12.5858f, 5.25f, 13.0f)
                curveTo(5.25f, 13.4142f, 5.5858f, 13.75f, 6.0f, 13.75f)
                horizontalLineTo(7.0f)
                curveTo(7.4142f, 13.75f, 7.75f, 13.4142f, 7.75f, 13.0f)
                close()
                moveTo(11.5f, 12.25f)
                curveTo(11.9142f, 12.25f, 12.25f, 12.5858f, 12.25f, 13.0f)
                curveTo(12.25f, 13.4142f, 11.9142f, 13.75f, 11.5f, 13.75f)
                horizontalLineTo(9.5f)
                curveTo(9.0858f, 13.75f, 8.75f, 13.4142f, 8.75f, 13.0f)
                curveTo(8.75f, 12.5858f, 9.0858f, 12.25f, 9.5f, 12.25f)
                horizontalLineTo(11.5f)
                close()
                moveTo(18.75f, 13.0f)
                curveTo(18.75f, 12.5858f, 18.4142f, 12.25f, 18.0f, 12.25f)
                horizontalLineTo(14.0f)
                curveTo(13.5858f, 12.25f, 13.25f, 12.5858f, 13.25f, 13.0f)
                curveTo(13.25f, 13.4142f, 13.5858f, 13.75f, 14.0f, 13.75f)
                horizontalLineTo(18.0f)
                curveTo(18.4142f, 13.75f, 18.75f, 13.4142f, 18.75f, 13.0f)
                close()
                moveTo(12.5f, 15.25f)
                curveTo(12.0858f, 15.25f, 11.75f, 15.5858f, 11.75f, 16.0f)
                curveTo(11.75f, 16.4142f, 12.0858f, 16.75f, 12.5f, 16.75f)
                horizontalLineTo(14.0f)
                curveTo(14.4142f, 16.75f, 14.75f, 16.4142f, 14.75f, 16.0f)
                curveTo(14.75f, 15.5858f, 14.4142f, 15.25f, 14.0f, 15.25f)
                horizontalLineTo(12.5f)
                close()
                moveTo(15.75f, 16.0f)
                curveTo(15.75f, 15.5858f, 16.0858f, 15.25f, 16.5f, 15.25f)
                horizontalLineTo(18.0f)
                curveTo(18.4142f, 15.25f, 18.75f, 15.5858f, 18.75f, 16.0f)
                curveTo(18.75f, 16.4142f, 18.4142f, 16.75f, 18.0f, 16.75f)
                horizontalLineTo(16.5f)
                curveTo(16.0858f, 16.75f, 15.75f, 16.4142f, 15.75f, 16.0f)
                close()
            }
        }
            .build()
        return _subtitles!!
    }

private var _subtitles: ImageVector? = null
