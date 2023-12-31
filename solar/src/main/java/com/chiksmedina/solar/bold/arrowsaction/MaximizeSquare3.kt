package com.chiksmedina.solar.bold.arrowsaction

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
import com.chiksmedina.solar.bold.ArrowsActionGroup

val ArrowsActionGroup.MaximizeSquare3: ImageVector
    get() {
        if (_maximizeSquare3 != null) {
            return _maximizeSquare3!!
        }
        _maximizeSquare3 = Builder(
            name = "MaximizeSquare3", defaultWidth = 24.0.dp, defaultHeight =
            24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                pathFillType = NonZero
            ) {
                moveTo(2.0f, 18.0f)
                curveTo(2.0f, 16.1144f, 2.0f, 15.1716f, 2.5858f, 14.5858f)
                curveTo(3.1716f, 14.0f, 4.1144f, 14.0f, 6.0f, 14.0f)
                curveTo(7.8856f, 14.0f, 8.8284f, 14.0f, 9.4142f, 14.5858f)
                curveTo(10.0f, 15.1716f, 10.0f, 16.1144f, 10.0f, 18.0f)
                curveTo(10.0f, 19.8856f, 10.0f, 20.8284f, 9.4142f, 21.4142f)
                curveTo(8.8284f, 22.0f, 7.8856f, 22.0f, 6.0f, 22.0f)
                curveTo(4.1144f, 22.0f, 3.1716f, 22.0f, 2.5858f, 21.4142f)
                curveTo(2.0f, 20.8284f, 2.0f, 19.8856f, 2.0f, 18.0f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                pathFillType = EvenOdd
            ) {
                moveTo(3.4645f, 3.4645f)
                curveTo(2.0f, 4.9289f, 2.0f, 7.286f, 2.0f, 12.0f)
                curveTo(2.0f, 12.3956f, 2.0f, 12.7746f, 2.0009f, 13.1378f)
                curveTo(2.509f, 12.8047f, 3.0688f, 12.6588f, 3.6056f, 12.5866f)
                curveTo(4.2512f, 12.4998f, 5.0449f, 12.4999f, 5.9105f, 12.5f)
                horizontalLineTo(6.0895f)
                curveTo(6.9551f, 12.4999f, 7.7488f, 12.4998f, 8.3944f, 12.5866f)
                curveTo(9.1054f, 12.6822f, 9.8568f, 12.9071f, 10.4749f, 13.5251f)
                curveTo(11.0929f, 14.1432f, 11.3178f, 14.8946f, 11.4134f, 15.6056f)
                curveTo(11.5002f, 16.2512f, 11.5001f, 17.0449f, 11.5f, 17.9105f)
                verticalLineTo(18.0895f)
                curveTo(11.5001f, 18.9552f, 11.5002f, 19.7488f, 11.4134f, 20.3944f)
                curveTo(11.3412f, 20.9312f, 11.1954f, 21.491f, 10.8622f, 21.9991f)
                curveTo(11.2255f, 22.0f, 11.6044f, 22.0f, 12.0f, 22.0f)
                curveTo(16.714f, 22.0f, 19.0711f, 22.0f, 20.5355f, 20.5355f)
                curveTo(22.0f, 19.0711f, 22.0f, 16.714f, 22.0f, 12.0f)
                curveTo(22.0f, 7.286f, 22.0f, 4.9289f, 20.5355f, 3.4645f)
                curveTo(19.0711f, 2.0f, 16.714f, 2.0f, 12.0f, 2.0f)
                curveTo(7.286f, 2.0f, 4.9289f, 2.0f, 3.4645f, 3.4645f)
                close()
                moveTo(13.25f, 6.25f)
                curveTo(12.8358f, 6.25f, 12.5f, 6.5858f, 12.5f, 7.0f)
                curveTo(12.5f, 7.4142f, 12.8358f, 7.75f, 13.25f, 7.75f)
                horizontalLineTo(15.1893f)
                lineTo(11.4697f, 11.4697f)
                curveTo(11.1768f, 11.7626f, 11.1768f, 12.2374f, 11.4697f, 12.5303f)
                curveTo(11.7626f, 12.8232f, 12.2374f, 12.8232f, 12.5303f, 12.5303f)
                lineTo(16.25f, 8.8107f)
                verticalLineTo(10.75f)
                curveTo(16.25f, 11.1642f, 16.5858f, 11.5f, 17.0f, 11.5f)
                curveTo(17.4142f, 11.5f, 17.75f, 11.1642f, 17.75f, 10.75f)
                verticalLineTo(7.0f)
                curveTo(17.75f, 6.5858f, 17.4142f, 6.25f, 17.0f, 6.25f)
                horizontalLineTo(13.25f)
                close()
            }
        }
            .build()
        return _maximizeSquare3!!
    }

private var _maximizeSquare3: ImageVector? = null
