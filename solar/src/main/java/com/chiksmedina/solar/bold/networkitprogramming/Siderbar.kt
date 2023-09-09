package com.chiksmedina.solar.bold.networkitprogramming

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.EvenOdd
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.chiksmedina.solar.bold.NetworkItProgrammingGroup

public val NetworkItProgrammingGroup.Siderbar: ImageVector
    get() {
        if (_siderbar != null) {
            return _siderbar!!
        }
        _siderbar = Builder(name = "Siderbar", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(22.0f, 11.0f)
                verticalLineTo(13.0f)
                curveTo(22.0f, 16.7712f, 22.0f, 18.6569f, 20.8284f, 19.8284f)
                curveTo(19.8541f, 20.8028f, 18.3859f, 20.9668f, 15.75f, 20.9944f)
                verticalLineTo(3.0056f)
                curveTo(18.3859f, 3.0332f, 19.8541f, 3.1972f, 20.8284f, 4.1716f)
                curveTo(22.0f, 5.3432f, 22.0f, 7.2288f, 22.0f, 11.0f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveTo(10.0f, 3.0f)
                horizontalLineTo(14.0f)
                horizontalLineTo(14.25f)
                lineTo(14.25f, 21.0f)
                horizontalLineTo(14.0f)
                horizontalLineTo(10.0f)
                curveTo(6.2288f, 21.0f, 4.3432f, 21.0f, 3.1716f, 19.8284f)
                curveTo(2.0f, 18.6569f, 2.0f, 16.7712f, 2.0f, 13.0f)
                verticalLineTo(11.0f)
                curveTo(2.0f, 7.2288f, 2.0f, 5.3432f, 3.1716f, 4.1716f)
                curveTo(4.3432f, 3.0f, 6.2288f, 3.0f, 10.0f, 3.0f)
                close()
                moveTo(4.75f, 10.0f)
                curveTo(4.75f, 9.5858f, 5.0858f, 9.25f, 5.5f, 9.25f)
                horizontalLineTo(11.5f)
                curveTo(11.9142f, 9.25f, 12.25f, 9.5858f, 12.25f, 10.0f)
                curveTo(12.25f, 10.4142f, 11.9142f, 10.75f, 11.5f, 10.75f)
                horizontalLineTo(5.5f)
                curveTo(5.0858f, 10.75f, 4.75f, 10.4142f, 4.75f, 10.0f)
                close()
                moveTo(5.75f, 14.0f)
                curveTo(5.75f, 13.5858f, 6.0858f, 13.25f, 6.5f, 13.25f)
                horizontalLineTo(10.5f)
                curveTo(10.9142f, 13.25f, 11.25f, 13.5858f, 11.25f, 14.0f)
                curveTo(11.25f, 14.4142f, 10.9142f, 14.75f, 10.5f, 14.75f)
                horizontalLineTo(6.5f)
                curveTo(6.0858f, 14.75f, 5.75f, 14.4142f, 5.75f, 14.0f)
                close()
            }
        }
        .build()
        return _siderbar!!
    }

private var _siderbar: ImageVector? = null
