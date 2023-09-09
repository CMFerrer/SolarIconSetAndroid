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

public val EssentionalUiGroup.Feed: ImageVector
    get() {
        if (_feed != null) {
            return _feed!!
        }
        _feed = Builder(name = "Feed", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveTo(3.0f, 10.0f)
                curveTo(3.0f, 6.2288f, 3.0f, 4.3432f, 4.1716f, 3.1716f)
                curveTo(5.3432f, 2.0f, 7.2288f, 2.0f, 11.0f, 2.0f)
                horizontalLineTo(13.0f)
                curveTo(16.7712f, 2.0f, 18.6569f, 2.0f, 19.8284f, 3.1716f)
                curveTo(21.0f, 4.3432f, 21.0f, 6.2288f, 21.0f, 10.0f)
                verticalLineTo(14.0f)
                curveTo(21.0f, 17.7712f, 21.0f, 19.6569f, 19.8284f, 20.8284f)
                curveTo(18.6569f, 22.0f, 16.7712f, 22.0f, 13.0f, 22.0f)
                horizontalLineTo(11.0f)
                curveTo(7.2288f, 22.0f, 5.3432f, 22.0f, 4.1716f, 20.8284f)
                curveTo(3.0f, 19.6569f, 3.0f, 17.7712f, 3.0f, 14.0f)
                verticalLineTo(10.0f)
                close()
                moveTo(6.0f, 12.0f)
                curveTo(6.0f, 10.5858f, 6.0f, 9.8787f, 6.4393f, 9.4393f)
                curveTo(6.8787f, 9.0f, 7.5858f, 9.0f, 9.0f, 9.0f)
                horizontalLineTo(15.0f)
                curveTo(16.4142f, 9.0f, 17.1213f, 9.0f, 17.5607f, 9.4393f)
                curveTo(18.0f, 9.8787f, 18.0f, 10.5858f, 18.0f, 12.0f)
                verticalLineTo(16.0f)
                curveTo(18.0f, 17.4142f, 18.0f, 18.1213f, 17.5607f, 18.5607f)
                curveTo(17.1213f, 19.0f, 16.4142f, 19.0f, 15.0f, 19.0f)
                horizontalLineTo(9.0f)
                curveTo(7.5858f, 19.0f, 6.8787f, 19.0f, 6.4393f, 18.5607f)
                curveTo(6.0f, 18.1213f, 6.0f, 17.4142f, 6.0f, 16.0f)
                verticalLineTo(12.0f)
                close()
                moveTo(7.0f, 5.25f)
                curveTo(6.5858f, 5.25f, 6.25f, 5.5858f, 6.25f, 6.0f)
                curveTo(6.25f, 6.4142f, 6.5858f, 6.75f, 7.0f, 6.75f)
                horizontalLineTo(12.0f)
                curveTo(12.4142f, 6.75f, 12.75f, 6.4142f, 12.75f, 6.0f)
                curveTo(12.75f, 5.5858f, 12.4142f, 5.25f, 12.0f, 5.25f)
                horizontalLineTo(7.0f)
                close()
            }
        }
        .build()
        return _feed!!
    }

private var _feed: ImageVector? = null
