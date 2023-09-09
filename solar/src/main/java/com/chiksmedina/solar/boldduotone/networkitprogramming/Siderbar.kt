package com.chiksmedina.solar.boldduotone.networkitprogramming

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
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
import com.chiksmedina.solar.boldduotone.NetworkItProgrammingGroup

public val NetworkItProgrammingGroup.Siderbar: ImageVector
    get() {
        if (_siderbar != null) {
            return _siderbar!!
        }
        _siderbar = Builder(name = "Siderbar", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, fillAlpha = 0.5f, strokeAlpha
                    = 0.5f, strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f, pathFillType = EvenOdd) {
                moveTo(3.1716f, 4.1716f)
                curveTo(2.0f, 5.3432f, 2.0f, 7.2288f, 2.0f, 11.0f)
                verticalLineTo(13.0f)
                curveTo(2.0f, 16.7713f, 2.0f, 18.6569f, 3.1716f, 19.8285f)
                curveTo(4.3432f, 21.0f, 6.2288f, 21.0f, 10.0f, 21.0f)
                horizontalLineTo(14.0f)
                curveTo(14.0843f, 21.0f, 14.9176f, 21.0001f, 15.0f, 21.0001f)
                lineTo(15.0f, 3.0001f)
                curveTo(14.9176f, 3.0001f, 14.0843f, 3.0f, 14.0f, 3.0f)
                horizontalLineTo(10.0f)
                curveTo(6.2288f, 3.0f, 4.3432f, 3.0f, 3.1716f, 4.1716f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(5.5f, 9.25f)
                curveTo(5.0858f, 9.25f, 4.75f, 9.5858f, 4.75f, 10.0f)
                curveTo(4.75f, 10.4142f, 5.0858f, 10.75f, 5.5f, 10.75f)
                horizontalLineTo(11.5f)
                curveTo(11.9142f, 10.75f, 12.25f, 10.4142f, 12.25f, 10.0f)
                curveTo(12.25f, 9.5858f, 11.9142f, 9.25f, 11.5f, 9.25f)
                horizontalLineTo(5.5f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(6.5f, 13.25f)
                curveTo(6.0858f, 13.25f, 5.75f, 13.5858f, 5.75f, 14.0f)
                curveTo(5.75f, 14.4142f, 6.0858f, 14.75f, 6.5f, 14.75f)
                horizontalLineTo(10.5f)
                curveTo(10.9142f, 14.75f, 11.25f, 14.4142f, 11.25f, 14.0f)
                curveTo(11.25f, 13.5858f, 10.9142f, 13.25f, 10.5f, 13.25f)
                horizontalLineTo(6.5f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(22.0f, 13.0f)
                verticalLineTo(11.0f)
                curveTo(22.0f, 7.2288f, 22.0f, 5.3432f, 20.8284f, 4.1716f)
                curveTo(19.8541f, 3.1972f, 17.6359f, 3.0332f, 15.0f, 3.0056f)
                verticalLineTo(20.9944f)
                curveTo(17.6359f, 20.9668f, 19.8541f, 20.8028f, 20.8284f, 19.8284f)
                curveTo(22.0f, 18.6569f, 22.0f, 16.7712f, 22.0f, 13.0f)
                close()
            }
        }
        .build()
        return _siderbar!!
    }

private var _siderbar: ImageVector? = null
