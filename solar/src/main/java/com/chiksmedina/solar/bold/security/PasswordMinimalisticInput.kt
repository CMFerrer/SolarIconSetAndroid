package com.chiksmedina.solar.bold.security

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
import com.chiksmedina.solar.bold.SecurityGroup

val SecurityGroup.PasswordMinimalisticInput: ImageVector
    get() {
        if (_passwordMinimalisticInput != null) {
            return _passwordMinimalisticInput!!
        }
        _passwordMinimalisticInput = Builder(
            name = "PasswordMinimalisticInput", defaultWidth =
            24.0.dp, defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight =
            24.0f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                pathFillType = NonZero
            ) {
                moveTo(15.75f, 2.0f)
                curveTo(15.75f, 1.5858f, 15.4142f, 1.25f, 15.0f, 1.25f)
                curveTo(14.5858f, 1.25f, 14.25f, 1.5858f, 14.25f, 2.0f)
                verticalLineTo(22.0f)
                curveTo(14.25f, 22.4142f, 14.5858f, 22.75f, 15.0f, 22.75f)
                curveTo(15.4142f, 22.75f, 15.75f, 22.4142f, 15.75f, 22.0f)
                verticalLineTo(19.9944f)
                curveTo(18.3859f, 19.9668f, 19.8541f, 19.8028f, 20.8284f, 18.8284f)
                curveTo(22.0f, 17.6569f, 22.0f, 15.7712f, 22.0f, 12.0f)
                curveTo(22.0f, 8.2288f, 22.0f, 6.3432f, 20.8284f, 5.1716f)
                curveTo(19.8541f, 4.1972f, 18.3859f, 4.0332f, 15.75f, 4.0056f)
                verticalLineTo(2.0f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                pathFillType = EvenOdd
            ) {
                moveTo(3.1716f, 18.8284f)
                curveTo(4.3432f, 20.0f, 6.2288f, 20.0f, 10.0f, 20.0f)
                horizontalLineTo(13.0f)
                verticalLineTo(12.0f)
                verticalLineTo(4.0f)
                horizontalLineTo(10.0f)
                curveTo(6.2288f, 4.0f, 4.3432f, 4.0f, 3.1716f, 5.1716f)
                curveTo(2.0f, 6.3432f, 2.0f, 8.2288f, 2.0f, 12.0f)
                curveTo(2.0f, 15.7712f, 2.0f, 17.6569f, 3.1716f, 18.8284f)
                close()
                moveTo(13.0f, 12.0f)
                curveTo(13.0f, 11.4477f, 12.5523f, 11.0f, 12.0f, 11.0f)
                curveTo(11.4477f, 11.0f, 11.0f, 11.4477f, 11.0f, 12.0f)
                curveTo(11.0f, 12.5523f, 11.4477f, 13.0f, 12.0f, 13.0f)
                curveTo(12.5523f, 13.0f, 13.0f, 12.5523f, 13.0f, 12.0f)
                close()
                moveTo(9.0f, 12.0f)
                curveTo(9.0f, 12.5523f, 8.5523f, 13.0f, 8.0f, 13.0f)
                curveTo(7.4477f, 13.0f, 7.0f, 12.5523f, 7.0f, 12.0f)
                curveTo(7.0f, 11.4477f, 7.4477f, 11.0f, 8.0f, 11.0f)
                curveTo(8.5523f, 11.0f, 9.0f, 11.4477f, 9.0f, 12.0f)
                close()
            }
        }
            .build()
        return _passwordMinimalisticInput!!
    }

private var _passwordMinimalisticInput: ImageVector? = null
